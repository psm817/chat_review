package com.ll.chat_review.domain.chat.chatRoom.controller;

import com.ll.chat_review.domain.chat.chatRoom.entity.ChatRoom;
import com.ll.chat_review.domain.chat.chatRoom.service.ChatRoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/chat/room")
@RequiredArgsConstructor
public class ChatRoomController {
    private final ChatRoomService chatRoomService;

    @GetMapping("/{roomId}")
    @ResponseBody
    public String showRoom(@PathVariable("roomId") final long roomId,
                           @RequestParam(value = "writerName", defaultValue = "NoName") final String writerName) {
        return "%d번 채팅방 입니다. writer : %s".formatted(roomId, writerName);
    }

    @GetMapping("/make")
    public String showMake() {
        return "domain/chat/chatRoom/make";
    }

    @PostMapping("/make")
    public String showMake(@RequestParam(value = "name", defaultValue = "") final String name) {
        chatRoomService.make(name);

        return "redirect:/chat/room/make?message=Chat Room Created";
    }

    @GetMapping("/list")
    @ResponseBody
    public List<ChatRoom> showList() {
        return chatRoomService.findAll();
    }

}
