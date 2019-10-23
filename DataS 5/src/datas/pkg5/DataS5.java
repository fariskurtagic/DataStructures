package datas.pkg5;

import java.io.*;
import java.util.*;

public class DataS5 {
    public static void main(String[] args) throws IOException{
        Scanner data = new Scanner (new File("C:\\Users\\faris\\Documents\\NetBeansProjects\\DataS 5\\build\\classes\\datas\\pkg5\\DS5file1.txt"));
        Tree tree = new Tree();
        read (data,tree,"Brian");
        Scanner data2 = new Scanner (new File("C:\\Users\\faris\\Documents\\NetBeansProjects\\DataS 5\\build\\classes\\datas\\pkg5\\DS5file2.txt"));
        Tree tree2 = new Tree();
        read (data2,tree2,"Tim");
        Scanner data3 = new Scanner (new File("C:\\Users\\faris\\Documents\\NetBeansProjects\\DataS 5\\build\\classes\\datas\\pkg5\\DS5file3.txt"));
        Tree tree3 = new Tree();
        read (data3,tree3,"Frank");
        Scanner data4 = new Scanner (new File("C:\\Users\\faris\\Documents\\NetBeansProjects\\DataS 5\\build\\classes\\datas\\pkg5\\DS5file4.txt"));
        Tree tree4 = new Tree();
        read (data4,tree4,"James");
        Scanner data5 = new Scanner (new File("C:\\Users\\faris\\Documents\\NetBeansProjects\\DataS 5\\build\\classes\\datas\\pkg5\\DS5file5.txt"));
        Tree tree5 = new Tree();
        read (data5,tree5,"Eric");    
    }
    
    public static void read(Scanner data,Tree tree,String p){
        while(data.hasNext()){
            String father = data.next();
            String son = data.next();
            tree.add(father, son);
        }
        questions(p,tree);
        data.close();
    }
    
    public static void questions(String p,Tree tree){
        System.out.println("Who is the father of " + p + "?");
        Node pfather = tree.findFather(p,tree.root);
        System.out.println(pfather.son);
        System.out.println("Who is the oldest brother of " + p + "?");
        Node pbrother = tree.findBrother(p, tree.root);
        System.out.println(pbrother.son);
        System.out.println("Who is the youngest brother of " + p + "?");
        Node pybrother = tree.findYBrother(p, tree.root);
        System.out.println("Who is the oldest son of " + p + "?");
        Node pson = tree.findSon(p, tree.root);
        System.out.println(pson.son);
        System.out.println("Who is the youngest son of " + p + "?");
        Node pyson = tree.findYSon(p, tree.root);
        System.out.println(pyson.son);
        System.out.println();
    }
}
