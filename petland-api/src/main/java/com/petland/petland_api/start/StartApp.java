package com.petland.petland_api.start;

import com.petland.petland_api.model.Cadastro;
import com.petland.petland_api.model.Endereco;
import com.petland.petland_api.model.Perfil;
import com.petland.petland_api.repository.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;



@Component
public class StartApp implements ApplicationRunner {

    @Autowired
    private CadastroRepository repository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Cadastro matheus = new Cadastro();
        matheus.setNome("Matheus");
        //matheus.setId(1);

        Perfil perfil = new Perfil();
        perfil.setCliente(true);
        matheus.setPerfil(perfil);

        Endereco endereco = new Endereco();
        endereco.setLogradouro("Rua das Flores");
        endereco.setNumero("123");
        matheus.setEndereco(endereco);


        repository.save(matheus);
    }
}