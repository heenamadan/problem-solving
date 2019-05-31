package feb19;


public class Binding {

    public static void main(String[] args)
    {
        superclass A = new superclass();
        superclass B = new subclass();
        A.print();
        B.print();
    }

    public static class superclass
    {
        static void print()
        {
            System.out.println("print in superclass.");
        }
    }

    public static class subclass extends superclass
    {
        static void print()
        {
            System.out.println("print in subclass.");
        }
    }
}
/*
private, final and static members (methods and variables) use static binding while for virtual methods (In Java methods are virtual by default) binding is done during run time based upon run time object.
        Static binding uses Type information for binding while Dynamic binding uses Objects to resolve binding.
        Overloaded methods are resolved (deciding which method to be called when there are multiple methods with same name) using static binding while overridden methods using dynamic binding, i.e, at run time.*/
