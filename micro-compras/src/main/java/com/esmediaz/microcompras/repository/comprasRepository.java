package com.esmediaz.microcompras.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.esmediaz.microcompras.entity.comprasEntity;

public interface comprasRepository extends JpaRepository<comprasEntity, Integer> {

}
