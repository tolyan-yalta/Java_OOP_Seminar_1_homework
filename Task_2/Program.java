package Task_2;


public class Program {
    public static void main(String[] args) {

        Human man = new Human("Karl", "husband");
        Human woman = new Human("Klara", "wife");
        Televisor samsung = new Televisor("BigTV");
        Cat cat = new Cat("Tom");

        man.QueryHuman();
        if (woman.AnswerHuman()) {
            samsung.StartTV();
            samsung.SwitchingСhannels();
            samsung.StopTV();
        } else {
            man.SleepHuman();
        }

        man.CallCat();
        cat.AnswerCat();
        woman.FeedCat();
        cat.CatEats();
        
        
    }
    
}
