
public class Main {
    public static void main(String[] args) {
        int milkAmount = 500; // ml
        int powderAmount = 500; // g
        int eggsCount = 500; // items
        int sugarAmount = 500; // g
        int oilAmount = 5000; // ml
        int appleCount = 50; // items


        var pancakes = (powderAmount >= 400 && sugarAmount >= 10 && milkAmount >= 1000 && oilAmount >= 30);
        var omelette = (powderAmount >= 5 && milkAmount >= 300 && eggsCount >= 5);
        var applePie = (appleCount >= 3 && powderAmount >= 300 && milkAmount >= 100 && eggsCount >= 4);
        if (appleCount >= 5) {
            System.out.println("Apple juice");
        }

        if (pancakes) {
            System.out.println("Pancakes");
        }

        if (omelette) {
            System.out.println("Omelette");
        }

        if (applePie) {
            System.out.println("Apple pie");
        }
    }
}
