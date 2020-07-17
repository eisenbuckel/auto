package com.stahlberger.autos.repository;

import com.stahlberger.autos.entity.Auto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutoRepository extends JpaRepository<Auto,Integer> {

}
