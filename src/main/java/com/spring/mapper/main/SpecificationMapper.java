package com.spring.mapper.main;

import com.spring.model.Specification;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * Created by SAM on 2017/10/10.
 */
@Component
@Mapper
public interface SpecificationMapper {

    Integer updateSpecification(Specification specification);

    Integer addSpecification(Specification specification);

    Integer deleteSpecificationByName(int id);

    Specification findSpecificationByName(int id);

}

















