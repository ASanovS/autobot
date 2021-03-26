package io.github.asanovs.autobot;

import io.github.asanovs.autobot.config.Mapper;
import io.github.asanovs.autobot.service.MessageService;
import io.github.asanovs.autobot.service.TelegramBot;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {TelegramBot.class, Mapper.class, MessageService.class})
public class AutobotApplicationTests {

	@Test
	void contextLoads() {
	}

}
