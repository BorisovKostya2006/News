package com.example.news.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import kotlinx.coroutines.flow.Flow
@Dao
interface NewsDao {

    @Query("SELECT * from subscription")
    fun getAllSubscription() : Flow<List<SubscriptionDbModel>>

    @Insert
    suspend fun addSubscription(subscriptionDbModel: SubscriptionDbModel)

    @Transaction
    @Delete
    suspend fun deleteSubscription(subscriptionDbModel: SubscriptionDbModel)

    @Query("SELECT * from articles WHERE topic IN (:topics) ORDER BY publishedAt DESC")
    fun getAllArticles(topics : List<String>) : Flow<List<ArticlesDbModel>>

    @Insert
    suspend fun addArticles(articles: List<ArticlesDbModel>)

    @Query("DELETE FROM articles WHERE topic IN (:topics)")
    suspend fun deleteArticlesByTopic(topics : List<String>)
}