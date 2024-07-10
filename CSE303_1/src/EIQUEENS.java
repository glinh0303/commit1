import java.io.*;
import java.util.*;;

public class EIQUEENS {

	public static void main(String[] args) {
		Queen[] queens = new Queen[8];
		int count = 0;
		for (int i = 0; i < 8; i++) {
			String input = ns();
			Queen queen;
			for (int j = 0; j < input.length(); j++) {
				Character c = input.charAt(j);
				if (c.equals('*')) {
					count++;
					queen = new Queen(i, j);
					queens[i] = queen;
				}
			}
		}

		String output = "valid";
		if (count < 8) {
			output = "invalid";
		} else {
			for (int i = 0; i < queens.length - 1; i++) {
				for (int j = i + 1; j < queens.length; j++) {
					if (queens[i].row == queens[j].row) {
						output = "invalid";
						break;
					}
					if (queens[i].col == queens[j].col) {
						output = "invalid";
						break;
					}
					if (Math.abs(queens[i].row - queens[j].row) == Math.abs(queens[i].col - queens[j].col)) {
						output = "invalid";
						break;
					}
				}
			}
		}
		System.out.println(output);
	}

	static class Queen {
		public int row;
		public int col;

		public Queen(int row, int col) {
			this.col = col;
			this.row = row;
		}
	}

	static InputStream is = System.in;
	static byte[] inbuf = new byte[1 << 24];
	static int lenbuf = 0, ptrbuf = 0;

	static int readByte() {
		if (lenbuf == -1)
			throw new InputMismatchException();
		if (ptrbuf >= lenbuf) {
			ptrbuf = 0;
			try {
				lenbuf = is.read(inbuf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (lenbuf <= 0)
				return -1;
		}
		return inbuf[ptrbuf++];
	}

	static boolean isSpaceChar(int c) {
		return !(c >= 33 && c <= 126);
	}

	static int skip() {
		int b;
		while ((b = readByte()) != -1 && isSpaceChar(b))
			;
		return b;
	}

	static double nd() {
		return Double.parseDouble(ns());
	}

	static char nc() {
		return (char) skip();
	}

	static String ns() {
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while (!(isSpaceChar(b))) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	static char[] ns(int n) {
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while (p < n && !(isSpaceChar(b))) {
			buf[p++] = (char) b;
			b = readByte();
		}
		return n == p ? buf : Arrays.copyOf(buf, p);
	}

	static int ni() {
		int num = 0, b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		while (true) {
			if (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
			} else {
				return minus ? -num : num;
			}
			b = readByte();
		}
	}

	static long nl() {
		long num = 0;
		int b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		while (true) {
			if (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
			} else {
				return minus ? -num : num;
			}
			b = readByte();
		}
	}

}
