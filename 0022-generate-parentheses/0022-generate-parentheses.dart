class Solution {
  List<String> generateParenthesis(int n) {
  List<String> result = [];

  void generate(String p, int left, int right) {
    if (left == 0 && right == 0) {
      result.add(p);
      return;
    }

    if (left > 0) {
      generate(p + '(', left - 1, right);
    }

    if (right > left) {
      generate(p + ')', left, right - 1);
    }
  }

  generate('', n, n);
  return result;
}

}