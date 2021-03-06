package main;
/**
 * Enum Mood
 * @author Мишанин Никита
 */
public enum Mood {
    LONGING("LONGING"),
    GLOOM("GLOOM"),
    CALM("CALM"),
    RAGE("RAGE"),
    FRENZY("FRENZY");
    public final String mood;
    Mood (String mood) {
        this.mood = mood;
    }
    public String getMood() {
        return mood;
    }
}
