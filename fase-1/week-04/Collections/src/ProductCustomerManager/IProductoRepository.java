package ProductCustomerManager;

import java.util.List;

public interface IProductoRepository {

    public void registrarProducto(Producto registroProducto);

    public List<Producto> obtenerTodos();

    public Producto buscarPorId(int id);

    public boolean actualizarProducto(int id, Producto nuevoProducto);

    public boolean eliminarProducto(int id);

}
