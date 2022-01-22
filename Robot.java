public class Robot {
	int maxspeed;
    private int getmaxspeed2(){
	return maxspeed;
}
    
public Robot() {
this.maxspeed=1;
}

public Robot (int maxspeed)
{
this.maxspeed = maxspeed;
}

/*public int getmaxspeed() {
return maxspeed;
}

public void setmaxspeed(int maxspeed)
{
if (maxspeed >=0);
this.maxspeed =0;
}
*/
public void travel()
{
System.out.println("the robot move " +maxspeed+" units");
}
}