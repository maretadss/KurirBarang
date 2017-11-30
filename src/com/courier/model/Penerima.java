/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.courier.model;

/**
 *
 * @author user
 */
public class Penerima {
    private String nama;
    private String alamat;
    private String provinsi;
    private String kota;
    private int kodepos;
    private int nohp;

    public Penerima() {
    }

    public Penerima(String nama, String alamat, String provinsi, String kota, int kodepos, int nohp) {
        this.nama = nama;
        this.alamat = alamat;
        this.provinsi = provinsi;
        this.kota = kota;
        this.kodepos = kodepos;
        this.nohp = nohp;
    }

    
    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the provinsi
     */
    public String getProvinsi() {
        return provinsi;
    }

    /**
     * @param provinsi the provinsi to set
     */
    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    /**
     * @return the kota
     */
    public String getKota() {
        return kota;
    }

    /**
     * @param kota the kota to set
     */
    public void setKota(String kota) {
        this.kota = kota;
    }

    /**
     * @return the kodepos
     */
    public int getKodepos() {
        return kodepos;
    }

    /**
     * @param kodepos the kodepos to set
     */
    public void setKodepos(int kodepos) {
        this.kodepos = kodepos;
    }

    /**
     * @return the nohp
     */
    public int getNohp() {
        return nohp;
    }

    /**
     * @param nohp the nohp to set
     */
    public void setNohp(int nohp) {
        this.nohp = nohp;
    }
    
    
}
