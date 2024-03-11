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
    public int getNobility () {
        return this.nobility;
    }
    public int getHonor () {
        return this.honor;
    }
    public int getBravery () {
        return this.bravery;
    }
    public void setNobility (int nobility) {
        if (nobility >= 100) {
            this.nobility = 100;
        } else if (nobility <= 0) {
            this.nobility = 0;
        } else {
            this.nobility = nobility;
        }
    }
    public void setHonor (int honor) {
        if (honor >= 100) {
            this.honor = 100;
        } else if (honor <= 0) {
            this.honor = 0;
        } else {
            this.honor = honor;
        }
    }
    public void setBravery (int bravery) {
        if (bravery >= 100) {
            this.bravery = 100;
        } else if (bravery <= 0) {
            this.bravery = 0;
        } else {
            this.bravery = bravery;
        }
    }
    public int sumPower () {
        return this.getNobility() + this.getHonor() + this.getBravery() + this.getMagicPower() + this.getTransgression();
    }
    public String equalsPowerFaculty (Gryffindor personTwo) {
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
                "\nБлагородство: " + this.getNobility() + "\nЧесть: " + this.getHonor() + "\nХрабрость: " + this.getBravery();
    }
}
