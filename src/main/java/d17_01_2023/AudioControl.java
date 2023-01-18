package d17_01_2023;

public class AudioControl extends Control{
    private boolean isHigher;
    public AudioControl(boolean isHigher) {
        this.isHigher = isHigher;
    }
    public boolean isHigher() {
        return isHigher;
    }
    public void setHigher(boolean higher) {
        isHigher = higher;
    }

    @Override
    public void action(VideoPlayer vp){
        if(isHigher){
            vp.setVolume(vp.getVolume() + 1);
        }else{
            vp.setVolume(vp.getVolume() - 1);
        }

        if(vp.getVolume() > 100){
            vp.setVolume(100);
        }
        if(vp.getVolume() < 0){
            vp.setVolume(0);
        }

    }
}
