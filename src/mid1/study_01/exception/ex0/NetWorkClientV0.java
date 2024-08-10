package mid1.study_01.exception.ex0;

public class NetWorkClientV0 {
    private final String address;

    public NetWorkClientV0(String address) {
        this.address = address;
    }

    public String connect(){ // 연결
        // 연결 성공
        System.out.println(address + "서버 연결 성공");
        return "success";
    }
    public String send(String data){ // 전송
        // 전송 성공
        System.out.println(address + "서버에 데이터 전송: " + data );
        return "success";
    }

    public void disconnect(){ // 연결 해제
        System.out.println(address + " 서버 연결 해제");
    }
}
