package Week_2;
import java.util.*;

public class Solution extends VersionControl {
  public int firstBadVersion(int n) {
    int l = 1;
    int r = n;

    while (l < r) {
      final int m = l + (r - l) / 2;
      if (isBadVersion(m))
              r = m;
            else
              l = m + 1;
          }
      
          return l;
        }
      
        private boolean isBadVersion(int m) {
          // TODO Auto-generated method stub
          throw new UnsupportedOperationException("Unimplemented method 'isBadVersion'");
        }
}