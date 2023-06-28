package com.madive.bigcommerce.madiveone.admin.biz.cp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.madive.bigcommerce.madiveone.admin.biz.cp.service.CompanyPartnerService;
import com.madive.bigcommerce.madiveone.admin.domain.Result;

@RestController
@RequestMapping("api/v1/")
public class CompanyPartnerRest {
	
	@Autowired
	private CompanyPartnerService companyPartnerService;

	@GetMapping("company/query-list")
	public Result list(@RequestParam(value = "condition", required = true) String condition, @RequestParam(value = "keyword", required = false) String keyword ) {
		return companyPartnerService.getList(condition, keyword);
	}
}