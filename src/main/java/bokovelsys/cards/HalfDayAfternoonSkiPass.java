package bokovelsys.cards;

import bokovelsys.servises.AccountSystem;

public class HalfDayAfternoonSkiPass extends SkiPass {

    public HalfDayAfternoonSkiPass(){
        this.id = AccountSystem.getAccountingSystem().getNextId();
        this.skiPassType = SkiPassType.HOLIDAY_HALF_DAY_AFTENOON;

    }
}
