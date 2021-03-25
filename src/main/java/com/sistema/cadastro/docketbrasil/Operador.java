package com.sistema.cadastro.docketbrasil;
import javafx.scene.input.DataFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.File;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Operador{

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;
        private String endereco;
        private File certidao;

}
