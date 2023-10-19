package prvypolrok;


import java.util.*;

public class opakovanie {
    public static void main(String[] args) {
        Automobil automobil = new Automobil("ford",true,60);
        Automobil skoda = new Automobil("skoda",false,150);
        Automobil tiguan = new Automobil("tiguan",false,80);
        Automobil audi= new Automobil("skoda",false,150);
        Set<Automobil> sets = new HashSet<>();
        sets.addAll(Arrays.asList(automobil,skoda,tiguan,audi));
        int temp=0;
        for (Automobil automobil1 : sets) {
            temp=automobil1.getAkutalnarychlost()+temp;
            System.out.println(automobil1.getZnacka());
        }
        System.out.println(sets.size());
        int vys;
        vys=temp/ sets.size();
        System.out.println("priemerna rychlost je "+vys);
        Map<String, String> map = new HashMap<>(){};
    }
}
