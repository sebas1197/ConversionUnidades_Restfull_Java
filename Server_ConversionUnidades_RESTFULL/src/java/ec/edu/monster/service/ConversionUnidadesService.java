/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.monster.service;

/**
 *
 * @author SebastianLG
 */
public class ConversionUnidadesService {
    
    public double pulgadasAcentimetros(double pulgadas){
        return pulgadas * 2.54;
    }
    
    public double centimetrosApulgadas(double centimetros){
        return centimetros / 2.54;
    }
    
}
