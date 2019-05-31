package hackerrank.advanced;

/**
 * Created by heena.madan on 31/08/17.
 */
public class CovarientdataTypes {
}
class Flower {
    String whatsYourName() {
        return "I have many names and types";
    }
}

class Jasmine extends Flower {
    @Override
    String whatsYourName() {
        return "Jasmine";
    }
}

class Lily extends Flower {
    @Override
    String whatsYourName() {
        return "Lily";
    }
}

class Lotus extends Flower {
    @Override
    String whatsYourName() {
        return "Lotus";
    }
}

abstract class State {
    abstract Flower yourNationalFlower();
}

class WestBengal extends State {
    @Override
    Flower yourNationalFlower() {
        return new Jasmine();
    }
}

class Karnataka extends State {
    @Override
    Flower yourNationalFlower() {
        return new Lotus();
    }
}

class AndhraPradesh extends State {
    @Override
    Flower yourNationalFlower() {
        return new Lily();
    }
}
