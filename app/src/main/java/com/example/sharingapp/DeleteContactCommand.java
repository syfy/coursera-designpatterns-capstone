package com.example.sharingapp;

import android.content.Context;

public class DeleteContactCommand extends Command {
    private Context context;
    private Contact contact;
    private ContactList contact_list;
    public DeleteContactCommand(ContactList contact_list, Contact contact , Context context){
        this.contact_list = contact_list;
        this.contact = contact;
        this.context = context;
    }
    public void execute() {
        contact_list.deleteContact(contact);
        setIsExecuted(contact_list.saveContacts(context));
    }

}
