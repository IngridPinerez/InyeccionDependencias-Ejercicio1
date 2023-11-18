package com.example.ejercicioDependencias1.service;
import com.example.ejercicioDependencias1.model.Message;
import java.util.List;

public interface IMessageService {

    Message sendMessage(Message message);
    List<Message> getList();
    Message getMessageBySenderName(String name);

}
