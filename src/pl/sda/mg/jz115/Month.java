package pl.sda.mg.jz115;

import java.util.function.Predicate;
import java.util.stream.Stream;

public enum Month {
    JANUARY(1),
    FEBRUARY(2, "Luty"),
    APRIL(3, "Marzec")
    ;
    private final int value;
    private final String name;

    Month(int value) {
        this.value = value;
        this.name = "";
    }

    Month(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static Month getMonthFromValue(int value) {
        return Stream.of(values())
                .filter(month -> month.getValue() == value)
                .findFirst()
                .orElse(null);
    }

    public static Month getMonthFromName(String name) {
        return Stream.of(values())
                .filter(new Predicate<Month>() {
                    @Override
                    public boolean test(Month month) {
                        return month.getName().equalsIgnoreCase(name);
                    }
                })
                .findFirst()
                .orElse(null);
    }
}
