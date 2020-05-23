package com.se17e.bean;

public class User {
	/**
	 * 管理员类型用户
	 */
	public static final int USER_ADMIN = 1;
	
	/**
	 * 顾客类用户
	 */
	public static final int USER_CUSTOMER = 2;
	
	/**
	 * 前台类型用户
	 */
	public static final int USER_RECEPTIONIST = 3;
	
	private int id; //ID
	
	private String IDnumber; //身份证号
	
	private String password = "111111"; //密码：默认'111111'
	
	private String name; //用户姓名
	
	public User() {
		super();
	}
	
	public User(String iDnumber, String password) {
		super();
		IDnumber = iDnumber;
		this.password = password;
	}

	private int type = USER_CUSTOMER; // 账户类型：默认2为顾客；3为管理员，2为顾客，1为前台

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIDnumber() {
		return IDnumber;
	}

	public void setIDnumber(String iDnumber) {
		IDnumber = iDnumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
}
