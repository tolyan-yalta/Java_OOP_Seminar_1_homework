package Task_1;
import java.util.ArrayList;
import java.util.HashMap;

public class Family {
    private HashMap<Human, Human> parent;   // родитель
    private HashMap<Human, Human> children; // ребенок
    private HashMap<Human, Human> sibling;  // брат или сестра
    //public HashMap<Human, Human> grandparent; // бабушки и дедушки
    //public HashMap<Human, Human> grandchildren; // внуки и внучки

    
    public static ArrayList<HashMap<Human, Human>> listParent = new ArrayList<>();
    public static ArrayList<HashMap<Human, Human>> listChildren = new ArrayList<>();
    public static ArrayList<HashMap<Human, Human>> listSibling = new ArrayList<>();
    //ArrayList listGrandparent = new ArrayList<>();
    //ArrayList listGrandchildren = new ArrayList<>();
    

    public void Parent(Human p, Human ch){
        HashMap<Human, Human> temp1 = new HashMap<>();
        temp1.put(p, ch);
        this.parent = temp1;
        listParent.add(this.parent);

        HashMap<Human, Human> temp2 = new HashMap<>();
        temp2.put(ch, p);
        this.children = temp2;
        listChildren.add(this.children);
    }

    public void Children(Human ch, Human p){
        Parent(p, ch);
    }

    public void Sibling(Human h1, Human h2){
        HashMap<Human, Human> temp1 = new HashMap<>();
        temp1.put(h1, h2);
        this.sibling = temp1;
        listSibling.add(this.sibling);
        HashMap<Human, Human> temp2 = new HashMap<>();
        temp2.put(h2, h1);
        this.sibling = temp2;
        listSibling.add(this.sibling);
    }

    // поиск родителей
    public static void SearchParents(Human h){
        System.out.println("Для:");
        System.out.println(h.getInfo());
        System.out.println("Родителями будут:");
        for (HashMap<Human,Human> i : listChildren) {
            if (i.containsKey(h)) {
                Human p = i.get(h);
            System.out.println(p.getInfo());
            }
        }
    }

    
    // поиск детей
    public static void SearchChildren(Human h){
        System.out.println("Для:");
        System.out.println(h.getInfo());
        System.out.println("Детьми будут:");
        for (HashMap<Human,Human> i : listParent) {
            if (i.containsKey(h)) {
                Human p = i.get(h);
            System.out.println(p.getInfo());
            }
        }
    }

    // поиск поиск братьев (сестер)
    public static void SearchSibling(Human h){
        System.out.println("Для:");
        System.out.println(h.getInfo());
        System.out.println("Братьями и сестрами будут:");
        for (HashMap<Human,Human> i : listSibling) {
            if (i.containsKey(h)) {
                Human p = i.get(h);
            System.out.println(p.getInfo());
            }
        }
    }



}
