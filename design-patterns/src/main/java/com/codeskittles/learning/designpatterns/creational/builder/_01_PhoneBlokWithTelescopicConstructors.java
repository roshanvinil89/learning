package com.codeskittles.learning.designpatterns.creational.builder;

public class _01_PhoneBlokWithTelescopicConstructors {

  // Mandatory members
  private final String processor;
  private final String internalMemory;
  private final String battery;
  private final String displayScreen;

  // Optional members
  private final String camera;
  private final String projector;

  // Constructor with all mandatory members
  public _01_PhoneBlokWithTelescopicConstructors(
      final String processor,
      final String internalMemory,
      final String battery,
      final String displayScreen) {
    this(processor, internalMemory, battery, displayScreen, null, null);
  }

  // Constructor with all mandatory members and one optional member
  public _01_PhoneBlokWithTelescopicConstructors(
      final String processor,
      final String internalMemory,
      final String battery,
      final String displayScreen,
      final String camera) {

    this(processor, internalMemory, battery, displayScreen, camera, null);
  }

  // Constructor with all mandatory members and two optional members
  public _01_PhoneBlokWithTelescopicConstructors(
      final String processor,
      final String internalMemory,
      final String battery,
      final String displayScreen,
      final String camera,
      final String projector) {

    this.processor = processor;
    this.internalMemory = internalMemory;
    this.battery = battery;
    this.displayScreen = displayScreen;
    this.camera = camera;
    this.projector = projector;
  }

  public static void main(String[] args) {

    // Client of PhoneBlokWithTelescopicConstructors
    final _01_PhoneBlokWithTelescopicConstructors phoneBlokWithProjectorAndNoCamera =
        new _01_PhoneBlokWithTelescopicConstructors(
            "Intel i9 10th gen",
            "16gb Samsung RAM",
            "4000mAh Battery",
            "UHD 4K Screen",
            null,
            "Elite Projector 4K");

    final _01_PhoneBlokWithTelescopicConstructors misplacedArguments =
        new _01_PhoneBlokWithTelescopicConstructors(
            "16gb Samsung RAM", // Internal Memory passed as argument instead of Processor
            "Intel i9 10th gen", // Processor passed as argument instead of Internal Memory
            "4000mAh Battery",
            "UHD 4K Screen",
            null,
            "Elite Projector 4K");
  }
}
