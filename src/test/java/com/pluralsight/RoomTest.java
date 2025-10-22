package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class RoomTest {
    @Test
    void failCheckInIfRoomDirty(){

        //create room for testing
        Room theRoom = new Room(10,false,true);

        //Attempt to check in dirty room
        theRoom.checkIn();

        //Room should not be occupied since room is dirty, will not check in
        assertFalse(theRoom.isOccupied());

    }

    @Test
    void whenUserCheckInSetOccupiedAndDirtyToTrue(){

        //Create room for testing
        Room theRoom = new Room(10,false,false);

        //Check in to room
        theRoom.checkIn();

        //Room should be occupied and dirty
        assertTrue(theRoom.isOccupied() && theRoom.isDirty());

    }

    @Test
    void whenUserCheckOut_SetNotOccupiedAndDirty(){

        //create room for testing
        Room theRoom = new Room(10,false,false);

        //Check in, then check out
        theRoom.checkIn();
        theRoom.checkOut();

        //Room should be not occupied and is dirty
        assertTrue(!theRoom.isOccupied() && theRoom.isDirty());

    }

    @Test
    void whenCleanRoom_RoomShouldNotBeDirty(){

        //create room for testing
        Room theRoom = new Room(10,false,true);

        //clean room
        theRoom.cleanRoom();

        //Room should not be dirty
        assertFalse(theRoom.isDirty());

    }

}