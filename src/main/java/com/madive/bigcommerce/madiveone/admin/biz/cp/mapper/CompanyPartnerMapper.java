package com.madive.bigcommerce.madiveone.admin.biz.cp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.madive.bigcommerce.madiveone.admin.domain.Company;

@Mapper
public interface CompanyPartnerMapper {

	List<Company> getList(@Param("condition") String condition, @Param("keyword") String keyword);
	
}