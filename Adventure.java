import java.util.Scanner;

public class Adventure {
    public static void main(String[] args){
        System.out.println(". ❅ . * . ❅ . * . ❅ . * . ❅ . * ❅ .");
        Boolean playingGame = true;
        int points = 0;
        Scanner input = new Scanner(System.in);
        while (playingGame) { // Uses a loop to allow the user to restart the adventure if the player completes the story
        System.out.println("You wake up the morning before Christmas, frost clinging to your window, and turn to see your stuffed penguin nearby.");    
        System.out.println("'Hey, kid! You woke up!', Pingu says. \n'Stop calling me kid! My name is ");
        String name = input.nextLine(); // Ask the user to enter a hero’s name
        System.out.println("'Okay, " + name + ", do you want to go on an adventure today?'"); // string manipulation
        System.out.println("'Yes! Where are we going?'");
        System.out.println("'To find Santa, of course!'");
        System.out.println("Next thing you know, you have Pingu in a little bag at the snow-covered park.");
        System.out.println("Pingu explains that the more magical experiences you have today, the more magic points you acquire to see Santa.");
        points += 10; // numeric check for the score
        System.out.println("Talking to Pingu gives you ten magic points: " + points);
        System.out.println("You look up and see a snowman and an igloo ahead of you.");
        Boolean makingDecision = true;
        while (makingDecision){ // The conditionals are in a loop so that if the user makes the wrong decision, they get another chance at it without restarting the whole game.
            System.out.print("\nDo you interact with the snowman (1) or the igloo (2)? "); // Decision point 1
            int decision1 = Integer.parseInt(input.nextLine());
            if (decision1 == 1){ // Conditionals determine the outcomes of each choice
                System.out.println("You walk towards the snowman and poke it. Suddenly, the snowman moves and throws a snowball in your face.\nWhen you open your eyes, you find yourself back at the point of decision.");
                points -= 5;
                System.out.println("-5 magic points: " + points);
                continue;
            } else if (decision1 == 2){
                System.out.println("You walk into the igloo and fall through a sheet of ice. When you collect your thoughts, you are on the other side you see a vast expanse of snow.\n'The North Pole,' Pingu exlaims!");
                points += 20;
                System.out.println("+20 magic points: " + points);
                makingDecision = false;
            } else {
                System.out.println("While you are not making a decision, a pile of snow falls from a tree and buries you. Regain your focus and pick your path.");
                points -= 10;
                System.out.println("-10 magic points: " + points);
                continue;}}
        System.out.println("Looking out on the blue-tinted landscape of white snow, you see a polar bear and a caribou on opposite sides of your view.");
        makingDecision = true;
        while (makingDecision){
            System.out.print("Which one do you approach, the polar bear (1) or the caribou (2)? "); // Decision point 2
            int decision2 = Integer.parseInt(input.nextLine());
            if (decision2 == 1){
                System.out.println("You go up to the polar bear and ask if he can take you to Santa's workshop.\nHe offers you a ride, and after hours of wondering in the snow, the polar bear admits it got lost and you end up back where you started.\nYou leave the polar bear and see the caribou still nearby.");
                points -= 5;
                System.out.println("-5 magic points: " + points);
                continue;
            } else if (decision2 == 2){
                System.out.println("You walk towards the antlered creature as Pingu tells you caribou are also known as reindeer!\nThe caribou tells you it is one of Santa's reindeer and knows exactly how to get to him, so you ride a magical caribou all the way to the workshop.");
                points += 20;
                System.out.println("+20 magic points: " + points);
                makingDecision = false;
            } else {
                System.out.println("As you stand there, you loose your footing on the snow, and fall, getting a cold greeting from the snow in your face.");
                points -= 10;
                System.out.println("-10 magic points: " + points);
                continue;}}
        System.out.println("The workshop is busy with festive cheer and holiday preparations.\nYou look around for Santa, but instead see an old elf looking through a box of toys while a younger elf puts parts together into toys and tosses them into the box.");
        makingDecision = true;
        while (makingDecision){
            System.out.print("\nDo you ask the old elf (1) or the young elf (2) for help? "); // Decision point 3
            int decision3 = Integer.parseInt(input.nextLine());
            if (decision3 == 1){
                System.out.println("You walk towards the older elf as he places a toy train back in the box. 'Oh! Why, hello, young one! What are you doing here?'\n'I am looking for Santa,' you respond.\n'Oh, of course!,' exclaims the gray-haired elf, as he turns away from you. 'Follow me!'");
                points += 20;
                System.out.println("+20 magic points: " + points);
                makingDecision = false;
            } else if (decision3 == 2){
                System.out.println("You approach the busy elf, and he barely notices you as he paints the rims on a model car. 'Excuse me...'\nStartled, the elf looks up at you. 'What are you doing here? Children do not belong in Santa's workshop!'\n'Oh, well, I am looking for him!'\nFocusing on his work again, the elf mumbles 'Alright, well, here, I need to keep working,' as he hands you a superhero figurine.\nYou walk away with the toy in-hand, seeing that the old elf is still nearby.");
                points -= 10;
                System.out.println("-10 magic points: " + points);
            } else {
                System.out.println("As you stand in the doorway of Santa's workshop, an elf carrying a large box of toys bumps into you. After regaining your balance, you look up at the two elves at the end of an assembly line again.");
                points -= 10;
                System.out.println("-10 magic points: " + points);
                continue;}}
        System.out.println("\nThe wise elf leads you to a large candy-cane striped door. Slowly, with a grand gesture, the elf opens the door, and steps aside to let you in.\nThe next thing you know, you are standing right in front of Santa.");
        System.out.println("'Oh, ho, ho, ho! Look who we have here! " + name + ", how did you get to my workshop?'\nYou stutter in pure astonishment and excitement, 'I- I- Pingu led me from home.' Pingu pokes out of your bag and waves cheerfully at Santa.\n'Well, what a journey! For your efforts, I have a little present for you, but first, follow me to my sleigh. I need to take you home!' Next to Santa, you climb into a seat in his sleigh.\nAfter a jolly whistle to his reindeer, you feel that you are floating, and soon, moving, fast, flying home.\nIn your state of pure exhilaration, it feels like after just an instant, the sleigh has landed on a familiar rooftop. 'Well, buddy, you are home!', Santa tells you. You turn to step out of the sleigh.\n'Before you go though,' Santa says, as he hands you a perfectly wrapped gift, 'I have this for you.'\nBefore you can thank him, Santa chuckles cheerfully and whistles to his reindeer once more as he disappears into the setting sky.\nYou look at the glittering bow on the present in your hands, and cannot help but feeling an overwhelming certainty that it is exactly what you hoped for for Christmas.");
        System.out.print("\nDo you wish to adventure more (1) or find your way to bed and sleep before Christmas morning (2)? ");
            int decision4 = Integer.parseInt(input.nextLine());
            if (decision4 == 2){
                playingGame = false;
            }}
    System.out.println("After safely finding your way off the roof, you place the gift from Santa under your Christmas tree. Happy, but sleepy, you drag yourself to bed, quickly dreaming about the morning to come.");
    System.out.println("Final magic points: " + points);
    System.out.println(". ❅ . * . ❅ . * . ❅ . * . ❅ . * ❅ .");
    input.close();
    }}