package com.project.screanmatch;

import com.project.screanmatch.model.Serie;
import com.project.screanmatch.service.ConsumoAPI;
import com.project.screanmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreanmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreanmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ConsumoAPI consumoAPI = new ConsumoAPI();

		var json = consumoAPI.obterDados("http://www.omdbapi.com/?t=game+of+thrones&apikey=3edd966a");

		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		Serie dados = conversor.obterDados(json, Serie.class);
		System.out.println(dados);
	}
}
