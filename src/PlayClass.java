import java.util.Scanner;

//클래스 '첫'글자 대문자
public class PlayClass {
    //생성자
    public Scanner sc;
    public  PlayClass(){
        sc = new Scanner(System.in);
    }
    //오버로딩 오버라이딩 차이점(중요)
    //public  PlayClass(String n){}


    // 메소드 '첫' 글자 소문자
    public int play1(String n){

        System.out.println(n + "이 설정 되었습니다.");
        System.out.println(n + "이 여행을 떠난다");
        // 가다가 퉁퉁이를 만난다
        System.out.println(n + "가다가 퉁퉁이를 만난다");
        // 1.공격. 2.말을건다 3.도망간다.
        System.out.println("1.공격 2.무시하기 3.지나가기 4.런...");
        System.out.print("선택: ");
        sc.nextInt();
        return 0;
    }
    public int play2(int num){
        int ret = 0;
        // 만약에 num 1 이면 공격한다
        if(num==1){
            System.out.println("싸우자");
            System.out.println("1.공격 2.아이템 사용 3.방어");
            System.out.println("입력:");
            Scanner sc = new Scanner(System.in);
            ret= sc.nextInt();
        } else if (num==2) {
            System.out.println("멋대로해라");
        }else {
            System.out.println();
        }
        return ret;
        // 2면 아이템 사용
    }
    public  void  play3(int num){
        if(num ==1){
            System.out.println("그냥 공격");
        } else if (num==2) {
            System.out.println("아이템 사용");
        }
    }
}
