package clean.code.design6.data.movie.step01;

import clean.code.design6.money.Money;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String [] args) {

        //상영 순번에 대한 할인 조건 객체 생성
        DiscountCondition sequenceCondition1 = new SequenceDiscountCondition(1);
        DiscountCondition sequenceCondition2 = new SequenceDiscountCondition(2);
        DiscountCondition sequenceCondition10 = new SequenceDiscountCondition(10);

        //기간에 대한 할인 조건 객체 생성
        DiscountCondition periodCondition1 = new PeriodDiscountCondition(DayOfWeek.MONDAY, LocalTime.of(10, 0), LocalTime.of(11, 59));
        DiscountCondition periodCondition2 = new PeriodDiscountCondition(DayOfWeek.THURSDAY, LocalTime.of(10, 0), LocalTime.of(20, 59));
        DiscountCondition periodCondition3 = new PeriodDiscountCondition(DayOfWeek.TUESDAY, LocalTime.of(14, 0), LocalTime.of(14, 59));
        DiscountCondition periodCondition4 = new PeriodDiscountCondition(DayOfWeek.THURSDAY, LocalTime.of(10, 0), LocalTime.of(13, 59));

        DiscountPolicy amountDiscountPolicy = new AmountDiscountPolicy(Money.wons(800), sequenceCondition1, sequenceCondition10, periodCondition1, periodCondition2);
        DiscountPolicy percentDiscountPolicy = new PercentDiscountPolicy(0.1, periodCondition3, sequenceCondition2, periodCondition4 );
        DiscountPolicy noneDiscountPolicy = new NoneDiscountPolicy();


        try {
            Movie avatar = new Movie("아바타", Duration.ofMinutes(120), Money.wons(10000), amountDiscountPolicy);

            //10% 비율 할인 정책
            Movie titanic = new Movie("타이타닉", Duration.ofMinutes(180), Money.wons(11000), percentDiscountPolicy);

            //할인 정책 없음
            Movie starWars = new Movie("스타워즈", Duration.ofMinutes(210), Money.wons(14000), noneDiscountPolicy);

            //아바타 상영 일시 객체 생성
            List<Screening> avatarScreeningList = Arrays.asList(
                new Screening(avatar, 1, LocalDateTime.of(2022, 1, 1, 10, 0)),
                new Screening(avatar, 2, LocalDateTime.of(2022, 1, 1, 12, 0)),
                new Screening(avatar, 3, LocalDateTime.of(2022, 1, 1, 14, 0)),
                new Screening(avatar, 4, LocalDateTime.of(2022, 1, 1, 16, 0)),
                new Screening(avatar, 5, LocalDateTime.of(2022, 1, 1, 18, 0)),
                new Screening(avatar, 6, LocalDateTime.of(2022, 1, 2, 10, 0)),
                new Screening(avatar, 7, LocalDateTime.of(2022, 1, 2, 12, 0)),
                new Screening(avatar, 8, LocalDateTime.of(2022, 1, 2, 14, 0)),
                new Screening(avatar, 9, LocalDateTime.of(2022, 1, 2, 16, 0)),
                new Screening(avatar, 10, LocalDateTime.of(2022, 1, 2, 18, 0))
            );

            //타이타닉 상영 일시 객체 생성
            List<Screening> titanicScreeningList = Arrays.asList(
                    new Screening(titanic,  1, LocalDateTime.of(2022, 1, 1, 10, 0)),
                    new Screening(titanic,  2, LocalDateTime.of(2022, 1, 1, 13, 0)),
                    new Screening(titanic,  3, LocalDateTime.of(2022, 1, 1, 15, 0)),
                    new Screening(titanic,  4, LocalDateTime.of(2022, 1, 1, 18, 0)),
                    new Screening(titanic,  5, LocalDateTime.of(2022, 1, 1, 21, 0)),
                    new Screening(titanic,  6, LocalDateTime.of(2022, 1, 2, 10, 0)),
                    new Screening(titanic,  7, LocalDateTime.of(2022, 1, 2, 13, 0)),
                    new Screening(titanic,  8, LocalDateTime.of(2022, 1, 2, 15, 0)),
                    new Screening(titanic,  9, LocalDateTime.of(2022, 1, 2, 18, 0)),
                    new Screening(titanic, 10, LocalDateTime.of(2022, 1, 2, 21, 0))
            );

            //스타워즈 상영 일시 객체 생성
            List<Screening> starWarsScreeningList = Arrays.asList(
                    new Screening(starWars,  1, LocalDateTime.of(2022, 1, 1, 10, 0)),
                    new Screening(starWars,  2, LocalDateTime.of(2022, 1, 1, 13, 0)),
                    new Screening(starWars,  3, LocalDateTime.of(2022, 1, 1, 15, 0)),
                    new Screening(starWars,  4, LocalDateTime.of(2022, 1, 1, 18, 0)),
                    new Screening(starWars,  5, LocalDateTime.of(2022, 1, 1, 21, 0)),
                    new Screening(starWars,  6, LocalDateTime.of(2022, 1, 2, 10, 0)),
                    new Screening(starWars,  7, LocalDateTime.of(2022, 1, 2, 13, 0)),
                    new Screening(starWars,  8, LocalDateTime.of(2022, 1, 2, 15, 0)),
                    new Screening(starWars,  9, LocalDateTime.of(2022, 1, 2, 18, 0)),
                    new Screening(starWars, 10, LocalDateTime.of(2022, 1, 2, 21, 0))
            );

            //홍길동 객체 생성함
            Customer hong = Customer.createCustomer("홍길동");

            //ReservationAgency 클래스의 정적 예매 메서드를 호출하여 예매한다
            Reservation reserveHong = avatarScreeningList.get(0).reserve(hong, 2);
            reserveHong.detailOutput();

            //이순신 객체 생성함
            Customer lee = Customer.createCustomer("이순신");

            //ReservationAgency 클래스의 정적 예매 메서드를 호출하여 예매한다
            Reservation reserveLee= avatarScreeningList.get(1).reserve(lee, 2);
            reserveLee.detailOutput();

            //장길산 객체 생성함
            Customer jang = Customer.createCustomer("장길산");

            //ReservationAgency 클래스의 정적 예매 메서드를 호출하여 예매한다
            Reservation reserveJang  = titanicScreeningList.get(1).reserve(jang, 1);
            reserveJang.detailOutput();

            //장길산 객체 생성함
            Customer leem = Customer.createCustomer("임꺽정");

            //ReservationAgency 클래스의 정적 예매 메서드를 호출하여 예매한다
            Reservation reserveLeem  = starWarsScreeningList.get(1).reserve(leem, 1);
            reserveLeem.detailOutput();

            //실행중 할인 정책 변경
            starWars.setDiscountPolicy(amountDiscountPolicy);
            Customer honggilja = Customer.createCustomer("홍길자");

            //ReservationAgency 클래스의 정적 예매 메서드를 호출하여 예매한다
            Reservation reserveHonggilja = starWarsScreeningList.get(0).reserve(honggilja, 2);
            reserveHonggilja.detailOutput();


        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
