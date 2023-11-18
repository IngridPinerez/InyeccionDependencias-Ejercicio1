package com.example.ejercicioDependencias1.service;
import com.example.ejercicioDependencias1.model.Message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service("emailService")
public class EmailMessageService implements IMessageService {

    List<Message> emailMessage;

    @Autowired
    public EmailMessageService() {
        this.emailMessage = new ArrayList<>();
    }

    @Override
    public Message sendMessage(Message message) {
        this.emailMessage.add(message);
        return message;
    }

    @Override
    public List<Message> getList() {
        return this.emailMessage;
    }

    @Override
    public Message getMessageBySenderName(String name) {
        Optional<Message> optMessage = this.emailMessage.stream().filter(m -> m.getSenderName().equals(name)).findFirst();
        return optMessage.get();
    }


}
