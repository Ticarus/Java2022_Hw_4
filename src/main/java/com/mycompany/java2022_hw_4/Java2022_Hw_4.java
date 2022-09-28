package com.mycompany.java2022_hw_4;

public class Java2022_Hw_4 {

    public static void main(String[] args) {
        jl_37();
    }
    
    /*Java Lesson #no = jl_1
    I was already using methods so I skipped 24
    */
    
    public static void jl_25(){
        String message = giveCity();
        int num = sum(21, 42);
        System.out.println(message + "\n" + num);
    }
    
    public static void add(){
        System.out.println("Added");
    }
    
    public static void delete(){
        System.out.println("Deleted");
    }
    
    public static void update(){
        System.out.println("Updated");
    }
    
    public static int sum(int num1, int num2){
        return (num1 + num2);
    }
    
    public static String giveCity(){
        return "Ankara";
    }
    
//------------------------------------------------------------------------------
    
    public static void jl_26(){
        int sum = sum2(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(sum);
        
        System.out.println(sum2(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }
    
    public static int sum2(int... nums){
        int sum = 0;
        for(int num : nums)
        {
            sum += num;
        }
        return sum;
    }
    
    //--------------------------------------------------------------------------
    
    public static void jl_28(){
        CustomerManager customerManager = new CustomerManager();
        
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();
    }
    
    //--------------------------------------------------------------------------
    
    public static void jl_29(){
        //Primitives are value type
        int num1 = 10;
        int num2 = 20;
        num2 = num1;
        num1 = 30;
        System.out.println(num2);
        
        //Arrays are reference type
        int[] nums1 = new int[]{1, 2, 3};
        int[] nums2 = new int[]{4, 5, 6};
        nums2 = nums1;
        nums1[0] = 10;
        System.out.println(nums2[0]);
    }
    
    //--------------------------------------------------------------------------
    
    public static void jl_30(){
        BasicCalculator basicCalculator = new BasicCalculator();
        int sumResult = basicCalculator.Sum(1, 2);
        int subResult = basicCalculator.Substract(2, 1);
        int multResult = basicCalculator.Multiply(2, 2);
        int divResult = basicCalculator.Division(4, 2);
        
        System.out.println(sumResult + "\n" + subResult + "\n" + multResult + "\n" + divResult);
    }
    
    //--------------------------------------------------------------------------
    
    public static void jl_31(){
        //From java lesson 31 to 34
        
        //This is overloading 
        Product product = new Product(1, "Laptop", "Lenovo Laptop", 5000, 3, "Black");
        
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Lenovo Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);
        
        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getCode());
    }
    
    //--------------------------------------------------------------------------
    
    public static void jl_35(){
        BasicCalculator basicCalculator = new BasicCalculator();
        
        /*Using method overloading, doesn't matter if the names are same as long as parameter signutare
        is different
        */
        System.out.println(basicCalculator.Sum(1, 2));
        System.out.println(basicCalculator.Sum(1, 2, 3));
    }
    
    //--------------------------------------------------------------------------
    
    public static void jl_36(){
        Customer customer= new Customer();
        Employee employee = new Employee();
        
        customer.age = 25;
        customer.email = "smthng1@gmail.com";
        
        employee.age = 30;
        employee.salary = 20000;
        
        CustomerManager customerManager = new CustomerManager();
        customerManager.Add();
        customerManager.Update();
        
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.Add();
        employeeManager.EmployeeOfTheMonth();
    }
    
    //--------------------------------------------------------------------------
    
    public static void jl_37(){
        //TeachersCreditManager teachersCreditManager = new TeachersCreditManager();
        //teachersCreditManager.Calculate();
        
        CreditUI creditUI = new CreditUI();
        //creditUI.CalculateCredit(teachersCreditManager);  Use this if the class is initialized
        creditUI.CalculateCredit(new TeachersCreditManager());
        /*Because BaseCreditManager is the parent of both TeachersCreditManager and 
        AgriculturalCreditManager it could hold their reference too
        */
        creditUI.CalculateCredit(new SoldiersCreditManager());
    }
}