package com.madive.bigcommerce.madiveone.admin.domain;

import java.util.Date;

import lombok.Data;

@Data
public class Base {
	private String regId;	
	private Date regDate; 
	private String updId;
	private Date updDate;
}
