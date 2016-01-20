public void testEquality() {
  assertTrue(Money.dollar(5).equals(Money.dollar(5)));
  assertFalse(Money.dollar(5).equals(Money.dollar(6)));
}
