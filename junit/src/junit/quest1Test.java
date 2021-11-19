package junit;

import org.junit.jupiter.api.Test;

public class quest1Test {
int[] a=new int[] {56,34,7,3,54,3,34,34,53};

@Test
public void testmin()
{
	int Findmin=quest1.minval(a);
	assert(Findmin==3);
	
}
@Test
public void testmax()
{
	int Findmax=quest1.maxval(a);
	assert(Findmax==56);
	
}
public void quest1test()
{
	int[] arr1=new int[min,max];
	
}

}
