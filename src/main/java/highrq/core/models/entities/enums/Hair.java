package highrq.core.models.entities.enums;

public enum Hair {
    BROWN("Brown"),
    BLONDE("Blonde"),
    RED("Red"),
    BLUE("Blue"),
    GREEN("Green"),
    PURPLE("Purple"),
    MULTI("Multi-Color"),
    SILVER("Silver"),
    WHITE("White"),
    BALD("Bald");

    private String value;

    private Hair(String value) {
        this.value = value;
    }
};


