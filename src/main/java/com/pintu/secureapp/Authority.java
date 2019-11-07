package com.pintu.secureapp;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int  id;

    @Enumerated(EnumType.STRING)
    private AuthorityType name;

    public Authority(){}

    public Authority(AuthorityType name) {
        this.name = name;
    }

    private int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Authority)) return false;
        Authority authority = (Authority) o;
        return getId() == authority.getId() &&
                getName() == authority.getName();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }

    AuthorityType getName() {
        return name;
    }

    public void setName(AuthorityType name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Authority{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}
