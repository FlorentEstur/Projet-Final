package org.inti.repository;

import org.inti.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IClientRepository extends JpaRepository<Client, Integer> {

}
