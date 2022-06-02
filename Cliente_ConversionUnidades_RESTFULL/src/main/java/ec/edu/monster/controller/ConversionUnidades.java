/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.monster.controller;

import ec.edu.monster.service.ConversionUnidadesService;



/**
 *
 * @author SebastianLG
 */
public class ConversionUnidades {
    
   private ConversionUnidadesService conversionUnidadesService = new ConversionUnidadesService();
   
   public double pulgadasAcentimetros(double pulgadas){
       return this.conversionUnidadesService.pulgadasAcentimetros(pulgadas);
   }
        
   public double centimetrosApulgadas(double centimetros){
       return this.conversionUnidadesService.centimetrosApulgadas(centimetros);
   }
}
