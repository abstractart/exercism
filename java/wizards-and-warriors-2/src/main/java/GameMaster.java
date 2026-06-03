public class GameMaster {

    public String describe(Character c) {
        return String.format("You're a level %d %s with %d hit points.", c.getLevel(), c.getCharacterClass(), c.getHitPoints());
    }

    public String describe(Destination d) {
        return String.format("You've arrived at %s, which has %d inhabitants.", d.getName(), d.getInhabitants());
    }

    public String describe(TravelMethod tm) {
        return String.format("You're traveling to your destination %s %s.", tm == TravelMethod.HORSEBACK ? "on" : "by", tm.name().toLowerCase());
    }

    public String describe(Character c, Destination d, TravelMethod tm) {
        return describe(c) + " " + describe(tm) + " " + describe(d);
    }

    public String describe(Character c, Destination d) {
        return describe(c, d, TravelMethod.WALKING);
    }
}
