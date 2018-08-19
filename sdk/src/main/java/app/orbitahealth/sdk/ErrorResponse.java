package app.orbitahealth.sdk;


public class ErrorResponse {

    private boolean strong;
    private String reason;

    public boolean isStrong() {
        return strong;
    }

    public void setStrong(boolean strong) {
        this.strong = strong;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
