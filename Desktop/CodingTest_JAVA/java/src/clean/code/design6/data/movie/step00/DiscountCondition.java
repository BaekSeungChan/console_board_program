package clean.code.design6.data.movie.step00;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class DiscountCondition {
    private DiscountConditionType type; //할인조건(순번, 기간)  // 논리오류를 구문으로 바뀔 수 있다.
//    private int type; // 할인조건(순번 : 0, 기간 : 1, 2, 3 ) int 크기가 크기 때문에 enum에 사용으로 타입 변수 안에 들어갈 수 있는

    private int sequence; //순번
    private DayOfWeek dayOfWeek; //기간
    private LocalTime startTime; //기간 시작시간
    private LocalTime endTime;   //기간 종료시간

    public DiscountCondition(int sequence) {
        this(DiscountConditionType.SEQUENCE, sequence, DayOfWeek.of(1), LocalTime.of(0,0), LocalTime.of(0,0));
    }

    public DiscountCondition(DayOfWeek dayOfWeek, LocalTime startTime, LocalTime endTime) {
        this(DiscountConditionType.PERIOD, 0, dayOfWeek, startTime, endTime);
    }

    public DiscountConditionType getType() {
        return type;
    }

    public void setType(DiscountConditionType type) {
        this.type = type;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    private DiscountCondition(DiscountConditionType type, int sequence, DayOfWeek dayOfWeek, LocalTime startTime, LocalTime endTime) {
        this.type = type;
        this.sequence = sequence;
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
    }

}
