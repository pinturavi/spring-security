package com.pintu.secureapp;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.sql.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty
    @Column(unique = true)
    private String userName;

    @NotEmpty
    private String password;

    private Date dateCreated;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Authority> authorities = new HashSet<>();

    public User(){}

    public User(@NotEmpty String userName, @NotEmpty String password, Date dateCreated, Set<Authority> authorities) {
        this.userName = userName;
        this.password = password;
        this.dateCreated = dateCreated;
        this.authorities = authorities;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Set<Authority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Set<Authority> authorities) {
        this.authorities = authorities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getId() == user.getId() &&
                getUserName().equals(user.getUserName()) &&
                getPassword().equals(user.getPassword()) &&
                getDateCreated().equals(user.getDateCreated()) &&
                getAuthorities().equals(user.getAuthorities());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getUserName(), getPassword(), getDateCreated(), getAuthorities());
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", dateCreated=" + dateCreated +
                ", authorities=" + authorities +
                '}';
    }


}
