package com.crud.tasks.trello.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TrelloConfigTest {
    @Autowired
    TrelloConfig trelloConfig;

    @Test
    public void testTrelloConfig() {
        assertEquals("https://api.trello.com/1", trelloConfig.getTrelloApiEndpoint());
        assertEquals("025e7195ef42872964fe681e1ddbb2e9", trelloConfig.getTrelloAppKey());
        assertEquals("40a31cbc7d4cbb1e79a0b17d9e1af706731ae9b5361f63cf97564dad8de20b83", trelloConfig.getTrelloToken());
    }
}