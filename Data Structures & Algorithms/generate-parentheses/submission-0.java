class Solution {
    List<String> result= new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        backtrack(n,n,n,"");
        return result;
    }
    public void backtrack(int opened,int closed,int n,String it)
    {
        if(opened==0 && closed==0)
        {
            result.add(it);
            return;
        }
        if(opened>0)
        {
            backtrack(opened - 1,closed,n,it+"(");
        }
        if(closed>opened)
        {
            backtrack(opened,closed - 1,n,it+")");
        }
    }
}
