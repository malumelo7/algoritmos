import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Linkedlist malu = new Linkedlist(new Node(1));
//
//
//
//        malu.print();
//        System.out.println();
//
//
//        malu.remove();
//        malu.print();
//        System.out.println();
        ArrayList<Integer> x = new ArrayList<>();
        x.add(1);
        x.add(2);
        x.add(3);
        x.add(4);
        x.add(5);
        x.add(6);
        System.out.println(x);
        int value = 3;
        int last = x.size()-1;

        int result = Lista.binarySearch(x, 0, last, value);
        if(result ==-1){
            System.out.println("Element not found!");
        }
        else{
            System.out.println("Element is found at index: " + result);
        }

    }

}
