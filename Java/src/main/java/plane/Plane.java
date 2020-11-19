package plane;

import java.util.Objects;

public abstract class Plane {
    private String model;
    private int maxSpeed;
    private int maxFlightDistance;
    private int maxLoadCapacity;

    public Plane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.maxFlightDistance = maxFlightDistance;
        this.maxLoadCapacity = maxLoadCapacity;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getMaxFlightDistance() {
        return maxFlightDistance;
    }

    public int getMaxLoadCapacity() {
        return maxLoadCapacity;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("Plane{").append("model='").append(model).append('\'').append(", maxSpeed=").append(maxSpeed)
                .append(", maxFlightDistance=").append(maxFlightDistance).append(", maxLoadCapacity=").append(maxLoadCapacity)
                .append('}');
        return stringBuilder.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
    }

    @Override
    public boolean equals(Object object) {
        return (this ==object) || (object instanceof Plane) || (maxSpeed == ((Plane) object).maxSpeed &&
                maxFlightDistance == ((Plane) object).maxFlightDistance &&
                maxLoadCapacity == ((Plane) object).maxLoadCapacity &&
                Objects.equals(model, ((Plane) object).model));
    }
}
