package com.example.news.data.local

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.Companion.CASCADE

@Entity(
    tableName = "articles",
    primaryKeys = ["topic", "url"],
    foreignKeys = [
        ForeignKey(
            entity = SubscriptionDbModel ::class,
            parentColumns = ["topic"],
            childColumns = ["topic"],
            onDelete = CASCADE
        )
    ]
)
data class ArticlesDbModel(
    val title : String,
    val description: String,
    val imageUrl : String?,
    val publishedAt: Long,
    val url : String,
    val topic: String
)
