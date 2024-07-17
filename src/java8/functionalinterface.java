package java8;

import java.util.function.Predicate;

public class functionalinterface {
  
	public static int getsum(int[] arr,Predicate<Integer> condition)
	{
		int sum = 0;
		for(int num : arr)
		{
			if(condition.test(num))
			{
				sum +=num;
			}
		}
		
		return sum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] intarr = {1,2,3,4,5,6};
      int evensum = getsum(intarr,x->x%2==0);
      System.out.println("sum of even number "+evensum);
      System.out.println("sum of odd number "+getsum(intarr,x->x%2!=0));
	}

}
