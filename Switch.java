
public class Switch
{
public static void main (String args[])
{
int age = 45;
int wt = 60;
switch(age) {


case 16:	System.out.println("Donate blood");
 			break;
case 18:	System.out.println("Not allowed for blood donation");
			break;
case 20:	System.out.println("Not allowed for blood donation");
			break;
case 22:	System.out.println("allowed for blood donation and vaccination");
			break;
case 24:	System.out.println("allowed for vaccination");
			break;
case 26:	System.out.println("Not allowed for blood donation & vaccination");
			break;
default:	System.out.println("rejected");
}
}
}

