package datas.pkg1;
import java.util.Scanner;
import java.io.*;
import static java.lang.Double.parseDouble;
import java.util.ArrayList;

public class DataS1 {
    public static void main(String[] args) throws IOException,FileNotFoundException {
        Scanner mstr = new Scanner(new File("C:\\Users\\faris\\Documents\\NetBeansProjects\\DataS 1\\build\\classes\\datas\\pkg1\\DS1File1.txt"));
        Scanner tran = new Scanner(new File("C:\\Users\\faris\\Documents\\NetBeansProjects\\DataS 1\\build\\classes\\datas\\pkg1\\tran.txt"));

        ArrayList<Integer> idnum = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<Double> inbal = new ArrayList<>();
        while (mstr.hasNextLine()){
            idnum.add(mstr.nextInt());
            String line= mstr.nextLine();
            String cstmr= line.substring(1,20);
            name.add(cstmr);
            String bal= line.substring(21);
            double initial=parseDouble(bal);
            inbal.add(initial);
        }
        
        ArrayList<Integer> idnumo= new ArrayList<>();
        ArrayList<Integer> idnump= new ArrayList<>();
        ArrayList<Integer> onum= new ArrayList<>();
        ArrayList<Integer> pnum= new ArrayList<>();
        ArrayList<String> item= new ArrayList<>();
        ArrayList<Integer> quant= new ArrayList<>();
        ArrayList<Double> price= new ArrayList<>();
        ArrayList<Double> pmt= new ArrayList<>();
        ArrayList<Double> cost= new ArrayList<>();
        ArrayList<Double> totcustbal= new ArrayList<>();
        
        int o=0;
        int p=0;
        int t=0;
        while (tran.hasNext()){
            String c= tran.next();
            if(c.equals("O")){
                idnumo.add(tran.nextInt());
                onum.add(tran.nextInt());
                item.add(tran.next());
                quant.add(tran.nextInt());
                price.add(tran.nextDouble());
                o++;
                t++;
            }
            else if(c.equals("P")){
                idnump.add(tran.nextInt());
                pnum.add(tran.nextInt());
                pmt.add(tran.nextDouble());
                p++;
                t++;
            }
        }
        
        for (int n=0; n<idnum.size();n++){
            double total=inbal.get(n);
            for (int z=0; z<o;z++){
                if (idnum.get(n).equals(idnumo.get(z))){
                        total += (quant.get(z)*price.get(z));
                }
            }
            totcustbal.add(total);
        }
        for (int n=0; n<idnum.size();n++){
            double total=totcustbal.get(n);
            for (int z=0; z<p;z++){
                if (idnum.get(n).equals(idnump.get(z))){
                        total -=pmt.get(z);
                }
            }
            cost.add(total);
        }
        for (int n=0; n<idnum.size();n++){
            System.out.printf("\n%s\t%d\t\n\t\t\t  Previous Balance = $ %.2f\n\n",name.get(n),idnum.get(n),inbal.get(n));
            for (int z=0; z<o;z++){
                if (idnum.get(n).equals(idnumo.get(z))){
                    double orderamt=(quant.get(z)*price.get(z));
                    System.out.printf("Transaction # %d\t%s\t\t$%.2f\n",onum.get(z),item.get(z),orderamt);
                }
            }
            for (int z=0; z<p;z++){
                    if(idnum.get(n).equals(idnump.get(z))){
                        System.out.printf("Transaction # %d\tPayment\t\t$%.2f\n",pnum.get(z),pmt.get(z));
                    }
            }
            System.out.printf("\t\tBalance Due\t$%.2f\n", cost.get(n) );
            
        }
    }
}
