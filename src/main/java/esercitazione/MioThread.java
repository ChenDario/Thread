package esercitazione;

public class MioThread extends Thread{
    //private String nome = " ";

    public MioThread(String nome){
        this.setName(nome);
    }

    public MioThread(){

    }
    
    @Override
    //Il metodo run è il corpo del thread, un metodo da eseguire, ciò che ho da eseguire nel Thread loo metto nel run()
    public void run() {
        System.out.println("Ciaooooooooooo da " + this.getName());
        System.out.println(this.getId());
        System.out.println(this.getName());
        System.out.println(this.getPriority());
        System.out.println(this.getState());

    }
}
