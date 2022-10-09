package OOP.homeWork3.people;

public class Relative {
    private Human human1;
    private Human human2;
    private Relation relation;

    public Relative(Human human1, Relation relation, Human human2) {
        this.human1 = human1;
        this.relation = relation;
        this.human2 = human2;
    }

    public Human getHuman1() {
        return human1;
    }

    public void setHuman1(Human human1) {
        this.human1 = human1;
    }

    public Human getHuman2() {
        return human2;
    }

    public void setHuman2(Human human2) {
        this.human2 = human2;
    }

    public Relation getRelation() {
        return relation;
    }

    public void setRelation(Relation relation) {
        this.relation = relation;
    }

    @Override
    public String toString() {
        return  human1 +
                " " + relation +
                " of " + human2;
    }
}
