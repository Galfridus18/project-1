package Hibernate;

import jakarta.persistence.Entity;

@Entity
public class Manager {
    private int id;
    private String name;
    private String email;
    private String gender;
    private String username;
    private String password;
    private boolean isLogged;

    public Manager() {
    }

    public Manager(int id, String name, String email, String gender, String username, String password, boolean isLogged) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.username = username;
        this.password = password;
        this.isLogged = isLogged;
    }

    public Manager(String name, String email, String gender, String username, String password, boolean isLogged) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.username = username;
        this.password = password;
        this.isLogged = isLogged;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLogged() {
        return isLogged;
    }

    public void setLogged(boolean logged) {
        isLogged = logged;
    }
}
