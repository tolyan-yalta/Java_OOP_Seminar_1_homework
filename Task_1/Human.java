package Task_1;

public class Human {
    
    public String name;
    public String patronymic;
    public String surname;
    public int age;

    public Human(String n, String p, String s, int a){
        this.name = n;
        this.patronymic = p;
        this.surname = s;
        this.age = a;
    }

    public String getInfo(){
        return String.format("Имя: %s Отчество: %s Фамилия: %s Возраст: %d",
         name, patronymic, surname, age);
    }

}
