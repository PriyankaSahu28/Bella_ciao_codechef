package git_bella_ciao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bella_ciao_codechef {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-- > 0) {
		    String[] str = br.readLine().trim().split(" ");
		    long D = Long.parseLong(str[0]);
		     long d = Long.parseLong(str[1]);
		      long p = Long.parseLong(str[2]);
		       long q = Long.parseLong(str[3]);
		       
		       long r = D%d;
		       long z = D/d;
		       
		       long ans =0;
		       if(r == 0) {
		          ans = D*p + ((z-1)*z*d*q)/2; 
		       } else {
		           ans = D*p + ((z-1)*z*d*q)/2 + r*z*q;
		       }
		       System.out.println(ans);
		}
	}


	}


