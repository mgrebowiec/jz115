package pl.sda.mg.jz115;

import java.util.HashMap;
import java.util.Map;

public class PairMain {

    public static void main(String[] args) {
        Pair<String, String> pair1 = new Pair<>("michal", "grebowiec");
        System.out.println("imie: " + pair1.getFirst() + " nazwisko: " + pair1.getSecond());

        Pair<Integer, Boolean> pair2 = new Pair<>(1, Boolean.TRUE);
        System.out.println("wartosc: " + pair2.getFirst() + " flaga: " + pair2.getSecond());


        Pair<Pair<String, String>, Integer> pair3 = new Pair<>(new Pair<>("jan", "kowalski"), 100);


        Map<String, Pair<String, Float>> countries = new HashMap<>();
        countries.put("polska", new Pair<>("ludnosc", Float.valueOf(12)));



    }

}
