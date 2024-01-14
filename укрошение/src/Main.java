import model.Material;
import model.Producer;
import model.Ring;

import java.util.jar.JarEntry;

public class Main {
    public static void main(String[] args) {
       Producer[] producers={
               new Producer("SLAVIA"),
               new Producer("CRISTAL"),

       } ;
        JarEntry[] jarEntries = {
                new Ring.Ring()123, producers[0], 3, Material.GOLD, 17);
new Earrings.Earrings(234, producers[1], 5,Material.SILVER),
        new Necklace()(741, producers[2], 2, Material.WHITE_GOLD)
        };
        for (jarEntries jewellery : jarEntries){
            System.out.println(jarEntries);
        }

    }

}
