@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    boolean expected = true;
    boolean actual = isAdult;
    assertEquals("пользователь младше 18 лет", expected, isAdult); // Напиши код здесь
}
