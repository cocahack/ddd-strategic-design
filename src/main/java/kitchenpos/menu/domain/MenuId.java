package kitchenpos.menu.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class MenuId {
    private final UUID value;

    private MenuId(UUID value) {
        this.value = value;
    }

    public static MenuId newId() {
        return new MenuId(UUID.randomUUID());
    }

    public static MenuId from(final UUID value) {
        return new MenuId(value);
    }

    public UUID getValue() {
        return value;
    }
}
