package com.propen.resismiop.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "user")
public class UserModel implements Serializable {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;

    @NotNull
    @Size(max = 50)
    @Column(name = "username", nullable = false)
    private String username;

    @NotNull
    @Lob
    @Column(name = "password", nullable = false)
    private String password;

    @NotNull
    @Column(name = "nama")
    private String nama;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "manajer_operasional_role",referencedColumnName = "role")
    private ManajerOperasionalModel manager;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "operator_role",referencedColumnName = "role")
    private OperatorModel operator;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_role", referencedColumnName = "id",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private RoleModel role;

    public OperatorModel getOperator() {
        return operator;
    }

    public void setOperator(OperatorModel operator) {
        this.operator = operator;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public ManajerOperasionalModel getManager() {
        return manager;
    }

    public void setManager(ManajerOperasionalModel manager) {
        this.manager = manager;
    }

    public RoleModel getRole() {
        return role;
    }

    public void setRole(RoleModel role) {
        this.role = role;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

}
