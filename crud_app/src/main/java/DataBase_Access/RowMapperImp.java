package DataBase_Access;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import Entities.User;

public class RowMapperImp implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		user.setUid(rs.getInt(1));
		user.setName(rs.getString(2));
		user.setEmail(rs.getString(3));
		user.setContact(rs.getLong(4));
		user.setPassword(rs.getString(5));
		return user;
	}

}
