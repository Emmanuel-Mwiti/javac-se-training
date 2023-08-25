package com.systechafrica.otherTests;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class PersonObjectToTestTest {
  @Test
  void testPersonIfObject() {
    PersonObjectToTest person = new PersonObjectToTest("Emmanuel", 23);
    assertNotNull(person, "The preson is null");
  }
}
