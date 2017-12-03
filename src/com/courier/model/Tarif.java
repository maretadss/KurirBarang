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
public class Tarif {
    
    private String kotaTujuan;
    private String pembayaran;
    private Tipe tipeLayanan;
    private Dimensi dimensi;
    private String provinsi;

    public Tarif() {
        
    }
    
    /**
     * @return the kotaTujuan
     */
    public String getKotaTujuan() {
        return kotaTujuan;
    }

    /**
     * @param kotaTujuan the kotaTujuan to set
     */
    public void setKotaTujuan(String kotaTujuan) {
        this.kotaTujuan = kotaTujuan;
    }


    /**
     * @return the pembayaran
     */
    public String getPembayaran() {
        return pembayaran;
    }

    /**
     * @param pembayaran the pembayaran to set
     */
    public void setPembayaran(String pembayaran) {
        this.pembayaran = pembayaran;
    }
    
    /**
     * @return the jasaLayanan
     */
    public Tipe getTipeLayanan() {
        return tipeLayanan;
    }

    /**
     * @param jasaLayanan the jasaLayanan to set
     */
    public void setTipeLayanan(Tipe jasaLayanan) {
        this.tipeLayanan = jasaLayanan;
    }
    
    @Override
    public String toString() {
        return getKotaTujuan(); //To change body of generated methods, choose Tools | Templates.
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
     * @return the dimensi
     */
    public Dimensi getDimensi() {
        return dimensi;
    }

    /**
     * @param dimensi the dimensi to set
     */
    public void setDimensi(Dimensi dimensi) {
        this.dimensi = dimensi;
    }
 
}
