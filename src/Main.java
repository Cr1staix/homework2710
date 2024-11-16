import jdk.jshell.JShell;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        House house1 = new House.Builder()
                .floors(2)
                .rooms(7)
                .isGarage(true)
                .build();

        System.out.println(house1);

        House house2 = new House.Builder()
                .floors(1)
                .rooms(4)
                .isGarage(false)
                .build();

        System.out.println(house2);

        House house3 = new House.Builder()
                .floors(3)
                .rooms(8)
                .isGarage(true)
                .build();

        System.out.println(house3);

        House house4 = new House.Builder()
                .floors(2)
                .rooms(7)
                .isGarage(false)
                .build();

        System.out.println(house4);
        List<House> houses = new ArrayList<>();
        houses.add(house1);
        houses.add(house2);
        houses.add(house3);
        houses.add(house4);

        System.out.println(houses.contains(house1));
        System.out.println(houses.contains(house2));
        System.out.println(houses.indexOf(house3));
        System.out.println(houses.indexOf(house4));
    }
}