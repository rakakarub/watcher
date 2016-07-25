package tr.com.innova.watcher.dys;

/**
 * Created by tozyurek on 27.04.2016.
 */
public interface DysService {

    void sendDocument(BelgeModel belgeModel) throws DysException;

    void queryDocumentStatus();

    void sendDocumentFail(Exception exception);

    void logError(Exception exception);
}
