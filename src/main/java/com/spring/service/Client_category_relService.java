package com.spring.service;

import com.spring.model.Client_category_rel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by SAM on 2017/10/9.
 */
@Mapper
public interface Client_category_relService {

   Integer  addClient_category_rel(Client_category_rel client_category_rel);

   Integer update(Client_category_rel client_category_rel);

   Integer deleteByName(String clientId);

   List<Client_category_rel > findByName(String clientId);


}
