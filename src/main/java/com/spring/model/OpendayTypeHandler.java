package com.spring.model;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.*;
import java.text.SimpleDateFormat;

/**
 * Created by SAM on 2017/10/26.
 */
@MappedJdbcTypes({JdbcType.VARCHAR})
@MappedTypes({Date.class})
public class OpendayTypeHandler extends BaseTypeHandler<Date> {
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, Date date, JdbcType jdbcType) throws SQLException {
        SimpleDateFormat sdf =   new SimpleDateFormat( " yyyy年MM月dd日 " );
        String str = sdf.format(date);
        ps.setString(10,str);
    }

    @Override
    public Date getNullableResult(ResultSet resultSet, String s) throws SQLException {   //获取结果集，并把字段为s的列数据（字符串）转化为date.

        String str= resultSet.getString(s);
        String str1=str.replace("年","-").replace("月","-").replace("日","-");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
        java.util.Date d = null;
        try {
            d = format.parse(str1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        java.sql.Date date = new java.sql.Date(d.getTime());
        return date;
    }
    @Override
    public Date getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return null;
    }

    @Override
    public Date getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return null;
    }

}
