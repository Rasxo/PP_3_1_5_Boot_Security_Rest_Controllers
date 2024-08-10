package ru.kata.spring.boot_security.demo.dto;

public class RoleDTO {
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name.replaceAll("ROLE_", "");
    }

    public void setName(String name) {
        this.name = name;
    }
}
