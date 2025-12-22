import java.util.Scanner;

public class Adventure {
    public static void main(String[] args){
        Boolean playingGame = true;
        while (playingGame) {
        Scanner input = new Scanner(System.in);
        System.out.println("You wake up the morning before Christmas, frost clinging to your window,\nand turn to see your stuffed penguin nearby.\n");    
        System.out.println("'Hey, kid! You woke up!', Pingu says. \n'Stop calling me kid! My name is ");
        String name = input.nextLine();
        System.out.println("\n'Okay, " + name + ", do you want to go on an adventure today?'");
        System.out.print(" 'Yes! Where are we going?'");
        System.out.print(" 'To find Santa, of course!'");
        System.out.print(" 'Next thing you know, you have Pingu in a little bag\nand you are looking at an igloo and snowman at the park.");
        Boolean makingDecision = true;
        while (makingDecision){
            System.out.println(" Do you interact with the snowman(1) or the igloo(2)?");
            int decision1 = Integer.parseInt(input.nextLine());
            if (decision1 == 1){
                System.out.println("You walk towards the snowman and poke it. Suddenly, the snowman moves and throws a snowball in your face.\nWhen you open your eyes, you find yourself back at the point of decision.");
                continue;
            } else if (decision1 == 2){
                System.out.println("You walk into the igloo and fall through a sheet of ice. When you collect you thoughts, on the other side you see a vast expanse of snow.\n'The North Pole,' Pingu exlaims!");
                makingDecision = false;
            } else {
                System.out.println("While you are not making a decision, a pile of snow falls from a tree and buries you. Regain your focus and pick your path.");
                continue;
            }
        }

    }
}}