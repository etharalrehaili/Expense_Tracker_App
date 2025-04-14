package com.example.expense_tracking_project.core.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "User")
data class User(
    @PrimaryKey(autoGenerate = true)
    val userId: Int = 0,
    val name: String,
    val created_at: Date, // change it
    val createdAt: Date,
    val updated_at: Date, // change it
    val updatedAt: Date
)
