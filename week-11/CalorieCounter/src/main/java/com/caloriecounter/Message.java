package com.caloriecounter;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@Setter
public class Message {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    private String messageText;
    private int shift;
    private Date date;

    public Message() {
        date=new Date();
    }

    public Message(String messageText, int shift) {
        this();
        this.messageText=messageText;
        this.shift=shift;
    }





}
