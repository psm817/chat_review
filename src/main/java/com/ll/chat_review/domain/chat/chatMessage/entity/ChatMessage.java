package com.ll.chat_review.domain.chat.chatMessage.entity;

import com.ll.chat_review.domain.chat.chatRoom.entity.ChatRoom;
import com.ll.chat_review.global.jpa.baseEntity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;
import lombok.experimental.SuperBuilder;

import static lombok.AccessLevel.PROTECTED;

@Entity
@AllArgsConstructor(access = PROTECTED)
@NoArgsConstructor(access = PROTECTED)
@SuperBuilder
@Getter
@Setter
@ToString(callSuper = true)
public class ChatMessage extends BaseEntity {

    @ManyToOne
    private ChatRoom chatRoom;

    @Getter
    private String writerName;

    @Getter
    private String content;
}
