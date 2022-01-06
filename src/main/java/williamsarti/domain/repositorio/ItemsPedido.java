package williamsarti.domain.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import williamsarti.domain.entity.ItemPedido;

public interface ItemsPedido extends JpaRepository<ItemPedido, Integer> {
}
