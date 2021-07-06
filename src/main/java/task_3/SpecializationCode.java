package task_3;

public enum SpecializationCode {
    SC01("Artificial intelligence and cybernetics"),
    SC02("Big data analysis"),
    SC03("Reconfigurable computing"),
    SC04("Interface design"),
    SC05("Embedded systems"),
    SC06("Computational geometry"),
    SC07("Modeling and simulation");

    private final String description;

    SpecializationCode(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
