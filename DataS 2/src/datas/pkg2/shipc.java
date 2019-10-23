package datas.pkg2;

public class shipc {
    final String city; 
    int item1=0;
    int item2=0;
    int item3=0;
    
    public shipc(String city, int item1, int item2, int item3){
        this.city=city;
        this.item1=item1;
        this.item2=item2;
        this.item3=item3;
    }
    public String getcity() {
       return city;
    }
    public double getitem1() {
       return item1;
    }
    public double getitem2() {
       return item2;
    }
    public double getitem3() {
       return item3;
    }
}

