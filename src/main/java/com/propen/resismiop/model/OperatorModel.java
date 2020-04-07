package com.propen.resismiop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "operator")
public class OperatorModel {
    @NotNull
    @Column(name = "role")
    private String role;

    @OneToOne(mappedBy = "manager")
    private UserModel user;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }
}
