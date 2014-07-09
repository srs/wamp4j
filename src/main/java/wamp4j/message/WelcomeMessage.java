package wamp4j.message;

public interface WelcomeMessage
{
    public String getSession();

    public Object getDetails(); // Json
}
