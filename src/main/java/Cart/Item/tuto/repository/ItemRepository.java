package Cart.Item.tuto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Cart.Item.tuto.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
