package com.spring.model;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.*;
import java.text.SimpleDateFormat;

/**
 * Created by SAM on 2017/10/26.
 */
@MappedJdbcTypes({JdbcType.VARCHAR})
@MappedTypes({Date.class})
public class NullTypeHandler  implements TypeHandler<Timestamp>{
    @Override
    public void setParameter(PreparedStatement ps, int i, Timestamp parameter, JdbcType jdbcType) throws SQLException {
        SimpleDateFormat sdl=new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");
        String str=sdl.format(parameter);
        ps.setString(3,str);
    }


    @Override
    public Timestamp getResult(ResultSet rs, String upd_date) throws SQLException {
        String nullStr = rs.getString(upd_date);
        Timestamp aa = null;
        if (nullStr == "NULL") {
            //nullStr="0000-00-00 00:00:00";
            aa = new Timestamp(77777);
        }
        return aa;
    }

    @Override
    public Timestamp getResult(ResultSet rs, int columnIndex) throws SQLException {
        return null;
    }

    @Override
    public Timestamp getResult(CallableStatement cs, int columnIndex) throws SQLException {
        return null;
    }
}
