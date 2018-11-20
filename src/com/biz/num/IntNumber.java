/*
 * Package는 폴더의 개념을 자바 프로젝트에서 쉽게 구분하기 위한 것이다.
 * 여기의 IntNumber.java소스코드는 프로젝트 폴더의 src폴더 아래의 com/biz/num 폴더에 있음을 나타내는 이정표 역할을 한다.
 */
package com.biz.num;


public class IntNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(3000 * 3000); //9 곱하기 10의 6승
		System.out.println(30000 * 30000);
		System.out.println(300000 * 3000); //정수를 저장할 수 있는 크기를 정해놨기 때문에 그 크기를 넘어간다면 결과값이 이상하게 나온다.overflow

	}

}
