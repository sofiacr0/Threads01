/*
Práctica con hilos 01
Desarrollar un programa en Java que a través de la línea de comandos reciba una lista de n números enteros
y calcule el número factorial correspondiente a cada uno de los números en la lista.

1. El cómputo de cada factorial se debe realizar en hilo (thread).
2. Al finalizar el cálculo, hilo debe imprimir el resultado genererado y
el nombre del hilo en donde se realizo el cálculo.
 */

public class T7p1 implements Runnable {
    private int max;

    public T7p1(int n) {
        this.max = n;
    }

    public void run() {
        int fact=1, i=1;
        while (i<=max){
            fact = fact*i;
            i++;

        }
        System.out.println( Thread.currentThread().getName() + ":" + fact);
    }

    //main
    public static void main(String args[]) {
        for( String s: args) {
            int n = Integer.parseInt(s);
            Thread t = new Thread( new T7p1(n) );
            t.start();
        }
    }
}