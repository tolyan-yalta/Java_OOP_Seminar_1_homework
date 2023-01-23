package Task_2;

import java.util.Random;

public class Human {
    public String name;
    public String status;

    public Human(String n, String s){
        this.name = n;
        this.status = s;
    }

    Random rand = new Random();

    public boolean AnswerHuman(){
        if (rand.nextInt(2) == 0) {
            System.out.println("Да");
            return true;
        }
        else{
            System.out.println("Нет");
            return false;
        }
    }
    
    public void QueryHuman(){
        System.out.println("Можно включить телевизор?");
    }

    public void SleepHuman(){
        System.out.println("Тогда я пошел спать");
    }


    public void CallCat() { 
        System.out.println("Кис-Кис..."); 
    }

    public void FeedCat() { 
        System.out.println("Кушай котик..."); 
    }
}
