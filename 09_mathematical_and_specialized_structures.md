# Playbook 09: Mathematical Paradigms & Specialized Pure Structures

This final reference file covers rigid mathematical and algorithmic structures. These do not "bend" into general problem variants; instead, they serve as specialized, formula-driven optimizations for precise numerical, string-matching, or graph-network boundaries.

---

## 1. Number Theory & Combinatorial Primality

### 27. Primality Testing & Factor Sieves (Sieve of Eratosthenes)
*   **The Core Concept:** Pre-allocating continuous boolean flags to isolate and index prime numbers up to a limit $N$ in $O(N \log(\log N))$ time, or computing the Greatest Common Divisor (GCD) using the Euclidean algorithm in logarithmic steps.
*   **Trigger Keywords:** "Find all prime factors", "Compute least common multiple of a dynamic array", "Check if a number is prime under high execution frequencies".
*   **Staff-Level Reality:** Foundational for cryptographic handshakes, secure token generation modules, and optimizing high-frequency telemetry counters where numbers must be split into unique prime IDs.
*   **High-Yield LeetCode Targets:**
    *   *Easy:* 204. Count Primes
    *   *Medium:* 1998. GCD Sort of an Array

### 28. Fast Powering (Exponentiation by Squaring)
*   **The Core Concept:** Computing $x^n$ in $O(\log n)$ runtime instead of linear $O(n)$ steps by exploiting the rule that $x^n = (x^{n/2})^2$ for even numbers.
*   **Trigger Keywords:** "Compute power value matching giant constraints", "Calculate values modulo $10^9 + 7$ over large scaling limits".
*   **Staff-Level Reality:** Used in matrix exponentiation loops for predicting linear recurrences, scaling deep machine learning transformations, and implementing game-state projection frameworks.
*   **High-Yield LeetCode Targets:**
    *   *Medium:* 50. Pow(x, n)
    *   *Medium:* 372. Super Pow

---

## 2. Advanced Hard-Rigid Substring Parsers

### 29. Linear-Time String Matching (KMP & Z-Algorithm)
*   **The Core Concept:** Using precomputed prefix-suffix matching tables to parse an exact text body for string overlaps without ever rolling the primary execution pointer backward.
*   **Trigger Keywords:** "Find an exact matching pattern inside a massive stream in $O(N+M)$ time", "Longest matching prefix that is also a valid suffix".
*   **Staff-Level Reality:** Built directly into low-level regex compilation utilities, operating system string searches (`grep` adjacent modules), and high-throughput log analysis tools.
*   **High-Yield LeetCode Targets:**
    *   *Medium:* 28. Find the Index of the First Occurrence in a String
    *   *Hard:* 1392. Longest Happy Prefix

---

## 3. High-Capacity Structural Networks

### 30. Network Flow & Bipartite Matching (Ford-Fulkerson / Edmonds-Karp)
*   **The Core Concept:** Determining the absolute peak bottleneck capacity through a directed network path from a single source node to a terminal sink node.
*   **Trigger Keywords:** "Assign tasks to workers given maximum constraint maps", "Compute maximum data routing pipeline volume without bursting local nodes".
*   **Staff-Level Reality:** Applied directly to complex cloud data center load balancing configurations, logistical supply chain shipping routes, and real-time ad-tech placement assignment grids.
*   **High-Yield LeetCode Targets:**
    *   *Hard (Graph optimization analogy):* 743. Network Delay Time
    *   *Advanced Cross-over:* Frequently surfaced as a macro-architecture question within the staff-level system design coding crossover rounds.

---

## 4. Production Java Template: Advanced Mathematical Strings

### 1. Logarithmic Exponentiation Engine (Java)
```java
public class MathematicalPowerEngine {
    // Computes (base^exponent) % modulo accurately in O(log N) runtime
    public long computeModularPower(long base, long exponent, long modulo) {
        if (modulo == 1) return 0;
        long result = 1;
        base = base % modulo; // Guard against initial overflow bounds

        while (exponent > 0) {
            // Bitwise validation: check if the lowest bit position is an odd number
            if ((exponent & 1) == 1) {
                result = (result * base) % modulo;
            }
            exponent >>= 1; // Shift bits rightward to halve the remaining exponent space
            base = (base * base) % modulo; // Square the tracking base safely
        }
        return result;
    }
}
```

### 2. High-Performance Knuth-Morris-Pratt (KMP) Lookup Utility (Java)
```java
public class StringMatchingEngine {
    public int findPatternFirstIndex(String text, String pattern) {
        if (pattern == null || pattern.isEmpty()) return 0;
        if (text == null || text.length() < pattern.length()) return -1;

        int[] lpsTable = computeLPSTable(pattern);
        int textIndex = 0;
        int patternIndex = 0;

        while (textIndex < text.length()) {
            if (text.charAt(textIndex) == pattern.charAt(patternIndex)) {
                textIndex++;
                patternIndex++;
            }

            if (patternIndex == pattern.length()) {
                return textIndex - patternIndex; // Match isolated; return starting boundary index
            } else if (textIndex < text.length() && text.charAt(textIndex) != pattern.charAt(patternIndex)) {
                // Mismatch event processing: leverage historical prefix lookahead boundaries
                if (patternIndex != 0) {
                    patternIndex = lpsTable[patternIndex - 1];
                } else {
                    textIndex++;
                }
            }
        }
        return -1;
    }

    private int[] computeLPSTable(String pattern) {
        int[] lps = new int[pattern.length()];
        int lengthCounter = 0;
        int i = 1;

        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(lengthCounter)) {
                lengthCounter++;
                lps[i] = lengthCounter;
                i++;
            } else {
                if (lengthCounter != 0) {
                    lengthCounter = lps[lengthCounter - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}
```
