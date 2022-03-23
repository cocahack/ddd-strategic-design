package kitchenpos.menu.infrastructure;

import kitchenpos.menu.domain.Menu;
import kitchenpos.menu.domain.MenuRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface JpaMenuRepository extends MenuRepository, JpaRepository<Menu, UUID> {
    @Query("select m from Menu m, MenuProduct mp where mp.product.id = :productId")
    @Override
    List<Menu> findAllByProductId(@Param("productId") UUID productId);
}