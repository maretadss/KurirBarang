/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.courier.dao;

import com.courier.model.Tarif;
import com.courier.model.Tipe;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class TarifFileDAO {

    public List<Tarif>getTarifs() {
        
        List<Tarif> daftarTarifs = new ArrayList<>();

        try {
            Scanner scan;
            scan = new Scanner(new File("tarif.txt"));
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] data = line.split(",");
                
                Tarif tarif = new Tarif();
                tarif.setKotaTujuan(data[0]);
                
                Tipe tipe = new Tipe();
                tarif.setJasaLayanan(tipe);
                
                tarif.getJasaLayanan().setReg(Double.parseDouble(data[1].trim()));
                tarif.getJasaLayanan().setKilat(Double.parseDouble(data[2].trim()));
                tarif.getJasaLayanan().setSds(Double.parseDouble(data[3].trim()));
                tarif.getJasaLayanan().setOns(Double.parseDouble(data[4].trim()));
                tarif.getJasaLayanan().setHds(Double.parseDouble(data[5].trim()));

                daftarTarifs.add(tarif);


            }

        } catch (FileNotFoundException fileErr) {
            //fileErr.printStackTrace();
            System.out.println("File Tidak Ada");
        }
    
        return daftarTarifs;
    
    }
}