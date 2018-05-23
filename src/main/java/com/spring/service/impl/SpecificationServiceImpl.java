package com.spring.service.impl;

import com.spring.mapper.main.SpecificationMapper;
import com.spring.model.Specification;
import com.spring.service.SpecificationService;
import com.spring.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by SAM on 2017/10/10.
 */
@Service
public class SpecificationServiceImpl implements SpecificationService {
    @Autowired
    SpecificationMapper specificationMapper;
    @Override
    public Integer  addSpecification(Specification specification){
        return specificationMapper.addSpecification(specification);

    }

    @Override
    public Integer update(Specification specification){
        return specificationMapper.updateSpecification(specification);
    }

    @Override
    public Integer deleteByName(int id) {
        return specificationMapper.deleteSpecificationByName(id);
    }

    @Override
    public Specification findByName(int id) {
        Specification specification= specificationMapper.findSpecificationByName(id);
        return specification;
    }
}
