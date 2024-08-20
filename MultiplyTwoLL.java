class MultiplyTwoLL {
    public long multiplyTwoLists(Node first, Node second) {
        // Code here
        
        long num1 = calculate(first);
        long num2 = calculate(second);
        long result = (num1*num2)% 1000000007;
        return result;
        
    }
    public static long calculate(Node curr){
        long number = 0;
        while(curr!=null){
            number = (number*10)%1000000007 + curr.data;
            curr = curr.next;
        }
        return number;
    }
}