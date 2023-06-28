package com.madive.bigcommerce.madiveone.admin.biz.cp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class CompanyPartnerRespDto {
	
	@JsonProperty("CompanyID")
	private String compyId;
	@JsonProperty("CompanyName")
	private String compyNm;
	@JsonProperty("CompanyContractHolder")
	private String compyConHol;
	@JsonProperty("CompanyPhone")
	private String compyPhone;
	@JsonProperty("CompanyEmail")
	private String compyEmail;
	@JsonProperty("CompanyContractStartDate")
	private String compyConStrDt;
	@JsonProperty("CompanyContractEndDate")
	private String compyConEndDt;
}