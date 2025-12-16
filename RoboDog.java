public class RoboDog extends Robot implements Pet {
    boolean isCharged;
    public boolean isCharged() {
        return isCharged;
    }

    public void setCharged(boolean isCharged) {
        this.isCharged = isCharged;
    }

    @Override
    public void performTask() {
        if (isCharged) {
            System.out.println(getModel() + " is guarding the house.");
        } else {
            System.out.println(getModel() + " needs recharging before performing tasks.");
        }
    }

        @Override
    public void play() {
        if (isCharged) {
            System.out.println(getModel() + " is playing fetch in simulation mode.");
        } else {
            System.out.println(getModel() + " cannot play while discharged.");
        }
    }

    public RoboDog(String model) {
    super(model);
    this.isCharged = true;
}
}