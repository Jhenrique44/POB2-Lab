package com.example.saswuad.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.saswuad.entities.Cliente;

public class ClienteRepository {
    
    public List<Cliente> getClientes(){


        Cliente c = new Cliente();
        c.setId(1l);
        c.setName("joao");
        c.setAddress("rua x, 00");
            
        Cliente x = new Cliente();
        x.setId(2l);
        x.setName("jose");
        x.setAddress("rua y, 00");

        Cliente z = new Cliente();
        z.setId(3l);
        z.setName("josue");
        z.setAddress("rua z, 00");
    
        List<Cliente> list= new ArrayList<>();
        list.add(c);
        list.add(x);
        list.add(z);

        return list;
    }

}
