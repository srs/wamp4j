package wamp4j.message;

public interface AbortMessage
{
    public String getReason();

    public Object getDetails(); // Json
}
