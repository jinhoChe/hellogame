import java.util.Scanner;

public class fdsf {
    public static void main(String[] args) {
//        System.out.println("Hello, world!");
//        System.out.println("Hello, world!");
//        System.out.println("Hello, world!");
//        System.out.println("Hello, world!");
//        System.out.println("Hello, world!");
//        System.out.println("안녕 자바야!");
        // 위에 자바를 내가 입력한 글자로 바꾸고 싶다.
        // 구글에 자바 입력 검색
        // 스캐너라는게 나오네 이걸 복붙
        Scanner sc = new Scanner(System.in);// 키보드로 부터 입력 받기 준비
        //System.out.print("입력:");//ln = line  ln제거하면 옆에 글자사용가능
        //String name = sc.next(); //키보드로 부터 글자를 입력 받기
        //위에 name는 사용자가 입력한 글자가 저장이 된다.
        //name 에 저장된 글을 출력을 해보자
        //System.out.println("안녕"+name+"야");
        // 캐릭터 이름 설정
        System.out.println("캐릭터 이름 설정:");
        System.out.print("이름 입력:");
        String n = sc.next();
        // 도라에몽이 여행을 떠난다
        System.out.println(n + "이 설정 되었습니다.");
        System.out.println(n + "이 여행을 떠난다");
        // 가다가 퉁퉁이를 만난다
        System.out.println(n + "가다가 퉁퉁이를 만난다");
        // 1.공격. 2.말을건다 3.도망간다.
        System.out.println("1.공격 2.아이템 사용 3.방어 4.난죽택...");
        System.out.print("선택: ");
        // 만역에 1번이면 10번을 공격한다.
        int num = sc.nextInt(); //숫자를 입력가능하게함

        if (num == 1) {   // 싸운다 선택
            System.out.println("싸우자 덤벼라 퉁퉁아!");
            System.out.println("1. 10번 콤보 공격 2. 아이템 사용 3. 방어");
            System.out.print("선택: ");
            num = sc.nextInt();   // 숫자 입력받기
            // 만약에 1번이면 10번을 공격을한다.
            if (num == 1) {
                System.out.println("10번 콤보 공격!!");
                System.out.println("다다다다다다다다다");
            } else if (num == 2) {
                // 만약에 2번이면 아이템 메뉴가 출력이 되고 선택한 아이템으로 공격
                System.out.println("아이템 사용 아이템 메뉴가 나와서 선택해서 공격");

            } else if (num == 3) {
                // 3번이면 방어를 하고 퉁퉁이가 나를 공격한다
                System.out.println("방어 모드");
                System.out.println("퉁퉁이가 다다다다다다다다다다");
                System.out.println("퉁퉁이가 필살기를 사용하여 승!!");
            } else {
                System.out.println("잘못 입력 게임오버~");
            }
        }if (num == 2) {  // 2번을 입력하면
            // 도망간다
            System.out.println("1.개패기 2.뒤집기 3.누르기");
            num = sc.nextInt();
            if(num ==1){
                System.out.println("개패기");
                System.out.println("퉁퉁이가 분노했습니다!");

            } else if (num==2) {
                System.out.println("뒤집기");
                System.out.println("퉁퉁이가 분노했습니다!");

            } else if (num==3) {
                System.out.println(("누르기 사용!"));
                System.out.println("우웩");
                System.out.println("퉁퉁이가 분노했습니다!");
            }
        } if(num ==3){
            System.out.println("1.그냥 방어 2.이걸 방어 3.딱대 방어");
            num = sc.nextInt();
            if(num ==1){
                System.out.println("그냥 방어 사용!");
                System.out.println("퉁퉁이 주먹 골절!");
            } else if ( num ==2) {
                System.out.println("이걸 방어?");
                System.out.println("퉁퉁이가 이걸?");
            } else if (num ==3) {
                System.out.println("딱대 방어");
                System.out.println("ㅋㅋ딱대");
            }
        }
        System.out.println("퉁퉁이피가 10감소했습니다.");
        System.out.println("다시 공격하시겠습니까?");
        System.out.println("1.공격 2.아이템 사용 3.방어 4.지금이라도 빌어?");
        if (num == 1) {   // 싸운다 선택
            System.out.print("선택: ");
            num = sc.nextInt();   // 숫자 입력받기
            // 만약에 1번이면 10번을 공격을한다.
            if (num == 1) {
                System.out.println("10번 콤보 공격!!");
                System.out.println("다다다다다다다다다");
            } else if (num == 2) {
                // 만약에 2번이면 아이템 메뉴가 출력이 되고 선택한 아이템으로 공격
                System.out.println("아이템 사용 아이템 메뉴가 나와서 선택해서 공격");

            } else if (num == 3) {
                // 3번이면 방어를 하고 퉁퉁이가 나를 공격한다
                System.out.println("방어 모드");
                System.out.println("퉁퉁이가 다다다다다다다다다다");
                System.out.println("퉁퉁이가 필살기를 사용하여 승!!");
            } else {
                System.out.println("잘못 입력 게임오버~");
            }
        }if (num == 2) {  // 2번을 입력하면
            // 도망간다
            System.out.println("1.개패기 2.뒤집기 3.누르기");
            num = sc.nextInt();
            if(num ==1){
                System.out.println("개패기");
            } else if (num==2) {
                System.out.println("뒤집기");
            } else if (num==3) {
                System.out.println(("누르기 사용!"));
                System.out.println("우웩");
            }
        } if(num ==3){
            System.out.println("1.그냥 방어 2.이걸 방어 3.딱대 방어");
            num = sc.nextInt();
            if(num ==1){
                System.out.println("그냥 방어 사용!");
                System.out.println("퉁퉁이 주먹 골절!");
            } else if ( num ==2) {
                System.out.println("이걸 방어?");
                System.out.println("퉁퉁이가 이걸?");
            } else if (num ==3) {
                System.out.println("딱대 방어");
                System.out.println("ㅋㅋ딱대");
            }
        }
        System.out.println("퉁퉁이피가 10감소했습니다.");
        System.out.println("게임 끝");
        System.out.println("승리!");
    }
}



        //String a = sc.next();
        //String m = sc.next();
        //String r = sc.next();
        // 만약에 1번을 입력하면
        //System.out.print("10번공격");
        // 공격 선택
        // 만약에 2번을 입력하면
        //System.out.print(m+"아이템 사용");
        //String q = sc.next();
        //String w = sc.next();
//        String e = sc.next();
//        System.out.print(q+"칼");
//        System.out.print(w+"총");
//        System.out.print(e+"돌");
        // 아이템 사용 선택
        // 만약에 3번을 입력하면
//        System.out.print(r+"방어성공");
//        String y = sc.next();
//        System.out.print(y+"퉁퉁이가 나를 공격");
        // 방어 선택
        // 1번이면

        // 1.10번공격 2.아이템 사용 3.방어
        // 만약에 1번이면 10번을 공격한다.
        // 만약에 2번이면 아이템 메뉴가 출력이 되고 선택한 아이템으로 공격
        // 3번이면 방어를 하고 퉁퉁이가 나를 공격한다.





