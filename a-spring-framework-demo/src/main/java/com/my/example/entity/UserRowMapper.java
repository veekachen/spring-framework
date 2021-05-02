package com.my.example.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

/**
 * d
 *
 * @author syj
 * CreateTime 2019/08/16
 * describe:
 */
public class UserRowMapper implements RowMapper {
    @Override
	@Nullable
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
        User user=new User();
        user.setId(resultSet.getInt("id"));
        user.setName(resultSet.getString("name"));
        user.setAge(resultSet.getInt("age"));
        return user;
    }
}
