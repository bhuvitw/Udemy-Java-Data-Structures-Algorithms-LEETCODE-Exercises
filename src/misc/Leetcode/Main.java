package misc.Leetcode;


public class Main {
    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.subtractProductAndSum(234)); // example input
    }
    public int subtractProductAndSum(int n) {
        // return product - sum

        int temp = n;
        int product = 1;
        while(temp != 0){
            product *= temp%10;
            temp = temp/10;
        }
        temp = n;
        int sum = 0;
        while(temp != 0){
            sum += temp%10;
            temp = temp/10;
        }
        return product-sum;

    }
}
    

