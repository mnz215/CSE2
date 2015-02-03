//Murphy Zingsheim
//CSE002 Hw02
//Professor: Brian Chen
//This homework will have us calculate the total cost for a trip to walmart.
//The program will include a sales tax of 6 percent

public class Arithmetic{
    public static void main(String[] args){
        
        int nSocks=3, nGlasses=6, nEnvelopes=1;
        double sockCost$=2.58, glassCost$=2.29, envelopeCost$=3.25, taxPercent=0.06;
        double TotalSockCost, TaxCostSocks, TotalGlassCost, TaxCostGlass;
        double TotalEnvelopeCost, TaxCostEnvelope, TotalPurchaseCost, TotalTaxCost, FinalTotal;
        
        TotalSockCost=sockCost$*nSocks;
        TaxCostSocks=TotalSockCost*taxPercent*100;
        int xTaxCostSocks= (int)TaxCostSocks;    //Recasted the tax on socks as an integer
        double NewTaxCostSocks;   //declared a new variable for tax as a double so I could divide by 100 and receive a double 
        NewTaxCostSocks=(xTaxCostSocks)/100.0; //method for socks is the same as for glass and envelopes
        
        TotalGlassCost=glassCost$*nGlasses;
        TaxCostGlass=TotalGlassCost*taxPercent*100;
        int xTaxCostGlass= (int)TaxCostGlass;
        double NewTaxCostGlass;
        NewTaxCostGlass=(xTaxCostGlass)/100.0;
        
        TotalEnvelopeCost=envelopeCost$*nEnvelopes;
        TaxCostEnvelope=TotalEnvelopeCost*taxPercent*100;
        int xTaxCostEnvelope= (int)TaxCostEnvelope;
        double NewTaxCostEnvelope;
        NewTaxCostEnvelope=(xTaxCostEnvelope)/100.0;
        
        TotalPurchaseCost=TotalSockCost+TotalGlassCost+TotalEnvelopeCost;
        TotalTaxCost=NewTaxCostSocks+NewTaxCostGlass+NewTaxCostEnvelope;
        FinalTotal=TotalPurchaseCost-TotalTaxCost;
        
        
        System.out.println("Total cost of socks = $"+TotalSockCost);
        System.out.println("Total cost of tax on socks = $"+NewTaxCostSocks);
        System.out.println();
        System.out.println("Total cost of glass = $"+TotalGlassCost);
        System.out.println("Total cost of tax on glass = $"+NewTaxCostGlass);
        System.out.println();
        System.out.println("Total cost of envelopes= $"+TotalGlassCost);
        System.out.println("Total cost of tax on envelopes = $"+NewTaxCostEnvelope);
        System.out.println();
        System.out.println("Total cost of Purchase = $"+TotalPurchaseCost);
        System.out.println("Total cost of tax on Purchase = $"+TotalTaxCost);
        System.out.println();
        System.out.println("The final total of the transaction at Walmart = $"+FinalTotal);
    }
}