package datas.pkg3;
public class List {
    private class Node{
        receipt value;
        Node next;  
        
        Node(receipt val, Node n){
            value=val;
            next=n;
        }
        Node(receipt val){
            this(val, null);
        }
    } 
    private Node front, rear;
    private int size;
    
    public List(){
        front = null;
	rear = null;
        size = 0;
    }
    
    public receipt delete(){
        if(front==null){
            return null;
        }
        receipt p = front.value;
        front=front.next;
        size--;
        return p;
    }
    
    
    public void insert(receipt item){
       if(isEmpty()){
           front=new Node(item);
           rear=front;
       }
       else{
           rear.next=new Node(item);
           rear=rear.next;
       }
           
        size++;
    }
    
    public void insert(int index, receipt item){
        if(index==0){
            front=new Node(item, front);
            if(rear==null)
                rear=front;
            size++;
            return;
        }
        Node pred=front;
        for(int k=1; k<=index-1; k++){
            pred=pred.next;
        }
        pred.next=new Node(item, pred.next);
        if(pred.next.next == null)
            rear=pred.next;
    }
    
    public boolean isEmpty(){
        return (front==null);
    }
     
    public int size(){
        return size;
    }  
}
    
