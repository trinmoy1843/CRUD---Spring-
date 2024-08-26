package Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import DataBase_Access.Db_operations;
import Entities.User;

@Controller
public class DeleteController {
	
	@RequestMapping("/delete")
	public String getDeletePage() {
		return "delete";
	}
	
	@RequestMapping("/deleteUser")
	public String deleteUser(@ModelAttribute User user, Model model) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Db_operations db = (Db_operations) context.getBean("db_operation");
		if(db.deleteProfile(user.getUid(), user.getPassword()) == true) model.addAttribute("delete", "true");
		else model.addAttribute("delete", "false");
		return "delete";
	}
	
}
