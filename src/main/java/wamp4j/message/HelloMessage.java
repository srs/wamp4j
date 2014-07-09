package wamp4j.message;

public interface HelloMessage
{
    public String getRealm();

    public Object getDetails(); // Json
}
