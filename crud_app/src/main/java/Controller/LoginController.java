package Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import DataBase_Access.Db_operations;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public String getLoginPage() {
		return "login";
	}

	@RequestMapping(path = "/doLogin", method = RequestMethod.POST)
	public String doLogin(@RequestParam("uid") int uid,
			@RequestParam("password") String password, 
			Model model) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Db_operations db = (Db_operations) context.getBean("db_operation");
		if(db.login(uid, password) == true) return "welcome";
		model.addAttribute("success", "false");
		return "login";
	}

}
