package main;
/**
 * Enum WeaponType
 * @author Мишанин Никита
 */
public enum WeaponType {
    HAMMER("HAMMER"),
    AXE("AXE"),
    SHOTGUN("SHOTGUN"),
    RIFLE("RIFLE"),
    BAT("BAT");
    public final String weapon;
    WeaponType (String weapon) {
        this.weapon = weapon;
    }
    public String getWeapon() {
        return weapon;
    }
}
