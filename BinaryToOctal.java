import java.util.HashMap;
import java.util.Scanner;

class binaryToOctal{
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();

        hmap.put(0, "0");
        hmap.put(1, "1");
        hmap.put(10, "2");
        hmap.put(11, "3");
        hmap.put(100, "4");
        hmap.put(101, "5");
        hmap.put(110, "6");
        hmap.put(111, "7");


        Scanner sc = new Scanner(System.in);

        System.out.println(hmap);
        System.out.println("Octal number 111 to Binary is "+ hmap.get(111));


    }
}