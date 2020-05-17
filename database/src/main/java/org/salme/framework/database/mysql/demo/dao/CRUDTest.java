package org.salme.framework.database.mysql.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * salme
 */

@Component
public class CRUDTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    private static final String DELETE_SQL = "delete from test where id = %s";

    public void delete(long id){

        String sql = String.format(DELETE_SQL,id);

        jdbcTemplate.update(sql);
    }

    //只写一个，后面的自己想象

}
