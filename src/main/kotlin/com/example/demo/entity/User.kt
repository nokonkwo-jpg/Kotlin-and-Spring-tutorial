package com.example.demo.entity

import jakarta.persistence.*

@Entity
@Table(name = "app_user")
data class User(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long? = null,
    val name: String,
    val age: Int,
    val email: String
)

