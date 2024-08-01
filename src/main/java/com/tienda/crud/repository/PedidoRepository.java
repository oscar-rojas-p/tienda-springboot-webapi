package com.tienda.crud.repository;

import com.tienda.crud.model.Pedido;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PedidoRepository extends MongoRepository<Pedido,String> {
}
