package funnymoditis.communitymodrofl.entity;

public enum ModEntity {
    THE_ONE("The One", 420);


    ModEntity(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public final String name;
    public final int id;
}
