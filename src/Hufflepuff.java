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
    public int getIndustriousness () {
        return this.industriousness;
    }
    public int getLoyalty () {
        return this.loyalty;
    }
    public int getHonesty () {
        return this.honesty;
    }
    public void setIndustriousness (int industriousness) {
        if (industriousness >= 100) {
            this.industriousness = 100;
        } else if (industriousness <= 0) {
            this.industriousness = 0;
        } else {
            this.industriousness = industriousness;
        }
    }
    public void setLoyalty (int loyalty) {
        if (loyalty >= 100) {
            this.loyalty = 100;
        } else if (loyalty <= 0) {
            this.loyalty = 0;
        } else {
            this.loyalty= loyalty;
        }
    }
    public void setHonesty (int honesty) {
        if (honesty >= 100) {
            this.honesty = 100;
        } else if (honesty <= 0) {
            this.honesty = 0;
        } else {
            this.honesty = honesty;
        }
    }
    public int sumPower () {
        return this.getIndustriousness() + this.getLoyalty() + this.getHonesty() + this.getMagicPower() + this.getTransgression();
    }
    public String equalsPowerFaculty (Hufflepuff personTwo) {
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
                "\nТрудолюбие: " + this.getIndustriousness() + "\nВерность: " + this.getLoyalty() + "\nЧестность: " + this.getHonesty();
    }
}