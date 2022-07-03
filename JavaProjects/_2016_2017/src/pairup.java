import java.io.*;
import java.util.*;

public class pairup {
	static Reader s;
	static int N, num;
	static pair[] milk;
	static long ans;
	static PrintWriter out;
	static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;
 
        public Reader()
        {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
 
        public Reader(String file_name) throws IOException
        {
            din = new DataInputStream(
                new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
 
        public String readLine() throws IOException
        {
            byte[] buf = new byte[64]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1) {
                if (c == '\n') {
                    if (cnt != 0) {
                        break;
                    }
                    else {
                        continue;
                    }
                }
                buf[cnt++] = (byte)c;
            }
            return new String(buf, 0, cnt);
        }
 
        public int nextInt() throws IOException
        {
            int ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
 
            if (neg)
                return -ret;
            return ret;
        }
 
        public long nextLong() throws IOException
        {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }
 
        public double nextDouble() throws IOException
        {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
 
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
 
            if (c == '.') {
                while ((c = read()) >= '0' && c <= '9') {
                    ret += (c - '0') / (div *= 10);
                }
            }
 
            if (neg)
                return -ret;
            return ret;
        }
 
        private void fillBuffer() throws IOException
        {
            bytesRead = din.read(buffer, bufferPointer = 0,
                                 BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }
 
        private byte read() throws IOException
        {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }
 
        public void close() throws IOException
        {
            if (din == null)
                return;
            din.close();
        }
    }
	public static void main(String[] args) throws IOException {
		s = new Reader("pairup.in");
		out = new PrintWriter(new File("pairup.out"));
		init();
		solve();
		out.close();
	}
	public static void init() throws IOException {
		N = s.nextInt();
		num = 0;
		milk = new pair[N];
		for(int i = 0; i < N; i++) {
			milk[i] = new pair(s.nextInt(), s.nextInt());
		}
		Arrays.sort(milk);
		//System.out.println(milk);
	}
	public static void solve() {
		int lcow = N-1;
		int ans = 0;
		for(int i = 0; i < N/2; i++) {
			 int n1 = milk[i].a;
			 int n2 = milk[lcow].a;
			 int n3 = 0;
			 ans = Math.max(ans, milk[i].b + milk[lcow].b);
			 if(n1 == n2) {
				 lcow--;
				 
			 } else if(n1 > n2) {
				 milk[i].a -= n2;
				 i--;
				 lcow--;
			 } else if(n2 > n1) {
				 milk[lcow].a -= n1;
				 
			 }
		}
		out.println(ans);
	}
	static class pair implements Comparable<pair> {
		int a, b;
		public pair(int x, int y) {
			a = x;
			b = y;
		}
		@Override
		public int compareTo(pair o) {
			return b - o.b;
		}
		public String toString() {
			return a+ " " + b;
		}
		
	}
}
