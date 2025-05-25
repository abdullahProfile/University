package linkList.SingleList;


import java.util.Scanner;
public class List {

    public class  Node {
    int data;
    Node next;

    public Node(int data) {
        this.data= data;
        this.next= null;
    }


    public static Node heade;
    public static Node tail;

    public void addfirst(int data) {
        Node newNode= new Node(data);

        if(newNode== null) {
            heade = newNode = tail;
        }

        newNode.next=heade;
        heade=newNode;
    }

    public void printNode() {
        Node temp=heade;

        if(temp== null) {
            System.out.print("list is Empty");
        }


        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp= temp.next;
        }


        System.out.print("Null");
    }
    public static void main(String[] args) {


        List node1= new List();


        Scanner reader= new Scanner(System.in);


        System.out.print("How Many Node Do You Want to Add: ");
        int readeNode=reader.nextInt();


        for(int i=0; i<readeNode; i++){
            System.out.print("Add Node at:"+ i+ ": ");
            int addNode=reader.nextInt();

            node1.addfirst(addNode);
        }
        node1.printNode();
    }
}
}