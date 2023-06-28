package com.madive.bigcommerce.madiveone.admin.domain;

import lombok.Data;

@Data
public class Company extends Base {

	private String compyId;
	private String compyOwnerNm;
	private String compyNm;
	private String compyConHol;
	private String compyEmail;
	private String compyPhone;
	private String compyCltId;
	private String compySecKey;
	private String compyDom;
	private String compyConStrDt;
	private String compyConEndDt;
	private int compyStatus;
	
}