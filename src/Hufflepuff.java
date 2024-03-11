public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;
    public Hufflepuff (String name, int magicPower, int transgression, int industriousness, int loyalty, int honesty) {
        super(name, magicPower, transgression);
        if (industriousness >= 100) {
            this.industriousness = 100;
        } else if (industriousness <= 0) {
            this.industriousness = 0;
        } else {
            this.industriousness = industriousness;
        }
        if (loyalty >= 100) {
            this.loyalty = 100;
        } else if (loyalty <= 0) {
            this.loyalty = 0;
        } else {
            this.loyalty = loyalty;
        }
        if (honesty >= 100) {
            this.honesty = 100;
        } else if (honesty <= 0) {
            this.honesty = 0;
        } else {
            this.honesty = honesty;
        }
    }
}
