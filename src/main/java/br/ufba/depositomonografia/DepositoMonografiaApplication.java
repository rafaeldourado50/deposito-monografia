package br.ufba.depositomonografia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class DepositoMonografiaApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(DepositoMonografiaApplication.class, args);
	}
}
