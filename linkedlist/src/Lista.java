import java.util.ArrayList;


class Lista{
    public static int binarySearch(ArrayList<Integer> x,int first, int last, int value){

            if(last >= first){
                int mid = first + (last-first)/2;
                if(x.get(mid) == value){
                    return mid;
                }
                if (x.get(mid) > value) {
                    return binarySearch(x, first, mid-1, value);
                }
                else{
                    return binarySearch(x, mid + 1, last, value);
                }
                }
            return -1;
            }

    }
