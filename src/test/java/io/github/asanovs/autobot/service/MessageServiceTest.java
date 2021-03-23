package io.github.asanovs.autobot.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.asanovs.autobot.config.Mapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = {TelegramBot.class, Mapper.class, MessageService.class})
class MessageServiceTest {

    @Autowired
    TelegramBot telegramBot;
    @Autowired
    ObjectMapper objectMapper;
    @Autowired
    MessageService messageService;

    @Test
    void onUpdateReceived() throws IOException {
        Update update = objectMapper.readValue(new File("src/test/resources/update.json"), Update.class);
        String actualResult = messageService.onUpdateReceived(update);
        String expectedResult = "Hello!";
        assertEquals(expectedResult, actualResult);
    }
}