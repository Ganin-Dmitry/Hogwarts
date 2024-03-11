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
    public int getWit () {
        return this.wit;
    }
    public int getCreativity () {
        return this.creativity;
    }
    public void setWit (int wit) {
        if (wit >= 100) {
            this.wit = 100;
        } else if (wit <= 0) {
            this.wit = 0;
        } else {
            this.wit = wit;
        }
    }
    public void setCreativity (int creativity) {
        if (creativity >= 100) {
            this.creativity = 100;
        } else if (creativity<= 0) {
            this.creativity = 0;
        } else {
            this.creativity = creativity;
        }
    }
    public int sumPower () {
        return this.getWit() + this.getCreativity() + this.getMagicPower() + this.getTransgression();
    }
    public String equalsPowerFaculty (Kogtervan personTwo) {
        if (this.sumPower() > personTwo.sumPower()) {
            return this.getName() + " как ученик лучше, чем " + personTwo.getName() + ".";
        } else if (this.sumPower() < personTwo.sumPower()) {
            return personTwo.getName() + " как ученик лучше, чем " + this.getName() + ".";
        } else {
            return "Ученики равны.";
        }
    }
    @Override
    public String toString () {
        return this.getName() + "\nСила магии: " + this.getMagicPower() + "\nТрансгрессия: " + this.getTransgression() +
                "\nОстроумие: " + this.getWit() + "\nКреативность: " + this.getCreativity();
    }
}