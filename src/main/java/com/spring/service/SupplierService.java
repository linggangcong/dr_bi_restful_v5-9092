package com.spring.service;

import com.spring.model.Supplier;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by SAM on 2017/10/9.
 */
@Mapper
public interface SupplierService {
   
   Integer  addSupplier(Supplier supplier);

   Integer update(Supplier supplier);

   Integer deleteById(String code);

   Supplier findById(String code);


}
