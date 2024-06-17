package com.ll.chat_review.domain.chat.chatRoom.entity;

import com.ll.chat_review.global.jpa.baseEntity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import static lombok.AccessLevel.PROTECTED;

@Entity
@AllArgsConstructor(access = PROTECTED)
@NoArgsConstructor(access = PROTECTED)
@Getter
@Setter
@SuperBuilder
@ToString(callSuper = true)
public class ChatMessage extends BaseEntity {
    @ManyToOne
    private ChatRoom chatRoom;

    private String writerName;

    private String content;
}
