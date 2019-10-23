package datas.pkg2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DataS2 {
    public static void main(String[] args) throws IOException {
        Scanner data = new Scanner(new File("C:\\Users\\faris\\Documents\\NetBeansProjects\\DataS 2\\src\\datas\\pkg2\\DS2file1.txt"));
        double price1= data.nextDouble();
        double price2= data.nextDouble();
        double price3= data.nextDouble();
        
        String ny= "NewYork";
        String mi= "Miami";
        String la= "LosAngeles";
        String ho= "Houston";
        String cg= "Chicago";
        
        shipc wh [] = new shipc [5];
        wh[0] = new shipc(ny, 0,0,0);
        wh[1] = new shipc(mi, 0,0,0);
        wh[2] = new shipc(la, 0,0,0);
        wh[3] = new shipc(ho, 0,0,0);
        wh[4] = new shipc(cg, 0,0,0);
      
        while (data.hasNextLine()){
            String s=data.next();
            if (s.equals("s")){
                String city =data.next();
                if (city.equals(ny))
                    shpmnt (0,data,wh);
                else if (city.equals(mi))
                    shpmnt (1,data,wh);
                else if (city.equals(la))
                    shpmnt (2,data,wh);
                else if (city.equals(ho))
                    shpmnt (3,data,wh);
                else if (city.equals(cg))
                    shpmnt (4,data,wh);
                else 
                    System.out.println("Invalid city ");
            }
            else if(s.equals("o")){                
                String city =data.next();
                if (city.equals(ny))                    
                    instock(0,price1,price2,price3, data,wh);
                else if (city.equals(mi))
                    instock(1,price1,price2,price3, data,wh);
                else if (city.equals(la))
                    instock(2,price1,price2,price3, data,wh);
                else if (city.equals(ho))
                    instock(3,price1,price2,price3, data,wh);
                else if (city.equals(cg))
                    instock(4,price1,price2,price3, data,wh);
                else 
                    System.out.println("Invalid city ");
            }
        }
    }
   
    public static void shpmnt (int n, Scanner data, shipc wh[]){
        int x=data.nextInt();
        int y=data.nextInt();
        int z=data.nextInt();
        System.out.println("Shipment to "+ wh[n].city+" of "+x+"\t"+y+"\t"+z);
        wh[n].item1+=x;
        wh[n].item2+=y;
        wh[n].item3+=z;
        System.out.println(wh[n].city+" now has\t\t"+wh[n].item1+"\t"+wh[n].item2+"\t"+wh[n].item3+"\n");
    }
            
    public static void instock (int n,double price1, double price2, double price3,Scanner data, shipc wh[]){
        int x=data.nextInt();
        int y=data.nextInt();
        int z=data.nextInt();
        double cost=0;
        System.out.printf("order in %s of %d %d %d\n",wh[n].city,x,y,z);
        if (wh[n].item1-x<0){                      
            int p = max1(x,wh);
            if (wh[p].item1+wh[n].item1-x>=0){
                cost+=wh[n].item1*price1;
                int ship=wh[p].item1-(wh[p].item1+wh[n].item1-x);
                cost+=ship*price1*1.1;
                System.out.printf("%d of item1 shipped from %s to %s\n",ship,wh[p].city,wh[n].city);
                wh[p].item1=wh[p].item1+wh[n].item1-x;
                wh[n].item1=0;
                System.out.println(wh[p].city+"\t"+wh[p].item1+"\t"+wh[p].item2+"\t"+wh[p].item3);
            }
            else 
                System.out.println("orderf for item 1 unfilled");
        }
        else{
            wh[n].item1-=x;
            cost+=x*price1;
        }
        if (wh[n].item2-y<0){
            int q = max2(y,wh);
            if (wh[q].item2+wh[n].item2-y>=0){
                cost+=wh[n].item2*price2;
                int ship=wh[q].item2-(wh[q].item2+wh[n].item2-y);
                cost+=ship*price2*1.1;
                System.out.printf("%d of item2 shipped from %s to %s\n",ship,wh[q].city,wh[n].city);
                wh[q].item2=wh[q].item2+wh[n].item2-y;
                wh[n].item2=0;
                System.out.println(wh[q].city+"\t"+wh[q].item1+"\t"+wh[q].item2+"\t"+wh[q].item3);
            }
            else 
                System.out.println("order for item 2 unfilled");
        }
        else {
            wh[n].item2-=y;
            cost+=y*price2;
        }
        if (wh[n].item3-z<0){
            int r =max3(z,wh);
            if (wh[r].item3+wh[n].item3-z>=0){
                cost+=wh[n].item3*price3;
                int ship=wh[r].item3-(wh[r].item3+wh[n].item3-z);
                cost+=ship*price3*1.1;
                System.out.printf("%d of item3 shipped from %s to %s\n",ship,wh[r].city,wh[n].city);
                wh[r].item3=wh[r].item3+wh[n].item3-z;
                wh[n].item3=0;
                System.out.println(wh[r].city+"\t"+wh[r].item1+"\t"+wh[r].item2+"\t"+wh[r].item3);
            }
            else 
                System.out.println("order for item 3 unfilled");
        }
        else {
            wh[n].item3-=z;
            cost+=z*price3;
        }
        System.out.printf("%s\t%d\t%d\t%d\nPrice of Order: $%.2f\n\n",wh[n].city,wh[n].item1,wh[n].item2,wh[n].item3,cost);
    }
    
        public static int max1 (int o, shipc wh[]){
            int high =o;
            int r=0;
            for(int p=0; p<=4;p++){
                if (wh[p].item1>high){
                    high=wh[p].item1;
                    r=p;
                }
            }
            return r;
    }
        public static int max2 (int o, shipc wh[]){
            int high =o;
            int r=0;
            for(int p=0; p<=4;p++){
                if (wh[p].item2>high){
                    high=wh[p].item2;
                    r=p;
                }
            }
            return r;
    }   
    
        public static int max3 (int o, shipc wh[]){
            int high =o;
            int r=0;
            for(int p=0; p<=4;p++){
                if (wh[p].item3>high){
                    high=wh[p].item3;
                    r=p;
                }
            }
            return r;
        }
}
    

