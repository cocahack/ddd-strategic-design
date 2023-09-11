package kitchenpos.menu.adapter.out.persistence;

import kitchenpos.menu.application.port.out.UpdateMenuPort;
import kitchenpos.menu.domain.Menu;
import kitchenpos.menu.domain.MenuRepository;
import kitchenpos.menu.application.port.out.LoadMenuPort;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
class MenuPersistenceAdapter implements LoadMenuPort, UpdateMenuPort {

    private final MenuRepository menuRepository;

    public MenuPersistenceAdapter(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    @Override
    public List<Menu> findAllByIdIn(List<UUID> ids) {
        return menuRepository.findAllByIdIn(ids);
    }

    @Override
    public Optional<Menu> findById(UUID id) {
        return menuRepository.findById(id);
    }

    @Override
    public Menu save(Menu menu) {
        return null;
    }
}
