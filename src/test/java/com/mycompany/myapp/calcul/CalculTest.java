package com.mycompany.myapp.calcul;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculTest {

  @Test
  void testSimpleAddition(){
    assertThat(Calcul.operate("2 3 +")).isEqualTo("5");
  }

  @Test
  void testSimpleAddition2(){
    assertThat(Calcul.operate("4 2 +")).isEqualTo("6");
  }

  @Test
  void testSimpleAddition3(){
    assertThat(Calcul.operate("41 98 +")).isEqualTo("139");
  }

  @Test
  void testSimpleSubtraction(){
    assertThat(Calcul.operate("5 2 -")).isEqualTo("3");
  }

  @Test
  void testSimpleMultiplication(){
    assertThat(Calcul.operate("5 3 *")).isEqualTo("15");
  }

  @Test
  void testSimpleDivision(){
    assertThat(Calcul.operate("9 3 /")).isEqualTo("3");
  }

}
