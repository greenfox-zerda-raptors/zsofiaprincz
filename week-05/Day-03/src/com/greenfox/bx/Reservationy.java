package com.greenfox.bx;

import java.util.NoSuchElementException;

/**
 * Created by zsofiaprincz on 16/11/16.
 */
public interface Reservationy {



    void setDowBooking(String dowBooking);
    String getDowBooking();

    void setCodeBooking(String codeBooking);
    String getCodeBooking();

    boolean PlaceReserved (String dowBooking, String codeBooking); //must return true if successful
    boolean PlaceCancelled (String dowBooking,String codeBooking); //must return true if successful

    String toString (); //format("Booking# %s for %s");


}
