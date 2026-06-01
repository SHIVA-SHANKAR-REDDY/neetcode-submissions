class Solution {

    List<String> result = new ArrayList<>();

    public List<String> letterCombinations(String digits) {

        if (digits == null || digits.length() == 0)
            return result;

        Map<Character, String> dialPad = new HashMap<>();

        dialPad.put('2', "abc");
        dialPad.put('3', "def");
        dialPad.put('4', "ghi");
        dialPad.put('5', "jkl");
        dialPad.put('6', "mno");
        dialPad.put('7', "pqrs");
        dialPad.put('8', "tuv");
        dialPad.put('9', "wxyz");

        backtrack(0, digits, dialPad, "");

        return result;
    }

    private void backtrack(int index,
                           String digits,
                           Map<Character, String> dialPad,
                           String current) {

        if (index == digits.length()) {
            result.add(current);
            return;
        }

        String letters = dialPad.get(digits.charAt(index));

        for (char ch : letters.toCharArray()) {

            backtrack(
                index + 1,
                digits,
                dialPad,
                current + ch
            );
        }
    }
}