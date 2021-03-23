package io.github.asanovs.autobot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;

@SpringBootApplication
public class AutobotApplication {

	public static void main(String[] args) {
		ApiContextInitializer.init();
		SpringApplication.run(AutobotApplication.class, args);
	}

}
