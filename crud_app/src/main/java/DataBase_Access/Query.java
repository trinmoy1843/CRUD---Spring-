package DataBase_Access;

public class Query {
	
	//LOGIN OR NEW REGISTRATION
	static String login = "select * from user where uid=? and password=?";
	static String insert = "insert into user(name, email, contact, password) values(?, ?, ?, ?)";
	
	//FETCHING DATA FROM DATABASE
	static String display = "select * from user";
	static String getUid = "select * from user where contact=?";
	
	//UPDATE PROFILE
	static String upd_name = "update user set name=? where uid=?";
	static String upd_email = "update user set email=? where uid=?";
	static String upd_contact = "update user set contact=? where uid=?";
	static String upd_password = "update user set password=? where uid=?";
	
	//DELETE PROFILE
	static String delete = "delete from user where uid=? and password=?";
	
}
