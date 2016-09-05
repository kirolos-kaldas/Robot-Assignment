import java.util.Scanner;


public class RobotTest
{

	   final static String [] STAGE_B_CONFIG = {"734561"};
	   final static String [] STAGE_C_TEST_1_CONFIG = {"222222", "2111"};
	   final static String [] STAGE_C_TEST_2_CONFIG = {"444444", "1222"};
	   final static String [] STAGE_C_TEST_3_CONFIG = {"676767", "1233"};
	   final static String [] STAGE_C_TEST_4_CONFIG = {"734561", "231231"};
	   
	   final static Scanner sc = new Scanner(System.in);
	         
	   public static void main(String[] args)
	   {
	      
	                    
	      int response;

	      
	      do
	      {
	        printMenu();
	         
	         System.out.print("Enter selection: ");
	         while (!sc.hasNextInt()) {

	        	 printMenu();
	             sc.next(); // this is important!
	         }
	         response = sc.nextInt();
	         
	         
	         
	         System.out.println();
	         
	         
	         switch (Integer.valueOf(response))
	         {

	            case 1:
	               runStageATest();
	               break;
	               
	            case 2:
	               runStageBTest();
	               break;
	               
	            case 3:
	               runStageCTest1();
	               break;
	               
	            case 4:
	               runStageCTest2();
	               break;
	               
	            case 5:
	               runStageCTest3();
	               break;
	               
	            case 6:
	               runStageCTest4();
	               break;
	               
	            case 7:
	               runCustomTest();
	               break;
	               
	            case 8:
	               runAllTests();
	               break;

	            case 9:
	               break;

	            default:
	               System.out.println("Error - invalid selection!");
	         }
	         System.out.println();
	         
	      } while (response != 0);
   }
   
   public static void runStageATest()
   {
      System.out.println("Running Stage A Test - bars = 777777, blocks = 3333 (default bar / block config)");
      Robot.main(new String[0]);
   }
   
   public static void runStageBTest()
   {
      System.out.println("Running Stage B Test - bars = 734561, blocks = 3333 (default block config)");
      Robot.main(STAGE_B_CONFIG);
   }
   
   public static void runStageCTest1()
   {
      System.out.println("Running Stage C Test 1 - bars = 222222, blocks = 2111");
      System.out.println("Minimum move count: 98)");
      Robot.main(STAGE_C_TEST_1_CONFIG);
   }
   
   public static void runStageCTest2()
   {
      System.out.println("Running Stage C Test 2 - bars = 444444, blocks = 1222");
      System.out.println("Minimum move count: 112)");
      Robot.main(STAGE_C_TEST_2_CONFIG);
   }
   
   public static void runStageCTest3()
   {
      System.out.println("Running Stage C Test 3 - bars = 676767, blocks = 1233");
      System.out.println("Minimum move count: 148)");
      Robot.main(STAGE_C_TEST_3_CONFIG);
   }
   
   public static void runStageCTest4()
   {
      System.out.println("Running Stage C Test 4 - bars = 734561, blocks = 231231");
      System.out.println("Minimum move count: 224)");
      Robot.main(STAGE_C_TEST_4_CONFIG);
   }
   
   public static void runCustomTest()
   {
      System.out.print("Running custom test - please enter bar and block heights below: ");
      Scanner scCustom = new Scanner(System.in);
      String configInput = scCustom.nextLine();
      System.out.println();
      
      String [] configArgs = configInput.split(" ");
      System.out.println("Running robot with config bars = " + 
                         (configArgs[0].length() == 0 ? "{7,7,7,7,7,7} (default)" : configArgs[0]) +
                         ", blocks: " +
                         (configArgs.length == 1 ? "{3,3,3,3} (default)" : configArgs[1]));
      System.out.println();
      
      
      Robot.main(configArgs);
   }
   
   public static void runAllTests()
   {
      System.out.println("Running all tests - hit enter after each test is complete to contine:");
      System.out.println();
      
      runStageATest();
      
      System.out.println();

      runStageBTest();

      System.out.println();

      runStageCTest1();

      System.out.println();

      runStageCTest2();

      System.out.println();

      runStageCTest3();

      System.out.println();

      runStageCTest4();

      System.out.println();
     
   }
   
   public static void printMenu()
   {
	   System.out.println("************************** ROBOT TEST HARNESS MENU **************************");
       System.out.println();
       
       System.out.println("1. Stage A Test 1 - bars = 777777, blocks = 3333 (default bar / block config)\n");
       System.out.println("2. Stage B Test 1 - bars = 734561, blocks = 3333 (default block config)\n");
       System.out.println("3. Stage C Test 1 - bars = 222222, blocks = 2111\n");
       System.out.println("4. Stage A Test 2 - bars = 444444, blocks = 1222\n");
       System.out.println("5. Stage C Test 1 - bars = 676767, blocks = 1233\n");
       System.out.println("6. Stage C Test 2 - bars = 734561, blocks = 231231\n");
       System.out.println("7. Stage C Test Custom (user supplies bar / block config)\n");
       System.out.println("8. Run All Tests (1 - 6)\n");
       
       System.out.println("0. Exit Test Harness\n");
       System.out.println();
   }
}
