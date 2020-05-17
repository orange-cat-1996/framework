package org.salme.framework.database;

import org.junit.jupiter.api.Test;
import org.salme.framework.database.mysql.demo.dao.CRUDTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DatabaseApplicationTests {

    @Autowired
    private CRUDTest crudTest;

    @Test
    void contextLoads() {
        crudTest.delete(0);
    }

}
