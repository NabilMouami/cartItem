package Cart.Item.tuto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Cart.Item.tuto.model.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
}
