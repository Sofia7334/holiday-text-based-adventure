import java.util.Scanner;

public class Adventure {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("You wake up the morning before Christmas, frost clinging to your window,\nand turn to see your stuffed penguin nearby.\n");    
        System.out.println("'Hey, kid! You woke up!', Pingu says. \n'Stop calling me kid! My name is ");
        String name = input.nextLine();
        System.out.println("\n'Okay, " + name + ", do you want to go on an adventure today?'");
        System.out.print("Yes! Where are we going?'");
        System.out.print("'To find Santa, of course!''");
        System.out.print("Next thing you know, you have Pingu in a little bag\nand you are looking at an igloo and snowman at the park.");
    }
}