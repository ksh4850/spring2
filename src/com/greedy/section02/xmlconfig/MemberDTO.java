package com.greedy.section02.xmlconfig;

public class MemberDTO {
	private int seqence;
	private String id;
	private String pwd;
	private String name;
	
	public MemberDTO() {
		
	}
	
	public MemberDTO(int seqence, String id, String pwd, String name) {
		super();
		this.seqence = seqence;
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}
	public int getSeqence() {
		return seqence;
	}
	public void setSeqence(int seqence) {
		this.seqence = seqence;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "MemberDTO [seqence=" + seqence + ", id=" + id + ", pwd=" + pwd + ", name=" + name + "]";
	}
	
	

}
