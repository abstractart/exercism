class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter{
    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
       if( fighter.isVulnerable()) {
           return 10;
       }

       return 6;
    }
}


class Wizard extends Fighter {
    boolean spellPrepared = false;

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    @Override
    boolean isVulnerable() {
        return !this.spellPrepared;
    }

    public void prepareSpell() {
        this.spellPrepared = true;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        if (spellPrepared) {
            return 12;
        }
        return 3;
    }
}