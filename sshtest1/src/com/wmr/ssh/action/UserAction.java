package com.wmr.ssh.action;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		System.out.println("action.............running!");
		return NONE;
	}
}
