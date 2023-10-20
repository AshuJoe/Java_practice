package core;
import java.time.LocalDate;
public class Customer {
/*1. Customer class (core class)
	state  : customer id(int) ,first name, last name (string),email(string),password(string),registrationAmount(double),dob(LocalDate),plan(ServicePlan : enum)
	idGenerator : static 
	Must generate customer ids automatically : auto increment)
	PK(UID) : email*/
	
	private String firstname;
	private String lastname;
	private String Password;
	private String email;
	double regamount;
	public static int id=100;
	Serviceplan plan;
	LocalDate date;
	public Customer(int id,String fn,String ln,String email,String password,double regamount,Serviceplan plan,LocalDate dob) {
		this.firstname=fn;
		this.lastname=ln;
		this.email=email;
		Password=password;
		this.regamount=regamount;
		this.date=dob;
		this.plan=plan;
	}
	public Customer(String email) {
		super();
		this.email=email;
	}
	public Customer(String email,String password) {
		super();
		this.email=email;
		this.Password=password;
	}
	@Override
	public String toString() {
	return "Hello "+this.firstname+this.lastname+"with id no. "+id;
	}
	public void setpassword(String password) {
		this.Password=password;
	}
//	public int idgenerator(){
//		id++;
//		return id;
//	}
	
}
