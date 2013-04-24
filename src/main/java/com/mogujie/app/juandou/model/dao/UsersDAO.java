/**
 * 
 */
package com.mogujie.app.juandou.model.dao;

import java.sql.SQLException;

import com.mogujie.app.juandou.model.dataobject.User;

/**
 * @author yuexuqiang
 * 
 *
 */
public interface UsersDAO {
	User getUserByEmail(String email) throws SQLException;
}
