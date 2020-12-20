

public class Laptops {


    public static void main(String[] args) {

    double laptop1 = 1000, laptop2 = 2000, laptop3 =1000;
                //sprawdzenie czy wszystkie tej samej cenie
                if ((laptop1 == laptop2) && (laptop1 == laptop3)) {
                    System.out.println("NWszystkie laptopy w tej samej cenie");
                }
                //sprawdzenie czy dwa nie są najtańsze L1 i L2 lub L3
                else if ((laptop1 <= laptop2) && (laptop1 <= laptop3) && (laptop1 == laptop2)) {
            System.out.println("Najtanszy jest laptop1 i laptop2");
                }
                else if ((laptop1 <= laptop2) && (laptop1 <= laptop3) && (laptop1 == laptop3)) {
                System.out.println("Najtanszy jest laptop1 i laptop3");
                }
                //sprawdzenie czy dwa nie są najtańszy tylko L1
                 else if ((laptop1 < laptop2) && (laptop1 < laptop3)) {
                  System.out.println("Najtanszy jest laptop1");
                }
                //sprawdzenie czy dwa nie są najtańsze L2 i L3
                 else if ((laptop2 <= laptop3) && (laptop2 <= laptop1) && (laptop2 == laptop3)) {
                    System.out.println("Najtanszy jest laptop2 i laptop3");
                  }
                   else if ((laptop2 < laptop1) && (laptop2 < laptop3)) {
                        System.out.println("Najtanszy jest laptop2");
                    }
                         else {
                         System.out.println("Najtanszy jest laptop3");
         }

    }
}