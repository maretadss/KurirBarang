/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.courier.model;

import com.courier.dao.TarifFileDAO;

/**
 *
 * @author user
 */
public class Paket {

    private String noPaket;
    private Tarif paketTarif;
    private double berat;

    public Paket() {
    }

    public double hitungTotalReguler(int index) {
        double reg = 0.0;
        TarifFileDAO tff = new TarifFileDAO();
        Tarif tarif = new Tarif();
        tarif = tff.getTarifs().get(index);
        reg = tarif.getJasaLayanan().getReg() * getBerat();
        return reg;
    }
    
    public double hitungTotalKilat(int index) {
        double kilat = 0.0;
        TarifFileDAO tff = new TarifFileDAO();
        Tarif tarif = new Tarif();
        tarif = tff.getTarifs().get(index);
        kilat = tarif.getJasaLayanan().getKilat() * getBerat();
        return kilat;
        
    }
    
  
    
    

    public double hitungBiayaWithAsuransi(int index) {
        double biayaasruansi = hitungTotalReguler(0) * 0.003;
        double biaya = hitungTotalReguler(0) + biayaasruansi;
        return biaya;
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

}
