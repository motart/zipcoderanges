import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Range> input = new ArrayList<>();
        Range r0 = new Range(12300,12301);
        Range r1 = new Range(12301,12350);
        Range r2 = new Range(12346,12349);
        Range r3 = new Range(12348,12350);
        Range r4 = new Range(12748,12950);
        input.add(r3);
        input.add(r0);
        input.add(r1);
        input.add(r2);
        input.add(r4);
        ZipCodeMerger zipCodeMerger = new ZipCodeMerger();
        System.out.print(zipCodeMerger.merge(input));
    }
}
