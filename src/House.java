import java.util.Objects;

/**
 * Класс создает объект типа House. Содержит методы для управления его состоянием.
 */
public class House {
    private int floors;
    private int rooms;
    private boolean isGarage;


    private House(Builder builder) {
        this.floors = builder.floors;
        this.rooms = builder.rooms;
        this.isGarage = builder.isGarage;
    }

    @Override
    public String toString() {
        return "Дом{" +
                "Этажей = " + floors +
                ", Комнат = " + rooms +
                ", Гараж " + isGarage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return floors == house.floors && rooms == house.rooms;
    }

    @Override
    public int hashCode() {
        return Objects.hash(floors, rooms, isGarage);
    }

    /**
     * Класс Builder для реализации паттерна проектирования Builder.
     */
    public static class Builder {
        private int floors;
        private int rooms;
        private boolean isGarage;


        public Builder floors(int floors) {
            this.floors = floors;
            if (floors < 1) {
                throw new RuntimeException("Количество этажей не может быть 0 или отрицательным");
            } else {
                return this;
            }
        }

        public Builder rooms(int rooms) {
            this.rooms = rooms;
            if (rooms < 1) {
                throw new RuntimeException("Количество комнат не может быть меньше 1");
            } else {
                return this;
            }
        }

        public Builder isGarage(boolean isGarage) {
            this.isGarage = isGarage;
            return this;
        }

        public House build() {
            return new House(this);
        }

    }
}
