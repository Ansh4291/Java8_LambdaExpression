package com.Practice_Problm;
//      EXAMPLE-1
@FunctionalInterface  //It is optional
//interface Drawable{
//    public void draw();
//}
//      EXAMPLE-2
interface Sayable{
    public String say();
}

public class Lambda_ExpRession_Exp {
    public static void main(String[] args) {
        //      EXAMPLE-1
//with lambda
//        int width=50;
//        Drawable d2=()->{
//            System.out.println("Drawing "+width);
//        };
//        d2.draw();

//      EXAMPLE-2
        Sayable s=()->{
            return "I have nothing to say.";
        };
        System.out.println(s.say());
    }
}
