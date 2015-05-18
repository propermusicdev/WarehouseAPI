package data;

//import org.codehaus.jackson.annotate.JsonProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;

/**
 * Created by Lebel on 01/04/2014.
 */
//@JsonEntity("Message")
public class Message {
    private static final long serialVersionUID = 1L;
    private int MessageId;
    private String Source;
    private String MessageType;
    private int IncomingStatus;
    private String IncomingMessage;
    private int OutgoingStatus;
    private String OutgoingMessage;
    private Timestamp InsertedTimeStamp;
    private int TTL;

    public Message(int messageId, String source, String messageType, int incomingStatus, String incomingMessage, int outgoingStatus, String outgoingMessage, Timestamp insertedTimeStamp, int ttl) {
        MessageId = messageId;
        Source = source;
        MessageType = messageType;
        IncomingStatus = incomingStatus;
        IncomingMessage = incomingMessage.toString();
        OutgoingStatus = outgoingStatus;
        OutgoingMessage = outgoingMessage.toString();
        InsertedTimeStamp = insertedTimeStamp;
        this.TTL = ttl;
    }

    public Message() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @JsonProperty("MessageId")
    public int getMessageId() {
        return MessageId;
    }

    public void setMessageId(int messageId) {
        MessageId = messageId;
    }

    @JsonProperty("Source")
    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    @JsonProperty("MessageType")
    public String getMessageType() {
        return MessageType;
    }

    public void setMessageType(String messageType) {
        MessageType = messageType;
    }

    @JsonProperty("IncomingStatus")
    public int getIncomingStatus() {
        return IncomingStatus;
    }

    public void setIncomingStatus(int incomingStatus) {
        IncomingStatus = incomingStatus;
    }

    @JsonProperty("IncomingMessage")
    public String getIncomingMessage() {
        return IncomingMessage;
    }

    public void setIncomingMessage(String incomingMessage) {
        IncomingMessage = incomingMessage;
    }

    @JsonProperty("OutgoingStatus")
    public int getOutgoingStatus() {
        return OutgoingStatus;
    }

    public void setOutgoingStatus(int outgoingStatus) {
        OutgoingStatus = outgoingStatus;
    }

    @JsonProperty("OutgoingMessage")
    public String getOutgoingMessage() {
        return OutgoingMessage;
    }

    public void setOutgoingMessage(String outgoingMessage) {
        OutgoingMessage = outgoingMessage;
    }

    @JsonProperty("InsertedTimeStamp")
    public Timestamp getInsertedTimeStamp() {
        return InsertedTimeStamp;
    }

    public void setInsertedTimeStamp(Timestamp insertedTimeStamp) {
        InsertedTimeStamp = insertedTimeStamp;
    }

    @JsonProperty("TTL")
    public int getTTL() {
        return TTL;
    }

    public void setTTL(int TTL) {
        this.TTL = TTL;
    }
}

