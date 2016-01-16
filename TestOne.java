

public class TestOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("This my first Test!");
		TestOne a = new TestOne();
		ABC yz = a.getTest();
		yz.Test();
	}

	public ABC getTest()
	{
		return new ABC(){

			@Override
			public void Test() {
				// TODO Auto-generated method stub
				System.out.println("Inner Class Test");
			}
			      
		};
	}
}


interface ABC
{
	void Test();
}