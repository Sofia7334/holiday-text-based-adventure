import java.util.Scanner;

public class Adventure {
    public static void main(String[] args){
        System.out.println(". ❅ . * . ❅ . * . ❅ . * . ❅ . * ❅ .");
        Boolean playingGame = true;
        int points = 0;
        while (playingGame) {
        Scanner input = new Scanner(System.in);
        System.out.println("You wake up the morning before Christmas, frost clinging to your window, and turn to see your stuffed penguin nearby.");    
        System.out.println("'Hey, kid! You woke up!', Pingu says. \n'Stop calling me kid! My name is ");
        String name = input.nextLine();
        System.out.println("'Okay, " + name + ", do you want to go on an adventure today?'");
        System.out.println("'Yes! Where are we going?'");
        System.out.println("'To find Santa, of course!'");
        System.out.println("Next thing you know, you have Pingu in a little bag at the snow-covered park.");
        System.out.println("Pingu explains that the more magical experiences you have today, the more magic points you acquire to see Santa.");
        points += 10;
        System.out.println("Talking to Pingu gives you ten magic points: " + points);
        System.out.println("You look up and see a snowman and an igloo ahead of you.");
        Boolean makingDecision = true;
        while (makingDecision){
            System.out.println(" Do you interact with the snowman(1) or the igloo(2)?");
            int decision1 = Integer.parseInt(input.nextLine());
            if (decision1 == 1){
                System.out.println("You walk towards the snowman and poke it. Suddenly, the snowman moves and throws a snowball in your face.\nWhen you open your eyes, you find yourself back at the point of decision.");
                points -= 5;
                System.out.println("-5 magic points: " + points);
                continue;
            } else if (decision1 == 2){
                System.out.println("You walk into the igloo and fall through a sheet of ice. When you collect you thoughts, on the other side you see a vast expanse of snow.\n'The North Pole,' Pingu exlaims!");
                points += 20;
                System.out.println("+20 magic points: " + points);
                makingDecision = false;
            } else {
                System.out.println("While you are not making a decision, a pile of snow falls from a tree and buries you. Regain your focus and pick your path.");
                points -= 10;
                System.out.println("-10 magic points: " + points);
                continue;}

        }

    }
}}