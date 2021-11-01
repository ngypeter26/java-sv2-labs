package enumtype.university;

public enum University {
    BME ("Budapesti Műegyetem"),
    SZTE("Szegedi Tudományegyetem"),
    PTE("Pécsi Tudományegyetem"),
    SZIE("Szent István Egytem"),
    BGE("Budapesti Gazdaságtudományi Egyetem"),
    ELTE("Eötvös Lóránt TUdomáynegyetem");

    private final String name;

    private University(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
