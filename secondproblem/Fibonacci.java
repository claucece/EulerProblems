class Fibonacci {
   int fibo = 0;
   int prev = 0;
   int current = 1;
   int grand_total = 0;
   int sum = 0;
   boolean run = true;
   
   public int getEvens(){
   while (fibo < 4000000) {
     fibo = current + prev;
     prev = current;
     current = fibo;
     if (fibo % 2 == 0) {
       sum += fibo;
     }
     System.out.println(current + " " + prev );
     }
     System.out.println(sum);
     return 0;
    }
   
  }
     
     
