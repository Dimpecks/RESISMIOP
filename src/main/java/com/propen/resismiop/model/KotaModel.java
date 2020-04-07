package com.propen.resismiop.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "kota")
public class KotaModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idKota;

    @NotNull
    @Column(name = "nama")
    private String name;

    @OneToMany(mappedBy = "nop", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<NOPModel> listNOP;

    public Long getIdKota() {
        return idKota;
    }

    public void setIdKota(Long idKota) {
        this.idKota = idKota;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<NOPModel> getListNOP() {
        return listNOP;
    }

    public void setListNOP(List<NOPModel> listNOP) {
        this.listNOP = listNOP;
    }
}
