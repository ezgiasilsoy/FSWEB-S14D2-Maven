import org.example.model.*;

public class Bedroom {
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;
    private Wardrobe wardrobe;
    private Carpet carpet;

    public Bedroom(Wall wall2, Wall wall3, Ceiling ceiling, Bed bed, Lamp lamp, Carpet carpet, Wardrobe wardrobe, Wall wall4, String name, Wall wall1) {
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
        this.carpet = carpet;
        this.wardrobe = wardrobe;
        this.wall4 = wall4;
        this.name = name;
        this.wall1 = wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall4() {
        return wall4;
    }

    public Bed getBed() {
        return bed;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall1() {
        return wall1;
    }

    public String getName() {
        return name;
    }
}
