package com.example.demo.controller

import com.example.demo.entity.User
import com.example.demo.repo.UserRepo
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController(private val repository: UserRepo) {

    @GetMapping
    fun getAllUsers(): Iterable<User> = repository.findAll()

    @PostMapping
    fun addUser(@RequestBody user: User): User = repository.save(user)
}
