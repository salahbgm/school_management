package efrei.fr.domain;

public class Classroom {
    private String roomNumber;
    private int size; 

    public Classroom(String roomNumber) {
        this.roomNumber = roomNumber;
    }
    
    public Classroom(int size) {
        this.size = size;
    }

    public String getroomNumber() {
        return roomNumber;
    }

    public void setroomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
    
    public int getsize() {
        return size;
    }

    public void setsize(int size) {
        this.size = size;
    }


    @Override
    public String toString() {
        return "Classroom{" +
                "Room number ='" + roomNumber + '\'' + "Size = " + size + 
                '}';
    }
}
