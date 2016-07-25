package tr.com.innova.watcher.configuration;

/**
 * Created by tozyurek on 11.04.2016.
 */
public class SimpleResponse {
    private String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public boolean isResultOk() {
        return result.equals("ok");
    }
}
