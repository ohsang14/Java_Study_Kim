package basic.class_06;

public class Speaker {
    int volume;

    public Speaker(int volume) {
        this.volume = volume;
    }
    void VolumeUp(){
        if(volume >= 100){
            System.out.println("음량을 증가할 수 없습니다. 최대 음량");
        }else{
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }
    void  VolumeDown(){
        volume -= 10;
        System.out.println("volumeDown 호출");
    }
    void showVolume(){
        System.out.println("현재 음량: " +volume );
    }
}
