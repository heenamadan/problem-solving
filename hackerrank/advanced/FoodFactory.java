package hackerrank.advanced;

import java.util.Objects;

/**
 * Created by heena.madan on 14/08/17.
 */
public class FoodFactory {
    public Food getFood(String order) {

// or by if else
            switch (order.toLowerCase()) {
                case "pizza":
                    return new Pizza();
                case "cake":
                    return new Cake();
                default:
                    return null;

        }
    }

}
