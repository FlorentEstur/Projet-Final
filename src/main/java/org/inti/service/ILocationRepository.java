package org.inti.service;

import org.inti.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILocationRepository extends JpaRepository<Location, Integer> {

}
