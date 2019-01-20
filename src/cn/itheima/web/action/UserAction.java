package cn.itheima.web.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


import cn.itheima.domain.User;
import cn.itheima.service.UserService;
import cn.itheima.service.impl.UserServiceImpl;

public class UserAction extends ActionSupport implements ModelDriven<User> {

	
	private User user = new User();
	private UserService us = new UserServiceImpl();

	public String login() throws Exception {
		User u = us.login(user);
		ActionContext.getContext().getSession().put("user", u);
		return "toHome"; 
	}

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return null;
	}
     
	
	
}
