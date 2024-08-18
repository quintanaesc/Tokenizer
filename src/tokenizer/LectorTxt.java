/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokenizer;

import java.io.*;

/**
 *
 * @author 2im3q
 */
public class LectorTxt {
    String ruta;
    String txt;
    public LectorTxt(String ruta) {
        this.ruta = ruta;
    }
    
    public  void escanear()  {
        try {
            BufferedReader bf=new BufferedReader(new FileReader(ruta));
            String tmp;
            while((tmp=bf.readLine()) != null){
                this.txt+="\n"+tmp;
            }
        } catch (Exception e) {
            System.err.println("no se encontro archivo o esta vacio");
        }
    } 
}
