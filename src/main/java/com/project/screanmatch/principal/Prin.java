package com.project.screanmatch.principal;

import com.project.screanmatch.model.Serie;
import com.project.screanmatch.service.ConsumoAPI;
import com.project.screanmatch.service.ConverteDados;

import java.util.Scanner;

public class Prin {

    private Scanner leitura = new Scanner(System.in);
    private final String ENDERECO = "http://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=3edd966a";
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConverteDados conversor = new ConverteDados();

    public void exibeMenu(){
        System.out.println("Digite o nome da série: ");
        var nomeSerie = leitura.nextLine();
        var json = consumoAPI.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);
        Serie dados = conversor.obterDados(json, Serie.class);
        System.out.println(dados);
    }

}
