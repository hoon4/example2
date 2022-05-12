import java.util.*;

public class main {
    public static void main(String[] args) {

        System.out.println("희망하는 구구단을 숫자로 입력해주세요 (2 ~ 9) : ");
        Scanner sc = new Scanner(System.in);  // 입력받을 Scanner 선언
        int num = sc.nextInt();
        sc.close();
        int min_num = 2;                // 구구단의 최소값 변수
        int max_num = 9;                // 구구단의 최대값 변수
        System.out.println(num + " 단이 입력되었습니다.");
        if(num >= min_num && num <= max_num) {               // 입력값이 옳바른 경우 구구단 반복문 수행
            for(int i = 1; i <= 9; i++) {
                System.out.println(num + " * " + i + " = " + num * i);
            }
        }
        else {                                              // 잘못된 입력의 경우 에러메세지 출력 후 종료
            System.out.println("옳바른 입력값을 입력해주세요. (2~9단 입력가능)\n프로그램 종료");
        }


    }
}
