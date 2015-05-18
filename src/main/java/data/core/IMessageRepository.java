package data.core;

import data.Message;

import java.util.List;

/**
 * Created by Lebel on 01/04/2014.
 */
public interface IMessageRepository {
    List<Message> getAll();
    Message find(int id);
    String getOutGoingMessageById(int id);
    int add(Message msg);
    String queryBarcodeFromQueuePartDeux(Message msg);
}
