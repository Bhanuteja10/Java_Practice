interface Computer {
    void code();
}

class Laptop implements Computer {
    public void code() {
        System.out.println("Coding in Laptop");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("Coding in Desktop");
    }
}

class Developer {
    public void devApp(Computer c) {
        c.code();
    }
}

public class Demo {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer rnd_person = new Developer();
        rnd_person.devApp(lap);
    }
}
