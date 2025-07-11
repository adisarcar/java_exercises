package basic.ex6;

public class door {
    boolean isLocked;
    boolean open;
    
    boolean isOpen() { 
        return open;
    }

    void openDoor() {
        if (isLocked)
            open = false;
        else
            open = true;
    }

    void closeDoor() {
        open = false;
    } 
     
    void lockDoor() {
        isLocked = true;
    }
    
    void unlockDoor() {
        isLocked = false; 
    }    
}


