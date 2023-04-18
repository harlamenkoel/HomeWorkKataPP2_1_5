package koschei.models;




public class Island2 {

    private final Chest2_5 chest;

    public Island2(Chest2_5 chest) {
        this.chest = chest;
    }

    @Override
    public String toString() {
        return ", на том острове дуб стоит" + chest.toString();
    }
}
