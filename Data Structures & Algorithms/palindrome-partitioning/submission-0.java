class Solution {
    List<List<String>> result=new ArrayList<>();
    public List<List<String>> partition(String s) {
        backtrack(0,s,new ArrayList<>());
        return result;
    }
    public void backtrack(int start,String s,List<String> current)
    {
        if(start==s.length())
        {
            result.add(new ArrayList<>(current));
        }
        for(int i=start;i<s.length();i++)
        {
            if(isPalindrome(s,start,i))
            {
                //CHOOSE
                current.add(s.substring(start,i+1));
                //EXPLORE
                backtrack(i+1,s,current);
                //UNDO
                current.remove(current.size()-1);
            }
        }
    }
    public boolean isPalindrome(String s,int start,int end)
    {
        while(start<=end)
        {
            if(s.charAt(start)!=s.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
