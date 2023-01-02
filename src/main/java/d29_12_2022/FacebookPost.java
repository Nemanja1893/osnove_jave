package d29_12_2022;

public class FacebookPost {

    private String name;
    private String friendName;
    private String text;
    private int likeCount;
    private int shareCount;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getFriendName() {
        return friendName;
    }
    public void setFriendName(String friendName) {
        this.friendName = friendName;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public int getLikeCount() {
        return likeCount;
    }
    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }
    public int getShareCount() {
        return shareCount;
    }
    public void setShareCount(int shareCount) {
        this.shareCount = shareCount;
    }

    public void like(){
        likeCount++;
    }
    public void dislike(){
        if(likeCount > 0){
            likeCount--;
        }
    }
    public void share(){
        shareCount++;
    }
    public void print(){
        System.out.println(name + " >>> " + friendName);
        System.out.println(text);
        System.out.println("Likes " + likeCount + " | Shares " + shareCount);
    }
}
