package datas.pkg3;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DataS3 {
    public static void main(String[] args) throws IOException{
        Scanner data=  new Scanner (new File("C:\\Users\\faris\\Documents\\NetBeansProjects\\DataS 3\\build\\classes\\datas\\pkg3\\DS3file1.txt"));
        int quantity;
        double price;
        double total;
        int saleq;
        double saletot=0;
        int promocust=0;
        double promo=0;
        List list=new List();
        while(data.hasNextLine()){
            String q= data.next();
            if (q.equals("R")){
                quantity=data.nextInt();
                price= data.nextDouble();
                receipt r= new receipt(quantity, price);
                list.insert(r);
                System.out.printf("Receipt with %d items at $%.2f each\n\n",r.quantity,r.price);
                
            }
            else if (q.equals("S")){
                total=0;
                saleq = data.nextInt();
                receipt stock =list.delete();
                if (stock.quantity>=saleq){
                    double salep= stock.price*1.3;
                    saletot=salep*saleq;
                    if (promocust==0){
                        System.out.printf("%d sold at $%.2f each\tSales: $%.2f\n", saleq,salep,saletot);
                    }
                    else{
                        saletot=saletot-(saletot*promo);
                        System.out.printf("%d sold at $%.2f each\tSales: $%.2f\n", saleq,salep,saletot);
                        promocust--;
                    }
                    stock.quantity-=saleq;
                    if (stock.quantity>0)
                        list.insert(0,stock);
                    System.out.printf("\tTotal Sales: $%.2f\n\n",saletot);
                }
                else{
                    int saleleft=saleq-stock.quantity;
                    double salep= stock.price*1.3;
                    saletot=salep*stock.quantity;
                    total+=saletot;
                    if (promocust==0){
                        System.out.printf("%d sold at $%.2f each\tSales: $%.2f\n", stock.quantity,salep,saletot);
                    }
                    else{
                        saletot=saletot-(saletot*promo);
                        System.out.printf("%d sold at $%.2f each\tSales: $%.2f\n", stock.quantity,salep,saletot);
                        total-=saletot;
                        promocust--;
                    }
                    while (!list.isEmpty()&&saleleft>0){
                        receipt stock2 =list.delete();
                        if (stock2.quantity>=saleleft){
                            stock2.quantity-=saleleft;
                            double salep2=stock2.price*1.3;
                            saletot=salep2*saleleft;
                            total+=saletot;
                            if(promocust==0){
                                System.out.printf("%d sold at $%.2f each\tSales: $%.2f\n", saleleft,salep2,saletot);
                            }
                            else{
                                saletot=saletot-(saletot*promo);
                                System.out.printf("%d sold at $%.2f each\tSales: $%.2f\n", saleleft,salep2,saletot);
                                total-=saletot;
                                promocust--;
                            }
                            if (stock2.quantity>0)
                                list.insert(0,stock2);
                            saleleft=0;
                        }
                        else {
                            saleleft-=stock2.quantity;
                            double salep2=stock2.price*1.3;
                            saletot=salep2*stock2.quantity;
                            total+=saletot;
                            if(promocust==0){
                                System.out.printf("%d sold at $%.2f eaach\tSales: $%.2f\n", stock2.quantity,salep2,saletot);
                            }
                            else{
                                saletot=saletot-(saletot*promo);
                                System.out.printf("%d sold at $%.2f eaach\tSales: $%.2f\n", stock2.quantity,salep2,saletot);
                                total-=saletot;
                                promocust--;
                            }
                        }
                    }
                    if (saleleft>0)
                        System.out.println("Remainder of "+saleleft+" widgets not available");
                    System.out.printf("\tTotal Sales: $%.2f\n\n",total);
                }
            }
            else if (q.equals("P")){
                promo=data.nextDouble();
                String p="%";
                System.out.printf("The next two customers recieve a %s%.2f discount on their puchase\n\n",p,promo);
                promo=promo/100;
                promocust+=2;
            }
        }
        System.out.println("Widgets left in stock:");
        while(!list.isEmpty()){
            receipt widget = list.delete();
            System.out.printf("%d widgets left at original price of $%.2f\n",widget.quantity,widget.price);
            
        }
    }
}
