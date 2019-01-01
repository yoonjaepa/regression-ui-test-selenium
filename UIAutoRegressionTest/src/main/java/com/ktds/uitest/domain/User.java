package com.ktds.uitest.domain;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long 	id;
	private	String	usrId;
	private Long 	sysSeq;
	private String	usrPw;
	private String	usrNm;
	private String	regDttm;
	private String	usrYn;
	private String	lastModiId;


	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsrId() {
		return usrId;
	}
	public void setUsrId(String usrId) {
		this.usrId = usrId;
	}
	public Long getSysSeq() {
		return sysSeq;
	}
	public void setSysSeq(Long sysSeq) {
		this.sysSeq = sysSeq;
	}
	public String getUsrPw() {
		return usrPw;
	}
	public void setUsrPw(String usrPw) {
		this.usrPw = usrPw;
	}
	public String getUsrNm() {
		return usrNm;
	}
	public void setUsrNm(String usrNm) {
		this.usrNm = usrNm;
	}
	public String getRegDttm() {
		return regDttm;
	}
	public void setRegDttm(String regDttm) {
		this.regDttm = regDttm;
	}
	public String getUsrYn() {
		return usrYn;
	}
	public void setUsrYn(String usrYn) {
		this.usrYn = usrYn;
	}
	public String getLastModiId() {
		return lastModiId;
	}
	public void setLastModiId(String lastModiId) {
		this.lastModiId = lastModiId;
	}
	
}
