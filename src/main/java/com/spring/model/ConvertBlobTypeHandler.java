package com.spring.model;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.io.ByteArrayInputStream;
import java.sql.*;

/**
 * Created by SAM on 2017/12/1.
 */
public class ConvertBlobTypeHandler extends BaseTypeHandler<byte[]> {
    //###指定字符集
    private static final String DEFAULT_CHARSET = "utf-8";

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, byte[] parameter, JdbcType jdbcType) throws SQLException {
        ByteArrayInputStream bis;
        try {
            //###把字节数组转化成byte输入流
            bis = new ByteArrayInputStream(parameter);
        } catch (Exception e) {
            throw new RuntimeException("Blob Encoding Error!");
        }
        ps.setBinaryStream(i, bis);
    }

    @Override
    public byte[] getNullableResult(ResultSet rs, String columnName) throws SQLException {
        Blob blob = rs.getBlob(columnName);
        byte[] returnValue = null;
        if (null != blob) {
           return returnValue = blob.getBytes(1, (int) blob.length());
        }else {
            return  null;
        }
    }

    @Override
    public byte[] getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return null;
    }

    @Override
    public byte[] getNullableResult(ResultSet arg0, int arg1)
            throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }
}