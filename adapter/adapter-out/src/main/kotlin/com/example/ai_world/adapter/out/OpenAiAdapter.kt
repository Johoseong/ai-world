package com.example.ai_world.adapter.out

import com.example.ai_world.port.out.AiChatPort
import org.springframework.ai.chat.client.ChatClient
import org.springframework.stereotype.Component

@Component
internal class OpenAiAdapter(
    private val chatClient: ChatClient,
) : AiChatPort {

    override fun chat(content: String): String {
        return chatClient.prompt()
            .user(content)
            .call()
            .content()
    }
}
