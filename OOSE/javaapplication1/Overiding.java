class Overiding1 {

    public static void one() {

        System.out.println("I am one");
    }
}

class Child extends Overiding1 {

    public static void one() {

        System.out.println("I am two");
    }

}

public class Overiding {
    public static void main(String[] args) {

        Child o = new Child();
        o.one();

    }
}

// class Overiding1 {

//     public final void one() {

//         System.out.println("I am one");
//     }
// }

// class Child extends Overiding1 {

//     public final void one() {

//         System.out.println("I am two");
//     }

// }

// public class Overiding {
//     public static void main(String[] args) {

//         Overiding1 o = new Child();
//         o.one();

//     }
// }

