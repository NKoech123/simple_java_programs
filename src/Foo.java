public class Foo {             //declare class
    public int x,y;            //Instance variables

    public Foo(int x, int y){      //Constructor
        this.x=x;
        this.y=y;
    }
    public static void switcheroo (Foo a, Foo b) {  //Class (static) Method
        Foo temp=a;
        a= b;
        b= temp;
        System.out.println(a.x);
        System.out.println(a.x);
    }
    public static void fliperoo (Foo a, Foo b){
        Foo temp = a;
        a.x = b.x;
        a.y = b.y;
        b.x = temp.x;
        b.y = temp.y;
    }
    public static void swaperoo (Foo a , Foo b){
        Foo temp = a;
        a.x = b.x;
        a.y = b.y;
        b.x = temp.x;
        b.y = temp.y;
    }
    public static void main (String [] args){
        Foo foobar = new Foo (10,20);
        Foo baz = new Foo (30,40);
        switcheroo(foobar,baz);
        fliperoo(foobar,baz);
        swaperoo(foobar,baz);
        System.out.println("Done Debugging!");

    }

}
