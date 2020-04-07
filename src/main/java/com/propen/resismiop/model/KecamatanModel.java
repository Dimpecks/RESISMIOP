package com.propen.resismiop.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "kecamatan")
public class KecamatanModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idKecamatan;

    @NotNull
    @Column(name = "nama")
    private String name;

    @OneToMany(mappedBy = "nop", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<NOPModel> listNOP;

    public Long getIdKecamatan() {
        return idKecamatan;
    }

    public void setIdKecamatan(Long idKecamatan) {
        this.idKecamatan = idKecamatan;
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
