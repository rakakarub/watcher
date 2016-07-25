package tr.com.innova.watcher.dys;

/**
 * Created by tozyurek on 06.05.2016.
 */
public class DysException extends RuntimeException {
    private BelgeModel belgeModel;

    public DysException(String message, BelgeModel belgeModel) {
        super(message);
        this.belgeModel = belgeModel;
    }

    public BelgeModel getBelgeModel() {
        return belgeModel;
    }
}
