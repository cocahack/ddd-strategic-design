package kitchenpos.menu.application.port.out;

import kitchenpos.menu.domain.Menu;

public interface UpdateMenuPort {
    Menu save(final Menu menu);
}
