package com.madive.bigcommerce.madiveone.admin.biz.cp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.madive.bigcommerce.madiveone.admin.biz.cp.mapper.CompanyPartnerMapper;
import com.madive.bigcommerce.madiveone.admin.domain.Company;

@Service
@Transactional
public class CompanyPartnerService {

	@Autowired
	private CompanyPartnerMapper companyPartnerMapper;

	public List<Company> getList(String condition, String keyword) {
		return companyPartnerMapper.getList(condition, keyword);
	}
}