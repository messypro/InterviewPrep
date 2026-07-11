# Playbook 04: Advanced State Trees & Space Compression

Detailed progression maps and targeting matrices for dynamic high-throughput trees, multi-state problems, and structural compression.

## Category D: Advanced State Trees & Compression

### 12. Top K Elements / Heaps
*   **The Core Concept:** Maintaining an internally self-balancing tree structure to fetch local maximum or minimum bounds in $O(1)$ time while allowing mutation over a volatile stream.
*   **Trigger Keywords:** "Top K frequent elements", "Kth largest element", "Merge K sorted streams", "Find median from data stream".
*   **Staff-Level Reality:** Used for high-throughput stream processing, calculating live real-time metrics, leaderboard aggregators, or prioritizing job queue execution.
*   **Progression Mechanics:**
    *   *Easy:* Pushing a fixed list into a heap to grab a static maximum boundary target.
    *   *Medium:* Maintaining a bounded rolling heap structure of size K to handle highly unpredictable data streams.
    *   *Hard:* Balancing two heaps at once (a min-heap and a max-heap) to calculate values like moving medians from erratic, real-time data inputs.
*   **High-Yield LeetCode Targets:**
    *   *Easy:* 703. Kth Largest Element in a Stream
    *   *Medium:* 347. Top K Frequent Elements
    *   *Hard:* 295. Find Median from Data Stream

### 13. Dynamic Programming (DP)
*   **The Core Concept:** Storing intermediate answers to recurring subproblems to eliminate redundant computations over large, overlapping choice structures.
*   **Trigger Keywords:** "Maximum profit", "Minimum cost path", "Knapsack problem", "Longest common subsequence", "Ways to reach target state".
*   **Staff-Level Reality:** Used for deep algorithmic performance work, inventory optimization systems, capacity distribution layouts, or text processing matching algorithms.
*   **Progression Mechanics:**
    *   *Easy:* 1D transformations where each step depends only on the previous step (e.g., Fibonacci or Climbing Stairs).
    *   *Medium:* 2D matrices tracking multiple choice paths over long sequences (e.g., Longest Common Subsequence).
    *   *Hard:* Advanced multi-dimensional state tracking where you must optimize memory by rolling arrays over, or utilize bitmasks to handle exponential states.
*   **High-Yield LeetCode Targets:**
    *   *Easy:* 70. Climbing Stairs
    *   *Medium:* 300. Longest Increasing Subsequence
    *   *Hard:* 72. Edit Distance

### 14. Trie (Prefix Tree)
*   **The Core Concept:** A highly efficient character-keyed tree optimized for searching substrings and prefix matches without checking every dictionary entry.
*   **Trigger Keywords:** "Autocomplete systems", "Dictionary lookup systems", "Prefix matching", "Word search matrix".
*   **Staff-Level Reality:** Powers IP routing tables, typeahead search microservices, text-indexing utilities, or regex matching acceleration modules.
*   **Progression Mechanics:**
    *   *Easy:* Coding standard insert, search, and prefix matching mechanics inside a clean tree layout.
    *   *Medium:* Adding complex search wildcards (like `.`) that require you to branch out and explore multiple tree roots simultaneously.
    *   *Hard:* Embedding a Trie inside a grid search pattern (like a DFS matrix) to validate combinations in real time while using suffix connections.
*   **High-Yield LeetCode Targets:**
    *   *Easy:* 208. Implement Trie (Prefix Tree)
    *   *Medium:* 211. Design Add and Search Words Data Structure
    *   *Hard:* 212. Word Search II

### 15. Prefix / Suffix Hash (Rolling Hash & Rabin-Karp)
*   **The Core Concept:** Transforming rolling slices of a collection into single hash signatures to evaluate long pattern match collisions in continuous linear steps.
*   **Trigger Keywords:** "Subdomain matching", "Repeated DNA sequences", "String pattern matching", "Longest duplicate substring".
*   **Staff-Level Reality:** Crucial pattern for deep pattern matching engine design, file duplication checks (similar to rsync logic), and massive text processing pipelines.
*   **Progression Mechanics:**
    *   *Easy:* Standard substring lookups using explicit, fixed-length target definitions.
    *   *Medium:* Handling moving windows to isolate recurring string profiles while using basic mod arithmetic to prevent data overflows.
    *   *Hard:* Finding the longest repeating sequence by combining a rolling hash with binary search to scale up processing performance.
*   **High-Yield LeetCode Targets:**
    *   *Easy:* 28. Find the Index of the First Occurrence in a String
    *   *Medium:* 187. Repeated DNA Sequences
    *   *Hard:* 1044. Longest Duplicate Substring

### 16. Matrix / Coordinate Compression (Line Sweep)
*   **The Core Concept:** Projecting massive, sparse spatial arrays or coordinate grids down into a condensed scale containing only discrete, critical structural intervals.
*   **Trigger Keywords:** "Area of overlapping rectangles", "Skyline problem", "Bomb placement range coverage", "Sparse grid traversal limits".
*   **Staff-Level Reality:** Solves mapping and geospatial query optimizations, rendering engine layout calculations, or massive geo-fencing calculation engines where memory footprint bounds must remain fixed.
*   **Progression Mechanics:**
    *   *Easy:* Linear boundary array queries over small, static ranges.
    *   *Medium:* Organizing mixed dynamic events along a timeline to compute real-time capacity shifts or concurrency limits.
    *   *Hard:* Computing geometry metrics across massive 2D environments (e.g., $10^9 \times 10^9$) by compressing sparse points into manageable segments.
*   **High-Yield LeetCode Targets:**
    *   *Easy:* 1200. Minimum Absolute Difference (Basic proximity sorting analogy)
    *   *Medium:* 253. Meeting Rooms II
    *   *Hard:* 850. Rectangle Area II
