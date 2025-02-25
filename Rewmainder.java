
class Remainder {
       public static void main(String[] args) 
    { 
  int dividend = 555, divisor = 10;
  
        // int quotient = dividend / divisor; 
        int remainder; 
        while(dividend>0)
        {
             remainder = dividend % divisor; 
        // System.out.println("The Quotient is = " + quotient); 
        System.out.println("The Remainder is = " + remainder);
        dividend = dividend/divisor;
       
    } 
}
}

   