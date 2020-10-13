package cl.inacap.carrodecompra;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

import adapters.ProductosListAdapter;
import cl.inacap.carrodecompra.dao.ProductosDao;
import cl.inacap.carrodecompra.dao.ProductosDaoLista;
import cl.inacap.carrodecompra.dto.Producto;

public class MainActivity extends AppCompatActivity {


    private ListView productosLV;
    private ProductosListAdapter adapter;

    private List<Producto> productos;
    private ProductosDao prodDAO = ProductosDaoLista.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setSupportActionBar( (Toolbar) findViewById(R.id.toolbar));
        this.productos = this.prodDAO.getAll();
        this.productosLV = findViewById(R.id.productos_lv);
        this.adapter = new ProductosListAdapter(this, R.layout.productos_list, this.productos);
        this.productosLV.setAdapter(this.adapter);
    }
}