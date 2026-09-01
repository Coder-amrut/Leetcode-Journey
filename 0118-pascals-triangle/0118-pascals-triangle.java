class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            // प्रत्येक row चा पहिला element 1
            row.add(1);

            // मधले elements
            for (int j = 1; j < i; j++) {
                int value = ans.get(i - 1).get(j - 1)
                           + ans.get(i - 1).get(j);

                row.add(value);
            }

            // प्रत्येक row चा शेवटचा element 1
            if (i > 0) {
                row.add(1);
            }

            ans.add(row);
        }

        return ans;
    }
}