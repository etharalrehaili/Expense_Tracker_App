package com.example.expense_tracking_project.core.local.entities

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import java.util.Date

@Entity(
    tableName = "transactions",
    indices = [Index("categoryId")]
)
data class Transaction(
    @PrimaryKey(autoGenerate = true)
    val transaction_id: Int = 0, // change it
    val transactionId: Int = 0,

 //   val categoryId: Int,
    val categoryId: Int? = null, // make FK after screen add category
    val amount: Double,
    val date: Date,
    val note: String,
    val isDeleted: Boolean = false,
    val created_at: Date, // change it
    val createdAt: Date,
    val updated_at: Date, // change it
    val updatedAt: Date
)

