package com.spring.mapper.main;

import com.spring.model.Supplier;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * Created by SAM on 2017/10/10.
 */
@Component
@Mapper
public interface SupplierMapper {

    Integer updateSupplier(Supplier supplier);

    Integer addSupplier(Supplier supplier);

    Integer deleteSupplierById(String name);

    Supplier findSupplierById(String name);

}

















