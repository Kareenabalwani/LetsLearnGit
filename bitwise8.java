public class bitwise8
{
	public static void main(String args[])
	{

	int num1,num2;
	int or_result , and_result , xor_result,left_shift,right_shift,right_zero_shift;
		if(args.length==0)
		{
			System.out.println("Please Provide arguments ok??!");
		}
		else
		{
			num1 = Integer.parseInt(args[0]);
			num2 = Integer.parseInt(args[1]);
			and_result  = num1 & num2;
		                    or_result = num1 | num2;
			xor_result = num1 ^ num2;
			left_shift =num1 << 2;
			right_shift	= num1 >>2;
			right_zero_shift = num1>>>2;
System.out.println("\n num1 is :"+num1
	+ "\n num2 is : "+num2
	+ "\n and result :" + and_result
	+ "\n or result :" + or_result
	+ "\n XOR result :" + xor_result
	+ "\n left shift : " + left_shift
	+ "\n right shift : "+ right_shift
	+ "\n right shift with zero filled:" + right_zero_shift

);
			
		}
	}
}