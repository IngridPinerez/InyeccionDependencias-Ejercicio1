package com.example.ejercicioDependencias1.controller;

import com.example.ejercicioDependencias1.model.Message;
import com.example.ejercicioDependencias1.service.EmailMessageService;
import com.example.ejercicioDependencias1.service.TextMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/v1/messages")
public class MessageController {
    private EmailMessageService emailService;
    private TextMessageService textService;

    @Autowired
    public MessageController(@Qualifier("emailService") EmailMessageService emailService, @Qualifier("textService") TextMessageService textService) {
        this.emailService = emailService;
        this.textService = textService;
    }

    @PostMapping("/sendEmail")
    public Message sendEmailMessage(@RequestBody() Message message){
        Message result = emailService.sendMessage(message);
        return result;
    }

    @GetMapping("/getListEmail")
    public List<Message> getListEmailMessage(){
        List<Message> result = emailService.getList();
        return result;
    }

    @GetMapping("/email/{value}")
    public Message getEmailMessage(@PathVariable("value") String value) {
        Message result = emailService.getMessageBySenderName(value);
        return result;
    }

    @PostMapping("/sendText")
    public Message sendTextMessage(@RequestBody() Message message){
        Message result = textService.sendMessage(message);
        return result;
    }

    @GetMapping("/getListText")
    public List<Message> getListTextMessage(){
        List<Message> result = textService.getList();
        return result;
    }

    @GetMapping("/text/{value}")
    public Message getTextMessage(@PathVariable("value") String value) {
        Message result = textService.getMessageBySenderName(value);
        return result;
    }
}
