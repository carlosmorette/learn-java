class WarriorProxy extends ReflectionProxy {

    @Override
    public String getTargetClassName() {
        return "Warrior";
    }
    
    public String toString() {
        return invokeMethod("toString", new Class[0]);
    }

    boolean isVulnerable() {
        return false;
    }

    int getDamagePoints(Fighter target) {
        return invokeMethod("getDamagePoints", new Class[]{Fighter.class}, target);
    }
}
