package Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import DataBase_Access.Db_operations;
import Entities.User;

@Controller
public class RegistrationController {
	
	@RequestMapping("/registration")
	public String getRegisterPage() {
		return "registration";
	}
	
	@RequestMapping(path="/doRegister", method=RequestMethod.POST)
	public String deRegister(@ModelAttribute User user, Model model) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Db_operations db = (Db_operations) context.getBean("db_operation");
		int n = db.insert(user);
		if(n>=1) model.addAttribute("success", String.valueOf(db.getUid(user.getContact())));
		else model.addAttribute("success", "false");
		return "registration";
	}
	
}
