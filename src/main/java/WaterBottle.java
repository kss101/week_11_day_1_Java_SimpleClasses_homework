public class WaterBottle {
    private int volume;

    public WaterBottle(){
        this.volume = 100;
    }

    public int getVolume(){
        return volume;
    }

    public void drink(){
        volume = volume - 10;
    }
}
