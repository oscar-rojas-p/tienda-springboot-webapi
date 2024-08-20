package com.tienda.crud.repository;

import com.tienda.crud.model.Cliente;
import com.tienda.crud.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    List<Producto> findAllByOrderByIdAsc();
}
