public class Linkedlist {
    Node head;

    public Linkedlist(Node head){
        this.head = head;
    }

    public void add(int value){
        Node node = new Node(value);
        Node nodeTemp = this.head;
        while(nodeTemp.next != null){
            nodeTemp = nodeTemp.next;
        }
        nodeTemp.next = node;
    }

    public void print(){
        Node nodeTemp = this.head;
        if(nodeTemp == null){
            System.out.println("List is empty");
            return;
        }
        System.out.print(nodeTemp.getValue() + " -> ");
        while(nodeTemp.next != null){
            System.out.print(nodeTemp.next.getValue() + " -> ");
            nodeTemp = nodeTemp.next;
        }
    }

    public void delete(int value){
        Node nodeTemp = this.head;
        if (nodeTemp.getValue() == value){
            this.head = nodeTemp.next;
            return;
        }

        while(nodeTemp.next.getValue() != value){
            nodeTemp = nodeTemp.next;
        }
        nodeTemp.next = nodeTemp.next.next;
    }

    public void findIndex(int value){
        Node nodeTemp = this.head;
        int i = 1;
        while(nodeTemp!=null){
            if(nodeTemp.getValue() == value){
                System.out.println("The index is " + i);
                return;
            }
            nodeTemp = nodeTemp.next;
            i++;
        }
        System.out.println("Doesn't exist!");
    }

    //fazendo uma pilha
    public Node remove(){
        Node nodeTemp = this.head;
        if(size() == 1){
            this.head = null;
            return nodeTemp;
        }

        while(nodeTemp != null){
            if(nodeTemp.next.next == null){
                Node toBeRemoved = new Node(nodeTemp.next.getValue());
                nodeTemp.next = null;
                return toBeRemoved;
            }
            nodeTemp = nodeTemp.next;
        }
        return null;
    }

    //fazendo uma fila
    public boolean pop(){

        if(this.head.next != null) {
            this.head = this.head.next;
            return true;
        }
        return false;
        }

    public void findLastRepeat(Integer value){
        Node nodeTemp = this.head;
        int index = 1;
        int repeated = index;

        while(nodeTemp != null){
            if(nodeTemp.getValue() == value){
                repeated = index;
            }
            nodeTemp = nodeTemp.next;
            index++;
        }
        System.out.println("The last time " + value + " appears is in index: " + repeated);

    }

    public Integer size(){
        Node nodeTemp = this.head;
        int index = 0;

        while(nodeTemp != null){
            index++;
            nodeTemp = nodeTemp.next;
        }
            return index;
    }
}
