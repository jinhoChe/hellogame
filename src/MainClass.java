
public class MainClass {
    public static void main(String[] args) {
        System.out.println("헬로월드 ");


        // 클래스를 불러서 사용
        NameSet ns = new NameSet();
        ns.setName(); // 클래스이름 . < 붙이기 (이름 설정 기능
        //아이템 설정
        ns.setItem();
//        System.out.println(ns.n+"꺼져~");
//        ns.n = "오늘?";
//        System.out.println(ns.n+"이리와~");

        // 이름을 출력
        String n = ns.getName(); //(이름 출력 기능 , 설정된 이름을 받을 수 있다.
        // 플레이~ 시작
        PlayClass pc = new PlayClass();
        //pc.play1(안에서는 쌍따옴표>>""만 치면 앞에있는n을 가져옴)
        // 투명한건 따라치는거 아님 ㅋ
        int num = pc.play1(n);
        num = pc.play2(num);
        pc.play3(num);
    }
}
