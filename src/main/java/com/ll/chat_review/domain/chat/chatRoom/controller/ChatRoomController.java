package com.ll.chat_review.domain.chat.chatRoom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/chat/room")
public class ChatRoomController {
    @GetMapping("/{roomId}")
    @ResponseBody
    public String showRoom(@PathVariable("roomId") final long roomId,
                           @RequestParam(value = "writerName", defaultValue = "NoName") final String writerName) {
        return "%d번 채팅방 입니다. writer : %s".formatted(roomId, writerName);
    }

    @GetMapping("/make")
    @ResponseBody
    public String showMake() {
        return """
                <form action="">
                    <div>
                        <input type="text">
                    </div>
                    <div>
                        <input type="submit">
                    </div>
                </form>
                """.stripIndent();
    }

}
