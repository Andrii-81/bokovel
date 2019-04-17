package bokovelsys.servises;

import bokovelsys.cards.SkiPassType;

import java.util.HashMap;
import java.util.Map;

public class Turnstile {
    private Map<SkiPassType,Integer> counterPassed = new HashMap<>();
    private Map<SkiPassType,Integer> counterCanseled = new HashMap<>();


    public Turnstile(){
        for(SkiPassType skiPassType : SkiPassType.values()){
            counterPassed.put(skiPassType, 0);
        }
        for(SkiPassType skiPassType : SkiPassType.values()){
            counterCanseled.put(skiPassType, 0);
        }
    }


    public Map<SkiPassType, Integer> getCounterPassed() {
        return counterPassed;
    }

    public void setCounterPassed(Map<SkiPassType, Integer> counterPassed) {
        this.counterPassed = counterPassed;
    }

    public Map<SkiPassType, Integer> getCounterCanseled() {
        return counterCanseled;
    }

    public void setCounterCanseled(Map<SkiPassType, Integer> counterCanseled) {
        this.counterCanseled = counterCanseled;
    }


    public void getStat(){
        //System.out.println(counterPassed.size() + counterCanseled.size());
        System.out.println("Total passed: " + counterPassed.size() + "."  + " Total canceled: " + counterCanseled.size());
    }

    public void getStat(SkiPassType skiPassType){
        // peredaem tip nasego skiPasss -a
        switch (skiPassType){
            case SEASON:
                System.out.println("Total passed Season Skipass: " + counterPassed.get(skiPassType) + "."  + " Total canceled Season Skipass: " + counterCanseled.get(skiPassType));
                break;
            case DAY_LIMIT:
                System.out.println("Total passed Daylimit Skipass: " + counterPassed.get(skiPassType) + "."  + " Total canceled Daylimit Skipass: " + counterCanseled.get(skiPassType));
                break;
            case HOLIDAY_DAY_LIMIT:
                System.out.println("Total passed Holidaylimit Skipass: " + counterPassed.get(skiPassType) + "."  + " Total canceled Holidaylimit Skipass: " + counterCanseled.get(skiPassType));
                break;
            case HALF_DAY_AFTERNOON:
                System.out.println("Total passed Halfdayafternoon Skipass: " + counterPassed.get(skiPassType) + "."  + " Total canceled Halfdayafternoon Skipass: " + counterCanseled.get(skiPassType));
                break;
            case HALF_DAY_MORNING:
                System.out.println("Total passed HALF_DAY_MORNING Skipass: " + counterPassed.get(skiPassType) + "."  + " Total canceled HALF_DAY_MORNING Skipass: " + counterCanseled.get(skiPassType));
                break;
            case HOLIDAY_HALF_DAY_MORNING:
                System.out.println("Total passed HOLIDAY_HALF_DAY_MORNING Skipass: " + counterPassed.get(skiPassType) + "."  + " Total canceled HOLIDAY_HALF_DAY_MORNING Skipass: " + counterCanseled.get(skiPassType));
                break;
            case HOLIDAY_HALF_DAY_AFTENOON:
                System.out.println("Total passed HOLIDAY_HALF_DAY_AFTENOON Skipass: " + counterPassed.get(skiPassType) + "."  + " Total canceled HOLIDAY_HALF_DAY_AFTENOON Skipass: " + counterCanseled.get(skiPassType));
                break;

        }

    }
}
