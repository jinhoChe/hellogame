
public class MainClass {
    public static void main(String[] args) {
        System.out.println("헬로월드 ");


        // 클래스를 불러서 사용
        NameSet ns = new NameSet();
        ns.setName(); // 클래스이름 . < 붙이기 (이름 설정 기능
        // 이름을 출력
        ns.getName(); //(이름 출력 기능
        // 플레이~ 시작
        PlayClass pc = new PlayClass();
        //pc.play1(안에서는 쌍따옴표>>""만 치면 앞에있는n을 가져옴)
        pc.play1("도라에몽");
    }
}
