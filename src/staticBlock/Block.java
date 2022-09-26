package staticBlock;

public class Block {

    public static int year;

    //creating static block
    static {
        year = 2022;
        System.out.println("This code block is executed first");
    }

}
