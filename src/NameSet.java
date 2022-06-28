import java.util.ArrayList;
import java.util.Scanner;

/*
* 이름을 설정하는 클래스
 */
public class NameSet {
    private String name;
    private Scanner sc;
    // 메소드 = public void 메소드이름(){ }
     //생성자
    public NameSet(){
        sc = new Scanner(System.in);
    }


    private String n; //멋대로 사용방지 private
    public void setName(){
        System.out.println("이름 설정 기능");
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 설정:");
        n = sc.next();//문자열 입력 받기 String n <<저장소 생성
    }// 이름을 갖고와서 출력하는 기능
    public String getName(){
        System.out.println("이름 출력 기능");
        System.out.println(n+"아 안녕!!!!!!!!!!!");
        return n;
    }

    //아이템 셋팅
    // 사용자가 원하는만큼 아이템 셋팅
    public  void  setItem(){
        System.out.println("몇개의 아이템을 사용하시겠습니까?");
        System.out.print("갯수 입력(너무 많이 하면 힘들어요):");
        int n = sc.nextInt();
        // n 만큼 반복해서 아이템 입력
        //itemClass ic = new itemClass(); // 아이템을 담는그릇 생성(데이터저장
        ArrayList<itemClass> list = new ArrayList<>(); //여러 클래스를 담을수있는 그릇.
        for(int i=0; i<n; i++){
            itemClass ic = new itemClass(); // 아이템을 담는그릇 생성(데이터저장
            System.out.print("아이템입력:");
            String it = sc.next();
            ic.setName(it);//이름을 담고
            //System.out.println(i+". 아이템:" +it);
            System.out.print("속성입력:");
            it =sc.next();
            ic.setAtt(it);// 속성을 담는 그릇
            // ItemClass가 셋팅된오브젝트를 담는다(list)
            list.add((ic));
            //System.out.println("i + "속성:" + it);
        } // 중요 ↓ //데이터를 보내기위한 오브잭트 DTO(DATA TRANSE OBJECT
        System.out.println("입력한 아이템 출력");
        for(itemClass ic :list) {
            System.out.println("아이템 이름:"+ic.getName());
            System.out.println("아이템 속성:"+ic.getAtt());
        }//중요↑
        }

}
