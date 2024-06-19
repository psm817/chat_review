package com.ll.chat_review.domain.chat.chatRoom.entity;

import com.ll.chat_review.global.jpa.baseEntity.BaseEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

import static lombok.AccessLevel.PROTECTED;

@Entity
@AllArgsConstructor(access = PROTECTED)
@NoArgsConstructor(access = PROTECTED)
@Getter
@Setter
@SuperBuilder
@ToString(callSuper = true)
public class ChatRoom extends BaseEntity {
    private String name;

    @OneToMany(mappedBy = "chatRoom", cascade = CascadeType.ALL, orphanRemoval = true)
    @Builder.Default
    @ToString.Exclude
    private List<ChatMessage> chatMessages = new ArrayList<>();

    public ChatRoom(String name) {
        this.name = name;
    }

    public ChatMessage writeMessage(String writerName, String content) {
        ChatMessage chatMessage = ChatMessage.builder()
                .chatRoom(this)
                .writerName(writerName)
                .content(content)
                .build();

        chatMessages.add(chatMessage);

        return chatMessage;
    }
}
