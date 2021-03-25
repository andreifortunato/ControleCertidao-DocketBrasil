package com.sistema.service.docketbrasil;

import com.sistema.cadastro.docketbrasil.DocketBrasilApplication;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;

@Service
@Getter @Setter
public class CartorioService extends DocketBrasilApplication {


        @Autowired

        private Repository CartorioRepository;

        public void salvar(String nome, String endereco ) {
            CartorioService.CartorioRepository.save( Cartorio(nome, endereco));
        }
        @Autowired
        public List<Cartorio> findAll() {
            return Repository.findAll();
        }

        public long count() {
            return Repository.count();
        }
        @Autowired
        public CartorioRepository findById(String id) {
            return Repository.findOne(id);
        }

        public void delete(Long id) {
            Repository.delete(id);
        }

    }
}
}
