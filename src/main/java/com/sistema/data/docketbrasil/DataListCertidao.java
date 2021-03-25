package com.sistema.data.docketbrasil;

import javafx.scene.chart.PieChart;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.io.File;


@Data(collection = "certidao")
@Getter
@Setter
public class DataListCertidao {


        @Id
        private Long id;
        protected String nome;
        protected String endereco;
        protected File certidao;


        public Data(String endereco , String nome) {
            this.endereco = endereco;
            this.nome = nome;

        }
    }


