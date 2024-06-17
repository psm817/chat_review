package com.ll.chat_review.domain.chat.chatRoom.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatRoom {
    private long id;

    private String name;

    public ChatRoom(String name) {
        this.name = name;
    }
}
