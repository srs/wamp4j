package wamp4j.message;

public interface SubscribeMessage
{
    public String getRequest();

    public Object getOptions(); // Json

    public String getTopic();
}
