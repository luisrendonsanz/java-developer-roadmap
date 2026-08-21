package ProductCustomerManager;

import java.util.*;

public class ProductoServices {
    private IProductoRepository repository;

    public ProductoServices(IProductoRepository repository) {
        this.repository = repository;
    }

    public void registrarProducto(Producto registroProducto) {
        repository.registrarProducto(registroProducto);
    }

    public List<Producto> stockBajo() {
        List<Producto> productos = repository.obtenerTodos();
        return productos.stream().filter(n -> n.getStock() < n.getStockBajo()).toList();
    }

    public List<Producto> obtenerProductosOrdenadosPorPrecio() {
        List<Producto> lista = new ArrayList<>(repository.obtenerTodos());
        // Asumiendo que Producto implementa Comparable o usando un Comparator:
        Collections.sort(lista);
        return lista;
    }

    public String listarProductos() {
        List<Producto> productos = repository.obtenerTodos();
        if (productos.isEmpty()) {
            return "No hay productos registrados";
        }
        return productos.toString();
    }

    public Producto buscarPorId(int id) {
        if (repository.buscarPorId(id)==null) {
            throw new NoSuchElementException("Producto no encontrado");
        }
        return repository.obtenerTodos().get(id);
    }
    public boolean actualizarProducto(int id, Producto nuevoProducto) {
        return repository.actualizarProducto(id,nuevoProducto);
    }


}
