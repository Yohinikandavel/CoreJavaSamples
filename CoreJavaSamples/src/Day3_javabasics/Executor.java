package Day3_javabasics;

public class Executor {
         public static void main(String[] args) {
        	 Customer cl=new Customer();
        	 cl.setCid(37);
        	 cl.setCname("Yohini");
        	 cl.setAddress("Cuddalore");
        	 System.out.println("Customer ID:"+cl.getCid()+" Customer Name:"+cl.getCname()+" Customer Address:"+cl.getAddress());
         }
}