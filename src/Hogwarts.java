public class Hogwarts {
    private String name;
    private int magicPower;
    private int transgression;
    public Hogwarts (String name, int magicPower, int transgression) {
        this.name = name;
        if (magicPower >= 100) {
            this.magicPower = 100;
        } else if (magicPower <= 0) {
            this.magicPower = 0;
        } else {
            this.magicPower = magicPower;
        }
        if (transgression >= 100) {
            this.transgression = 100;
        } else if (transgression <= 0) {
            this.transgression = 0;
        } else {
            this.transgression = transgression;
        }
    }
}
