public abstract class Robot {
    private String model;

    public Robot(String model) {
        this.model = model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public abstract void performTask();

    
}
