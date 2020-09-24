import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class ZipCodeMergerTest {
    ZipCodeMerger fixture = new ZipCodeMerger();
    @Test
    public void mergeTest() {
        List<Range> testData = new ArrayList<>();
        List<Range> result;


        // Empty list
        result = fixture.merge(testData);
        assertEquals(0,result.size());

        // Single element list
        result.clear();
        testData.clear();
        testData.add(RangesData.RANGE_1);
        result = fixture.merge(testData);
        assertEquals(1,result.size());


        result.clear();
        testData.clear();
        testData.add(RangesData.RANGE_1);
        testData.add(RangesData.RANGE_2);
        testData.add(RangesData.RANGE_3);
        result = fixture.merge(testData);
        assertEquals(1,result.size());

        result.clear();
        testData.clear();
        testData.add(RangesData.RANGE_1);
        testData.add(RangesData.RANGE_2);
        testData.add(RangesData.RANGE_3);
        testData.add(RangesData.RANGE_4);
        testData.add(RangesData.RANGE_5);
        testData.add(RangesData.RANGE_6);
        result = fixture.merge(testData);
        assertEquals(1,result.size());

        result.clear();
        testData.clear();
        testData.add(RangesData.RANGE_4);
        testData.add(RangesData.RANGE_5);
        testData.add(RangesData.RANGE_7);
        result = fixture.merge(testData);
        assertEquals(3,result.size());

    }

    @Test
    public void nonNullMergerTest() {
        List<Range> input = new ArrayList<>();
        List<Range> processed = new ArrayList<>();
        input.add(RangesData.RANGE_8);
        input.add(RangesData.RANGE_11);
        input.add(RangesData.RANGE_13);
        processed = fixture.nonNullRanges(input);
        assertEquals(2,processed.size());
    }
}
