import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.*;
public class Main {

    List<Car> ourCarArrayList = new ArrayList<>(Arrays.asList(
            new Car(4, 5, true, true),
            new Car(4, 3, true, true),
            new Car(4, 5, true, false)
    ));



    public List<Car> getOurCarArrayList() {
        return ourCarArrayList;
    }

    System.out.println(Car);
}

