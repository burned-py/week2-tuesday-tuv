public class CarInspectionService {

    public boolean hasFourWheels(Car car) {
        return car.numberOfTires == 4;
    }

    public boolean hasSeatbelt(Car car) {
        return car.seatBelt;
    }

    public boolean hasAirbag(Car car) {
        return car.airbag;
    }

    public boolean has3or5doors(Car car) {
        return car.numberOfDoors == 3 || car.numberOfDoors == 5;
    }

    public boolean passesInspection(Car car) {
        return (hasFourWheels(car)
                && hasSeatbelt(car)
                && hasAirbag(car)
                && has3or5doors(car));
    }
}
