import jdk.jshell.JShell;

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
    }
}