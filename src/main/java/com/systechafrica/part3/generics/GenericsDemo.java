package com.systechafrica.part3.generics;

public class GenericsDemo {
  public static void main(String[] args) {

  }

  public static void withGenerics() {
    MaizeFlour floor = new MaizeFlour();
    MaizeFlour floor2 = new MaizeFlour();
    MaizeFlour[] maizeFloors = { floor, floor2 };
    StorageGenerics<MaizeFlour> storageGenerics = new StorageGenerics<>();
    storageGenerics.store(maizeFloors);

    Bag bag1 = new Bag();
    Bag bag2 = new Bag();
    Bag[] bags = { bag1, bag2 };
    StorageGenerics<Bag> bagsStorage = new StorageGenerics<>();
    bagsStorage.store(bags);

  }

  public static void withoutGenerics() {
    Storage storage = new Storage();

    MaizeFlour floor = new MaizeFlour();
    MaizeFlour floor2 = new MaizeFlour();
    MaizeFlour[] maizeFloors = { floor, floor2 };

    storage.store(maizeFloors);

    Bag bag1 = new Bag();
    Bag bag2 = new Bag();
    Bag[] bags = { bag1, bag2 };

    storage.store(bags);
  }
}
