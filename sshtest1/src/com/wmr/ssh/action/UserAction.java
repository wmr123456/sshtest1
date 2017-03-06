package com.wmr.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.wmr.ssh.service.UserService;

public class UserAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	
	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public String execute() throws Exception {
		System.out.println("userACtion !");
		userService.add();
		return NONE;
	}
	public UserService getUserService() {
		return userService;
	}
	
	public void add(){
		System.out.println("userAction...........");
	}
}
