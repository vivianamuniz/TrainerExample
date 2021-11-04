package MyPackage;

public class MyThing {
//Primitive Data Types	
//Whole Numbers
int myWholeNumber; //Short for 'integer', 32 bits, whole numbers only
short mySmallNumber = 5; //Half of an int 16 bits
long myBigNumber; //Twice as large as an int 64 bits
byte myByte = 1; //Half of a short 8 bits

//Decimal Numbers
float myDecimal = 1.05f; //'Floating Point' or decimal number, 64 bits, Notoriously inaccurate
double myMorePreciseDecimal = 1.06; // 128 bits, double precision decimal number

//True / False 
boolean myTrueOrFalse; // 1 byte or 8 bits

//Character
char myCharacter; // 16 bits, stores ASCCI

//Reference -holds memory address of some object
Object o; //References are 32 bits on a x86

//My first method
public void PrintMyValues() {
	System.out.println ("My values are: " + myByte + ", " + mySmallNumber + ", " + myDecimal);
}
}
