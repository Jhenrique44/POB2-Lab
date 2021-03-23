package com.example.saswuad.repository;

import com.example.saswuad.entities.Client;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface ClientRepository extends JpaRepository <Client,Long> {
    

    //Uma consulta JPQL (sintaxe diferente de SQL)!!!
    @Query("SELECT c FROM Client c" + 
            "WHERE" + 
            "LOWER(c.name) LIKE LOWER(CONCAT('%', :name, '%')) AND " +
            "LOWER(c.address) LIKE LOWER(CONCAT('%', :address, '%')) "
    ) //SELECT da entidade Client e não da tabela
    public Page<Client> find(Pageable pageRequest, String name, String address);


}