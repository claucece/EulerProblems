public class ThridEulerProblem {
    long largestFactor = 0; 
    long loopMax = 17425170L;
    long numm = 600851475143L; 
    boolean isPrime;
  
    public long getLargest(long numm) {
        for (long i = 2; i * i <= loopMax; i++) {
            if (numm % i == 0) {  
                boolean isPrime = true;             
                for (int j = 2; j < i; j++) { 
                     if (i % j == 0) { 
                     isPrime = false; 
                     break; 
                     }    
                }
                isTrue(isPrime, i);
              }
         }
         return numm;
    }

    public void isTrue(boolean isPrime, long i) {
        if (isPrime) {
            largestFactor = i; 
            System.out.println("prime factor: " + i); 
            loopMax = (numm / i) + 1;
        }
   }
} 
