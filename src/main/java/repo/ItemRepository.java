package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
    // You can add custom query methods if needed
}
