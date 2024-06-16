package playground;

import org.openjdk.jcstress.annotations.*;
import org.openjdk.jcstress.infra.results.LL_Result;

import static org.openjdk.jcstress.annotations.Expect.*;

@JCStressTest
@Outcome(id = { "Bar, Baz", "Baz, Bar"},    expect = ACCEPTABLE, desc = "Both updates.")
@State
public class Hello {
    @Actor
    public void method1() {
        // todo
    }

    @Actor
    public void method2() {
        // todo
    }

    @Arbiter
    public void arbiter(LL_Result s) {
        // todo
    }
}
