package com.mogujie.app.juandou.model.daoimpl;

import java.sql.SQLException;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import com.mogujie.app.juandou.model.dao.UsersDAO;
import com.mogujie.app.juandou.model.dataobject.User;

/**
 * 
 * @author lvpinglin
 *
 */
@Component
public interface UsersDAOImpl extends UsersDAO {
	
	@Select("SELECT uname name, email FROM Users WHERE email= #{email}")
	User getUserByEmail(@Param("email") String email) throws SQLException;

}
