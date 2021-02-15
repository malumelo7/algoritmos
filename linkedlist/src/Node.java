public class Node {
    private Integer value;
    Node next;

    public Node(int value){
        this.value = value;
        this.next = null;
    }

    public int getValue(){
        return value;
    }

    public void setValue(Integer value){
        this.value = value;
    }
}
