package com.example.secondhandmarket.chatdetail

data class ChatItem(
    val senderId: String,
    val message: String
) {
    constructor(): this("", "")
}
