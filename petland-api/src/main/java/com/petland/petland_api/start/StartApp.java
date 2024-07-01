package com.petland.petland_api.start;

import com.petland.petland_api.model.Animal;
import com.petland.petland_api.model.AnimalEspecie;
import com.petland.petland_api.repository.AnimalRepository;
import com.petland.petland_api.repository.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


@Component
public class StartApp implements ApplicationRunner {

    @Autowired
    private CadastroRepository cadastroRepository;

    @Autowired
    private AnimalRepository animalRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // Cadastro victor = new Cadastro();
        // victor.setNome("Victor");

        // Perfil perfil = new Perfil();
        // perfil.setCliente(true);
        // victor.setPerfil(perfil);

        // Endereco endereco = new Endereco();
        // endereco.setLogradouro("Rua das Flores");
        // endereco.setNumero("123");
        // victor.setEndereco(endereco);


        // cadastroRepository.save(victor);


        // Animal snoop = new Animal();
        // snoop.setNome("Snoop");
        // snoop.setAniversário(LocalDate.of(2015, 10, 10));
        // snoop.setEspecie(AnimalEspecie.CACHORRO);

        // animalRepository.save(snoop);
    }
}