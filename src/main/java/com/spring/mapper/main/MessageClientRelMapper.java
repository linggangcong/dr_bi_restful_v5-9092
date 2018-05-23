package com.spring.mapper.main;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by SAM on 2017/12/4.
 */
@Mapper
public interface MessageClientRelMapper {
   // Integer addMessageClientRelMapper(MessageClientRelMapper messageClientRelMapper);

    Integer updateShow(@Param(value="clientId")int clientId ,@Param(value="messageId")int messageId);
    //依据clientId和messageId更改记录，show字段。
    Integer updateStatus(@Param(value="clientId")int clientId ,@Param(value="messageId")int messageId); //依据clientId和messageId更改记录，status字段。

   // Integer deleteMessageClientRelMapper(int id);

    //MessageClientRelMapper findById(int id);

}
