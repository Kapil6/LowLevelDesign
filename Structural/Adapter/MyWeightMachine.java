//client
class MyWeightMachine
{
    public static void main(String arg[])
    {
        System.out.println("========Adapter Design pattern===========");
        
        double baby_weight = 25;
        OmronWeightMachineImpl om_weight = new OmronWeightMachineImpl(25);
        WeightMachineAdapterImpl weight_machine = new WeightMachineAdapterImpl(om_weight);
        System.out.println("\n\nWeight in KG: " + weight_machine.getWeightInKg() + "\n\n");
    }
}
