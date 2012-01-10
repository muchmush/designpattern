package strategy;

/**
 * Created by IntelliJ IDEA.
 * User: m_arino
 * Date: 12/01/10
 * Time: 17:31
 * To change this template use File | Settings | File Templates.
 */
public class TaskController {

    public void process() {
        CalcTax myTax;
        myTax = getTaxRulesForCountry();
        SalesOrder mySO = new SalesOrder();
        mySO.process(myTax);
    }
    
    private CalcTax getTaxRulesForCountry(){
        return new CanTax();
    }

}