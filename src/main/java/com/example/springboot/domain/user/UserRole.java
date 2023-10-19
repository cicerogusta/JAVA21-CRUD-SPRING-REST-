package com.example.springboot.domain.user;

public enum UserRole {
    ADMIN("admin"),
    USER("user");

    public String getRole() {
        return role;
    }

    private final String role;

    UserRole(String role) {
        this.role = role;
    }
}
