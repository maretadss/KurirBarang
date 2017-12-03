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
public class cobaaja {
    public static void main(String[] args) {
        TarifFileDAO tff = new  TarifFileDAO();
        Tarif ta = new Tarif();
        ta = tff.getTarifs().get(1);
        
        Paket pa = new Paket();
        pa.setHargaBarang(5000000);
        System.out.println(pa.totalBiayaREGWithAsuransi(3));
        System.out.println(ta.getTipeLayanan().getSDS()+" "+ ta.getTipeLayanan().getHDS() +ta.getKotaTujuan());
    }
}
