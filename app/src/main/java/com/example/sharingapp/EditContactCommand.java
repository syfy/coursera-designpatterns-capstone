package com.example.sharingapp;

import android.content.Context;

public class EditContactCommand extends Command {

    private ContactList contact_list;
    private Contact contact;
    private Context context;
    private Contact old_contact;
    public  EditContactCommand(ContactList contact_list, Contact old_contact,Contact contact , Context context){
        this.contact_list = contact_list;
        this.contact = contact;
        this.context = context;
        this.old_contact = old_contact;
    }
    public void execute(){
        contact_list.deleteContact(old_contact);
        contact_list.addContact(contact);
        setIsExecuted(contact_list.saveContacts(this.context));
    }
}
