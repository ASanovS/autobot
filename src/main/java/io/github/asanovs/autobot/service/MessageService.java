package io.github.asanovs.autobot.service;

import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.objects.Update;

@Service
public class MessageService {
    public String onUpdateReceived(Update update) {
        return "Hello!";
    }
}
