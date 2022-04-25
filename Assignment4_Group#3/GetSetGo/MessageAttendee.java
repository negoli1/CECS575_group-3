/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author naina
 */
public class MessageAttendee implements Observer {
    public void DescUpdate(Message m){
        System.out.println("Update Message :: " + m.getMessageContent());
}
    public void LocUpdate(Message m){
        System.out.println("Update Message :: " + m.getMessageContent());
}
}