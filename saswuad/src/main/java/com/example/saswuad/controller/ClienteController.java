package com.example.saswuad.controller;

//import java.util.ArrayList;
import java.util.List;

import com.example.saswuad.dto.ClienteDTO;
//import com.example.saswuad.entities.Cliente;
import com.example.saswuad.services.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")

public class ClienteController {
    
    @Autowired
    private ClienteService service;
    
    @GetMapping
    public ResponseEntity<List<ClienteDTO>> getCliente(){
        List<ClienteDTO> list = service.getClientes();
        return ResponseEntity.ok().body(list);
        
    }

}
