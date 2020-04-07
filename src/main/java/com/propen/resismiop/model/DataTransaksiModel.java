package com.propen.resismiop.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "dataTransaksi")
public class DataTransaksiModel {

    @Id
    @Column(name = "nomor_transaksi")
    private long nomorTransaksi;

    /**
     *  If result "0" = Bapenda
     *  If result "1" = Bank
     */
    @NotNull
    @Column(name = "jenis")
    private int jenis;

    @NotNull
    @Column(name = "tanggal")
    private Date tanggal;

    @NotNull
    @Column(name = "jam")
    private Time jam;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "nop", referencedColumnName = "nop", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private NOPModel nop;

    @NotNull
    @Column(name = "denda")
    private int denda;

    @NotNull
    @Column(name = "jumlah_setoran")
    private int jumlahSetoran;

    @NotNull
    @Column(name = "luas_tanah")
    private Double luasTanah;

    @NotNull
    @Column(name = "luas_bangunan")
    private Double luasBangunan;

    @NotNull
    @Column(name = "kecamatan")
    private String kecamatan;

    @NotNull
    @Column(name = "kelurahan")
    private String kelurahan;

    @NotNull
    @Column(name = "masa_pajak")
    private String masaPajak;

    @NotNull
    @Column(name = "lokasi")
    private String lokasi;

    @NotNull
    @Column(name = "pokok")
    private int pokok;

    @NotNull
    @Column(name = "cabang")
    private String cabang;

    @NotNull
    @Column(name = "User")
    private String user;

    public long getNomorTransaksi() {
        return nomorTransaksi;
    }

    public void setNomorTransaksi(long nomorTransaksi) {
        this.nomorTransaksi = nomorTransaksi;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public Time getJam() {
        return jam;
    }

    public void setJam(Time jam) {
        this.jam = jam;
    }

    public NOPModel getNop() {
        return nop;
    }

    public void setNop(NOPModel nop) {
        this.nop = nop;
    }

    public int getDenda() {
        return denda;
    }

    public void setDenda(int denda) {
        this.denda = denda;
    }

    public int getJumlahSetoran() {
        return jumlahSetoran;
    }

    public void setJumlahSetoran(int jumlahSetoran) {
        this.jumlahSetoran = jumlahSetoran;
    }

    public Double getLuasTanah() {
        return luasTanah;
    }

    public void setLuasTanah(Double luasTanah) {
        this.luasTanah = luasTanah;
    }

    public Double getLuasBangunan() {
        return luasBangunan;
    }

    public void setLuasBangunan(Double luasBangunan) {
        this.luasBangunan = luasBangunan;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public String getKelurahan() {
        return kelurahan;
    }

    public void setKelurahan(String kelurahan) {
        this.kelurahan = kelurahan;
    }

    public String getMasaPajak() {
        return masaPajak;
    }

    public void setMasaPajak(String masaPajak) {
        this.masaPajak = masaPajak;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public int getPokok() {
        return pokok;
    }

    public void setPokok(int pokok) {
        this.pokok = pokok;
    }

    public String getCabang() {
        return cabang;
    }

    public void setCabang(String cabang) {
        this.cabang = cabang;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
