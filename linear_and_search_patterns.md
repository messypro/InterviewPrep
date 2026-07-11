# Playbook 02: Linear Processing & Search Space Traversal

Detailed progression maps and targeting matrices for Linear Data structures and Search Space frameworks.

## Category A: Linear & Subarray Processing

### 1. Two Pointers (Fast & Slow / Left & Right)
*   **The Core Concept:** Using two independent indices iterating through a linear sequence to optimize space complexity.
*   **Trigger Keywords:** "Find a pair that sums to X", "Palindromes", "Detect a cycle in a linked list", "Reverse an array in-place".
*   **Staff-Level Reality:** Used as a localized optimization phase inside larger system simulations.
*   **Progression Mechanics:**
    *   *Easy:* Two static boundaries moving cleanly inward until they meet.
    *   *Medium:* Pointers shift at asymmetrical speeds or require dynamic swapping arrays on a mutating collection.
    *   *Hard:* Tracking multiple pointer combinations across diverse dimensions where pointer movement depends on an optimized historical lookback threshold.
*   **High-Yield LeetCode Targets:**
    *   *Easy:* 125. Valid Palindrome
    *   *Medium:* 11. Container With Most Water
    *   *Hard:* 42. Trapping Rain Water

### 2. Sliding Window
*   **The Core Concept:** Maintaining a subsegment of data over an array or string that dynamically expands or shrinks based on structural rules.
*   **Trigger Keywords:** "Contiguous subarray", "Longest substring without repeating characters", "Minimum window length", "Subsegment meeting criteria X".
*   **Staff-Level Reality:** Frequently used to solve rate-limiting algorithms or network packet tracking scenarios.
*   **Progression Mechanics:**
    *   *Easy:* Window length stays at a fixed, unchanging size.
    *   *Medium:* Window expands and contracts dynamically, requiring an auxiliary tracking structure (like a counter Map) to evaluate window validity.
    *   *Hard:* Finding global optimization limits with multiple constraint matrices where you must track invalid window states globally before resolving them.
*   **High-Yield LeetCode Targets:**
    *   *Easy:* 643. Maximum Average Subarray I
    *   *Medium:* 3. Longest Substring Without Repeating Characters
    *   *Hard:* 76. Minimum Window Substring

### 3. Prefix Sum
*   **The Core Concept:** Precalculating running cumulative totals to allow immutable subsegments or sub-ranges to be queried in $O(1)$ time.
*   **Trigger Keywords:** "Subarray sum equals K", "Range sum queries", "Number of continuous segments matching target".
*   **Staff-Level Reality:** Used extensively in telemetry processing and time-series data analysis.
*   **Progression Mechanics:**
    *   *Easy:* Basic 1D array where query ranges are input cleanly.
    *   *Medium:* Combining the running total with a frequency HashMap to look backward for exact numeric offset targets in linear time.
    *   *Hard:* Scaling the logic up into multidimensional matrix structures (2D Prefix Sums) or tracking rolling mod distributions.
*   **High-Yield LeetCode Targets:**
    *   *Easy:* 303. Range Sum Query - Immutable
    *   *Medium:* 560. Subarray Sum Equals K
    *   *Hard:* 308. Range Sum Query 2D - Mutable

### 4. Monotonic Stack / Queue
*   **The Core Concept:** Preserving an explicitly sorted (increasing or decreasing) order inside a linear container while scrubbing unneeded intermediate elements.
*   **Trigger Keywords:** "Next greater element", "Next smaller element", "Daily temperatures", "Online stock span", "Largest rectangle in histogram".
*   **Staff-Level Reality:** Essential for optimizing lookahead architectures or stream-processing sliding windows down from $O(N^2)$ to $O(N)$.
*   **Progression Mechanics:**
    *   *Easy:* A single pass down a linear list to locate the immediate right-side neighbor matching a rule.
    *   *Medium:* The elements have complex relationships, requiring you to pop indexes off the stack to compute geometric boundaries or track dynamic intervals.
    *   *Hard:* Managing multidimensional transformations where elements are discarded dynamically relative to multi-tiered conditional limits.
*   **High-Yield LeetCode Targets:**
    *   *Easy:* 496. Next Greater Element I
    *   *Medium:* 739. Daily Temperatures
    *   *Hard:* 84. Largest Rectangle in Histogram

### 5. Merge Intervals
*   **The Core Concept:** Sorting a collection of multidimensional boundaries by their starting index to isolate, merge, or insert overlapping arrays in a single linear pass.
*   **Trigger Keywords:** "Overlapping schedules", "Time slots", "Calendar events", "Disjoint sets", "Find the minimum number of resources (rooms/servers)".
*   **Staff-Level Reality:** Simulates resource contention, continuous scheduling blocks, cluster compute allocations, or real-time event logging timelines.
*   **Progression Mechanics:**
    *   *Easy:* Checking a single pairs list for basic overlap bounds.
    *   *Medium:* Mutating structural ranges on the fly, handling sorting constraints, or tracking concurrent intersection vectors across distinct streams.
    *   *Hard:* Running complex multi-point calculations via line sweep engines to locate maximum resource load spikes across massive streams.
*   **High-Yield LeetCode Targets:**
    *   *Easy:* 252. Meeting Rooms
    *   *Medium:* 56. Merge Intervals
    *   *Hard:* 218. The Skyline Problem

---

## Category B: Search Space Traversal

### 6. Modified Binary Search
*   **The Core Concept:** Dividing a monotonic or uniquely partitioned search space in half each iteration to guarantee logarithmic search steps.
*   **Trigger Keywords:** "Sorted array", "Search in rotated sorted array", "Find peak element", "Minimize maximum capacity (e.g., shipping packages)".
*   **Staff-Level Reality:** Used anytime the problem asks you to solve optimization parameters over a mathematical monotonic range.
*   **Progression Mechanics:**
    *   *Easy:* Direct target lookup inside a fully sorted array.
    *   *Medium:* Searching arrays with inflection points (rotated lists) or locations where element parity defines step choices.
    *   *Hard:* The search target is an unmaterialized mathematical calculation space (Binary Search over the Answer) where feasibility functions determine loop steps.
*   **High-Yield LeetCode Targets:**
    *   *Easy:* 704. Binary Search
    *   *Medium:* 33. Search in Rotated Sorted Array
    *   *Hard:* 410. Split Array Largest Sum

### 7. Backtracking
*   **The Core Concept:** Brute-forcing state configurations systematically via recursion, dropping branches early the moment they violate system constraints.
*   **Trigger Keywords:** "All permutations", "Generate all combinations", "N-Queens", "Sudoku solver", "Find all valid paths".
*   **Staff-Level Reality:** Appears when you must implement hard system configurations, access-control combinations, or layout optimizers where mathematical short-cuts don't exist.
*   **Progression Mechanics:**
    *   *Easy:* Straight branch execution paths where elements are never duplicated.
    *   *Medium:* Pruning recursion branches with heavy deduplication rules because the base dataset contains identical values.
    *   *Hard:* Complex state constraints where you must combine backtracking branches with bitmasking shortcuts to meet strict performance budgets.
*   **High-Yield LeetCode Targets:**
    *   *Easy:* 257. Binary Tree Paths
    *   *Medium:* 46. Permutations
    *   *Hard:* 51. N-Queens
