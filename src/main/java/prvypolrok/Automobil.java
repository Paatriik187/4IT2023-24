package prvypolrok;

import java.util.Objects;
import java.util.Scanner;

public class Automobil {
    String znacka;
    boolean start;
    int akutalnarychlost;

    public Automobil(String znacka, boolean start, int akutalnarychlost) {
        this.znacka = znacka;
        this.start = start;
        this.akutalnarychlost=akutalnarychlost;
    }
    public Automobil(){}

    public int getAkutalnarychlost() {
        return akutalnarychlost;
    }

    public String getZnacka() {
        return znacka;
    }

    public void setZnacka(String znacka) {
        this.znacka = znacka;
    }

    public boolean isStart() {
        return start;
    }

    public void setStart(boolean start) {
        this.start = start;
    }

    public void nastartovatAuto(){
        if (!isStart()){
            setStart(true);
        }
        else{
            setStart(false);
        }
    }
    public void pohyb(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("na aku rychlost chcete ist?");
        akutalnarychlost= scanner.nextInt();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Automobil automobil = (Automobil) o;
        return start == automobil.start && akutalnarychlost == automobil.akutalnarychlost && Objects.equals(znacka, automobil.znacka);
    }

    @Override
    public int hashCode() {
        return Objects.hash(znacka, start, akutalnarychlost);
    }
}
