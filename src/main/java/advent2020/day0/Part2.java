package advent2020.day0;

//day 1 2019
public class Part2 {
    public int calculateFuel(int mass){
        if (Math.floor(mass/3.0) - 2 > 0){
            int fuel = (int) Math.floor(mass/3.0) - 2;
            return fuel + calculateFuel(fuel);
        }
        return 0;
    }
}
