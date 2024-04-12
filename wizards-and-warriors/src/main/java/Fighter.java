class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {
    @Override
    public String toString() {
	return "Fighter is a Warrior";
    }

    @Override
    int getDamagePoints(Fighter fighter) {
	return fighter.isVulnerable() ? 10 : 6;
    }

    @Override
    boolean isVulnerable() {
	return false;
    }
}

class Wizard extends Fighter {
    private boolean itsPrepareSpell = false;
    private int damagePoints = 3;

    @Override
    public String toString() {
	return "Fighter is a Wizard";
    }

    void prepareSpell() {
	damagePoints += 9;
	itsPrepareSpell = true;
    }

    @Override
    boolean isVulnerable() {
	return !itsPrepareSpell;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
	return damagePoints;
    }
}
