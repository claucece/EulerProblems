public void testEquality() {
  assertTrue(new Dollar(5).equals(new Dollar(5)));
  assertFalse(new Dollar(5).equals(new DOllar(6)));
}
