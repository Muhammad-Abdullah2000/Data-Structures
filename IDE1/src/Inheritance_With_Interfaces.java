
        interface one{
            void a1();
            void b1();
        }
        interface childofone extends one{
            void c1();
            void d1();
        }
        class Anotherchildofone implements childofone{
            public void a1(){
                System.out.println("This is interface one: ");
            }
            public void b1(){
                System.out.println("This is also interface one: ");
            }
            public void c1(){
                System.out.println("This is the child of interface one: ");
            }
            public void d1(){
                System.out.println("This is another child of one: ");
            }
        }
        public class Inheritance_With_Interfaces {
            public static void main(String[] args) {
                Anotherchildofone two = new Anotherchildofone();
                two.a1();
                two.b1();
                two.c1();
                two.d1();
            }
        }


