package src.nestedClassesAndGenerics.d1;

import src.nestedClassesAndGenerics.d1.Anonim;

public class Main {
    public static void main(String[] args) {

    //   Out.In.run();

    //    Local l=new Local();
    //    l.run();

        Anonim a=new Anonim(){
            @Override
            public void run(){
                System.out.println(this.a);
                System.out.println("Anonim olarak yazılmış run metotu");
                print();
            }
            public void print(){
                System.out.println("Print metodu");
            }
        };
        a.run();

    }
}
