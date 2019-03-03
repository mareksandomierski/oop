package concract;

public class ISADBContractSave extends ISAContractSaver {

    @Override
    protected void internalSave(Contract contract){
        System.out.println("zapis do bazy");
    }
}
