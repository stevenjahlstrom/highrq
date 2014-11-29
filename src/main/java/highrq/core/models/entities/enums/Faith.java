package highrq.core.models.entities.enums;


public enum Faith {

    CATHOLIC("Catholic"),
    PROTESTANT("Protestant"),
    EVANGELICAL("Evangelical"),
    CHRISTIAN("Christian"),
    MUSLIM("Muslim"),
    HINDU("Hindu"),
    BUDDHIST("Buddhist"),
    SCIENTOLOGY("Scientology"),
    ATHEIST("Atheist"),
    AGNOSTIC("Agnostic"),
    OTHER("Other");

    private String value;

    private Faith(String value) {
        this.value = value;
    }
}
