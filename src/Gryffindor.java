public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;
    public Gryffindor (String name, int magicPower, int transgression, int nobility, int honor, int bravery) {
        super(name, magicPower, transgression);
        if (nobility >= 100) {
            this.nobility = 100;
        } else if (nobility <= 0) {
            this.nobility = 0;
        } else {
            this.nobility = nobility;
        }
        if (honor >= 100) {
            this.honor = 100;
        } else if (honor <= 0) {
            this.honor = 0;
        } else {
            this.honor = honor;
        }
        if (bravery >= 100) {
            this.bravery = 100;
        } else if (bravery <= 0) {
            this.bravery = 0;
        } else {
            this.bravery = bravery;
        }
    }
}
