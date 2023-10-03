class Solution {
    public static void main(String[] args)
    {
        int[] testCase = {1,2,3,1};

        System.out.println(containsDuplicate(testCase));
    }

    public static boolean containsDuplicate(int[] nums)
    {
        Boolean foundDupe = false;
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums.length; j++)
            {
               // System.out.println(nums[i]); // Debugging
                if(j != i && nums[i] == nums[j]) // If the numbers match & aren't from the same index
                    {
                        foundDupe = true;
                        break;
                    }
                /* else // Debugging
                    System.out.println("Not equal"); */
            }
            if(foundDupe)
                break;
        }
        return foundDupe;
    }
}