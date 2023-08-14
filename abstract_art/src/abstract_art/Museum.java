package abstract_art;

import java.util.ArrayList;

public class Museum {

    public static void main(String[] args) {
        ArrayList<Art> museum = new ArrayList<Art>();

        Painting painting1 = new Painting();
        Painting painting2 = new Painting();
        Painting painting3 = new Painting();
        Sculpture sculpture1 = new Sculpture();
        Sculpture sculpture2 = new Sculpture();
        
        
        museum.add(painting1);
        museum.add(painting2);
        museum.add(painting3);
        museum.add(sculpture1);
        museum.add(sculpture2);
        
        System.out.println(museum);
        
       
    }
}
