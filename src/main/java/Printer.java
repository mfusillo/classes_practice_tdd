public class Printer {

    private int numberOfSheetsLeft;
    private int tonerLevel;

    public Printer(int numberOfSheetsLeft, int tonerLevel){
        this.numberOfSheetsLeft = numberOfSheetsLeft;
        this.tonerLevel = tonerLevel;
    }

    public int getNumberOfSheetsLeft(){
        return this.numberOfSheetsLeft;
    }

    public int getTonerLevel(){
        return this.tonerLevel;
    }

    public void print(int numberOfPages, int numberOfCopies){
        int totalSheetsToRemove = numberOfCopies * numberOfPages;
        if(totalSheetsToRemove <= this.numberOfSheetsLeft && totalSheetsToRemove <= this.tonerLevel) {
            this.numberOfSheetsLeft -= totalSheetsToRemove;
            this.tonerLevel -= totalSheetsToRemove;
        }
    }

}
