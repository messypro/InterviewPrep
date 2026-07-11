# Playbook 01: Core Selection Matrix & Difficulty Mechanics

This playbook serves as a rapid-mapping blueprint for Staff-level coding loops. At this level, interviewers test your ability to bypass brute-force options and instantly map business-logic keywords to optimal data structures and algorithmic frameworks.

## 1. Comprehensive 16-Pattern Selection Matrix

Use this matrix to instantly choose your architectural tool based on the data structure layout and target runtime optimization.

| Strategy Category | Specific DSA Pattern | Primary Scalability Target |
| :--- | :--- | :--- |
| **Linear / Subarray Data** | 1. Two Pointers | Linear sequences, pairs, or cycle tracking |
| | 2. Sliding Window | Contiguous subsegments with constraints |
| | 3. Prefix Sum | Continuous static range query evaluation |
| | 4. Monotonic Stack | Immediate local maximum/minimum bounds |
| | 5. Merge Intervals | Time blocks, overlaps, or scheduling grids |
| **Search Space Traversal** | 6. Modified Binary Search | Logarithmic reduction of monotonic spaces |
| | 7. Backtracking | Exhaustive state-space validation loops |
| **Graph & Network Topology**| 8. Breadth-First Search (BFS) | Shortest distance vectors on unweighted edges |
| | 9. Depth-First Search (DFS) | Exhaustive branch traversal or cycle checks |
| | 10. Topological Sort | Dependency graphs and execution ordering |
| | 11. Union-Find (DSU) | Dynamic group clustering or grid connectivity |
| **Advanced State Trees** | 12. Top K / Heaps | Real-time sorting of volatile streams |
| | 13. Dynamic Programming | Subproblems with overlapping state spaces |
| | 14. Trie (Prefix Tree) | Prefix validation of dynamic string dictionaries |
| **Space Compression** | 15. Rolling Hash | Fast substring mapping over continuous arrays |
| | 16. Coordinate Compression | Scale reductions of massive, sparse spaces |

---

## 2. The Mechanics of Difficulty Progression

Staff loops assume you can solve "Mediums" effortlessly. They shift the difficulty to evaluate how cleanly your architectural choices bend under pressure.

*   **Easy Levels (Single-Rule Application):** The pattern application is direct. The array is already sorted, or the problem statement tells you exactly what to track. You need minimal auxiliary space and a single loop.
*   **Medium Levels (Multi-State Tracking):** The pattern is buried behind a business scenario. You must manage complex window state changes, auxiliary data tracking (like a sliding window combined with a HashMap counter), or custom object transformations.
*   **Hard Levels (State Compression & Monotonic Spaces):** The naive runtime is often $O(N^2)$ or worse due to a massive search space or high dimensions. Shifting to optimal requires using complex optimizations like coordinate compression, line sweep mechanics, or mapping a non-obvious variable to a monotonic search space (e.g., Binary Search over the answer).

