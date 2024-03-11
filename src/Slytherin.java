public class Slytherin extends Hogwarts {
    private int trick;
    private int determination;
    private int ambition;

    private int resourcefullness;
    private int firstForPower;
    public Slytherin (String name, int magicPower, int transgression, int trick,
                      int determination, int ambition, int resourcefullness, int firstForPower) {
        super(name, magicPower, transgression);
        if (trick >= 100) {
            this.trick = 100;
        } else if (trick <= 0) {
            this.trick = 0;
        } else {
            this.trick = trick;
        }
        if (determination >= 100) {
            this.determination = 100;
        } else if (determination <= 0) {
            this.determination = 0;
        } else {
            this.determination = determination;
        }
        if (ambition >= 100) {
            this.ambition = 100;
        } else if (ambition <= 0) {
            this.ambition = 0;
        } else {
            this.ambition = ambition;
        }
        if (resourcefullness >= 100) {
            this.resourcefullness = 100;
        } else if (resourcefullness <= 0) {
            this.resourcefullness = 0;
        } else {
            this.resourcefullness = resourcefullness;
        }
        if (firstForPower >= 100) {
            this.firstForPower = 100;
        } else if (firstForPower <= 0) {
            this.firstForPower = 0;
        } else {
            this.firstForPower = firstForPower;
        }
    }
}
