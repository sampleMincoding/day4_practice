

public class SplitVariable {
    public static void main(String[] args) {
        double temp = 24.0; // 섭씨 온도
        temp = (temp * 9 / 5) + 32; // 화씨로 변환
        System.out.println("섭씨 온도를 화씨로 변환: " + temp);
        temp = 10.0; // 길이 (미터)
        double area = temp * temp; // 면적 계산
        System.out.println("정사각형의 면적: " + area);
    }
}
