package cl.inacap.carrodecompra.dao;

import java.util.ArrayList;
import java.util.List;

import cl.inacap.carrodecompra.dto.Producto;

public class ProductosDaoLista implements ProductosDao{

    private static List<Producto> productos = new ArrayList<>();

    //Patron Singleton : --------------------------------------------------------------------
    //1. Una instancia como atributo estatico de si misma.
    //2. El constructor debe ser privado.
    //3. Debe existir un metodo que verifique la existencia de la unica instancia (getIntance).
    private static ProductosDaoLista instancia;

    public static ProductosDaoLista getInstance(){
        if(instancia == null){
            instancia = new ProductosDaoLista();

        }
        return instancia;
    }
    private ProductosDaoLista(){
        Producto p = new Producto();
        p.setNombre("Monster");
        p.setDescripcion("Energy Drink");
        p.setPrecio(1390);
        p.setFoto("https://www.monsterenergy.com/media/uploads_image/2017/08/24/auto/800/8d9c731bde87b449d987495082e24493.png?mod=v1_a1dabfbe49b39ec134b07732d3308ddb");
        productos.add(p);

        p = new Producto();
        p.setNombre("Red Bull");
        p.setDescripcion("Red Bull te da alas");
        p.setPrecio(1790);
        p.setFoto("https://jumbo.vteximg.com.br/arquivos/ids/331440/Principal-3882.jpg?v=637225817156530000");
        productos.add(p);

        p = new Producto();
        p.setNombre("Score");
        p.setDescripcion("Bebida energetica");
        p.setPrecio(1000);
        p.setFoto("https://www.cruzverde.cl/dw/image/v2/BDPM_PRD/on/demandware.static/-/Sites-masterCatalog_Chile/default/dw56009749/images/large/290967-bebida-energy-250-ml.jpg?sw=1000&sh=1000");
        productos.add(p);
    }
    @Override
    public Producto save(Producto p) {
        productos.add(p);
        return p;
    }

    @Override
    public List<Producto> getAll() {
        return productos;
    }
}
