package enemo.springframework.didemo.examplebeans;

public class FakeJmsBroker{
    private String userJms;
    private String passwordJms;
    private String urlJms;

    public String getUserJms() {
        return userJms;
    }

    public void setUserJms(String userJms) {
        this.userJms = userJms;
    }

    public String getPasswordJms() {
        return passwordJms;
    }

    public void setPasswordJms(String passwordJms) {
        this.passwordJms = passwordJms;
    }

    public String getUrlJms() {
        return urlJms;
    }

    public void setUrlJms(String urlJms) {
        this.urlJms = urlJms;
    }
}