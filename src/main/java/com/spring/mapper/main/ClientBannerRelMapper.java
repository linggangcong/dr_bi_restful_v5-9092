package com.spring.mapper.main;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * Created by SAM on 2017/10/10.
 */
@Component
@Mapper
public interface ClientBannerRelMapper {

   // Integer updateClientBannerRel(ClientBannerRel clientBannerRel);

    //Integer addClientBannerRel(ClientBannerRel clientBannerRel);

    //Integer deleteClientBannerRelByName(int id);

    List<Map<String ,String>> findBannerByClientName(String name);

}

















