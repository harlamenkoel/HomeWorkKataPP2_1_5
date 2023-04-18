package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Chest2_5 {
    @Autowired
    private final Wood3 wood;

    public Chest2_5(Wood3 wood) {
        this.wood = wood;
    }

    @Override
    public String toString() {
        return ", под дубом сундук зарыт" + wood.toString();
    }
}
