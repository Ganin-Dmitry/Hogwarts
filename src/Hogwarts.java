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
    public String getName () {
        return this.name;
    }
    public int getMagicPower () {
        return this.magicPower;
    }
    public int getTransgression () {
        return this.transgression;
    }
    public void setName (String name) {
        this.name = name;
    }
    public void setMagicPower (int magicPower) {
        if (magicPower >= 100) {
            this.magicPower = 100;
        } else if (magicPower <= 0) {
            this.magicPower = 0;
        } else {
            this.magicPower = magicPower;
        }
    }
    public void setTransgression (int transgression) {
        if (transgression >= 100) {
            this.transgression = 100;
        } else if (transgression <= 0) {
            this.transgression = 0;
        } else {
            this.transgression = transgression;
        }
    }
    public String equalsPersonPower (Hogwarts personTwo) {
        int onePower = this.getMagicPower() + this.getTransgression();
        int twoPower = personTwo.getMagicPower() + personTwo.getTransgression();
        if (onePower > twoPower) {
            return this.getName() + " обладает магией сильнее, чем у " + personTwo.getName() + ".";
        } else if (onePower < twoPower) {
            return personTwo.getName() + " обладает магией сильнее, чем у " + this.getName() + ".";
        } else {
            return "Магия этих учеников равна.";
        }
    }
}