package com.fsoft.entity;

public class Certificate {
	
	String certificateId;
	String certificateName;
	String certificateRank;
	String certificateDate;
	
	
	public String getCertificateId() {
		return certificateId;
	}



	public void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
	}


	public String getCertificateName() {
		return certificateName;
	}



	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}


	public String getCertificateRank() {
		return certificateRank;
	}


	public void setCertificateRank(String certificateRank) {
		this.certificateRank = certificateRank;
	}


	public String getCertificatedDate() {
		return certificateDate;
	}


	public void setCertificatedDate(String certificateDate) {
		this.certificateDate = certificateDate;
	}


	public Certificate() {
		// TODO Auto-generated constructor stub
	}
	
	public Certificate(	String certificateId, String certificateName, String certificateRank, String certificatedDate) {
		this.certificateId = certificateId;
		this.certificateId = certificateName;
		this.certificateId = certificateRank;
		this.certificateId = certificatedDate;
	}

}
