public void testMultiplication() {
  Dollar five = new Dollar(5);
  Dollar product =  five.times(2);
  assertEquals(new Dollar(10), five.times(2));
  product = five.times(3)
  assertEquals(new Dollar (15), five.times(3));
}
