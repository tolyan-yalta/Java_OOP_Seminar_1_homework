package Task_2;

public class Televisor {
    public String model;

    public Televisor(String model) {
            this.model = model;
        }



    // включение телевизора
    public void StartTV() { 
        System.out.println("Телевизор включен..."); 
    }

    // выключение телевизора
    public void StopTV() { 
        System.out.println("Телевизор выключен..."); 
    }

    // переключение каналов
    public void SwitchingСhannels() { 
        System.out.println("Смена канала..."); 
    }
    
}
