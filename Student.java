//ѧ����
public class Student {
	//����
	String stuName;
	int stuAge;
	String stuMajor;//רҵ
		
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
	//���ѧ����Ϣ�ķ���
	void getStuInfo(String name,int age,String major){
		stuName=name;
		stuAge=age;
		stuMajor=major;
	}
	//��ӡѧ����Ϣ�ķ���
	void printInfo(){
		System.out.println("����:"+stuName);
		System.out.println("���䣺"+stuAge);
		System.out.println("רҵ��"+stuMajor);
	}
	//main����
	public static void main(String[] args) {
		//ʵ����һ��ѧ���Ķ���
		Student stu1=new Student();
		stu1.getStuInfo("���", 20, "�������");
		stu1.printInfo();
		
		System.out.println("==================");
		//ʵ�����ڶ���ѧ���Ķ���
		Student stu2=new Student();
		stu2.getStuInfo("����", 30, "�������");
		stu2.printInfo();
		
		System.out.println("==================");
		Student stu3=new Student();
		stu3.setStuName("����");
		stu3.setStuAge(56);
		stu3.setStuMajor("���");
		System.out.println("������"+stu3.getStuName());
		System.out.println("���䣺"+stu3.getStuAge());
		System.out.println("רҵ��"+stu3.getStuMajor());
		1234567
	}
}
