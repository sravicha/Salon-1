/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Date;
/**
 *
 * @author Felipe
 */
public class Financial_Data extends Financial{
    private float financialBuildingTotal, financialEmployeeTotal, financialSupplierTotal;
    private float monthBalance, monthExpense, monthIncome;
    private float monthPaymentType[] = new float[3];
    
    Financial_Data(){
        Date a, b;
        a = getStartMonthDay();
        b = getLastMonthDay();
        Date minDateIncome = DatabaseManager.getMinDate("FINANCIAL_SALES", "DATE");
        Date maxDateIncome = DatabaseManager.getMaxDate("FINANCIAL_SALES", "DATE");

        monthIncome = calculePeriodIncome(a,b);
        financialBuildingTotal = calculePeriodExpense("FINANCIAL_BUILDING", a, b);
        financialEmployeeTotal = calculePeriodExpense("FINANCIAL_EMPLOYEE", a, b);
        financialSupplierTotal = calculePeriodExpense("FINANCIAL_SUPPLIER", a, b);
        monthExpense = financialBuildingTotal + financialEmployeeTotal + financialSupplierTotal;
        
        monthBalance = monthIncome - monthExpense;
        monthPaymentType[0]= DatabaseManager.getValueCategory("FINANCIAL_SALES", "VALUE", "PAYMENT_TYPE", "CREDIT CARD", a, b);
        monthPaymentType[1]= DatabaseManager.getValueCategory("FINANCIAL_SALES", "VALUE", "PAYMENT_TYPE", "DEBIT CARD", a, b);
        monthPaymentType[2]= DatabaseManager.getValueCategory("FINANCIAL_SALES", "VALUE", "PAYMENT_TYPE", "CASH", a, b);
        
    }
    //GETTER's SETTER's
    public void setStartPeriod(Date startPeriod) {
        Date startPeriod1 = startPeriod;
    }
    public void setEndPeriod(Date endPeriod) {
        Date endPeriod1 = endPeriod;
    }
    public float getMonthIncome() {
        return monthIncome;
    }
    public float getMonthExpense() {
        return monthExpense;
    }
    public float getMonthBalance(){
        return monthBalance;
    }
    
    ///////////////////////////////////////////////////////////////////////////
    /////                             PUBLICS                         
    ///////////////////////////////////////////////////////////////////////////
    
    //MONTH - EXPENSES - PERCENTAGE
    public float getPercentageMonthBuilding(){
        float aux = financialBuildingTotal * 100;
        return (aux/monthExpense);
    }
    public float getPercentageMonthEmployee(){
        float aux = financialEmployeeTotal * 100;
        return (aux/monthExpense);
    }
    public float getPercentageMonthSupplier(){
        float aux = financialSupplierTotal * 100;
        return (aux/monthExpense);
    }
    
    //MONTH - INCOME - VALUE
    public float getPercentageMonthCreditIncome(){
        float aux = monthPaymentType[0] * 100;
        return (aux/monthIncome);
    }
    public float getPercentageMonthDebitIncome(){
        float aux = monthPaymentType[1] * 100;
        return (aux/monthIncome);
    }
    public float getPercentageMonthCashIncome(){
        float aux = monthPaymentType[2] * 100;
        return (aux/monthIncome);
    }
    
    
    
    
    //PERIOD
    public float getPercentagePeriodBuilding(){
        return 0;
    }
    

    
    ///////////////////////////////////////////////////////////////////////////
    /////                             AUX
    ///////////////////////////////////////////////////////////////////////////
    
    private Date getStartMonthDay(){
        Date a = getTodaysDate();
        return makeDate(1, a.getMonth()+1, a.getYear()+1900);
    }
    
    private Date getLastMonthDay(){
        Date a = getTodaysDate();
        Date aux;
        long aux2;
        Date end=getTodaysDate(); 
        if (a.getMonth()<10){
            aux = makeDate(1, a.getMonth()+2, a.getYear()+1900);
        }else{
            aux = makeDate(1, 1, a.getYear()+1901);
        }
        aux2 = aux.getTime() - 86400;
        end.setTime(aux2);
        return end;
    }
   
    private float calculePeriodIncome(Date start, Date end){
        System.out.println("Primeiro dia do mes: "+start.toString()+ " || Ultimo dia do mes: " + end.toString());
        float result = DatabaseManager.ValuePeriod("FINANCIAL_SALES", "DATE", "VALUE" , start, end);
        System.out.println(result);
        return result;
    }
    
    private float calculePeriodExpense(String table, Date start, Date end){
        System.out.println("Primeiro dia do mes: "+start.toString()+ " || Ultimo dia do mes: " + end.toString());
        float result = DatabaseManager.ValuePeriod(table, "DATE_PAYMENT", "VALUE_TOTAL" , start, end);
        System.out.println(result);
        return result;
    }

    
}
