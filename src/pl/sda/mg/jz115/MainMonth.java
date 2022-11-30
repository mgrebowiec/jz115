package pl.sda.mg.jz115;

public class MainMonth {

    public static void main(String[] args) {
        Month actualMonth = Month.getMonthFromValue(2);
        System.out.printf("Znaleziony miesiac dla wartosci 2 to %s\n", actualMonth.getName());


        actualMonth = Month.getMonthFromName("marzec");
        System.out.printf("Znaleziony miesiac dla marzec to %d\n", actualMonth.getValue());


        actualMonth = Month.JANUARY;
        System.out.printf("Aktualnie mamy %s, %d", actualMonth.getName(), actualMonth.getValue());
    }
}
