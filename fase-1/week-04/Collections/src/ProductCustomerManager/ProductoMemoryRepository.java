package ProductCustomerManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;

public class ProductoMemoryRepository implements IProductoRepository {
    private int contadorId = 0;
    HashMap<Integer, Producto> productoHashMap;

    public ProductoMemoryRepository() {
        productoHashMap = new HashMap<>();
    }

    @Override
    public void registrarProducto(Producto registroProducto) {
        contadorId++;
        registroProducto.setId(contadorId);
        productoHashMap.put(contadorId, registroProducto);
    }

    @Override
    public List<Producto> obtenerTodos() {
        return new ArrayList<>(productoHashMap.values());
    }

    @Override
    public Producto buscarPorId(int id) {
        return productoHashMap.get(id);
    }

    @Override
    public boolean actualizarProducto(int id, Producto nuevoProducto) {
        if(productoHashMap.containsKey(id)){
            return false;
        }
        nuevoProducto.setId(id);
        productoHashMap.put(id,nuevoProducto);
        return true;
    }

    @Override
    public boolean eliminarProducto(int id) {
        if (productoHashMap.get(id) == null) {
            return false;
        }
        productoHashMap.remove(id);
        return true;
    }
}
