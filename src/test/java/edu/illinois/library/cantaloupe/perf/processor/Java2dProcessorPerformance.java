package edu.illinois.library.cantaloupe.perf.processor;

import java.util.concurrent.TimeUnit;

import edu.illinois.library.cantaloupe.processor.Java2dProcessorTest;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;

import static edu.illinois.library.cantaloupe.test.PerformanceTestConstants.*;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@Warmup(iterations = WARMUP_ITERATIONS,
        time = WARMUP_TIME)
@Measurement(iterations = MEASUREMENT_ITERATIONS,
        time = MEASUREMENT_TIME)
@State(Scope.Benchmark)
@Fork(value = 1, jvmArgs = { "-server", "-Xms128M", "-Xmx128M", "-Dcantaloupe.config=memory" })
public class Java2dProcessorPerformance extends Java2dProcessorTest {

    @Benchmark
    @Override
    public void testReadImageInfoOnAllFixtures() throws Exception {
        super.testReadImageInfoOnAllFixtures();
    }

    @Benchmark
    @Override
    public void testProcessWithAnimatedGIF() throws Exception {
        super.testProcessWithAnimatedGIF();
    }

}