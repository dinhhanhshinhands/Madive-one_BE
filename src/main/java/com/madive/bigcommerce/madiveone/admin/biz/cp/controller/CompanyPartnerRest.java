package com.madive.bigcommerce.madiveone.admin.biz.cp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.madive.bigcommerce.madiveone.admin.biz.cp.dto.CompanyPartnerRespDto;
import com.madive.bigcommerce.madiveone.admin.biz.cp.service.CompanyPartnerService;
import com.madive.bigcommerce.madiveone.admin.domain.Company;
import com.madive.bigcommerce.madiveone.admin.domain.Result;
import com.madive.bigcommerce.madiveone.admin.exception.AdminAuthenticationException;
import com.madive.bigcommerce.madiveone.admin.exception.ErrorType;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("api/v1/")
@Tag(name = "Company Partner")
public class CompanyPartnerRest {
	
	@Autowired
	private CompanyPartnerService companyPartnerService;

	@GetMapping("company/query-list")
	@Operation(method = "POST", summary = "API get list company partner.")
	public Result list(@RequestParam(value = "condition", required = true) String condition, @RequestParam(value = "keyword", required = false) String keyword ) {
		
		List<Company> listCompany = companyPartnerService.getList(condition, keyword);
		List<CompanyPartnerRespDto> listResp = new ArrayList<>();
		
		if (listCompany.isEmpty()) {
			throw new AdminAuthenticationException(ErrorType.DATA0001); // Search Error.
		} else {
			for (Company rs : listCompany) {
				CompanyPartnerRespDto resp = new CompanyPartnerRespDto();
				
				resp.setCompyId(rs.getCompyId());
				resp.setCompyNm(rs.getCompyNm());
				resp.setCompyConHol(rs.getCompyConHol());
				resp.setCompyPhone(rs.getCompyPhone());
				resp.setCompyEmail(rs.getCompyEmail());
				resp.setCompyConStrDt(rs.getCompyConStrDt());
				resp.setCompyConEndDt(rs.getCompyConEndDt());
				
				listResp.add(resp);
			}
		}

		return Result.LIST(listResp);
	}
}