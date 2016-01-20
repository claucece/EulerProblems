public class ThridEulerProblem {
  long testNum = 600851475143l; 
  int largestFactor = 0; 
  long loopMax = 17425170l; 
  boolean isPrime;
  
  public int getLargest() {
    for (int i = 3; i * i <= loopMax; i++) { 
      boolean isPrime = true;             
      for (int x = 2; x < i; x++) { 
       if (i % x == 0) { 
          isPrime = false; 
          break; 
       } 
    }                         
      if (isPrime && testNum % i == 0) { 
        System.out.println("prime factor: " + i); 
        largestFactor = i; 
        loopMax = (testNum / i) + 1; 
      } 
   }
   System.out.println("result is " + largestFactor);
   return 0;
  }
} 
