/*
 * Nathan S & Zachary S
 * Final project
 * Kapoof - Show
 * 12/4/2018
*/
package kapoof.testfile;
public class Show {
    private String title;
    //Show types
    private int type;
        public final static int MAGIC = 1;
        public final static int COMEDIAN = 2;
        public final static int ROCK = 3;
    private String performanceDate;
    private String bookingDate;
    private int fee;
    private String client;
    private String location;
    //Constructor
    Show() {
        this.title = "Unknown";
        this.type = 0;
        this.performanceDate = "Unknown";
        this.bookingDate = "Unknown";
        this.fee = 0;
        this.client = "Unknown";
        this.location = "Unknown";
    }
    Show(String title, int type, String performanceDate, String bookingDate, int fee, String client, String location) {
        this.title = title;
        this.type = type;
        this.performanceDate = performanceDate;
        this.bookingDate = bookingDate;
        this.fee = fee;
        this.client = client;
        this.location = location;
    }
    //Mutators and accesors
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getType() {
        switch(type) {
            case 1: return "Magic";
            case 2: return "Comedian";
            case 3: return "Rock";
            default: return "Unknown";
        }
    }
    public void setType(int type) {
        this.type = type;
    }
    public String getPerformanceDate() {
        return performanceDate;
    }
    public void setPerformanceDate(String performanceDate) {
        this.performanceDate = performanceDate;
    }
    public String getBookingDate() {
        return bookingDate;
    }
    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }
    public int getFee() {
        return fee;
    }
    public void setFee(int fee) {
        this.fee = fee;
    }
    public String getClient() {
        return client;
    }
    public void setClient(String client) {
        this.client = client;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
}