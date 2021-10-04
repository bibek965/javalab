package javalab.stringAndThreads;

class ThreadA extends Thread{
    public void run(){
        try {
            for(int i =50; i<100; i++){
                if (i%2==0) {
                   System.out.println(i);
                   sleep(700);
                }
            }
        } catch (Exception e) {
           
        }
    }
}
class ThreadB extends Thread{
    public void run(){
        try {
            for(int i =100; i<200; i++){
                if (i%2==1) {
                   System.out.println(i);
                   sleep(800);
                }
            }
        } catch (Exception e) {
           
        }
    }
}


public class q5 {
    public static void main(String[] args) {
        ThreadA obj1= new ThreadA();
        ThreadB obj2 = new ThreadB();
        obj1.start();
        obj2.start();
    }
}