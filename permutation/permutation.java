public class PossibleCombinations {
 public static void main(String[] args) {
  int[] input = { 2,8,9};
  int count=0;
  for (int x = 0; x < 3; x++) {
   for (int y = 0; y < 3; y++) {
    for (int z = 0; z < 3; z++) {
     if (x != y && y != z && z != x) {
      System.out.println(input[x] + " "+ input[y] + " "+input[z]);
      count++;
      System.out.println(count);
     }
    }
   }
  }
 }
}
