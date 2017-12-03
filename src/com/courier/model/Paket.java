/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.courier.model;

import com.courier.dao.TarifFileDAO;
import java.util.Date;

/**
 *
 * @author usser
 */
public class Paket {

    private String noPaket;
    private TarifFileDAO tfd;
    private Tarif paketTarif;
    private double berat;
    private double hargaBarang;
    private Date tanggalKirim;

    public Paket() {
    }

    public Paket(TarifFileDAO tfd) {
        this.tfd = tfd;
    }

    public double biayaAsuransi(int index) {
        double biaya = 0.0;
        paketTarif = tfd.getTarifs().get(index);
        biaya = getHargaBarang() * 0.003;
        return biaya;
    }
    public double totalBiayaECONonAsuransi(int index) {
        double ecoas = 0.0;
        paketTarif = tfd.getTarifs().get(index);
        ecoas = paketTarif.getTipeLayanan().getECO() * getBerat();
        return ecoas;

    }

    public double totalBiayaECOWithAsuransi(int index) {
        double ecoas = 0.0;
        paketTarif = tfd.getTarifs().get(index);
        ecoas = totalBiayaECONonAsuransi(index) + biayaAsuransi(index);
        return ecoas;
    }

    public double totalBiayaREGNonAsuransi(int index) {
        double reg = 0.0;
        paketTarif = tfd.getTarifs().get(index);
        reg = paketTarif.getTipeLayanan().getREG() * getBerat();
        return reg;

    }

    public double totalBiayaREGWithAsuransi(int index) {
        double regas = 0.0;
        paketTarif = tfd.getTarifs().get(index);
        regas = totalBiayaREGNonAsuransi(index) + biayaAsuransi(index);
        return regas;
    }
    
    public double totalBiayaONSNonAsuransi(int index) {
        double ons = 0.0;
        paketTarif = tfd.getTarifs().get(index);
        ons = paketTarif.getTipeLayanan().getONS() * getBerat();
        return ons;
    }

    public double totalBiayaONSWithAsuransi(int index) {
        double onsas = 0.0;
        paketTarif = tfd.getTarifs().get(index);
        onsas = totalBiayaONSNonAsuransi(index) + biayaAsuransi(index);
        return onsas;
    }
    
    public double totalBiayaHDSNonAsuransi(int index) {
        double hds = 0.0;
        paketTarif = tfd.getTarifs().get(index);
        hds = paketTarif.getTipeLayanan().getHDS() * getBerat();
        return hds;
    }

    public double totalBiayaHDSWithAsuransi(int index) {
        double hdsas = 0.0;
        paketTarif = tfd.getTarifs().get(index);
        hdsas = totalBiayaHDSNonAsuransi(index) + biayaAsuransi(index);
        return hdsas;
    }

    public double totalBiayaSDSNonAsuransi(int index) {
        double sds = 0.0;
        paketTarif = tfd.getTarifs().get(index);
        sds = paketTarif.getTipeLayanan().getSDS() * getBerat();
        return sds;
    }

    public double totalBiayaSDSWithAsuransi(int index) {
        double sdsas = 0.0;
        paketTarif = tfd.getTarifs().get(index);
        sdsas = totalBiayaSDSNonAsuransi(index) + biayaAsuransi(index);
        return sdsas;
    }


    /**
     * @return the noPaket
     */
    public String getNoPaket() {
        return noPaket;
    }

    /**
     * @param noPaket the noPaket to set
     */
    public void setNoPaket(String noPaket) {
        this.noPaket = noPaket;
    }

    /**
     * @return the paketTarif
     */
    public Tarif getPaketTarif() {
        return paketTarif;
    }

    /**
     * @param paketTarif the paketTarif to set
     */
    public void setPaketTarif(Tarif paketTarif) {
        this.paketTarif = paketTarif;
    }

    /**
     * @return the berat
     */
    public double getBerat() {
        return berat;
    }

    /**
     * @param berat the berat to set
     */
    public void setBerat(double berat) {
        this.berat = berat;
    }

    /**
     * @return the hargaBrang
     */
    public double getHargaBarang() {
        return hargaBarang;
    }

    /**
     * @param harga the harga to set
     */
    public void setHargaBarang(double hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    /**
     * @return the tfd
     */
    public TarifFileDAO getTfd() {
        return tfd;
    }

    /**
     * @param tfd the tfd to set
     */
    public void setTfd(TarifFileDAO tfd) {
        this.tfd = tfd;
    }

    /**
     * @return the tanggalKirim
     */
    public Date getTanggalKirim() {
        return tanggalKirim;
    }

    /**
     * @param tanggalKirim the tanggalKirim to set
     */
    public void setTanggalKirim(Date tanggalKirim) {
        this.tanggalKirim = tanggalKirim;
    }

}
