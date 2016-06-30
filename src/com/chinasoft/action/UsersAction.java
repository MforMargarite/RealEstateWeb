package com.chinasoft.action;

import com.chinasoft.pojo.Users;
import com.chinasoft.service.UsersService;

public class UsersAction {
	private UsersService service; //ҵ��ӿڶ�����Spring����������в���new��ֻ��get��set
	private Users users; //�û�����
	private String msg; //����ҳ���ֵ

	public UsersService getService() {
		return service;
	}

	public void setService(UsersService service) {
		this.service = service;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	//action�з����ķ���ֵ����ֻ����String
	//struts��ֵ����get��setʵ�֣�����action���еķ�����Ҫ������! ����ᱨ404
	public String login(){
		Users users1 = service.login(users);
		if(users1 != null){
			//�浽session
			msg = "��½�ɹ�";
			return "success";
		}
		else{
			msg = "��½ʧ��";
			return "error";
		}
	}
	
	public Users loiginTest(Users users){
		return service.login(users);
	}
	
	public String register(){
		Boolean flag = service.register(users);
		
		if(flag == true){
			//�浽session
			msg = "ע��ɹ�";
			return "success";
		}
		else{
			msg = "ע��ʧ��";
			return "error";
		}
	}
	
	
	
}