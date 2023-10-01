import java.util.ArrayList;
import java.util.Collections;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        //add elements
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);

        //get elements
        int element=list.get(0);
        System.out.println(element);

        //add element in between
        list.add(1,1);
        System.out.println(list);

        //set element
        list.set(0, 5);
        System.out.println(list);

        //delete elements
        list.remove(3);
        System.out.println(list);

        //size of list
        int size=list.size();
        System.out.println(size);

        //Loops on List
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i));
        }
        System.out.println();

        //sorting
        list.add(0);
        Collections.sort(list);
        System.out.println(list);
    }
}
