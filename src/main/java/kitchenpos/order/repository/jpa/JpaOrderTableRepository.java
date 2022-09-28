package kitchenpos.order.repository.jpa;

import kitchenpos.order.domain.OrderTable;
import kitchenpos.order.repository.OrderTableRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JpaOrderTableRepository extends OrderTableRepository, JpaRepository<OrderTable, UUID> {
}