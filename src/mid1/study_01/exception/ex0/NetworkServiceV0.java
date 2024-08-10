package mid1.study_01.exception.ex0;

public class NetworkServiceV0 {
    public void sendMessage(String data){
        String address = "http://example.com";
        NetWorkClientV0 client = new NetWorkClientV0(address);

        client.connect(); // 연결
        client.send(data); // 보내기
        client.disconnect(); // 연결해제

    }
}
