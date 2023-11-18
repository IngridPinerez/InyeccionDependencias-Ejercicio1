package com.example.ejercicioDependencias1.service;
import com.example.ejercicioDependencias1.model.Message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service("textService")
public class TextMessageService implements IMessageService {

    List<Message> textMessage;

    @Autowired
    public TextMessageService() {
        this.textMessage = new ArrayList<>();
    }

    @Override
    public Message sendMessage(Message message) {
        this.textMessage.add(message);
        return message;
    }

    @Override
    public List<Message> getList() {
        return this.textMessage;
    }

    @Override
    public Message getMessageBySenderName(String name) {
        Optional<Message> optMessage = this.textMessage.stream().filter(m -> m.getSenderName().equals(name)).findFirst();
        return optMessage.get();
    }

}
