package Enumeration_;
import java.util.Arrays;

public class Enumeration_2 {
	public enum BookType{
		SCIENCE/*(��ѧ)*/,MEDICINE/*(ҽҩ)*/,LITERATURE/*(��ѧ)*/,FOODCOOKING/*(��ʳ)*/,MAGAZINE/*(��־)*/;
	}
	public enum Press{
		�廪��ѧ������,������ѧ������,���ӹ�ҵ������,��е��ҵ������,��־�ڿ�������
	}
	public enum Sex{
		��,Ů
	}

	class Book{
		String bookName;//ͼ����
		Press press;//������
		BookType bookType;//ͼ������
		Book(){ }
		Book(String bookName,Press press,BookType bookType){
			this.bookName=bookName;
			this.press=press;
			this.bookType=bookType;
		}
		void printBookInfo(){
			String borrow = null;
			String index;
				
			switch(bookType) {
				case SCIENCE:
					borrow = "��ѧ";break;
				case MEDICINE:
					borrow = "ҽҩ";break;
				case LITERATURE:
					borrow = "��ѧ";break;
				case FOODCOOKING:
					borrow = "��ʳ";break;
				case MAGAZINE:
					borrow = "��־";break;
			}
			if (bookType == BookType.MAGAZINE) {
				index = "�������";
			}else {
				index = "�������";
			}
			System.out.println(bookName+"\t"+press+"\t"+borrow+"\t"+index+"\t"+bookType.toString());
		}//��ӡͼ����Ϣ
	}
	class Reader{
		String ReaderName;
		Sex sex;
		Book[] books;
		Reader(){}
		Reader(String ReaderName,Sex sex,Book[] books){
			this.ReaderName=ReaderName;
			this.sex=sex;
			this.books = Arrays.copyOf(books, books.length);
		}
		void printBorrowInfo(){
			System.out.println("��������:"+ReaderName+" �Ա�:"+sex+"  �ö��ߵĽ�����Ϣ����:");
			System.out.println("ͼ������:\t������\t���� \tͼ������");
			System.out.println("=======================================");
			for(Book b:books) {
				b.printBookInfo();
			}
			System.out.println("***************************************");
		}//��ӡ�ö��ߵĽ�����Ϣ
	}
 
	public static void main (String[]args){
		// instance books
		Book bookData = new Enumeration_2().new Book(
				"���ݿ�ԭ��", Press.�廪��ѧ������, BookType.SCIENCE);
		Book bookMedic = new Enumeration_2().new Book(
				"ҽѧ������", Press.������ѧ������, BookType.MEDICINE);
		Book bookLiter = new Enumeration_2().new Book(
				"ƽ��������", Press.���ӹ�ҵ������, BookType.LITERATURE);
		Book bookFood = new Enumeration_2().new Book(
				"��ʳ�뽡��", Press.��е��ҵ������, BookType.FOODCOOKING);
		Book bookComputbase = new Enumeration_2().new Book(
				"���������", Press.������ѧ������, BookType.SCIENCE);
		Book bookComputScien = new Enumeration_2().new Book(
				"�������ѧ", Press.��־�ڿ�������, BookType.MAGAZINE);
		// instance readers
		Reader liHong = new Enumeration_2().new Reader(
				"���", Sex.Ů, new Book[] {bookData,bookMedic,bookLiter});
		Reader xiaoMing = new Enumeration_2().new Reader(
				"Ф��", Sex.��, new Book[] {bookFood,bookComputbase,bookComputScien});
		
		// show
		liHong.printBorrowInfo();
		xiaoMing.printBorrowInfo();
		
		
	}
}
