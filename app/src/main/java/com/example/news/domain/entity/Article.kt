package com.example.news.domain.entity

import android.accessibilityservice.GestureDescription

data class Article(
    val title : String,
    val description: String,
    val imageUrl : String?,
    val publishedAt: Long,
    val url : String
)
