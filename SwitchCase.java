public class EmployeeWageBuild {
	
	public static final  int salaryPerHour=20,partTime=1,fullTime=2;
	
		   public static void main(String[] args) {
			    System.out.println("Welcome to Salary Calculator on Master branch"); 
			   
			   int empHours=0,empWageDaily=0;
			    
			  int empCheck = (int)Math.floor(Math.random() *10 )% 3;
			  
			  switch(empCheck) {
			  
			      case partTime:
				  System.out.println("Employee is Present Part Time");
				  empHours=4;
				  break;
				  
			      case fullTime:
			    	  System.out.println("Employee is Present Full Time");
			    	  empHours=8;
			    	  break;
			    	  
			      default:
			    	  System.out.println("Employee is Absent");
			    	  empHours=0;
			    	  
			  }
			    	  
			    
		
			  empWageDaily = empHours*salaryPerHour;
			  System.out.println("Daily Wage Of Employee is: " + empWageDaily);
			  
			  
			  
		
		  }
				           			    

	}