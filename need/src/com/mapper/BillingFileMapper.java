package com.mapper;

import com.model.BillingFile;

public interface BillingFileMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BillingFile record);

    int insertSelective(BillingFile record);

    BillingFile selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BillingFile record);

    int updateByPrimaryKey(BillingFile record);
}