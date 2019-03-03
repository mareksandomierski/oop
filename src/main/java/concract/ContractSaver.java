package concract;

public abstract class ContractSaver {

    public void  save(Contract contract){
        checkSecurity(contract);
        sign(contract);
        internalSave(contract);
    }

    protected abstract void internalSave(Contract contract);

    protected abstract void sign(Contract contract);

    protected abstract void checkSecurity(Contract contract);

}
