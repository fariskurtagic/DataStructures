package datas.pkg4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DataS4 {
    public static void main(String[] args) throws IOException{
        Scanner scanner=new Scanner(new File("C:\\Users\\faris\\Documents\\NetBeansProjects\\DataS 4\\build\\classes\\datas\\pkg4\\set1.txt"));
        BinaryTree btree = new BinaryTree();
        while(scanner.hasNext()){
           int num=scanner.nextInt();
           if(num!=-999){
               btree.add(num);
           }
        }
        System.out.println("tree min "+ btree.treemin(btree.root).value);
        System.out.print("Inorder \t");
        btree.inorder(btree.root);
        System.out.print("\nPreorder \t");
        btree.preorder(btree.root);
        System.out.print("\nPostorder \t");
        btree.postorder(btree.root);
        
//        System.out.println("tree min "+ btree.treemin(btree.root).value);
        
        System.out.println("\nNumber of nodes: " + btree.count(btree.root));
        System.out.print("Number of children each node has:");
        btree.traverse(btree.root);
        
        System.out.println("\nInsert 21, Delete 1, Insert 0, Delete 10, Delete 11, Delete 5, Delete 2, Insert 10:");
        btree.add(21);
        btree.delete(1);
        btree.add(0);
        btree.delete(10);
        btree.delete(11);
        btree.delete(5);
        btree.delete(2);
        btree.add(10);
        
        System.out.print("Inorder \t");
        btree.inorder(btree.root);
        System.out.print("\nPreorder \t");
        btree.preorder(btree.root);
        System.out.print("\nPostorder \t");
        btree.postorder(btree.root);
        
        System.out.println("\nNumber of nodes: " + btree.count(btree.root));
        System.out.print("Number of children each node has:");
        btree.traverse(btree.root);
        System.out.println("\n\n");
        btree.emptyTree();
        
        Scanner scanner2=new Scanner(new File("C:\\Users\\faris\\Documents\\NetBeansProjects\\DataS 4\\build\\classes\\datas\\pkg4\\set2.txt"));
        BinaryTree btree2 = new BinaryTree();
        while(scanner2.hasNext()){
           int num=scanner2.nextInt();
           if(num!=-999){
               btree2.add(num);
           }
        }
        System.out.print("Inorder \t");
        btree2.inorder(btree2.root);
        System.out.print("\nPreorder \t");
        btree2.preorder(btree2.root);
        System.out.print("\nPostorder \t");
        btree2.postorder(btree2.root);
        System.out.println("\nNumber of nodes: " + btree2.count(btree2.root));
        System.out.print("Number of children each node has:");
        btree2.traverse(btree2.root);
        
        
        System.out.println("\nDelete 3, Delete 1:");
        btree2.delete(3);
        btree2.delete(1);
        
        
        System.out.print("Inorder \t");
        btree2.inorder(btree2.root);
        System.out.print("\nPreorder \t");
        btree2.preorder(btree2.root);
        System.out.print("\nPostorder \t");
        btree2.postorder(btree2.root);
        
        System.out.println("\nNumber of nodes: " + btree2.count(btree2.root));
        System.out.print("Number of children each node has:");
        btree2.traverse(btree2.root);
        System.out.println("\n\n");
        btree2.emptyTree();
        
        Scanner scanner3=new Scanner(new File("C:\\Users\\faris\\Documents\\NetBeansProjects\\DataS 4\\build\\classes\\datas\\pkg4\\set3.txt"));
        BinaryTree btree3 = new BinaryTree();
        while(scanner3.hasNext()){
           int num=scanner3.nextInt();
           if(num!=-999){
               btree3.add(num);
           }
        }
        System.out.print("Inorder \t");
        btree3.inorder(btree3.root);
        System.out.print("\nPreorder \t");
        btree3.preorder(btree3.root);
        System.out.print("\nPostorder \t");
        btree3.postorder(btree3.root);
        System.out.println("\nNumber of nodes: " + btree3.count(btree3.root));
        System.out.print("Number of children each node has:");
        btree3.traverse(btree3.root);
        
        System.out.println("\nDelete 15, Insert 30, Insert 5, Insert 10, Insert 20, Delete 20, Delete 10, Delete 5, Delete 15, Delete 30:");
        btree3.delete(15);
        btree3.add(30);
        btree3.add(5);
        btree3.add(10);
        btree3.add(20);
        btree3.delete(20);
        btree3.delete(10);
        btree3.delete(5);
        btree3.delete(15);
        btree3.delete(30);
        
        
        System.out.print("Inorder \t");
        btree3.inorder(btree3.root);
        System.out.print("\nPreorder \t");
        btree3.preorder(btree3.root);
        System.out.print("\nPostorder \t");
        btree3.postorder(btree3.root);
        
        System.out.println("\nNumber of nodes: " + btree3.count(btree3.root));
        System.out.print("Number of children each node has:");
        btree3.traverse(btree3.root);
        System.out.println("\n\n");
        btree3.emptyTree();
        
        Scanner scanner4=new Scanner(new File("C:\\Users\\faris\\Documents\\NetBeansProjects\\DataS 4\\build\\classes\\datas\\pkg4\\set4.txt"));
        BinaryTree btree4 = new BinaryTree();
        while(scanner4.hasNext()){
           int num=scanner4.nextInt();
           if(num!=-999){
               btree4.add(num);
           }
        }
        System.out.print("Inorder \t");
        btree4.inorder(btree4.root);
        System.out.print("\nPreorder \t");
        btree4.preorder(btree4.root);
        System.out.print("\nPostorder \t");
        btree4.postorder(btree4.root);
        System.out.println("\nNumber of nodes: " + btree4.count(btree4.root));
        System.out.print("Number of children each node has:");
        btree4.traverse(btree4.root);
        
        System.out.println("\nDelete 2:");
        btree4.delete(2);
        
        
        System.out.print("Inorder \t");
        btree4.inorder(btree4.root);
        System.out.print("\nPreorder \t");
        btree4.preorder(btree4.root);
        System.out.print("\nPostorder \t");
        btree4.postorder(btree4.root);
        
        System.out.println("\nNumber of nodes: " + btree4.count(btree4.root));
        System.out.print("Number of children each node has:");
        btree4.traverse(btree4.root);
        System.out.println("\n\n");
        btree4.emptyTree();
        
        Scanner scanner5=new Scanner(new File("C:\\Users\\faris\\Documents\\NetBeansProjects\\DataS 4\\build\\classes\\datas\\pkg4\\set5.txt"));
        BinaryTree btree5 = new BinaryTree();
        while(scanner5.hasNext()){
           int num=scanner5.nextInt();
           if(num!=-999){
               btree5.add(num);
           }
        }
        System.out.print("Inorder \t");
        btree5.inorder(btree5.root);
        System.out.print("\nPreorder \t");
        btree5.preorder(btree5.root);
        System.out.print("\nPostorder \t");
        btree5.postorder(btree5.root);
        System.out.println("\nNumber of nodes: " + btree5.count(btree5.root));
        System.out.print("Number of children each node has:");
        btree5.traverse(btree5.root);
        
        
        System.out.println("\nDelete 37, Delete 15, Insert 40, Insert 99");
        btree5.delete(37);
        btree5.delete(15);
        btree5.add(40);
        btree5.add(99);
        
        
        System.out.print("Inorder \t");
        btree5.inorder(btree5.root);
        System.out.print("\nPreorder \t");
        btree5.preorder(btree5.root);
        System.out.print("\nPostorder \t");
        btree5.postorder(btree5.root);
        
        System.out.println("\nNumber of nodes: " + btree5.count(btree5.root));
        System.out.print("Number of children each node has:");
        btree5.traverse(btree5.root);
        System.out.println("\n\n");
        btree5.emptyTree();
        
        Scanner scanner6=new Scanner(new File("C:\\Users\\faris\\Documents\\NetBeansProjects\\DataS 4\\build\\classes\\datas\\pkg4\\set6.txt"));
        BinaryTree btree6 = new BinaryTree();
        while(scanner6.hasNext()){
           int num=scanner6.nextInt();
           if(num!=-999){
               btree6.add(num);
           }
        }
        System.out.print("Inorder \t");
        btree6.inorder(btree6.root);
        System.out.print("\nPreorder \t");
        btree6.preorder(btree6.root);
        System.out.print("\nPostorder \t");
        btree6.postorder(btree6.root);
        System.out.println("\nNumber of nodes: " + btree6.count(btree6.root));
        System.out.print("Number of children each node has:");
        btree6.traverse(btree6.root);
        System.out.println("\n\n");
        btree6.emptyTree();
        
        Scanner scanner7=new Scanner(new File("C:\\Users\\faris\\Documents\\NetBeansProjects\\DataS 4\\build\\classes\\datas\\pkg4\\set7.txt"));
        BinaryTree btree7 = new BinaryTree();
        while(scanner7.hasNext()){
           int num=scanner7.nextInt();
           if(num!=-999){
               btree7.add(num);
           }
        }
        System.out.print("Inorder \t");
        btree7.inorder(btree7.root);
        System.out.print("\nPreorder \t");
        btree7.preorder(btree7.root);
        System.out.print("\nPostorder \t");
        btree7.postorder(btree7.root);
        System.out.println("\nNumber of nodes: " + btree7.count(btree7.root));
        System.out.print("Number of children each node has:");
        btree7.traverse(btree7.root);
        btree7.emptyTree();
        System.out.println();
        
        
    }
    
}
