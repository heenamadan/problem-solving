package april19;

import java.util.stream.DoubleStream;

public class CreateDoubleStream {

    public static void main(String args[]) {

        DoubleStream doubleStream = DoubleStream.of(1.2, 1.3, 1.4, 1.5, 1.6);
        double d = doubleStream.average().orElse(0.0);
        System.out.println("d---->"+d);
        System.out.println("div by 0.0"+5/0.0);
        double d1= 3/0;
        System.out.println("div by 0"+d1);

    }
    }

