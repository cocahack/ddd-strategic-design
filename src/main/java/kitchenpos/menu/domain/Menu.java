package kitchenpos.menu.domain;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public class Menu {
    private final MenuId menuId;

    private String name;

    private BigDecimal price;

    private MenuGroup menuGroup;

    private boolean displayed;

    private List<MenuProduct> menuProducts;

    private UUID menuGroupId;

    public Menu(MenuId menuId, String name, BigDecimal price, MenuGroup menuGroup, boolean displayed, List<MenuProduct> menuProducts, UUID menuGroupId) {
        this.menuId = menuId;
        this.name = name;
        this.price = price;
        this.menuGroup = menuGroup;
        this.displayed = displayed;
        this.menuProducts = menuProducts;
        this.menuGroupId = menuGroupId;
    }

    public MenuId getMenuId() {
        return menuId;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public MenuGroup getMenuGroup() {
        return menuGroup;
    }

    public boolean isDisplayed() {
        return displayed;
    }

    public List<MenuProduct> getMenuProducts() {
        return menuProducts;
    }

    public UUID getMenuGroupId() {
        return menuGroupId;
    }
}
