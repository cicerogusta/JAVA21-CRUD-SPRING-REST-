package com.example.springboot.domain.user;

public record RegisterDTO(String login, String password, UserRole role) {
}
