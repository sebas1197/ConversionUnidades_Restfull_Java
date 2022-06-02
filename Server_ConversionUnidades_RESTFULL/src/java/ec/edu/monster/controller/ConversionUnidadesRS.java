/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.monster.controller;

import ec.edu.monster.service.ConversionUnidadesService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 *
 * @author SebastianLG
 */
@Path("/conversionesunidades")
public class ConversionUnidadesRS{
    
    private ConversionUnidadesService conversionUnidadesService = new ConversionUnidadesService(); 
    
    @GET
    @Path("/pulgadasacentimetros/{pulgadas}")
    public double pulgadasAcentimetros(@PathParam("pulgadas") double pulgadas){
        return this.conversionUnidadesService.pulgadasAcentimetros(pulgadas);
    }
    
    @GET
    @Path("/centimetrosapulgadas/{centimetros}")
    public double centimetrosApulgadas(@PathParam("centimetros") double centimetros){
        return this.conversionUnidadesService.centimetrosApulgadas(centimetros);
    }
    
}
