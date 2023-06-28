package com.madive.bigcommerce.madiveone.admin.domain;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class Base {
	private String regId;	
	private Timestamp regDt; 
	private String updId;
	private Timestamp updDt;
}
