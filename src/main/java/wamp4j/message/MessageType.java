package wamp4j.message;

public enum MessageType
{
    HELLO( 1 ),
    WELCOME( 2 ),
    ABORT( 3 ),
    GOODBYE( 6 ),

    SUBSCRIBE( 32 ),
    SUBSCRIBED( 33 ),
    UNSUBSCRIBE( 34 ),
    UNSUBSCRIBED( 35 ),

    PUBLISH( 16 ),
    PUBLISHED( 17 ),
    EVENT( 36 ),

    ERROR( 8 ),
    CHALLENGE( 4 ),
    AUTHENTICATE( 5 ),
    HEARTBEAT( 7 ),

    CALL( 48 ),
    CANCEL( 49 ),
    RESULT( 50 ),
    REGISTER( 64 ),
    REGISTERED( 65 ),
    UNREGISTER( 66 ),
    UNREGISTERED( 67 ),
    INVOCATION( 68 ),
    INTERRUPT( 69 ),
    YIELD( 70 );

    private final int code;

    private MessageType( final int code )
    {
        this.code = code;
    }

    public int getCode()
    {
        return this.code;
    }
}
