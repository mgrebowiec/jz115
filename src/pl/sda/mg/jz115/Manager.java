package pl.sda.mg.jz115;

public interface Manager {

    String create(String in, int inValue);

    default String defaultMethod(String in) {
        return create(in, 10);
    }

    default String defaultMethod2(String in) {
        return "";
    }

    default void print(String in) {
        System.out.println(defaultMethod(in));
    }

}
