package calculator;

import java.util.ArrayList;

public class CircleCalculator extends Calculator {
    /* PI */
    /* 3.14라는 파이는 함수를 통해서 사용 되어야 하고, 변하는 안되는 상수 */
    static final double pI = 3.14;

    /* 생성자 초기화 */
    public CircleCalculator(){
        super();
    }

    /* 원의 넓이를 구하는 메서드 */
    public double calculateCircleArea(double num){
        /*      원의 넓이 구하는 공식
         *  원의 면적 = 반지름 * 반지름 * 3.14
         */
        double circleArea = num * num * pI;

        /* 연산 결과 리스트에 저장 */
        results.add(circleArea);

        return circleArea;
    }

    @Override
    public void remove(String remove){
        if (remove.equals("remove")){
            results.remove(0);
        } else {
            System.out.println("삭제 하지 않습니다.");
        }
    }

    @Override
    public void inquiry(String inquiry){
        if (inquiry.equals("inquiry")){
            System.out.println("저장된 연산 결과 : " + results.toString());
        } else {
            System.out.println("출력 하지 않습니다.");
        }
    }

    /* 원의 넓이 결과값을 저장하는 ArrayList 변수 캡슐화 */
    public ArrayList<Double> getCircleAreaResults(){
        return results;
    }
    public void setCircleAreaResults(ArrayList<Double> results){
        this.results = results;
    }

}
