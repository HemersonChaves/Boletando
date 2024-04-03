package com.uece.boleto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uece.boleto.domain.ClienteEntity;

@SpringBootApplication
public class BoletoApplication {

	public static void main(String[] args) {
		// SpringApplication.run(BoletoApplication.class, args);
		
		ClienteEntity cleinte = new ClienteEntity(1l, "hemerson", "qwerty");
		System.out.println(cleinte.toString());

		ClienteEntity cleinte1 = new ClienteEntity();
		cleinte1.setId(123l);
		cleinte1.setNome("Jose");
		cleinte1.setSenha("jujuba");

		System.out.println(cleinte1.getNome() + " " + cleinte1.getSenha() + " " + cleinte1.getId());
	}

}
