import Discount.Discout;

public class Main {
   public static void main(String[]args){
     for (Discout value : Discout.values()){
           System.out.println(value);
       }

    double x = Discout.DISCOUNTED.getDiscount();
       System.out.println(x);
       System.out.println("----------");
       for (AbxtractDixcount value : AbxtractDixcount.values()){
           System.out.println(value.discout());
       }

       ////количество элементов пречисления
       System.out.println(AbxtractDixcount.values().length);
   }
}
