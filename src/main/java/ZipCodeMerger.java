import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ZipCodeMerger {
    public List<Range> merge(List<Range> rangesList) {
        // If only given one range or none, return the same
        if (rangesList.size() < 2) {
            return rangesList;
        }
        // Sort ranges by range.from values
        List<Range> sortedRanges = sortByFrom(rangesList);
        List<Range> result = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < sortedRanges.size() - 1; i++) {
            if (sortedRanges.get(i).getTo() < sortedRanges.get(i + 1).getFrom()) {
                // Ranges don't overlap, save the ith range in result
                result.add(sortedRanges.get(i));
                // move to next element
            } else {
                // Ranges overlap. We effectively reduce the size of the list to work on by 1,
                // set the next element to be this last list and nullify the prior
                if (sortedRanges.get(i).getTo() < sortedRanges.get(i + 1).getTo()) {
                    // ranges intersect partially, add the combined range
                    sortedRanges.set(i+1,new Range(sortedRanges.get(i).getFrom(),sortedRanges.get(i+1).getTo()));
                } else {
                    // range i contains all of range i+1, add range i
                    sortedRanges.set(i+1,sortedRanges.get(i));
                }
                sortedRanges.set(i,null);
            }
        }
        return nonNullRanges(sortedRanges);
    }

    private List<Range> nonNullRanges(List<Range> input) {
        List<Range> result = new ArrayList<>();
        for (Range range : input) {
            if (range != null) {
                result.add(range);
            }
        }
        return result;
    }


    public List<Range> sortByFrom(List<Range> rangesList) {
        // Using TreeMap with keys being range.from and values range.to. If two or more ranges have the same keys
        // discard the lowest values
        TreeMap<Integer,Integer> sortedMap = new TreeMap<>();
        for (Range range : rangesList) {
            Integer from = range.getFrom();
            Integer to = range.getTo();
            Integer temp = sortedMap.get(from);
            if (temp == null) {
                sortedMap.put(from,to);
            } else if (temp < range.getTo()) {
                // 'to' Value stored in sorted map is smaller than the new value, replace in map
                sortedMap.put(from,temp);
            }
        }

        return getListOfRangesFromMap(sortedMap);
    }

    List<Range> getListOfRangesFromMap(TreeMap<Integer,Integer> map) {
        List<Range> result = new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry : map.entrySet() ) {
            result.add(new Range(entry.getKey(),entry.getValue()));
        }
        return result;
    }
}
