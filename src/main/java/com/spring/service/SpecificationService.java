package com.spring.service;

import com.spring.model.Specification;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by SAM on 2017/10/9.
 */
@Mapper
public interface SpecificationService {

   Integer  addSpecification(Specification specification);

   Integer update(Specification specification);
   
   Integer deleteByName(int id);

   Specification findByName(int id);


}
