package com.esmediaz.microventas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.esmediaz.microventas.entity.ventasEntity;

public interface ventasRepository extends JpaRepository<ventasEntity, Integer> {

}
