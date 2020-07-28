package com.codeskittles.learning.designpatterns.creational.builder.lombok;

// Complex type
public class _01_PhoneBlokWithoutLombok {

    private final String camera;
    private final String projector;
    private final String processor;
    private final String internalMemory;
    private final String battery;
    private final String displayScreen;

    // The Boiler Plate Code section below has to be written for every complex type in the application.
    // Everytime _01_PhoneBlokWithoutLombok undergoes a change where new class members are added, the
    // Builder also needs to undergo a change. This reduces maintainability.

    // Boiler Plate Code - Start
    private _01_PhoneBlokWithoutLombok(final Builder builder) {
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

        public _01_PhoneBlokWithoutLombok build() {
            return new _01_PhoneBlokWithoutLombok(this);
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

    public static Builder getBuilder() {
        return new Builder();
    }

    // Boiler Plate Code - End

    public static void main(String[] args) {

        // Clients of PhoneBlokWithoutLombok

        final _01_PhoneBlokWithoutLombok bareBonesPhone =
                _01_PhoneBlokWithoutLombok.getBuilder()
                        .processor("Intel i9 10th gen")
                        .internalMemory("16gb Samsung RAM")
                        .battery("4000mAh Battery")
                        .displayScreen("UHD 4K Screen")
                        .build();

        final _01_PhoneBlokWithoutLombok withProjectorAndNoCamera =
                _01_PhoneBlokWithoutLombok.getBuilder()
                        .processor("Intel i9 10th gen")
                        .internalMemory("16gb Samsung RAM")
                        .battery("4000mAh Battery")
                        .displayScreen("UHD 4K Screen")
                        .projector("Elite Projector 4K")
                        .build();
    }
}
