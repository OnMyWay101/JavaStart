import CreateAndStart.TestThread1;
import StatusControlTest.*;
import SynchronizedTest.ReadableTest;
import SynchronizedTest.TestDeadLock;
import SynchronizedTest.TestSyn;

public class Main {
    public static void main(String[] args) {
        ReadableTest.Test();
        //TestDeadLock.Test();
        //TestSyn.Test();
        //TestRunner2.Test();
        //TestYield.Test();
        //TestJoin.Test();
        //TestInterrupt.Test();
        //TestPriority.Test();
        //TestThread1.Test2();
    }
}
