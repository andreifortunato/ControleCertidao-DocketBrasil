package com.sistema.cadastro.docketbrasil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
  abstract class DocketBrasilApplication<endereco> {

	  public static void main(String[] args) {
		SpringApplication.run(DocketBrasilApplication.class, args);
	}



	private Long id;

	protected String name;
	protected endereco;
	protected File certidao;
	public String pasta;

	protected abstract void  CertidaoUpload(String certidao);
}



