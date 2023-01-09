package javaOOP2.TestThread2;

public class MySumCount extends Thread {
    public MySumCount(int startIndex, int stopIndex, int[] array) {
        this.startIndex = startIndex;
        this.stopIndex = stopIndex;
        this.resultSum = 0;
        this.array = array;
    }

    public int startIndex;
    public int stopIndex;
    public long resultSum;
    public int[] array;

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public int getStopIndex() {
        return stopIndex;
    }

    @Override
    public void run() {
        for (int i = getStartIndex(); i <= getStopIndex(); i++)
            resultSum += array[i];
        System.out.println("Sum of array elements produced by " + getName() + ": " + resultSum);
    }
}