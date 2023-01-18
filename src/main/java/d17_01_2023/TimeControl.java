package d17_01_2023;

public class TimeControl extends Control{

    private boolean isForward;

    public TimeControl(boolean isForward) {
        this.isForward = isForward;
    }
    @Override
    public void action(VideoPlayer vp){
        double forward = 15 + vp.getCurrentTime();
        double backward = vp.getCurrentTime() - 15;

//        if(forward < vp.getLenght() && isForward){
//            vp.setCurrentTime(forward);
//        }else if (){
//            vp.setCurrentTime(vp.getLenght());
//        }
        if(this.isForward){
            if(forward < vp.getLenght()){
                vp.setCurrentTime(forward);
            }else {
                vp.setCurrentTime(vp.getLenght());
            }
        }
        if(!this.isForward){
            if(backward > 0){
                vp.setCurrentTime(backward);
            }else {
                vp.setCurrentTime(0);
            }
        }



    }

}
