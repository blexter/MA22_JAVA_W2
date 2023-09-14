import javax.naming.directory.SearchControls;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        /*int[] numbers = {3,5,6,9};
        String[] allNames = {"David", "Susan", "Lois", "Laura"};

        String[] moreNames = new String[25];

        String name1 = allNames[1];
        System.out.println(name1);

        for(int i = 0; i < allNames.length; i++){
            System.out.println(allNames[i]);
        }


        for (String name : allNames){
            System.out.println(name);
        }

        boolean found = contains("Lois", allNames);
        System.out.println(found);
    }

    static boolean contains(String name, String[] namesArray){
        for (String str : namesArray) {
            if(str.equals(name)){
                return true;
            }
        }
        return false;


        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hur många namn vill du hantera? ");
        size = sc.nextInt();
        String[] names = new String[size];
        sc.nextLine();
        for(int i = 0; i < size; i++) {
            int cnt = i+1;
            System.out.println("Ange namn nummer " + cnt + ": ");
            names[i] = sc.nextLine();
        }

        for (String name: names){
            System.out.println(name);
            String newWord ="";
            char ch;
            for (int i = 0; i < name.length(); i++) {
                ch = name.charAt(i);
                newWord = ch + newWord;
            }
            System.out.println(newWord);
        }*/

        /*ArrayList<String> allNames = new ArrayList<String>();

        System.out.println(allNames.size());

        allNames.add("David");
        allNames.add("Susan");
        allNames.add("Laura");

        System.out.println(allNames.size());

        System.out.println(allNames.get(0));

        System.out.println(allNames.contains("Susan"));

        for(String str : allNames){
            System.out.println(str);
        }*/


        /*Scanner sc = new Scanner(System.in);
        String input = "";
        ArrayList<String> list = new ArrayList<>();
        int cnt = 1;
        boolean cont = true;
        //while(!input.equals("done") && cnt < 10){
        do {
            System.out.println("Ange en vara: ");
            input = sc.nextLine();
            if (input.equals("done")) {

            } else if (cnt > 10) {
                searchAndReplace(list, sc, input);
                cont = false;
            }
            if (!input.equals("done") && cont) {
                list.add(input);
                cnt++;
            }
        } while (!input.equals("done"));
        for (String item : list) {
            System.out.println(item);
        }

    }

    static ArrayList<String> searchAndReplace(ArrayList<String> list, Scanner sc, String input) {

        System.out.println("Vilken vara vill du ersätta? ");
        String exist = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).equals(exist)) {
                list.remove(i);
                list.add(input);
            }
        }

        return list;*/

/*       Scanner sc = new Scanner(System.in);
        ArrayList<Integer> points = new ArrayList<>();
        int input = 1;
        while(input != 0) {
            System.out.println("Mata in poäng eller avsluta genom att skriva 0: ");
            input = sc.nextInt();
            if(input != 0){
                points.add(input);
            }
        }

        System.out.println("Highscore: " + highScore(points));
        System.out.println("Average: " + average(points));

    }

    static int highScore (ArrayList<Integer> scores){
        int highScore = 0;
        for (int point: scores){
            if(point > highScore){
                highScore = point;
            }
        }
        return highScore;
    }

    static double average (ArrayList<Integer> scores) {
        double average = 0;
        int i = 0;
        for(i = 0; i < scores.size(); i++){
            average += scores.get(i);
        }
        average = average / i;
        return average;
*/
/*        int MAX_SIZE = 3;


        ArrayList<String> shoppingList = new ArrayList<>();

        System.out.println("Skapa en matlista:");
        String newItem = "";

        while (!newItem.equals("done")) {
            System.out.println("Lägg till:");
            newItem = sc.nextLine();

            if (!newItem.equals("done")) {
                if (shoppingList.size() < MAX_SIZE) {
                    shoppingList.add(newItem);
                } else {
                    checkAndReplaceItem(shoppingList, newItem);
                }
            }

        }

        printList(shoppingList);

    }

    public static void checkAndReplaceItem(ArrayList<String> shoppingList, String newItem){
        boolean replaced = false;
        while (!replaced) {
            System.out.println("Vilken vara skall ersättas?");
            printList(shoppingList);
            String itemToRemove = sc.nextLine();
            replaced = replace(itemToRemove, newItem, shoppingList);
        }
    }
    public static boolean replace(String oldItem, String newItem, ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(oldItem)) {
                list.set(i, newItem);
                return true;
            }
        }
        return false;
    }

    public static void printList(ArrayList<String> list) {
        for (String item : list) {
            System.out.println(item);
        }*/

        /*Du har en lista av heltal. Din uppgift är att skapa en funktion eller algoritm som hittar
        det största unika talet i listan. Ett unikt tal är ett tal som bara förekommer en gång i listan.
        Om det inte finns något unikt tal ska funktionen returnera ett meddelande om detta.*/

        ArrayList<Integer> ints = new ArrayList<Integer>();
        int highestNumber = 0;

        highestNumber =  getInts(ints, highestNumber);
        for(int a : ints){
            //System.out.println(a);
        }
        System.out.println(highestNumber);
    }
    public static int getInts (ArrayList<Integer> ints, int highestNumber){
        Random rnd = new Random();
        for(int i = 1; i < 100; i++){
            ints.add(rnd.nextInt(100));
        }
        return getHighestInt(ints, highestNumber);

    }
    public static int getHighestInt (ArrayList<Integer> ints, int highestNumber){
        boolean exit = false;
        while(exit) {
            for (int oneInt : ints) {
                if (oneInt > highestNumber) {
                    highestNumber = oneInt;
                }
            }
            int j = 0;
            for (int oneInt : ints) {
                if (oneInt == highestNumber) {
                    j++;
                }

            }

            if (j > 1) {
                System.out.println("Dublett");
            }
        }
        return highestNumber;
    }
}