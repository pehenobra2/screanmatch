package com.project.screanmatch;

import com.project.screanmatch.model.Episodios;
import com.project.screanmatch.model.Serie;
import com.project.screanmatch.model.Temporada;
import com.project.screanmatch.principal.Prin;
import com.project.screanmatch.service.ConsumoAPI;
import com.project.screanmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ScreanmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreanmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Prin prin = new Prin();
		prin.exibeMenu();

	}
}
