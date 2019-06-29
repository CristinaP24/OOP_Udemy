public class PC {
    // it is Composition
    //if you use extends, you can only inherit from one class at a time
    //

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    public void drawLogo() {
        //just graphs with motherboard
        monitor.drawPixelAt(1200, 500, "red");
    }
}

