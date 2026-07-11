# Playbook 07: Specialized Systems & Infrastructure Patterns

These advanced structures are rarely tested in generic software loops but are critical for specialized engineering tracks (Infrastructure, Database Engines, Geospatial Systems, Data Platforms).

---

## 1. The Final Systems Paradigms

### 20. Geospatial & Spatial Trees (Segment Trees, Fenwick Trees, Quad-Trees)
*   **The Core Concept:** Hierarchical data structures designed to query, update, or sub-divide intervals and geometric space dimensions dynamically in logarithmic time.
*   **Trigger Keywords:** "Dynamic range maximum/minimum query", "Point updates in a mutable array", "Find all restaurants within a 2-mile radius", "Collision detection in a 2D space".
*   **Staff-Level Reality:** Powers structural rendering engines, spatial indexing maps (like Uber's H3 or Google Maps grid tiles), and time-series aggregation layers.
*   **High-Yield LeetCode Targets:**
    *   *Medium (Fenwick/Segment analogy):* 307. Range Sum Query - Mutable
    *   *Hard (Segment Tree):* 315. Count of Smaller Numbers After Self
    *   *Hard (Quad-Tree / Spatial):* 427. Construct a Quad Tree

### 21. Single-Source Shortest Paths with Weights (Dijkstra's / Bellman-Ford)
*   **The Core Concept:** Finding the absolute minimum cumulative path distance over edges containing arbitrary structural costs or negative weights.
*   **Trigger Keywords:** "Shortest path with edge weights/costs", "Network routing latency metrics", "Currency arbitrage detection".
*   **Staff-Level Reality:** Used for packet routing, transit path optimizations, traffic engine systems, or financial risk validation circuits.
*   **High-Yield LeetCode Targets:**
    *   *Medium:* 743. Network Delay Time
    *   *Hard:* 787. Cheapest Flights Within K Stops

### 22. Approximate Data Structures & Sketching (Bloom Filters / HyperLogLog)
*   **The Core Concept:** Using probabilistic bit arrays and hashing to answer cardinality or membership queries in static $O(1)$ space, trading precision for extreme scalability.
*   **Trigger Keywords:** "Check if a username already exists without database queries", "Count unique visitors over a massive stream using minimal memory", "Spam URL cache check".
*   **Staff-Level Reality:** Standard architectural choices inside storage engines (LSM trees like RocksDB use Bloom filters to avoid unnecessary disk seeks) and high-throughput streaming systems like Apache Kafka or Redis.
*   **High-Yield LeetCode Targets:**
    *   *Medium (Design implementation):* 146. LRU Cache (Analogous to custom engine design)
    *   *System Design Cross-over:* This is frequently tested as a hybrid "code-this-probabilistic-utility" question in high-level loops.

---

## 2. Production Java Template: Advanced Systems Operations

### 1. High-Performance Dijkstra's Weighted Graph Engine (Java)
```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class NetworkRoutingEngine {
    public static class Edge {
        int targetNode;
        int networkLatency;
        
        public Edge(int targetNode, int networkLatency) {
            this.targetNode = targetNode;
            this.networkLatency = networkLatency;
        }
    }

    public int findMinLatency(List<List<Edge>> graph, int source, int target, int totalNodes) {
        int[] minLatencies = new int[totalNodes];
        Arrays.fill(minLatencies, Integer.MAX_VALUE);
        minLatencies[source] = 0;

        // Min-Heap sorting nodes dynamically based on the current accumulated weight
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
        pq.offer(new int[]{source, 0});

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int currentNode = current[0];
            int currentLatency = current[1];

            // Stale path optimization
            if (currentLatency > minLatencies[currentNode]) continue;
            if (currentNode == target) return currentLatency;

            for (Edge edge : graph.get(currentNode)) {
                int nextLatency = currentLatency + edge.networkLatency;
                if (nextLatency < minLatencies[edge.targetNode]) {
                    minLatencies[edge.targetNode] = nextLatency;
                    pq.offer(new int[]{edge.targetNode, nextLatency});
                }
            }
        }
        return minLatencies[target] == Integer.MAX_VALUE ? -1 : minLatencies[target];
    }
}
```

### 2. High-Throughput Bloom Filter Membership Simulator (Java)
```java
import java.util.BitSet;

public class SystemBloomFilter {
    private final BitSet bitArray;
    private final int numHashFunctions;
    private final int bitArraySize;

    public SystemBloomFilter(int bitArraySize, int numHashFunctions) {
        this.bitArray = new BitSet(bitArraySize);
        this.numHashFunctions = numHashFunctions;
        this.bitArraySize = bitArraySize;
    }

    // Register an entity signature inside the bit cluster array
    public void add(String element) {
        for (int i = 0; i < numHashFunctions; i++) {
            int hash = computeHash(element, i);
            bitArray.set(Math.abs(hash % bitArraySize));
        }
    }

    // False Positive Validation: Returns true if the item *might* be present, false if definitely *not* present
    public boolean mightContain(String element) {
        for (int i = 0; i < numHashFunctions; i++) {
            int hash = computeHash(element, i);
            if (!bitArray.get(Math.abs(hash % bitArraySize))) {
                return false; // Guaranteed 100% not present if even one bit is un-set
            }
        }
        return true; // Might be present (subject to hash collision probability limits)
    }

    private int computeHash(String element, int seed) {
        int hash = element.hashCode();
        // Shift values systematically using the seed to generate independent hash positions
        return hash ^ (seed * 0x5bd1e995);
    }
}
```
