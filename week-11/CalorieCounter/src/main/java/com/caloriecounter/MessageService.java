package com.caloriecounter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    MessageRepository messageRepository;

    @Autowired
    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public String encrypting(Message message){
        String encodedText = "";
        int len = message.getMessageText().length();
        for(int x = 0; x < len; x++){
            char c = (char)(message.getMessageText().charAt(x) + message.getShift());
            if (c > 'z')
                encodedText += (char)(message.getMessageText().charAt(x) - (26-message.getShift()));
            else
                encodedText += (char)(message.getMessageText().charAt(x) + message.getShift());
        }
        message.setMessageText(encodedText);
        return encodedText;
    }


    public void saveCodedMessageToDB(Message message){
        messageRepository.save(message);
    }

}
