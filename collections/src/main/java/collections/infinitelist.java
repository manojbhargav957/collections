package collections;

import java.util.ArrayList;

public class infinitelist {
public static void main(String args[])
{
	ArrayList<String> list=new ArrayList<String>();
	list.add("epam");
	list.add("collection");
	list.add("webinar");
	for(String x: list)
	{
		System.out.print(x+" ");
	}
}
}