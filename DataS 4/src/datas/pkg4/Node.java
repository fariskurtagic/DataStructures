package datas.pkg4;
public class Node {
    int value;
    Node left, right;
    
    Node(int val){
        value=val;
        left=null;
        right=null;
    }
    
    Node(int val, Node leftChild, Node rightChild){
        value=val;
        left=leftChild;
        right=rightChild;
    }
}
