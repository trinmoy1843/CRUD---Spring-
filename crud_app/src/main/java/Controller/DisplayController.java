package Controller;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import DataBase_Access.Db_operations;
import Entities.User;

@Controller
public class DisplayController {
	
	@RequestMapping("/display")
	public String display(Model model) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Db_operations db = (Db_operations) context.getBean("db_operation");
		List<User> list = db.display();
		model.addAttribute("list", list);
		return "display";
	}
	
}
