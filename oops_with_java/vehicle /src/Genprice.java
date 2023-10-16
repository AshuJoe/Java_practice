import java.util.*;

public class Genprice {


    public static int genprice(){
     Scanner sc= new Scanner(System.in);

        System.out.println("enter vehicle type:");
        VehModels v= VehModels.valueOf(sc.next().toUpperCase());
        
        System.out.println("enter vehicle color:");
        
        vehcolor v1= vehcolor.valueOf(sc.next().toUpperCase());
       
        
       //int tprice=totalprice();


        
            int totprice =(v.getprice()+v1.getPrice());
            System.out.println("total price=" + totprice);

              sc.close();
            return totprice;
        
        
    }
}
