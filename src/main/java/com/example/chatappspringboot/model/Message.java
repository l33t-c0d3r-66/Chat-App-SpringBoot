package com.example.chatappspringboot.model;

import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Message {
    private String senderName;
    private String receiverName;
    private String message;
    private MessageType messageType;

}
