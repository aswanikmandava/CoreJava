enum JStatus {
    READY(), STARTED(200), STOPPED(300), PAUSED(400), FAILED(500);
    private int statusval;

    private JStatus() {
        this.statusval = 0;
        System.out.println("Default for obj: " + this.name());
    }

    private JStatus(int statusval) {
        this.statusval = statusval;
        System.out.println("Initiated for obj: " + this.name());
    }

    public int getStatusval() {
        return statusval;
    }

    public void setStatusval(int statusval) {
        this.statusval = statusval;
    }

}




public class EnumClass {
    public static void main(String[] args) {
        JStatus j = JStatus.FAILED;
        System.out.println(j.getStatusval());
        // changing the status value
        j.setStatusval(4);
        System.out.println("After status value change: " + j.getStatusval());
    }
}
