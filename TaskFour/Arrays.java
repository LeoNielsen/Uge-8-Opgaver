class Array{
int[] intArray = new int[10];
String[] stringArray = new String[5];
boolean[] booleanArray = new boolean[12];

public static void main(String[] args) {
	
}

static void printStrings (String[] strArr)
{
	for (int i = 0; i < strArr.lenght; i++){
		System.out.println(strArr[i]);
	}
}

static int sumOfArr(int[] intArr)
{
	int sum = 0;

	for (int i = 0; i < intArr.lenght; i++)
	{
		sum += intArr[i];
	} 
  return sum;
}

static int averageOfArr(int[] intArr)
{
	int sum = 0;

	for (int i = 0; i < intArr.lenght; i++)
	{
		sum += intArr[i];
	} 
  int average = sum/intArr.lenght;
  return average;
}

}