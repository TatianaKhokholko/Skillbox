public class Main {
    public static void main(String[] args) {
        int vasyaAge = 2;
        int katyaAge = 22;
        int mishaAge = 22;

        int minAgeCount = -1;
        int middleAgeCount = -1;
        int maxAgeCount = -1;

        if (vasyaAge < 0 || vasyaAge > 120 || katyaAge < 0 || katyaAge > 120 || mishaAge < 0 || mishaAge > 120) {
            System.out.print("Incorrect age!");
        } else {
            System.out.print("Minimal age: ");
            if (vasyaAge <= katyaAge && vasyaAge <= mishaAge) {
                minAgeCount = vasyaAge;
                System.out.print(minAgeCount);
            } else {
                if (katyaAge <= vasyaAge && katyaAge <= mishaAge) {
                    minAgeCount = katyaAge;
                    System.out.print(minAgeCount);
                } else {
                    minAgeCount = mishaAge;
                    System.out.print(minAgeCount);
                }
            }

            System.out.print("\nMiddle age: ");
            if (vasyaAge <= katyaAge && vasyaAge >= mishaAge || (vasyaAge >= katyaAge && vasyaAge <= mishaAge)) {
                middleAgeCount = vasyaAge;
                System.out.print(middleAgeCount);
            } else {
                if (katyaAge <= vasyaAge && katyaAge >= mishaAge || katyaAge >= vasyaAge && katyaAge <= mishaAge) {
                    middleAgeCount = katyaAge;
                    System.out.print(middleAgeCount);
                } else {
                    middleAgeCount = mishaAge;
                    System.out.print(middleAgeCount);
                }
            }

            System.out.print("\nMaximal age: ");
            if (vasyaAge >= katyaAge && vasyaAge >= mishaAge) {
                maxAgeCount = vasyaAge;
                System.out.print(maxAgeCount);
            } else {
                if (katyaAge >= vasyaAge && katyaAge >= mishaAge) {
                    maxAgeCount = katyaAge;
                    System.out.print(maxAgeCount);
                } else {
                    maxAgeCount = mishaAge;
                    System.out.print(maxAgeCount);
                }
            }
        }
    }
}
