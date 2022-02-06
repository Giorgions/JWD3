package Laboratorium17;

public enum CardinalPoint {
    N("północ", "North", 0),
    E("wschód", "East", 90),
    S("południe", "South", 180),
    W("zachód", "West", 270),
    NE("północny wschód", "Northeast", 45),
    NW("pólnocny zachód", "Northwest", 90),
    SE("południowy wschód", "Southeast", 180),
    SW("południowy zachód", "Southwest", 270);

    private String namePL;
    private String nameEN;
    private int rotation;

    CardinalPoint(String namePL, String nameEN, int rotation) {
        this.namePL = namePL;
        this.nameEN = nameEN;
        this.rotation = rotation;
    }

    public String getNamePL() {
        return namePL;
    }

    public void setNamePL(String namePL) {
        this.namePL = namePL;
    }

    public String getNameEN() {
        return nameEN;
    }

    public void setNameEN(String nameEN) {
        this.nameEN = nameEN;
    }

    public int getRotation() {
        return rotation;
    }

    public void setRotation(int rotation) {
        this.rotation = rotation;
    }

    @Override
    public String toString() {
        return "CardinalPoint{" +
                "namePL='" + namePL + '\'' +
                ", nameEN='" + nameEN + '\'' +
                ", rotation=" + rotation +
                '}';
    }
}
