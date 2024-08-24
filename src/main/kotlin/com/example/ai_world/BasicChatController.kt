package com.example.ai_world

import org.springframework.ai.chat.client.ChatClient
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/basic/v1")
class BasicChatController(
    private val chatClient: ChatClient,
) {

    @PostMapping("/chat")
    fun chat(
        @RequestBody request: BasicChatRequest,
    ): String {
        return chatClient.prompt()
            .user(request.content)
            .call()
            .content()
    }

    data class BasicChatRequest(
        val content: String,
    )
}