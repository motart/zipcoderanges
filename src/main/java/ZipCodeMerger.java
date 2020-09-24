import java.util.*;

public class ZipCodeMerger {
    public List<Range> merge(List<Range> rangesList) {
        // If only given one range or none, return the same
        if (rangesList.size() < 2) {
            return rangesList;
        }
        // Sort ranges by range.from values
        Collections.sort(rangesList);
        for (int i = 0; i < rangesList.size() - 1; i++) {
            if (rangesList.get(i).getTo() >= rangesList.get(i + 1).getFrom()) {
                // Ranges overlap. We effectively reduce the size of the list to work on by 1,
                // set the next element to be this last list and nullify the prior
                if (rangesList.get(i).getTo() < rangesList.get(i + 1).getTo()) {
                    // ranges intersect partially, add the combined range
                    rangesList.set(i+1,new Range(rangesList.get(i).getFrom(),rangesList.get(i+1).getTo()));
                } else {
                    // range i contains all of range i+1, add range i
                    rangesList.set(i+1,rangesList.get(i));
                }
                rangesList.set(i,null);
            }
        }
        return nonNullRanges(rangesList);
    }

    List<Range> nonNullRanges(List<Range> input) {
        List<Range> result = new ArrayList<>();
        for (Range range : input) {
            if (range != null) {
                result.add(range);
            }
        }
        return result;
    }
}
