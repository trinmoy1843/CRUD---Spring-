package DataBase_Access;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import Entities.User;

public class Db_operations {
	
	@Autowired
	JdbcTemplate template;
	
	//GETTER AND SETTER FOR JDBC TEMPLATE
	public JdbcTemplate getTemplate() {
		return template;
	}
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	
	//METHOD TO INSERT INTO THE DATABASE
	public int insert(User user) {
		String query = Query.insert;
		return this.template.update(query, user.getName(), user.getEmail(), user.getContact(), user.getPassword());
	}
	
	//METHOD TO DISPLAY THE DATABASE
	public List<User> display() {
		String query = Query.display;
		RowMapperImp rmp = new RowMapperImp();
		return this.template.query(query, rmp);
	}
	
	//METHOD TO RETRIEVE THE USER ID USING CONTACT
	public int getUid(Long contact) {
		String query = Query.getUid;
		RowMapperImp rmp = new RowMapperImp();
		User user = this.template.queryForObject(query, rmp, contact);
		return user.getUid();
	}
	
	//METHOD TO AUTHORIZE LOGIN
	public boolean login(int uid, String password) {
		String query = Query.login;
		RowMapperImp rmp = new RowMapperImp();
		List<User> list =  this.template.query(query, rmp, uid, password);
		if(list.isEmpty()) return false;
		else return true;
	}
	
	//METHOD TO UPDATE THE NAME
	public boolean updateName(int uid, String name) {
		String query = Query.upd_name;
		if(this.template.update(query, name, uid) > 0) return true;
		else return false;
	}
	
	//METHOD TO UPDATE EMAIL
	public boolean updateEmail(int uid, String email) {
		String query = Query.upd_email;
		if(this.template.update(query, email, uid) > 0) return true;
		else return false;
	}
	
	//METHOD TO UPDATE CONTACT NUMBER
	public boolean updateContact(int uid, Long contact) {
		String query = Query.upd_contact;
		if(this.template.update(query, contact, uid) > 0) return true;
		else return false;
	}
	
	//METHOD TO UPDATE PASSWORD
	public boolean updatePassword(int uid, String password) {
		String query = Query.upd_password;
		if(this.template.update(query, password, uid) > 0) return true;
		else return false;
	}
	
	//METHOD TO DELETE A USER
	public boolean deleteProfile(int uid, String password) {
		String query = Query.delete;
		if(this.template.update(query, uid, password) > 0) return true;
		else return false;
	}
	
}
