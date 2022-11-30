package pl.sda.mg.jz115;

public class ManagerImpl implements Manager {
    @Override
    public String create(String in, int inValue) {
        return "out: " + in + inValue;
    }

    public String prettyPrint(String in, int inValue) {
        return String.format("out[in:%s, inValue:%d]", in, inValue);
    }
}
