package lec2;

public class functions {
    public static void main(String[] args) {
        functions f =new functions();
        f.f1();
    }
    public static void f1(){
        f2();
        System.out.println("f1");
    }
    public static void f2(){
        f3();
        System.out.println("f2");
    }
    public static void f3(){
        System.out.println("f3");
    }
}
// GOLDEN NOTE -:
// 1 - ek function ka execution jab tak chalta jab tak ek toh sari lines khatam hogar [ya] return statemnt aajae.
// 2 - jab jab ek function call hogi
// 3 - functions get memory in call stack.