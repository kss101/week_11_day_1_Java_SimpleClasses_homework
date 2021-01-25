public class Printer {
    private int paperLeft;
    private int tonerVolume;

    public Printer( int paperLeft, int tonerVolume){
        this.paperLeft = paperLeft;
        this.tonerVolume = tonerVolume;
    }

    public int getPaperLeft(){
        return paperLeft;
    }

    public int getTonerVolumeLeft(){
        return tonerVolume;
    }

    public String printCopies( int pages, int copies){
        if(this.canPrint(pages, copies) == true){
            paperLeft = paperLeft - (pages * copies);
            tonerVolume = tonerVolume - (pages * copies);
            return "Printing complete";
        }
        return "Unable to print. Insufficient paper or toner";
    }

    private boolean canPrint( int pages, int copies){
        if ((paperLeft - (pages * copies) >= 0) && (tonerVolume - (pages * copies) >= 0)){
            return true;
        }
        return false;
    }

    public boolean checkSufficientToner( int pages){
        if (tonerVolume - pages >= 0){
            return true;
        }
        return false;
    }
}
