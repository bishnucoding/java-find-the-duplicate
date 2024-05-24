/**
 * FindFirst
 * Must run in Time complexity: O(N)
 * Must run in Space complexity: O(1)
 */
public class FindFirst {

    public int findFirst(int[] input){
        //Floyd's cycle detection problem. 

        int tortoise = input[0];
        int rabbit = input[input[0]];

        while (tortoise != rabbit) {
            tortoise = input[tortoise];
            rabbit =  input[input[rabbit]];
        }

        tortoise = 0;

        while (tortoise != rabbit) {
            tortoise = input[tortoise];
            rabbit = input[rabbit];
        }

        return rabbit;


    }
}