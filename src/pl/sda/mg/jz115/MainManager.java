package pl.sda.mg.jz115;

public class MainManager {

    public static void main(String[] args) {
        Manager manager = createManager();
        manager.create("11", 11);
        manager.defaultMethod("ssss");

        ((ManagerImpl) manager).prettyPrint("11", 11);


        ManagerImpl manager1 = new ManagerImpl();
        manager1.prettyPrint("11", 11);


    }

    private static Manager createManager() {
        return new ManagerImpl();
    }
}
