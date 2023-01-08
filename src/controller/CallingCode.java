package controller;

import util.time.useDto.businessLogicSample.DtoTimeSample;
import util.time.useMap.businessLogicSample.MapTimeSample;


public class CallingCode {
    public static void callingTimeByMap(){
        // time 패키지를 이용하여 구성한 비즈니스 로직 -> Map 테스트를 진행할 메소드 호출
        MapTimeSample.testCase();
    }

    public static void callingTimeByDto(){
        // time 패키지를 이용하여 구성한 비즈니스 로직 -> Dto 테스트를 진행할 메소드 호출
        DtoTimeSample.testCase();
    }
}
