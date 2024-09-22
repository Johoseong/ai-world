package com.example.ai_world.domain.service

import com.example.ai_world.port.`in`.ChattingPort
import com.example.ai_world.port.out.AiChatPort
import org.springframework.stereotype.Service

@Service
internal class ChatService(
    private val aiChatPort: AiChatPort,
) : ChattingPort {

    override fun chat(content: String): String {
        return aiChatPort.chat(content)
    }
}
