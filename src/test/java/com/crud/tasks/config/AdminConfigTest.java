package com.crud.tasks.trello.config;

import com.crud.tasks.config.AdminConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminConfigTest {
    @Autowired
    AdminConfig adminConfig;

    @Test
    public void testTrelloConfig() {
        assertEquals("mala123inez@gmail.com", adminConfig.getAdminMail());
    }
}