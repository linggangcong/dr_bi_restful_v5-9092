package com.spring.service.impl;

import com.spring.mapper.main.SupplierMapper;
import com.spring.model.Supplier;
import com.spring.service.SupplierService;
import com.spring.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by SAM on 2017/10/10.
 */
@Service
public class SupplierServiceImpl implements SupplierService {
    @Autowired
    SupplierMapper supplierMapper;
    @Override
    public Integer  addSupplier(Supplier supplier){
        Integer num=supplierMapper.addSupplier(supplier);
        if(num==0){
            ExceptionUtil.dataNotExistException("增加失败");
        }
        return num;
    }

    @Override
    public Integer update(Supplier supplier){
        return supplierMapper.updateSupplier(supplier);
    }

    @Override
    public Integer deleteById(String desc) {
        return supplierMapper.deleteSupplierById(desc);
    }

    @Override
    public Supplier findById(String desc) {
        return supplierMapper.findSupplierById(desc);
    }
}
