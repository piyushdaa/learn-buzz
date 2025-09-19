//Creating a class cellphone with methods to print "ringing", "vibrating" etc

package CodeWithHarry.OOPs.Custom_Class.PS;

//Creating Class

class cellphone{
    public void ringing(){
        System.out.println("Ringing...");
    }
    public void vibrating(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling Mukesh...");
    }
}

//main Class

public class PS_Q2 {
    public static void main(String[] args){
        //created object
        cellphone vivo = new cellphone();

        //calling methods
        vivo.vibrating();
        vivo.callFriend();
        vivo.ringing();
    }
}
