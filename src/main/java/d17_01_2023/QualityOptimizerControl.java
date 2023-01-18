package d17_01_2023;

public class QualityOptimizerControl extends Control{
    private double netSpeed;

    public QualityOptimizerControl(double netSpeed) {
        this.netSpeed = netSpeed;
    }
    public double getNetSpeed() {
        return netSpeed;
    }
    public void setNetSpeed(double netSpeed) {
        this.netSpeed = netSpeed;
    }

    @Override
    public void action(VideoPlayer vp){
        double qualityFactor = this.netSpeed * 10.1;
        
        if(qualityFactor < 200){
            vp.setQuality(144);
        }else if (qualityFactor > 200 && qualityFactor < 300) {
            vp.setQuality(240);
        }else if(qualityFactor > 300 && qualityFactor < 400){
            vp.setQuality(360);
        }else if (qualityFactor > 400 && qualityFactor < 600) {
            vp.setQuality(480);
        }else if(qualityFactor > 600 && qualityFactor < 800){
            vp.setQuality(720);
        }else if (qualityFactor > 800) {
            vp.setQuality(1080);
        }
    }
}
