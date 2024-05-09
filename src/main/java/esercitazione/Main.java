package esercitazione;

public class Main {
    public static void main(String[] args) {

        MioThread m = new MioThread();
        MioThread t = new MioThread("Dario");
        m.start(); //Ha creato un processo figlio
        t.start();

        System.out.println("Hello world!"); 
        //Vengono eseguite in contemporanea questa istruzione di output e il metodo del run() che è in start() dal Thread
    }
}