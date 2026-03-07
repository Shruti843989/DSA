package DAA;
import java.util.*;
public class krusskal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v = sc.nextInt();
        int[][] graph = new int[v][v];

        // Input adjacency matrix
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                graph[i][j] = sc.nextInt();
            }
        }

        boolean[] visited = new boolean[v];
        int[] key = new int[v];

        // Initialize keys as infinite
        Arrays.fill(key, Integer.MAX_VALUE);

        key[0] = 0; // Start from vertex 0
        int totalCost = 0;

        for (int i = 0; i < v; i++) {

            int u = -1;
            int min = Integer.MAX_VALUE;

            // Find minimum key vertex not visited
            for (int j = 0; j < v; j++) {
                if (!visited[j] && key[j] < min) {
                    min = key[j];
                    u = j;
                }
            }

            visited[u] = true;
            totalCost += key[u];

            // Update keys
            for (int j = 0; j < v; j++) {
                if (graph[u][j] != 0 && !visited[j] && graph[u][j] < key[j]) {
                    key[j] = graph[u][j];
                }
            }
        }

        System.out.println(totalCost);
        sc.close();
    }
}
