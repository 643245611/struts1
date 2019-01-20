package cn.itheima.service.impl;

import org.hibernate.Hibernate;

import cn.itheima.dao.UserDao;
import cn.itheima.dao.impl.UserDaoImpl;
import cn.itheima.domain.User;
import cn.itheima.service.UserService;
import cn.itheima.utils.HibernateUtils;

public class UserServiceImpl implements UserService {
	private UserDao ud = new UserDaoImpl();

	@Override
	public User login(User user) {
		User existu = ud.getByUserCode(user.getUser_code());
		HibernateUtils.getCurrentSession().getTransaction().begin();
		HibernateUtils.getCurrentSession().getTransaction().commit();
		
		if (existu == null) {
			throw new RuntimeException("≤ª¥Ê‘⁄");
		}
		if (!existu.getUser_password().equals(user.getUser_password())) {
			throw new RuntimeException("√‹¬Î¥ÌŒÛ");
		}
		return existu;
	}

}
