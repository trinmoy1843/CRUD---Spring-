package Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import DataBase_Access.Db_operations;
import Entities.UpdateUser;

@Controller
public class UpdateController {

	@RequestMapping("/update")
	public String getUpdatePage() {
		return "update";
	}
	
	@RequestMapping("/updateProfile")
	public String updateProfile(@ModelAttribute UpdateUser user, Model model) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Db_operations db = (Db_operations) context.getBean("db_operation");
		if(db.login(user.getUid(), user.getOldPassword()) == false) {
			model.addAttribute("login", "false");
			System.out.println("Login succesfull");
			return "update";
		}
		model.addAttribute("login", "true");
		boolean flag;
		if(user.getName().isEmpty() == false) {
			flag = db.updateName(user.getUid(), user.getName());
			if(flag == false) model.addAttribute("name", "false");
			else model.addAttribute("name", "true");
		}
		if(user.getEmail().isEmpty() == false) {
			flag = db.updateEmail(user.getUid(), user.getEmail());
			if(flag == false) model.addAttribute("email", "false");
			else model.addAttribute("email", "true");
		}
		if(user.getContact() != null) {
			flag = db.updateContact(user.getUid(), user.getContact());
			if(flag == false) model.addAttribute("contact", "false");
			else model.addAttribute("contact", "true");
		}
		if(user.getNewPassword().isEmpty() == false) {
			flag = db.updatePassword(user.getUid(), user.getNewPassword());
			if(flag == false) model.addAttribute("password", "false");
			else model.addAttribute("password", "true");
		}
		return "update";
	}
	
}
