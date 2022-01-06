package williamsarti.domain.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import williamsarti.domain.entity.Produto;

public interface Produtos extends JpaRepository<Produto,Integer> {
}