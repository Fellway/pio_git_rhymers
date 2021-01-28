package edu.kis.vh.nursery;

//alt + ← oraz alt + → pozwala na przełączanie się pomiędzy otwartymi oknami w Intellij
public class HanoiRhymer extends defaultCountingOutRhymer {

    int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
