package kitchenpos.menu.adapter.out.persistence;

import kitchenpos.menu.domain.Menu;

class MenuDomainEntityMapper {
    MenuDomainEntityMapper() {}

    Menu entityToDomain(MenuEntity entity) {
        return new Menu();
    }
}
