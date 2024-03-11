public class Kogtervan extends Hogwarts {
    private int wit;
    private int creativity;
    public Kogtervan (String name, int magicPower, int transgression, int wit, int creativity) {
        super(name, magicPower, transgression);
        if (wit >= 100) {
            this.wit = 100;
        } else if (wit <= 0) {
            this.wit = 0;
        } else {
            this.wit = wit;
        }
        if (creativity >= 100) {
            this.creativity = 100;
        } else if (creativity <= 0) {
            this.creativity = 0;
        } else {
            this.creativity = creativity;
        }
    }
}
