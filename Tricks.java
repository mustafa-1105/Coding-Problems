import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

class NodeClass
{
    int val;
    int steps;

    public NodeClass(int val, int steps)
    {
        this.val = val;
        this.steps = steps;
    }
}

public class Tricks
{
    private static int minOperations(int src,
                                     int target)
    {

        Set<NodeClass> visited = new HashSet<>(1000);
        LinkedList<NodeClass> queue = new LinkedList<NodeClass>();

        NodeClass node = new NodeClass(src, 0);

        queue.offer(node);
        visited.add(node);

        while (!queue.isEmpty())
        {
            NodeClass temp = queue.poll();
            visited.add(temp);

            if (temp.val == target)
            {
                return temp.steps;
            }

            int mul = temp.val * 2;
            int sub = temp.val + 1;

            // given constraints 
            if (mul > 0 && mul < 1000)
            {
                NodeClass nodeMul = new NodeClass(mul, temp.steps + 1);
                queue.offer(nodeMul);
            }
            if (sub > 0 && sub < 1000)
            {
                NodeClass nodeSub = new NodeClass(sub, temp.steps + 1);
                queue.offer(nodeSub);
            }
        }
        return -1;
    }

    // Driver code 
    public static void main(String[] args)
    {
        // int x = 2, y = 5; 
        int x = 1, y = 9;
        NodeClass src = new NodeClass(x, y);
        System.out.println(minOperations(x, y));
    }
} 