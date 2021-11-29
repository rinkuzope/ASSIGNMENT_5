import java.util.*;
public class compareElements {
    public static void main(String[] args) {
        ArrayList<String> flist= new ArrayList<String>();
        flist.add("One piece");
        flist.add("Naruto");
        flist.add("Haikyuu");
        flist.add("Deathnote");
        System.out.println("String one:" + flist);
        ArrayList<String> slist= new ArrayList<String>();
        slist.add("One piece");
        slist.add("Code Geas");
        slist.add("Haikyuu");
        slist.add("Deathnote");
        System.out.println("String two:" +slist);
        boolean b = flist.equals(slist);
        System.out.println("Is string one equal to string two:\t" + b);
      slist.removeAll(flist);
      System.out.println("Uncommon element in string two:" + slist);
      slist.retainAll(flist);

    }

}
