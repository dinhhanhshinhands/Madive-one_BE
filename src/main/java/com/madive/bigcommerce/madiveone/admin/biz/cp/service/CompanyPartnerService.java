package com.madive.bigcommerce.madiveone.admin.biz.cp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.madive.bigcommerce.madiveone.admin.biz.cp.mapper.CompanyPartnerMapper;
import com.madive.bigcommerce.madiveone.admin.domain.Result;

@Service
@Transactional
public class CompanyPartnerService {

	@Autowired
	private CompanyPartnerMapper companyPartnerMapper;

	public Result getList(String condition, String keyword) {
		return Result.LIST(companyPartnerMapper.getList(condition, keyword));
	}
}