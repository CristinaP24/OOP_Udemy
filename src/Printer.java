public class Printer {

    private int tonerLvl;
    private int pagPrinted;
    private boolean duplex;

    public void tonerFill() {
    }

    public Printer(int tonerLvl, boolean duplex) {
        if (tonerLvl > -1 && tonerLvl <= 100) {
            this.tonerLvl = tonerLvl;
        } else {
            this.tonerLvl = -1;
        }
        this.duplex = duplex;
        this.pagPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLvl + tonerAmount > 100) {
                return -1;
            }
            this.tonerLvl += tonerAmount;
            return this.tonerLvl;
        } else {
            return -1;//if it falls outside if condition, then return -1 = attempted to add toner, but was outside range
        }
    }

    public int printPages(int pages) {
        int pagesToPrin = pages;
        if (this.duplex) {
            pagesToPrin /= 2;
            System.out.println("Printing in duplex mode");
        }
        this.pagPrinted+=pagesToPrin;
        return pagesToPrin;
    }


    public int getPagPrinted() {
        return pagPrinted;
    }
}




















