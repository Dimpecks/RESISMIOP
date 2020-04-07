package com.propen.resismiop.model;

import javax.persistence.Column;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

public class ManajerOperasionalModel {

    @NotNull
    @Column(name = "role")
    private String role;

    @OneToOne(mappedBy = "manager")
    private UserModel user;
}
