package br.com.ferrosul.api.banco;

import br.com.ferrosul.api.banco.jdbc.Conexao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiBancoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiBancoApplication.class, args);
	}


}
