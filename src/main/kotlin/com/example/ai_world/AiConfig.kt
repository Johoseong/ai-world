package com.example.ai_world

import org.springframework.ai.chat.client.ChatClient
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class AiConfig {

    @Bean(name = ["openAiChatClient"])
    fun chatClient(builder: ChatClient.Builder): ChatClient {
        return builder.build()
    }
}
