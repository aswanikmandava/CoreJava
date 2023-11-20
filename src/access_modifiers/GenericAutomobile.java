package src.access_modifiers;

class GenericAutomobile {
    private String make, model;
    boolean isHybrid = false;

    public GenericAutomobile() {
        this.make = null;
        this.model = null;
    }

    public String getEngine() {
        if (isHybrid) {
            return "Hybrid engine";
        }
        else {
            return "Gasoline engine";
        }
    }
}
