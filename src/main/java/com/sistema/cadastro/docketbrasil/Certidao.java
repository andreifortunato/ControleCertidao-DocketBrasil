package com.sistema.cadastro.docketbrasil;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Bean;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

@Getter
@Setter @NoArgsConstructor
public class Certidao {

    Certidao certidao = new Certidao();


    public void CertidaoUpload(String pasta, String certidao) {

        String caminhoArquivo = pasta + "/" + certidao;
        File novoArquivo = new File(certidao);

    };


            @Override
            protected void  Certidao( String certidao);{
            Scanner ler = new Scanner(System.in);

            ArrayList<String> certidaoList = new ArrayList();

                      certidaoList.add("01;Paulo Cesar; Rua Assis; 3R451010TF1");
                      certidaoList.add("02 ; Jonas Santos; Rua Rodi; 3R451010TF2");
                      certidaoList.add("03; Carlos Patrick; Rua Esperança;  3R451010TF3");
                      certidaoList.add("04; Gerson Fontes; Rua Lemans  3R451010TF4");
                      certidaoList.add("06 ; Jefferson Lima; Rua Operaria 3E451010TF1");
                      certidaoList.add("07 ; Arnaldo Gomes; Rua Assis 3E451010TF2");
                      certidaoList.add("08; Julia Farias; Rua Assis  3E451010TF3");
                      certidaoList.add("09; Jansei dos Santos; Rua Augusta  3E451010TF4");
                      certidaoList.add("10 ; Armando Lélis; Rua Lajes 3S451010TF1");
                      certidaoList.add("11 ; Zacarias Faustino; Rua Assis 3S451010TF2");
                      certidaoList.add("12; Abrão de Lemos; Rua Assis  3S451010TF3");
                      certidaoList.add("13; Juca Cardoso; Rua Assis  3S451010TF4");


            Integer i;

            System.out.printf("Conferindo lista por indice\n");
            Integer n = certidaoList.size();
            for (i=0; i<n; i++) {
                System.out.printf("Posição %d- %s\n", i, certidaoList.get(i));
            }

            System.out.printf("\nInforme a certi a ser excluída:\n");
            i = ler.nextInt();


            System.out.printf("\nVerificando Lista\n");
            i = 0;
            for (String indice: certidaoList) {
                System.out.printf("Ordem da Lista %d- %s\n", i, certidaoList);
                i++;
            }
            System.out.printf("\nPercorrendo o ArrayList (usando iterator)\n");
            i = 0;
            Iterator<String> iterator = certidaoList.iterator();
            while (iterator.hasNext()) {
                System.out.printf("Posição %d- %s\n", i, iterator.next());
                i++;
            }
        }

    }


