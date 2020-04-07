package com.propen.resismiop.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Wajib_Pajak")
public class WajibPajakModel {
    @Id
    @Column(name = "nop")
    private long nop;

    @NotNull
    @Column(name = "nama")
    private String nama;

    @NotNull
    @Column(name = "masa_pajak")
    private String masaPajak;

    public long getNop() {
        return nop;
    }

    public void setNop(long nop) {
        this.nop = nop;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMasaPajak() {
        return masaPajak;
    }

    public void setMasaPajak(String masaPajak) {
        this.masaPajak = masaPajak;
    }
}
