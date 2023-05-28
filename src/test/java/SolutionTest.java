import org.example.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void minCostTest1() {
        int n = 7;
        int[] cuts = {1, 3, 4, 5};
        Assert.assertEquals(16, new Solution().minCost(n, cuts));
    }

    @Test
    public void minCostTest2() {
        int n = 9;
        int[] cuts = {5, 6, 1, 4, 2};
        Assert.assertEquals(22, new Solution().minCost(n, cuts));
    }
}
