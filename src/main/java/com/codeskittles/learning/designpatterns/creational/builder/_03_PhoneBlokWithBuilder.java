package com.codeskittles.learning.designpatterns.creational.builder;

public class _03_PhoneBlokWithBuilder {

  // All members final and set in the constructor making the class immutable.
  private final String camera;
  private final String projector;
  private final String processor;
  private final String internalMemory;
  private final String battery;
  private final String displayScreen;

  private _03_PhoneBlokWithBuilder(final Builder builder) {
    this.processor = builder.getProcessor();
    this.internalMemory = builder.getInternalMemory();
    this.battery = builder.getBattery();
    this.displayScreen = builder.getDisplayScreen();
    this.camera = builder.getCamera();
    this.projector = builder.getProjector();
  }

  private static class Builder {

    private String processor;
    private String internalMemory;
    private String battery;
    private String displayScreen;
    private String camera;
    private String projector;

    public Builder processor(final String processor) {
      this.processor = processor;
      return this;
    }

    public Builder internalMemory(final String internalMemory) {
      this.internalMemory = internalMemory;
      return this;
    }

    public Builder battery(final String battery) {
      this.battery = battery;
      return this;
    }

    public Builder displayScreen(final String displayScreen) {
      this.displayScreen = displayScreen;
      return this;
    }

    public Builder camera(final String camera) {
      this.camera = camera;
      return this;
    }

    public Builder projector(final String projector) {
      this.projector = projector;
      return this;
    }

    public _03_PhoneBlokWithBuilder build() {
        // Before calling the below method you can validate all inputs and throw an
        // IllegalArgumentException if the validation fails.
        return new _03_PhoneBlokWithBuilder(this);
    }

    private String getProcessor() {
      return processor;
    }

    private String getInternalMemory() {
      return internalMemory;
    }

    private String getBattery() {
      return battery;
    }

    private String getDisplayScreen() {
      return displayScreen;
    }

    private String getCamera() {
      return camera;
    }

    private String getProjector() {
      return projector;
    }
  }

  // Method returns the builder of PhoneBlokWithBuilder type
  public static Builder getBuilder() {
    return new Builder();
  }

  public static void main(String[] args) {

    // Clients of PhoneBlokWithBuilder

    // Fluent API Calls. More readable
    final _03_PhoneBlokWithBuilder bareBonesPhone =
        _03_PhoneBlokWithBuilder.getBuilder()
            .processor("Intel i9 10th gen")
            .internalMemory("16gb Samsung RAM")
            .battery("4000mAh Battery")
            .displayScreen("UHD 4K Screen")
            .build();

    // No need to set the optional members Camera in this case.
    final _03_PhoneBlokWithBuilder withProjectorAndNoCamera =
        _03_PhoneBlokWithBuilder.getBuilder()
            .processor("Intel i9 10th gen")
            .internalMemory("16gb Samsung RAM")
            .battery("4000mAh Battery")
            .displayScreen("UHD 4K Screen")
            .projector("Elite Projector 4K")
            .build();
  }
}
