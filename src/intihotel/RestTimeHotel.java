/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intihotel;

/**
 *
 * @author zayn
 */
public class RestTimeHotel {
 
    static Booking[] bookDB = new Booking [5];
    static int i = 0;
    
    
    
    static LoginScreen login = new LoginScreen ();
    
    static Menu menu = new Menu ();
    
    static Promotions promo = new Promotions ();
    
    static RoomTypes roomtypes = new RoomTypes();
    
    static SingleRoom single = new SingleRoom();
    static FamilyRoom family = new FamilyRoom();
    static LuxuryRoom luxury = new LuxuryRoom();
    static DeluxeRoom deluxe = new DeluxeRoom();
     
    
    static CheckIn checkin = new CheckIn ();
    static AssignRoom checkout = new AssignRoom ();
    
    
    
    static Summary bill = new Summary ();
    
    
    static int bookingCount=0;
    
    
    
    
    
}

