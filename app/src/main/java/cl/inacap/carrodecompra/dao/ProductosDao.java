package cl.inacap.carrodecompra.dao;

import java.util.List;

import cl.inacap.carrodecompra.dto.Producto;

public interface ProductosDao {

    Producto save(Producto p);
    List<Producto> getAll();




}
