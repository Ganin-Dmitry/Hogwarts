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
    public int getTrick () {
        return this.trick;
    }
    public int getDetermination () {
        return this.determination;
    }
    public int getAmbition () {
        return this.ambition;
    }
    public int getResourcefullness () {
        return this.resourcefullness;
    }
    public int getFirstForPower () {
        return this.firstForPower;
    }
    public void setTrick (int trick) {
        if (trick >= 100) {
            this.trick = 100;
        } else if (trick <= 0) {
            this.trick = 0;
        } else {
            this.trick = trick;
        }
    }
    public void setDetermination (int determination) {
        if (determination >= 100) {
            this.determination = 100;
        } else if (determination <= 0) {
            this.determination = 0;
        } else {
            this.determination = determination;
        }
    }
    public void setAmbition (int ambition) {
        if (ambition >= 100) {
            this.ambition = 100;
        } else if (ambition <= 0) {
            this.ambition = 0;
        } else {
            this.ambition = ambition;
        }
    }
    public void setResourcefullness (int resourcefullness) {
        if (resourcefullness >= 100) {
            this.resourcefullness = 100;
        } else if (resourcefullness <= 0) {
            this.resourcefullness = 0;
        } else {
            this.resourcefullness = resourcefullness;
        }
    }
    public void setFirstForPower (int firstForPower) {
        if (firstForPower >= 100) {
            this.firstForPower = 100;
        } else if (firstForPower <= 0) {
            this.firstForPower = 0;
        } else {
            this.firstForPower = firstForPower;
        }
    }
    public int sumPower () {
        return this.getTrick() + this.getDetermination() +
                this.getAmbition() + this.getMagicPower() +
                this.getTransgression() + this.getFirstForPower() +
                this.getResourcefullness();
    }
    public String equalsPowerFaculty (Slytherin personTwo) {
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
                "\nХитрость: " + this.getTrick() + "\nРешительность: " + this.getDetermination() + "\nАмбициозность: " +
                this.getAmbition() + "\nНаходчивость: " + this.getResourcefullness() + "\nЖажда власти: " + this.getFirstForPower();
    }
}