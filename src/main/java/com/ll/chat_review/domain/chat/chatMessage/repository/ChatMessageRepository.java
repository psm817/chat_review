package com.ll.chat_review.domain.chat.chatMessage.repository;

import com.ll.chat_review.domain.chat.chatMessage.entity.ChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChatMessageRepository extends JpaRepository<ChatMessage, Long> {

    List<ChatMessage> findByChatRoomIdAndIdAfter(long roomId, long afterId);
}
