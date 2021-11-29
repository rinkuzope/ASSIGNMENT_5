import java.util.*;

public class Rotate_elements {

        public static void main(String[] args) {

            List<Integer> num = new ArrayList<>();
            for (int i = 1; i <= 10; i++) {
                num.add(i);
            }
            System.out.println("Value Before Rotation: "+Arrays.toString(num.toArray()));
            Collections.rotate(num, 2);
            System.out.println("Value After Rotation: "+Arrays.toString(num.toArray()));
        }
    }

