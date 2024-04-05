import java.util.*;

public class mst {
    public static void main(String[] args) {
        MST_Prim gph = new MST_Prim(9);
        System.out.println();
        gph.primeMST();
        System.out.println();
    }
}

class MST_Prim {
    int count;
    private LinkedList<LinkedList<Edge>> Adj;

    private static class Edge implements Comparable<Edge> {
        private int dest;
        private int cost;

        public Edge(int dst, int cst) {
            dest = dst;
            cost = cst;
        }

        public Edge(int source, int dest2, int alt) {
            dest = dest2;
            cost = alt;
        }

        @Override
        public int compareTo(Edge that) {
            return this.cost - that.cost;
        }
    }

    public MST_Prim(int cnt) {
        count = cnt;
        Adj = new LinkedList<LinkedList<Edge>>();
        for (int i = 0; i < cnt; i++) {
            Adj.add(new LinkedList<Edge>());
        }
    }

    private void addDirectedEdge(int source, int dest, int cost) {
        Edge edge = new Edge(dest, cost);
        Adj.get(source).add(edge);
    }

    public void addDirectedEdge(int source, int dest) {
        addDirectedEdge(source, dest, 1);
    }

    public void addUndirectedEdge(int source, int dest, int cost) {
        addDirectedEdge(source, dest, cost);
        addDirectedEdge(dest, source, cost);
    }

    public void addUndirectedEdge(int source, int dest) {
        addUndirectedEdge(source, dest, 1);
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            LinkedList<Edge> ad = Adj.get(i);
            System.out.print("\n Vertex " + i + " is connected to ");
            for (Edge adn : ad) {
                System.out.print("(" + adn.dest + "," + adn.cost + ")");
            }
        }
    }

    public void primeMST() {
        int[] prev = new int[count];
        int[] dist = new int[count];
        boolean[] v = new boolean[count];
        Arrays.fill(prev, -1);
        Arrays.fill(dist, Integer.MAX_VALUE);
        int source = 0;
        dist[source] = 0;
        prev[source] = source;
        PriorityQueue<Edge> queue = new PriorityQueue<Edge>();
        Edge node = new Edge(source, source, 0);
        queue.add(node);

        while (!queue.isEmpty()) {
            node = queue.poll();
            int u = node.dest;
            v[u] = true;

            LinkedList<Edge> adl = Adj.get(u);
            for (Edge adn : adl) {
                int dest = adn.dest;
                int alt = adn.cost;
                if (alt < dist[dest] && !v[dest]) {
                    dist[dest] = alt;
                    prev[dest] = u;
                    queue.add(new Edge(u, dest, alt));
                }
            }
        }

        // Sum the weights of the MST edges
        int totalWeight = 0;
        for (int i = 1; i < count; i++) {
            totalWeight += dist[i];
        }

        // Print the total weight of the MST
        System.out.println("Total weight of the MST: " + totalWeight);
    }


    private void printMST(int[] prev, int[] dist) {
        System.out.println("MST consists of the following edges:");
        for (int i = 1; i < count; i++) {
            System.out.println("edge: (" + prev[i] + ", " + i + "), weight: " + dist[i]);
        }
    }
}
