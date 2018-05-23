package com.spring.dao;

import com.spring.model.Message;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by SAM on 2018/5/15.
 */
@Service
public class MessageDao {
    @Resource
    SqlSessionFactory ssf;
    //private  String resource = "com/mybatis/configuration/mybatis.xml";
    public List<Message> findAll(int pageSize, int offset){
        //Reader reader = Resources.getResourceAsReader(resource);
        //SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = ssf.openSession();
        //reader.close();

        Map<String,Integer> params = new HashMap<String,Integer>();
        params.put("pageSize", pageSize);
        params.put("offset", offset);
        List<Message> userList = session.selectList("com.spring.mapper.main.MessageMapper.findAll",params);
        session.commit();
        session.close();
        return userList;
    }
}
