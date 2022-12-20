package org.inti.service;

import org.inti.model.Achat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAchatRepository extends JpaRepository<Achat, Integer> {

}
