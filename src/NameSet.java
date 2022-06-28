import java.util.Scanner;

/*
* 이름을 설정하는 클래스
 */
public class NameSet {
    // 메소드 = public void 메소드이름(){ }
    private String n; //멋대로 사용방지 private
    public  void  setName(){
        System.out.println("이름 설정 기능");
        Scanner sc = new Scanner(System.in);
        System.out.println("이름 설정:");
        n = sc.next();//문자열 입력 받기 String n <<저장소 생성
    }// 이름을 갖고와서 출력하는 기능
    public String getName(){
        System.out.println("이름 출력 기능");
        System.out.println(n+"아 안녕!!!!!!!!!!!");
        return n;
    }
}
