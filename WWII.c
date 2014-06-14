#include <stdio.h>
enum alph{A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z};
char code[] = "reddit";
char key[] = "todayismybirthday";

int tt;
int pp;
int keyVal;
int codeVal;
int deCode;
int keySize = sizeof(key);
int codeSize = sizeof(code);

int main(int argc, char **argv)
{
	printChar(code, key);
	return 0;
}

void printChar(char msgKey[], char msgCode[]){
	
	for(tt = 0, pp = 0; tt < keySize; ++tt, pp++)
	{
		if(pp == (codeSize - 1)){
			pp = 0;
		}
		switch (msgKey[pp])
		{
			case 'a': keyVal = A;break;
			case 'b': keyVal = B;break;
			case 'c': keyVal = C;break;
			case 'd': keyVal = D;break;
			case 'e': keyVal = E;break;
			case 'f': keyVal = F;break;
			case 'g': keyVal = G;break;
			case 'h': keyVal = H;break;
			case 'i': keyVal = I;break;
			case 'j': keyVal = J;break;
			case 'k': keyVal = K;break;
			case 'l': keyVal = L;break;
			case 'm': keyVal = M;break;
			case 'n': keyVal = N;break;
			case 'o': keyVal = O;break;
			case 'p': keyVal = P;break;
			case 'q': keyVal = Q;break;
			case 'r': keyVal = R;break;
			case 's': keyVal = S;break;
			case 't': keyVal = T;break;
			case 'u': keyVal = U;break;
			case 'v': keyVal = V;break;
			case 'w': keyVal = W;break;
			case 'x': keyVal = X;break;
			case 'y': keyVal = Y;break;
			case 'z': keyVal = Z;break;
		}
		//printf(" %d+", keyVal);

		switch (msgCode[tt])
		{
			case 'a': codeVal = A;break;
			case 'b': codeVal = B;break;
			case 'c': codeVal = C;break;
			case 'd': codeVal = D;break;
			case 'e': codeVal = E;break;
			case 'f': codeVal = F;break;
			case 'g': codeVal = G;break;
			case 'h': codeVal = H;break;
			case 'i': codeVal = I;break;
			case 'j': codeVal = J;break;
			case 'k': codeVal = K;break;
			case 'l': codeVal = L;break;
			case 'm': codeVal = M;break;
			case 'n': codeVal = N;break;
			case 'o': codeVal = O;break;
			case 'p': codeVal = P;break;
			case 'q': codeVal = Q;break;
			case 'r': codeVal = R;break;
			case 's': codeVal = S;break;
			case 't': codeVal = T;break;
			case 'u': codeVal = U;break;
			case 'v': codeVal = V;break;
			case 'w': codeVal = W;break;
			case 'x': codeVal = X;break;
			case 'y': codeVal = Y;break;
			case 'z': codeVal = Z;break;
		}
		//printf("%d", codeVal);
		deCode = (keyVal + codeVal) % 26;
		//printf("=%d: ", deCode);
		switch (deCode)
		{
			case A: printf("%c", 'a');break;
			case B: printf("%c", 'b');break;
			case C: printf("%c", 'c');break;
			case D: printf("%c", 'd');break;
			case E: printf("%c", 'e');break;
			case F: printf("%c", 'f');break;
			case G: printf("%c", 'g');break;
			case H: printf("%c", 'h');break;
			case I: printf("%c", 'i');break;
			case J: printf("%c", 'j');break;
			case K: printf("%c", 'k');break;
			case L: printf("%c", 'l');break;
			case M: printf("%c", 'm');break;
			case N: printf("%c", 'n');break;
			case O: printf("%c", 'o');break;
			case P: printf("%c", 'p');break;
			case Q: printf("%c", 'q');break;
			case R: printf("%c", 'r');break;
			case S: printf("%c", 's');break;
			case T: printf("%c", 't');break;
			case U: printf("%c", 'u');break;
			case V: printf("%c", 'v');break;
			case W: printf("%c", 'w');break;
			case X: printf("%c", 'x');break;
			case Y: printf("%c", 'y');break;
			case Z: printf("%c", 'z');break;
		}
	}	
}
