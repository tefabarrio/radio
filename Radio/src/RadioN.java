/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author marianam
 */
public class RadioN extends RadioInterface{
    String[] arrayFM={"","","","","","","","","","","",""};
    String[] arrayAM={"","","","","","","","","","","",""};
    
    public String avanzar(String radio, boolean frecuencia){
        //am is true
        String newRad = null;
        if(frecuencia==true){
            int r;
            r=Integer.parseInt(radio);
            if(r<1610){
                r=r+10;    
            }
            else{
                r=530;
            }
            newRad=Integer.toString(r);
        }
        else if(frecuencia==false) {
            double r;
            r=Double.parseDouble(radio);
            double l=107.9;
            if(r<l){
                r=r+0.2;    
            }
            else{
                r=87.9;
            }
            newRad=Double.toString(r);
            
        }
        return newRad;
     
    }
    public boolean cambiarFrecuencia(boolean frecuencia){
        if(frecuencia==true){
            frecuencia=false;   
        }
        else if(frecuencia==false){
            frecuencia=true;
        }
        return frecuencia;   
    }
    public void guardar(int boton, boolean frecuencia, String radio){
        if(frecuencia==true){
            arrayAM[(boton-1)]=radio;
        }
        else{
            arrayFM[(boton-1)]=radio;
        }
    }
    public String seleccionarEmisora(int boton, boolean frecuencia){
        String radio;
        if(frecuencia==true){
            radio=arrayAM[(boton-1)];
        }
        else{
            radio=arrayFM[(boton-1)];
        }
        return radio;
    }    
    
}
    
    
    

