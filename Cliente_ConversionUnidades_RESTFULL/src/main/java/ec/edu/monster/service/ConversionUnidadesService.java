/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.monster.service;

import ec.edu.monster.controller.ConversionUnidades;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SebastianLG
 */
public class ConversionUnidadesService {

    private final String URL = "http://localhost:8080/Server_ConversionUnidades_RESTFULL/api/conversionesunidades";

    public double pulgadasAcentimetros(double pulgadas) {
        final HttpRequest httpRequest = HttpRequest.newBuilder().GET()
                .uri(URI.create(URL + "/pulgadasacentimetros/" + pulgadas)).build();
        HttpClient httpClient = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();

        try {
            final HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            return Double.parseDouble(httpResponse.body());
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(ConversionUnidades.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public double centimetrosApulgadas(double centimetros){
        final HttpRequest httpRequest = HttpRequest.newBuilder().GET()
                .uri(URI.create(URL + "/centimetrosapulgadas/" + centimetros)).build();
        HttpClient httpClient = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();

        try {
            final HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            return Double.parseDouble(httpResponse.body());
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(ConversionUnidades.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

}
