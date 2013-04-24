/**
 * 
 */
package com.mogujie.app.juandou.biz;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mogujie.app.common.BizException;
import com.mogujie.app.juandou.model.dao.UsersDAO;
import com.mogujie.app.juandou.model.dataobject.User;

/**
 * @author yuexuqiang
 * 
 */
@Component
public class WelcomeManager {
	private UsersDAO usersDAO;

	public User getLoginInfo(String email) throws BizException {
		try {
			return usersDAO.getUserByEmail(email);
		}catch (SQLException e) {
			throw new BizException("get user error!", e);
		}
	}

	/**
	 * @param usersDAO
	 *            the usersDAO to set
	 */
	@Autowired
	public void setUsersDAO(UsersDAO usersDAO) {
		this.usersDAO = usersDAO;
	}
}
