package april19;



public class Customer {

    private int id;
    @Override
    public int hashCode() {
        return 1;
    }

    /*public boolean equals(Object obj){
        return false;
    }
*/
    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;

        if (o == this)
            return true;

        if (o.getClass() != getClass())
            return false;

        Customer e = (Customer) o;

        return true;
    }
    private String name;

    Customer(int id,String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
