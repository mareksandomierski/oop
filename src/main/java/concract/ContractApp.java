package concract;

public class ContractApp {
    public static void main(String[] args) {

        Contract contract = new Contract("Umowa", "Treść");

        ContractSaver contractSaver = new ISAContractSaver();
        ContractSaver contractSaver2 = new ISADBContractSave();





    }
}
