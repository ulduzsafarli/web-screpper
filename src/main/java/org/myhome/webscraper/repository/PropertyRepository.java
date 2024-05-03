package org.myhome.webscraper.repository;

import org.myhome.webscraper.model.Property;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PropertyRepository extends JpaRepository<Property,Integer> {
}
