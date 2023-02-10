package count.count;

/**
 * Hello world!
 *
 */
import java.util.logging.*;

/**
 * Hello world!
 *
 */
import java.util.*;
import java.io.File;
class Frequency
{
	void countFrequency(String str)
	{
		Map<String,Integer>mp=new HashMap<>();
		String arr[]=str.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			if(mp.containsKey(arr[i]))
            {
                mp.put(arr[i],mp.get(arr[i])+1);
            }
            else
            {
                mp.put(arr[i],1);
            }
		}
		Logger logger;
		Logger l= Logger.getLogger("com.api.jar");
		Queue<Map.Entry<String,Integer>> queue=new PriorityQueue<>((a,b)->{return b.getValue()-a.getValue();});
		for(Map.Entry<String,Integer>e:mp.entrySet())
		{
			queue.add(e);
		}
		while(!queue.isEmpty())
		{
			
			l.log(Level.INFO,()-> "\n"+queue.poll());
		}
		
	}
	public static void main(String...args) throws Exception
	{
		Logger l=Logger.getLogger("com.api.jar");
		String f="C:\\Users\\Tringapps-user3\\Documents\\java\\file.txt";
 		Scanner sc=new Scanner(new File(f));
		String str=sc.nextLine();
		l.info(str);
		Frequency fre=new Frequency();
		fre.countFrequency(str);
		
	}
}

