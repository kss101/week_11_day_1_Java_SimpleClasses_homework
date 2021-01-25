public class Printer {
    private int paperLeft;

    public Printer( int paperLeft){
        this.paperLeft = paperLeft;
    }

    public int getPaperLeft(){
        return paperLeft;
    }

    public String printCopies( int pages, int copies){
        if(this.canPrint(pages, copies) == true){
            paperLeft = paperLeft - (pages * copies);
            return "Printing complete";
        }
        return "Unable to print. Insufficient paper";
    }

    private boolean canPrint( int pages, int copies){
        if (paperLeft - (pages * copies) >= 0){
            return true;
        }
        return false;
    }
}
