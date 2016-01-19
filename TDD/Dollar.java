class Dollar {
  private int amount;

  Dollar times(int multiplier){
    return new Dollar(amount * multiplier);
  }
  
  public boolean equals(Object object) {
    Dollar dollar = (dollar) object;
    return amount == dollar.amount;
  }
}

