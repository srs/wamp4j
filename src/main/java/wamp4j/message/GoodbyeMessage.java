package wamp4j.message;

public interface GoodbyeMessage
{
    public String getReason();

    public Object getDetails(); // Json
}
