package hackerrank.advanced;

/**
 * Created by heena.madan on 14/08/17.
 */
public interface Food {
    public String getType();
}
class Pizza implements Food {
    public String getType() {
        return "Someone ordered a Fast Food!";
    }
}

class Cake implements Food {

    public String getType() {
        return "Someone ordered a Dessert!";
    }
}
