import java.util.*;
import java.io.*;

public class bronzejanuary1promotioncounting {

    static Scanner in;
    static PrintWriter out;
    static StringTokenizer st;    
    static String f = "promote";
    static int a[],b[],ans[];

    public static void main(String[] args) throws IOException {
        in = new Scanner(new FileReader(f+".in"));
        out = new PrintWriter(new FileWriter(f+".out"));
        init();
        solve();
        
        in.close();
        out.close();
        
    }
    
    static void init() throws IOException {
    	a=new int[4];
    	b=new int[4];
    	ans=new int[4];
    	
    	for(int i=0;i<4;i++) {
    		a[i]=in.nextInt();
    		b[i]=in.nextInt();
    	}
    }
    
    static void solve() {
        for(int i=3;i>=1;i--) {
        	ans[i-1]=b[i]-a[i];
        	a[i-1]-=ans[i-1];
        }
        for(int i=0;i<3;i++) {
        	out.println(ans[i]);
        }
    }

}