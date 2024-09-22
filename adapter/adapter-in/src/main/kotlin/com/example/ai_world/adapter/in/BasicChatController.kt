package com.example.ai_world.adapter.`in`

import com.example.ai_world.port.`in`.ChattingPort
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/basic/v1")
class BasicChatController(
    private val chattingPort: ChattingPort,
) {

    @PostMapping("/chat")
    fun chat(
        @RequestBody request: BasicChatRequest,
    ): String {
        return chattingPort.chat(request.content)
    }

    data class BasicChatRequest(
        val content: String,
    )
}