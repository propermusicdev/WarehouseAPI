package controllers;

import data.Message;
import data.Repositories.MessageRepository;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by lebel on 18/05/2015.
 */
@Path("/messages")
public class MessageController {
    private MessageRepository repo = new MessageRepository();

    @POST
    @Path("/queue")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response queueMessage(final Message msg) throws InterruptedException {
        String resp = repo.queryBarcodeFromQueuePartDeux(msg);
        return Response.status(Response.Status.OK).entity(resp).build();
    }
}
