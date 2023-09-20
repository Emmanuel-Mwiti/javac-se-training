package com.systechafrica.part2.interfaces;

//! Access-modifier interface-keyword, interface-name
public interface ThreePinPlug {

  // ! contract- methods without implementation
  boolean plugIn(); // ?implicitly public abstract

  boolean plugOut();

  String NAME = "Emmanuel";

}
