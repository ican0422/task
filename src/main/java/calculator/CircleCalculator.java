package calculator;

import java.util.ArrayList;

public class CircleCalculator {
    /* PI */
    /* 3.14라는 파이는 함수를 통해서 사용 되어야 하고, 변하는 안되는 상수 */
    static final double pI = 3.14;

    /* 반지름 결과 값 저장 */
    private ArrayList<Double> circleAreaResults;

    /* 생성자 초기화 */
    public CircleCalculator(){
        circleAreaResults = new ArrayList<>();
    }

    /* 원의 넓이를 구하는 메서드 */
    public double calculateCircleArea(double num){
        /*      원의 넓이 구하는 공식
         *  원의 면적 = 반지름 * 반지름 * 3.14
         */
        double circleArea = num * num * pI;

        /* 연산 결과 리스트에 저장 */
        circleAreaResults.add(circleArea);

        return circleArea;
    }

    /* 연산 결과 가장 먼저 입력된 수를 삭제하는 메서드 */
    public void circleAreaRemove(String remove){
        if (remove.equals("remove")){
            circleAreaResults.remove(0);
        } else {
            System.out.println("잘 못된 입력입니다.");
        }
    }

    /* 원의 넓이를 구한 값들을 조회 하는 매서드 */
    public void circleAreaInquiry(String inquiry){
        if (inquiry.equals("inquiry")){
            System.out.println("저장된 연산 결과 : " + circleAreaResults.toString());
        } else {
            System.out.println("잘 못된 입력입니다.");
        }
    }

    /* 원의 넓이 결과값을 저장하는 ArrayList 변수 캡슐화 */
    public ArrayList<Double> getCircleAreaResults(){
        return circleAreaResults;
    }
    public void setCircleAreaResults(ArrayList<Double> circleAreaResults){
        this.circleAreaResults = circleAreaResults;
    }

}
