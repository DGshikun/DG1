//学生类
public class Student {
	//属性
	String stuName;
	int stuAge;
	String stuMajor;//专业
		
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getStuAge() {
		return stuAge;
	}
	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}
	public String getStuMajor() {
		return stuMajor;
	}
	public void setStuMajor(String stuMajor) {
		this.stuMajor = stuMajor;
	}
	//获得学生信息的方法
	void getStuInfo(String name,int age,String major){
		stuName=name;
		stuAge=age;
		stuMajor=major;
	}
	//打印学生信息的方法
	void printInfo(){
		System.out.println("姓名:"+stuName);
		System.out.println("年龄："+stuAge);
		System.out.println("专业："+stuMajor);
	}
	//main方法
	public static void main(String[] args) {
		//实例化一个学生的对象
		Student stu1=new Student();
		stu1.getStuInfo("李红", 20, "软件工程");
		stu1.printInfo();
		
		System.out.println("==================");
		//实例化第二个学生的对象
		Student stu2=new Student();
		stu2.getStuInfo("杨威", 30, "软件工程");
		stu2.printInfo();
		
		System.out.println("==================");
		Student stu3=new Student();
		stu3.setStuName("李宁");
		stu3.setStuAge(56);
		stu3.setStuMajor("体操");
		System.out.println("姓名："+stu3.getStuName());
		System.out.println("年龄："+stu3.getStuAge());
		System.out.println("专业："+stu3.getStuMajor());
	}
}
