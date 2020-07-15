package com.kuls.handler;

import com.kuls.pojo.Address;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author kuls
 * @Desc 公众号：JAVAandPython君
 * @date 2020/4/3 7:29 下午
 */
public class AddressTypeHandler extends BaseTypeHandler<Address> {
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, Address parameter, JdbcType jdbcType) throws SQLException {

         ps.setString(i,parameter.toString());
    }

    //下面三个getXXX方法，将数据库获得的记录集里的address字段转成java Address类型的对象。
    @Override
    public Address getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return new Address(rs.getString(columnName));
    }

    @Override
    public Address getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return new Address(rs.getString(columnIndex));
    }

    @Override
    public Address getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return new Address(cs.getString(columnIndex));
    }
}
