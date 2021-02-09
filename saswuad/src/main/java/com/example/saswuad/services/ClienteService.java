package com.example.saswuad.services;

import java.util.ArrayList;
import java.util.List;

import com.example.saswuad.dto.ClienteDTO;
import com.example.saswuad.entities.Cliente;
import com.example.saswuad.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    
    @Autowired
    private ClienteRepository reposity;

    public List<ClienteDTO> getClientes(){

        List<Cliente> list = reposity.getClientes();

        List<ClienteDTO> listDTO = new ArrayList<>();

        for(Cliente c: list){

            listDTO.add(new ClienteDTO(c.getId(), c.getName()));
        }
        return listDTO;
        

    }

}
