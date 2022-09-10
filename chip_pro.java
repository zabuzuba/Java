package end_sem;
import java.util.Scanner;
public class chips {
	public static void main(String args[]) {
		int i, s;
		Scanner sc = new Scanner(System.in);
		chips ob = new chips();
		ob.display();
		System.out.println("enter the index of your required function");
		int z = sc.nextInt();
		if(z==1) {
			System.out.println("enter the first input");
			int x = sc.nextInt();
			System.out.println("enter the second input");
			int y = sc.nextInt();
			if(x>1 || x<0) {
				System.out.println("enter a valid input");
				return;
			}
			if(y>1 || y<0) {
				System.out.println("enter a valid input");
				return;
				}
			ob.nand(x, y);			
		}
		if(z==2) {
			System.out.println("enter the first input");
			int x = sc.nextInt();
			System.out.println("enter the second input");
			int y = sc.nextInt();
			if(x>1 || x<0) {
				System.out.println("enter a valid input");
				return;
			}
			if(y>1 || y<0) {
				System.out.println("enter a valid input");
				return;
				}
			ob.and(x, y); 
			}
		if(z==3) {
			System.out.println("enter the first input");
			int x = sc.nextInt();
			System.out.println("enter the second input");
			int y = sc.nextInt();
			if(x>1 || x<0) {
				System.out.println("enter a valid input");
				return;
			}
			if(y>1 || y<0) {
				System.out.println("enter a valid input");
				return;
				}
			ob.or(x, y); 
			}
		if(z==4) {
			System.out.println("enter the  input");
			int x = sc.nextInt();
			
			if(x>1 || x<0) {
				System.out.println("enter a valid input");
				return;
			}
			ob.not(x); 
			}
		if(z==5) {
			System.out.println("enter the first input");
			int x = sc.nextInt();
			System.out.println("enter the second input");
			int y = sc.nextInt();
			System.out.println("enter the value of select line");	
			int se = sc.nextInt();
			if(x>1 || x<0) {
				System.out.println("enter a valid input");
				return;
			}
			if(y>1 || y<0) {
				System.out.println("enter a valid input");
				return;
				}
			if(se>1 || se<0) {
				System.out.println("enter a valid input");
				return;
				}
			ob.mux(x, y,se); 
			}
		if(z==6) {
			System.out.println("enter the input");
			int x = sc.nextInt();
			System.out.println("enter the value of select line");
			int se = sc.nextInt();
			if(x>1 || x<0) {
				System.out.println("enter a valid input");
				return;
			}
			if(se>1 || se<0) {
				System.out.println("enter a valid input");
				return;
				}
			ob.dmux(x, se);
		}
		if(z==7) {
			System.out.println("enter the first input");
			int x = sc.nextInt();
			System.out.println("enter the second input");
			int y = sc.nextInt();
			if(x>1 || x<0) {
				System.out.println("enter a valid input");
				return;
			}
			if(y>1 || y<0) {
				System.out.println("enter a valid input");
				return;
				}
			ob.nor(x, y); 
			}
		if(z==8) {
			System.out.println("enter the first input");
			int x = sc.nextInt();
			System.out.println("enter the second input");
			int y = sc.nextInt();
			if(x>1 || x<0) {
				System.out.println("enter a valid input");
				return;
			}
			if(y>1 || y<0) {
				System.out.println("enter a valid input");
				return;
				}
			ob.xor(x, y); 
			}
		if(z==9) {
			System.out.println("enter the first input");
			int x = sc.nextInt();
			System.out.println("enter the second input");
			int y = sc.nextInt();
			if(x>1 || x<0) {
				System.out.println("enter a valid input");
				return;
			}
			if(y>1 || y<0) {
				System.out.println("enter a valid input");
				return;
				}
			ob.xnor(x, y); 
			}
		if(z==10) {
			System.out.println("enter the input");
			int x[] = {0,0,0,0,0,0,0,0};
			for(i=0;i<8;i++) {
				x[i] = sc.nextInt();
				if(x[i]>1 || x[i]<0)
					return;
			}
			ob.and8(x);
		}
		if(z==11) {
			int x[] = {0,0,0,0,0,0,0,0};
			System.out.println("enter the input");
			for(i=0;i<8;i++) {
				x[i] = sc.nextInt();
				if(x[i]>1 || x[i]<0)
					return;
			}
			ob.or8(x);
		}
		if(z==12) {
			int x[] = {0,0,0,0,0,0,0,0};
			int se[] = {0,0,0};
			System.out.println("enter the input");
			for(i=0;i<8;i++) {
				x[i] = sc.nextInt();
				if(x[i]>1 || x[i]<0) {
					System.out.println("enter a valid input");
					return;}
			}
			System.out.println("enter the value of select line");
			for(i=0;i<3;i++) {
				se[i] = sc.nextInt();
				if(se[i]>1 || se[i]<0)
					return;
			}
			ob.mux8(x, se);
		}
		if(z==13) {
			int x;
			int se;
			System.out.println("enter the input value");
			x = sc.nextInt();
			System.out.println("enter the value of select line");
			se = sc.nextInt();
				if(x>1 || x<0)
					return;
				ob.dmux8(x,se);	
			}
			if(z==14) {
				int x[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
				int y[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
				System.out.println("enter the first input");
				for(i=0;i<16;i++) {
					x[i] = sc.nextInt();
					if(x[i]>1 || x[i]<0)
						return;
				}
				System.out.println("enter the second input");
				for(i=0;i<16;i++) {
					y[i] = sc.nextInt();
					if(y[i]>1 || y[i]<0)
						return;
				}
				ob.and16(x, y);
			}
			if(z==15) {
				int x[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
				int y[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
				System.out.println("enter the first input");
				for(i=0;i<16;i++) {
					x[i] = sc.nextInt();
					if(x[i]>1 || x[i]<0)
						return;
				}
				System.out.println("enter the second input");
				for(i=0;i<16;i++) {
					y[i] = sc.nextInt();
					if(y[i]>1 || y[i]<0)
						return;
				}
				ob.or16(x, y);
			}
			if(z==16) {
				int x[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
				System.out.println("enter the input");
				for(i=0;i<16;i++) {
					x[i] = sc.nextInt();
					if(x[i]>1 || x[i]<0)
						return;
				}
				ob.not16(x);
			}
			if(z==17) {
				int x[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
				int y[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
				int se;
				System.out.println("enter the first input");
				for(i=0;i<16;i++) {
					x[i] = sc.nextInt();
					if(x[i]>1 || x[i]<0)
						return;
				}
				System.out.println("enter the second input");
				for(i=0;i<16;i++) {
					y[i] = sc.nextInt();
					if(y[i]>1 || y[i]<0)
						return;
				}
				System.out.println("enter the value of select line");
				se = sc.nextInt();
				if(se>1 || se<0)
					return;
				ob.mux16(x, y,se);
			}
			if(z==18) {
				int x[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
				System.out.println("enter the input");
				for(i=0;i<16;i++) {
					x[i] = sc.nextInt();
					if(x[i]>1 || x[i]<0)
						return;
				}
				System.out.println("enter the value of select line");
				int se = sc.nextInt();	
				ob.dmux16(x, se);
			}
			if(z==19) {
				System.out.println("enter the first input");
				int x = sc.nextInt();
				System.out.println("enter the second input");
				int y = sc.nextInt();
				if(x>1 || x<0) {
					System.out.println("enter a valid input");
					return;
				}
				if(y>1 || y<0) {
					System.out.println("enter a valid input");
					return;
					}
				ob.halfadder(x, y); 
				}
			if(z==20) {
				System.out.println("enter the first input");
				int x = sc.nextInt();
				System.out.println("enter the second input");
				int y = sc.nextInt();
				System.out.println("enter the third input");
				int h = sc.nextInt();
				if(x>1 || x<0) {
					System.out.println("enter a valid input");
					return;
				}
				if(y>1 || y<0) {
					System.out.println("enter a valid input");
					return;
					}
				if(h>1 || h<0) {
					System.out.println("enter a valid input");
					return;
					}
				ob.fulladder(x, y, h); 
				}
			if(z>20)
				System.out.println("enter a valid index number");
		}
	public void display() {
		System.out.println("1.NAND");
		System.out.println("2.AND");
		System.out.println("3.OR");
		System.out.println("4.NOT");
		System.out.println("5.MUX");
		System.out.println("6.DMUX");
		System.out.println("7.NOR");
		System.out.println("8.XOR");
		System.out.println("9.XNOR");
		System.out.println("10.AND 8WAY");
		System.out.println("11.OR 8WAY");
		System.out.println("12.MUX 8WAY");
		System.out.println("13.DMUX 8WAY");
		System.out.println("14.AND 16BIT");
		System.out.println("15.OR 16BIT");
		System.out.println("16.NOT 16BIT");
		System.out.println("17.MUX 16BIT");
		System.out.println("18.DMUX 16BIT");
		System.out.println("19.HALF ADDER");
		System.out.println("20.FULL ADDER");
	}
	public void nand(int a, int b){
		System.out.println("input 1 = "+a);
		System.out.println("input 2 = "+b);
		if(a==1 && b==1)
			System.out.println("output = 0");
		else
			System.out.println("output = 1");
	}
	public void and(int a, int b) {
		System.out.println("input 1 = "+a);
		System.out.println("input 2 = "+b);
		if(a==1 && b==1)
			System.out.println("output = 1");
		else
			System.out.println("output = 0");	
	}
	public void or(int a, int b) {
		System.out.println("input 1 = "+a);
		System.out.println("input 2 = "+b);
		if(a==0 && b==0)
			System.out.println("output = 0");
		else
			System.out.println("output = 1");
	}
	public void not(int a) {
		System.out.println("input = "+a);
		if(a==1)
	     		System.out.println("output = 0");
			else 
				System.out.println("output = 1");	
	}
	public void mux(int a, int b, int sel) {
		System.out.println("input 1 = "+a);
		System.out.println("input 2 = "+b);
		System.out.println("select line = "+sel);
		if(sel==0)
			System.out.println("output = "+a);
		else
			System.out.println("output = "+b);
	}
	public void dmux(int in, int sel) {
		System.out.println("input = "+in);
		System.out.println("select line = "+sel);
		if(sel==0)
			System.out.println("a = "+in+" b = 0");
		else
			System.out.println("a = 0  b = "+in);
	}
	public void nor(int a, int b) {
		System.out.println("input 1 = "+a);
		System.out.println("input 2 = "+b);
		if(a==0 && b==0)
			System.out.println("output = 1");
		else
			System.out.println("output = 0");
	}
	public void xor(int a, int b) {
		System.out.println("input 1 = "+a);
		System.out.println("input 2 = "+b);
		if(a==b)
			System.out.println("output = 0");
		else
			System.out.println("output = 1");	
	}
	public void xnor(int a, int b) {
		System.out.println("input 1 = "+a);
		System.out.println("input 2 = "+b);
		if(a==b)
			System.out.println("output = 1");
		else
			System.out.println("output = 0");	
	}
	public void and8(int a[]) {
		int i;
		System.out.print("input  = ");
		for(i=0;i<8;i++) {
			System.out.print(a[i]);	
		}
		System.out.println("");
		int j=0;
		for(i=0;i<8;i++) {
			if(a[i]==1)
				j++;}
			if(j==8)
				System.out.println("output = 1");
			else
				System.out.println("output = 0");
	}
	public void or8(int a[]) {
		int i;
		System.out.print("input = ");
		for(i=0;i<8;i++) {
			System.out.print(a[i]);
		}
		System.out.println("");
		int j=0;
		for(i=0;i<8;i++) {
			if(a[i]==0)
				j++;
			}
			if(j==8)
				System.out.println("output = 0");
			else
				System.out.println("output = 1");
	}
	public void mux8(int a[], int sel[]) {
		int i;
		System.out.print("input 1 = ");
		for(i=0;i<8;i++) {
			System.out.print(a[i]);
		}
		System.out.println("");
		System.out.print("sel = ");
		for(i=0;i<3;i++) {
			System.out.print(sel[i]);
			System.out.println("");
		}
		 int o1,o2,o3,o4,o5,o6;
		 if(sel[2]==0) {
			 o1=a[0];
			 o2=a[2];
			 o3=a[4];
			 o4=a[6];
		 }else {
			 o1=a[1];
			 o2=a[3];
			 o3=a[5];
			 o4=a[7]; 
		 }
		 if(sel[1]==0) {
			 o5=o1;
			 o6=o3;
		 }else {
			 o5=o2;
			 o6=o4;
		 }
		 if(sel[0]==0)
			 System.out.println("output = "+o5);
		 else
			 System.out.println("output = "+o6);
			 }
	public void dmux8(int in,int sel ) {
		int i;
		int a[] = {0,0,0,0,0,0,0,0};
		System.out.println("input  = "+in);
		System.out.println("select line = "+sel);
		if(sel==000) {
			a[7] = in;
			a[6]=0;
			a[5]=0;
			a[4]=0;
			a[3]=0;
			a[2]=0;
			a[1]=0;
			a[0]=0;
			
		}else if(sel==001) {
			a[7] = 0;
			a[6]=in;
			a[5]=0;
			a[4]=0;
			a[3]=0;
			a[2]=0;
			a[1]=0;
			a[0]=0;
		}else if(sel==010) {
			a[7] = 0;
			a[6]=0;
			a[5]=in;
			a[4]=0;
			a[3]=0;
			a[2]=0;
			a[1]=0;
			a[0]=0;
		}else if(sel==011) {
			a[7]=0;
			a[6]=0;
			a[5]=0;
			a[4]=in;
			a[3]=0;
			a[2]=0;
			a[1]=0;
			a[0]=0;
		}else if(sel==100) {
			a[7] =0;
			a[6]=0;
			a[5]=0;
			a[4]=0;
			a[3]=in;
			a[2]=0;
			a[1]=0;
			a[0]=0;
		}else if(sel==101) {
			a[7] =0;
			a[6]=0;
			a[5]=0;
			a[4]=0;
			a[3]=0;
			a[2]=in;
			a[1]=0;
			a[0]=0;
		}else if(sel==110) {
			a[7] =0;
			a[6]=0;
			a[5]=0;
			a[4]=0;
			a[3]=0;
			a[2]=0;
			a[1]=in;
			a[0]=0;
		}else {
			a[7] = 0;
			a[6]=0;
			a[5]=0;
			a[4]=0;
			a[3]=0;
			a[2]=0;
			a[1]=0;
			a[0]=in;
		}
		System.out.println("output =");
		for(i=0;i<8;i++) {
			System.out.print(a[i]);
		}
		System.out.println("");
				
	}
	public void and16(int a[], int b[]) {
		int i;
		int out[]= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		System.out.println("input 1 =");
		for(i=0; i<16; i++) {
			System.out.print(a[i]);
		}System.out.println("");
		System.out.println("input 2 =");
		for(i=0; i<16; i++) {
			System.out.print(b[i]);
		}System.out.println("");
		for(i=0; i<16;i++) {
			if(a[i]==1 && b[i]==1)
				out[i]=1;
			else
				out[i]=0;
			}
		System.out.println("output =");
		for(i=0; i<16; i++) {
			System.out.print(out[i]);
		}System.out.println("");
	}
	public void or16(int a[], int b[]) {
		int i;
		int out[]= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		System.out.println("input 1 =");
		for(i=0; i<16; i++) {
			System.out.print(a[i]);
		}System.out.println("");
		System.out.println("input 2 =");
		for( i=0; i<16; i++) {
			System.out.print(b[i]);
		}System.out.println("");
		for(i=0; i<16;i++) {
			if(a[i]==0 && b[i]==0)
				out[i]=0;
			else
				out[i]=1;
			}
		System.out.println("output =");
		for(i=0; i<16; i++) {
			System.out.print(out[i]);
		}System.out.println("");
	}
	public void not16(int a[]) {
		int i;
		int out[]= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		System.out.println("input 1 =");
		for( i=0; i<16; i++) {
			System.out.print(a[i]);
		}System.out.println("");
		for(i=0; i<16;i++) {
			if(a[i]==1)
				out[i]=0;
			else
				out[i]=1;
			}
		System.out.println("output =");
		for( i=0; i<16; i++) {
			System.out.print(out[i]);
		}System.out.println("");
	}
	public void mux16(int a[], int b[], int sel) {
		int i;
		int out[]= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		System.out.println("input 1 =");
		for(i=0; i<16; i++) {
			System.out.print(a[i]);
		}System.out.println("");
		System.out.println("input 2 =");
		for(i=0; i<16; i++) {
			System.out.print(b[i]);
		}System.out.println("");
		for(i=0; i<16;i++) {
			if(sel==0)
				out[i]=a[i];
			else
				out[i]=b[i];
			}
		System.out.println("output =");
		for(i=0; i<16; i++) {
			System.out.print(out[i]);
		}System.out.println("");
	}
	public void dmux16(int in[], int sel ) {
		int i;
		int a[]= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int b[]= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		System.out.println("input = ");
		for(i=0;i<16;i++) {
			System.out.print(in[i]);
		}System.out.println("  ");
		for(i=0;i<16;i++) {
			if(sel==0)
				a[i]=in[i];
			else 
				b[i]=in[i];
		}
		System.out.println("a[] = ");
		for(i=0;i<16;i++) {
			System.out.print(a[i]);
		}System.out.println(" ");
		System.out.println("b[] = ");
		for(i=0; i<16; i++) {
			System.out.print(b[i]);
		}System.out.println(" ");
			}
	public void halfadder(int a, int b) {
		int s,sum,carry;
		System.out.println("input 1 = "+a);
		System.out.println("input 2 = "+b);
		s = a+b;
		if(s==0) {
			sum = 0;
			carry = 0;}
		else if(s==1) {
			sum = 1;
			carry = 0;}
		else {
			carry = 1;
			sum = 0;}
		System.out.println("sum = "+sum);
		System.out.println("carry = "+carry);
	}
	public void fulladder(int a, int b, int c) {
		int s,sum,carry;
		System.out.println("input 1 = "+a);
		System.out.println("input 2 = "+b);
		System.out.println("input 3 = "+c);
		s = a + b + c;
		if(s==0) {
			sum = 0;
			carry = 0;
		}else if(s==1) {
			sum = 1;
			carry = 0;
		}else {
			sum = 1;
			carry = 1;
		}
		System.out.println("sum = "+sum);
		System.out.println("carry = "+carry);
	}
}

	
	


