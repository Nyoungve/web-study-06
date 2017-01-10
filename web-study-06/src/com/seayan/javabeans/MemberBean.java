package com.seayan.javabeans;
//JavaBean 자바빈 파일 
//정보의 덩어리, 데이터의 저장소이다.(서버에서 데이터베이스로 정보를 전송할 때 데이터를 한꺼번에 처리 할 수 있는 효율성)
//자바의 데이터 은닉 기술 사용(private,public 접근제한자)
//액션 태그(usebean, setProperty, getProperty)와 함께 효율적인 사용.
//getter/setter 메소드를 사용해서 데이터를 저장하고 보내고..

public class MemberBean {
	//회원 정보를 저장할 필드 
	private String name;
	private String userid;
	private String nickname;
	private String pwd;
	private String email;
	private String phone;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
