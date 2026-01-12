package com.example.news.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "subscription")
data class SubscriptionDbModel(@PrimaryKey val topic : String)
