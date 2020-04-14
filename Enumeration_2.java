package Enumeration_;
import java.util.Arrays;

public class Enumeration_2 {
	public enum BookType{
		SCIENCE/*(科学)*/,MEDICINE/*(医药)*/,LITERATURE/*(文学)*/,FOODCOOKING/*(饮食)*/,MAGAZINE/*(杂志)*/;
	}
	public enum Press{
		清华大学出版社,北京大学出版社,电子工业出版社,机械工业出版社,杂志期刊主办商
	}
	public enum Sex{
		男,女
	}

	class Book{
		String bookName;//图书名
		Press press;//出版社
		BookType bookType;//图书类型
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
					borrow = "科学";break;
				case MEDICINE:
					borrow = "医药";break;
				case LITERATURE:
					borrow = "文学";break;
				case FOODCOOKING:
					borrow = "饮食";break;
				case MAGAZINE:
					borrow = "杂志";break;
			}
			if (bookType == BookType.MAGAZINE) {
				index = "不能租借";
			}else {
				index = "办理借阅";
			}
			System.out.println(bookName+"\t"+press+"\t"+borrow+"\t"+index+"\t"+bookType.toString());
		}//打印图书信息
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
			System.out.println("读者姓名:"+ReaderName+" 性别:"+sex+"  该读者的借阅信息如下:");
			System.out.println("图书名称:\t出版社\t借阅 \t图书类型");
			System.out.println("=======================================");
			for(Book b:books) {
				b.printBookInfo();
			}
			System.out.println("***************************************");
		}//打印该读者的借阅信息
	}
 
	public static void main (String[]args){
		// instance books
		Book bookData = new Enumeration_2().new Book(
				"数据库原理", Press.清华大学出版社, BookType.SCIENCE);
		Book bookMedic = new Enumeration_2().new Book(
				"医学与美容", Press.北京大学出版社, BookType.MEDICINE);
		Book bookLiter = new Enumeration_2().new Book(
				"平凡的世界", Press.电子工业出版社, BookType.LITERATURE);
		Book bookFood = new Enumeration_2().new Book(
				"饮食与健康", Press.机械工业出版社, BookType.FOODCOOKING);
		Book bookComputbase = new Enumeration_2().new Book(
				"计算机基础", Press.北京大学出版社, BookType.SCIENCE);
		Book bookComputScien = new Enumeration_2().new Book(
				"计算机科学", Press.杂志期刊主办商, BookType.MAGAZINE);
		// instance readers
		Reader liHong = new Enumeration_2().new Reader(
				"李红", Sex.女, new Book[] {bookData,bookMedic,bookLiter});
		Reader xiaoMing = new Enumeration_2().new Reader(
				"肖明", Sex.男, new Book[] {bookFood,bookComputbase,bookComputScien});
		
		// show
		liHong.printBorrowInfo();
		xiaoMing.printBorrowInfo();
		
		
	}
}
