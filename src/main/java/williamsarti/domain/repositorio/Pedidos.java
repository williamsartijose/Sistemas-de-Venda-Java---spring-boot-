package williamsarti.domain.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import williamsarti.domain.entity.Cliente;
import williamsarti.domain.entity.Pedido;

import java.util.List;
import java.util.Set;

public interface Pedidos extends JpaRepository<Pedido, Integer> {

    List<Pedido> findByCliente(Cliente cliente);
}