package com.marcos.crudclientes.repositories;

import com.marcos.crudclientes.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
