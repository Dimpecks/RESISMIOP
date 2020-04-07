package com.propen.resismiop.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "nop")
public class NOPModel implements Serializable {
    @Id
    @Column(name = "Nop")
    private Long nop;

    @NotNull
    @Column(name = "kodeBlok")
    private int kodeBlok;

    @NotNull
    @Column(name = "kodeTandaKhusus")
    private int kodeTandaKhusus;

    @NotNull
    @Column(name = "kodeObjekPajak")
    private int kodeObjekPajak;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "provinsiId", referencedColumnName = "idProvinsi", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private ProvinsiModel provinsi;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "kotaId", referencedColumnName = "idKota", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private KotaModel kota;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "kecamatanId", referencedColumnName = "idKecamatan", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private KecamatanModel kecamatan;

    @OneToMany(mappedBy = "dataTransaksi", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<DataTransaksiModel> listData;

    public List<DataTransaksiModel> getListData() {
        return listData;
    }

    public void setListData(List<DataTransaksiModel> listData) {
        this.listData = listData;
    }

    public Long getNop() {
        return nop;
    }

    public void setNop(Long nop) {
        this.nop = nop;
    }

    public int getKodeBlok() {
        return kodeBlok;
    }

    public void setKodeBlok(int kodeBlok) {
        this.kodeBlok = kodeBlok;
    }

    public int getKodeTandaKhusus() {
        return kodeTandaKhusus;
    }

    public void setKodeTandaKhusus(int kodeTandaKhusus) {
        this.kodeTandaKhusus = kodeTandaKhusus;
    }

    public int getKodeObjekPajak() {
        return kodeObjekPajak;
    }

    public void setKodeObjekPajak(int kodeObjekPajak) {
        this.kodeObjekPajak = kodeObjekPajak;
    }

    public ProvinsiModel getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(ProvinsiModel provinsi) {
        this.provinsi = provinsi;
    }

    public KotaModel getKota() {
        return kota;
    }

    public void setKota(KotaModel kota) {
        this.kota = kota;
    }

    public KecamatanModel getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(KecamatanModel kecamatan) {
        this.kecamatan = kecamatan;
    }
}
