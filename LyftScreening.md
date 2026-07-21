import java.io.*;
import java.lang.*;
import java.util.*;

// Your task will be to implement Fetcher.fetch().
// See the Instructions tab on the right for details.

class TestHelpers {
    public static ArrayList<Integer> makeRange(int min, int max) {
        ArrayList<Integer> results = new ArrayList<Integer>();
        for (int i = min; i < max; i++) {
            results.add(i);
        }
        return results;
    }
}


class Result {

    private ArrayList<Integer> results;
    private int nextPage;

    public Result(ArrayList<Integer> results, int nextPage) {
        this.results = results;
        this.nextPage = nextPage;
    }

    public ArrayList<Integer> getResults() {
        return this.results;
    }

    public int getNextPage() {
        return this.nextPage;
    }
}

interface Client {

    /**
     * Return the next page of results. If page == 0, starts from the
     * beginning. Otherwise, fetches the next PAGE_SIZE records after the last page.
     * returns:
     *    {
     *       'results': [...],
     *       'nextPage': 3
     *    }
     */
    Result fetchPage(int page);
}


/* Implements a mock client for testing. Do not rely on its behavior in your implementation. */
class MockClient implements Client {

    private static final int MAX_RESULTS = 103;
    private static final int PAGE_SIZE = 10;

    public Result fetchPage(int page) {
        ArrayList<Integer> results = new ArrayList<Integer>();

        if (page * PAGE_SIZE > MAX_RESULTS) {
            return new Result(results, -1);
        }
        results = TestHelpers.makeRange(page * PAGE_SIZE, Math.min(MAX_RESULTS, (page + 1) * PAGE_SIZE));
        return new Result(results, page + 1);
    }
}


class Fetcher {
    private Client client;

    Queue<Integer> cache = new LinkedList<>();

    int currentPage=0;

    boolean isClientExhausted = false;

    Fetcher(Client client) {
        this.client = client;
    }

    private void fetchNextPage(int pageNumber){

      // revist valdations and edge cases handling
      // seperate out two responsibilities

      Result result = client.fetchPage(pageNumber);
      // if result list is empty then its pages are exhaused

      if(result == null || result.getResults() == null || result.getResults().size() == 0){
        isClientExhausted = true;
      }

      currentPage = result.getNextPage();

      cache.addAll(result.getResults());


      //return result;

    }

    private ArrayList<Integer> getResults(int numResults) {

      ArrayList<Integer> resultList = new ArrayList<>();

      
          int counter =0;

          while(counter < numResults && !cache.isEmpty()){ //counter is n

            counter ++;

            resultList.add(cache.poll());

          }



        return resultList;
    }

    public ArrayList<Integer> fetch(int numResults) {
        // TODO
        // How @ exceptions, handle gracefully - revisit after first implementation
        // start with invalid param then return empty results

        ArrayList<Integer> resultList = new ArrayList<>();
        
        
        
        // page 0
        //client 100 , user requtesed 10. in this case - 
        // return first 10 to user
        // cache 90 for next run

        if(numResults == 0){
          return resultList;
        }

       // Result result = client.fetchPage(currentPage);

        // consider edge cases/validations on client response

        // requetssted size = numResults

        //


        if(cache.size() >= numResults) {

        return getResults(numResults);

        } else {

          // fetchNextPage(currentPage);

          // keep fetching till either pages are exhausted or got numResults count

          // resultList = getResults(numResults);

          int expectedResultSize=numResults;

          while(resultList.size() < expectedResultSize){

            fetchNextPage(currentPage);
            if(!isClientExhausted){

              resultList.addAll(getResults(expectedResultSize));

            } else{
              break;
            }
            

            expectedResultSize = expectedResultSize - resultList.size();

          }

          return resultList;


        }

    }
}


class Solution {
    public static void main(String[] args) {
        Client mockClient = new MockClient();

        Fetcher fetcher1 = new Fetcher(mockClient);
        testCase(1, fetcher1.fetch(5), TestHelpers.makeRange(0, 5)); // exclusing 5, 0-4
        testCase(2, fetcher1.fetch(2), TestHelpers.makeRange(5, 7)); 
        testCase(3, fetcher1.fetch(7), TestHelpers.makeRange(7, 14));
        testCase(4, fetcher1.fetch(103), TestHelpers.makeRange(14, 103));
        testCase(5, fetcher1.fetch(10), TestHelpers.makeRange(0, 0)); // nothing in the queue

        Fetcher fetcher2 = new Fetcher(mockClient);
        testCase(6, fetcher2.fetch(200), TestHelpers.makeRange(0, 103)); // less records in queue than requested
    }

    static void testCase(int caseNum, ArrayList<Integer> actual, ArrayList<Integer> expected) {
        if (actual.containsAll(expected) && expected.containsAll(actual)) {
            System.out.println("Test " + caseNum + " passed");
        } else {
            System.out.println("Test " + caseNum + " failed - expected: " + expected);
            System.out.println("actual: " + actual);
        }
    }
}

// Your previous Plain Text content is preserved below:

// Pad for Swati Mohite - Senior Security Engineer, Corporate Security
