package com.example.demo.repo

import com.example.demo.entity.User
import org.springframework.data.repository.CrudRepository

interface UserRepo : CrudRepository<User, Long>
