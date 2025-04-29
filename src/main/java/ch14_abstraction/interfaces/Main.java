package ch14_abstraction.interfaces;

public class Main {
    public static void main(String[] args) {
        TvRemoteController tvRemoteController1 = new TvRemoteController(
                new PowerButton(), new ChannelDownButton(), new ChannelUpButton(), new VolumeDownButton(), new VolumeUpButton()
        );

        // 별개의 PowerButton 객체를 생성해서 메서드 호출이 가능한가?
        PowerButton powerButton1 = new PowerButton();

        tvRemoteController1.onPressedPowerButton();     // 결과값 : 전원을 켭니다
        powerButton1.onPressed(); // 물론 가능합니다.         결과값 : 전원을 켭니다 -> 별개로 굴러가기 때문에
        tvRemoteController1.onPressedPowerButton();     // 결과값 : 전원을 끕니다
        tvRemoteController1.onPressedChannelDownButton();
        tvRemoteController1.onDownChannelDownButton();
        tvRemoteController1.onPressedChannelUpButton();
        tvRemoteController1.onUpChannelUpButton();
        tvRemoteController1.onPressedVolumeDownButton();
        tvRemoteController1.onDownVolumeDownButton();
        tvRemoteController1.onPressedVolumeUpButton();
        tvRemoteController1.onUpVolumeUpButton();


    }
}
