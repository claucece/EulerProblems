class MyFirstEulerProblem {
  int total_multiples = 0; 
  
  public int getMultiples(){ 
    for(int i = 1; i < 1000; i++){
      if (i % 3 == 0 || i % 5 == 0) {
        System.out.println("The Multiple is " + i);
        total_multiples = total_multiples + i;
      }
    }
    System.out.println("The sum of the multiples is " + total_multiples);
    return 0;
   }
}
