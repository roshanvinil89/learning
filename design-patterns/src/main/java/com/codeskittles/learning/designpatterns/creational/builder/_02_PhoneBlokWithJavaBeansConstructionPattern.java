package com.codeskittles.learning.designpatterns.creational.builder;

public class _02_PhoneBlokWithJavaBeansConstructionPattern {

  // Mandatory members
  private String processor;
  private String internalMemory;
  private String battery;
  private String displayScreen;

  // Optional members
  private String camera;
  private String projector;

  // No-args constructor
  public _02_PhoneBlokWithJavaBeansConstructionPattern() {}

  public static void main(String[] args) {

    // Client of the PhoneBlokWithJavaBeansConstructionPattern

    // New object created where all members are first initialized to their defaults.
    final _02_PhoneBlokWithJavaBeansConstructionPattern phoneblok =
        new _02_PhoneBlokWithJavaBeansConstructionPattern();
    // This is where an instance exists without the mandatory members being initialized.
    // If this object is used anywhere, the result could be a NPE at runtime.
    // For example:- sendAlertToDisplayScreen(phoneblok.getDisplayScreen());
    // sendAlertToDisplayScreen can safely assume that a phoneblok cannot exist without a
    // displayScreen as per the contract and therefore perform actions on the displayScreen object
    // which can throw an NPE.

    // Setting mandatory elements
    phoneblok.setProcessor("Intel i9 10th gen");
    phoneblok.setInternalMemory("16gb Samsung RAM");
    phoneblok.setBattery("4000mAh Battery");
    phoneblok.setDisplayScreen("UHD 4K Screen");

    // Setting optional elements
    phoneblok.setProjector("Elite Projector 4K");
  }

  // Member Setters
  public void setProcessor(String processor) {
    this.processor = processor;
  }

  public void setInternalMemory(String internalMemory) {
    this.internalMemory = internalMemory;
  }

  public void setBattery(String battery) {
    this.battery = battery;
  }

  public void setDisplayScreen(String displayScreen) {
    this.displayScreen = displayScreen;
  }

  public void setCamera(String camera) {
    this.camera = camera;
  }

  public void setProjector(String projector) {
    this.projector = projector;
  }
}
