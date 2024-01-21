import java.util.Scanner;

public class gatonombre {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Hello! Welcome to Gato Nombre. Is your gato a girl or the boy? (Gato means cat in Spanish!)");
            String gender = scan.nextLine();
            char g = gender.charAt(0);
            if (g == 'g' || g == 'G'){
                System.out.println("Girl gatos are known to be less silly than boy gatos! Is your gato silly?");
            }
            if (g == 'b' || g == 'B'){
                System.out.println("Boy gatos are known to be more silly than girl gatos! Is your gato silly?");
            }
            String cuddler = scan.nextLine();
            char c = cuddler.charAt(0);
            System.out.println("Of these three options, which meat does your cat love the most: Chicken, Beef, or Fish?");
            String meat = scan.nextLine();
            char m = meat.charAt(0);
            if (m == 'c' || m == 'C'){
                System.out.println("Bok bok bok! I love chicken too! Fun fact: My very own gato stole my chicken nugget once!");
            }
            if (m == 'b' || m == 'B'){
                System.out.println("Moo~! Your gato has expensive taste! Steak is very FANCY!");
            }
            if (m == 'f' || m == 'F'){
                System.out.println("As expected! Many cats adore seafood. Seafood is my favorite meat!");
            }
            if (g == 'g' || g == 'G'){
                gatoBoy(c,m);
            }
            if (g == 'b' || g == 'B'){
                gatoGirl(c,m);
            }

        }
    }
    public static void gatoBoy(char cud, char mt){
        if (cud == 'Y' || cud == 'y'){ //if silly, give silly name
            if (mt == 'c' || mt == 'C'){
                System.out.println("Your generated gato name is: Chicken! Just like his personality, a silly name is best! Especially one that represents his favorite food!");
            }
            if (mt == 'b' || mt == 'B'){
                System.out.println("Your generated gato name is: Taco! Tacos are commonly filled with beef! Knowing that your gato loves beef makes this name purrfect!");
            }
            if (mt == 'f' || mt == 'F'){
                System.out.println("Your generated gato name is: Lobster! Your gato's love for seafood makes this name purrfect!");
            }
        }
        else{ //if not silly, give a serious name haha!
            if (mt == 'c' || mt == 'C'){
                System.out.println("Your generated gato name is: Cooper! Watch out chickens! Cooper is coming for your chicken coops!");
            }
            if (mt == 'b' || mt == 'B'){
                System.out.println("Your generated gato name is: Tommy! Like tomahawk steak!");
            }
            if (mt == 'f' || mt == 'F'){
                System.out.println("Your generated gato name is: Fin! Like fish fin!");
            }

        }
    }
    public static void gatoGirl(char cud, char mt){
        if (cud == 'Y' || cud == 'y'){ //if silly, give silly name
            if (mt == 'c' || mt == 'C'){
                System.out.println("Your generated gato name is: Chickie! Just like her personality, a silly name is best! Especially one that represents her favorite food!");
            }
            if (mt == 'b' || mt == 'B'){
                System.out.println("Your generated gato name is: Taco! Taco is commonly filled with beef! Knowing that your gato loves beef makes this name purrfect!");
            }
            if (mt == 'f' || mt == 'F'){
                System.out.println("Your generated gato name is: Sushi! Your gato's love for fish makes this name purrfect!");
            }
        }
        else{ //if not silly, give a serious name haha!
            if (mt == 'c' || mt == 'C'){
                System.out.println("Your generated gato name is: Abby! Since your gato loves chicken, this name is purrfect! Since it is the same name of the girl chicken from Chicken Little!");
            }
            if (mt == 'b' || mt == 'B'){
                System.out.println("Your generated gato name is: Daisy! Since your gato loves beef, Daisy is purrfect! Daisy is a common name for cows!");
            }
            if (mt == 'f' || mt == 'F'){
                System.out.println("Your generated gato name is: Finley! Your gato's love for fish makes this name purrfect! Like fish fins!");
            }
        }
    }
}
