package ProjetFinDAnnee.service;


import ProjetFinDAnnee.model.TypeClient;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface ITypeClient extends Remote {
    public boolean addTypeClient(TypeClient typeClient) throws RemoteException;
    public List<TypeClient> listeTypeClient() throws RemoteException;
    public TypeClient findTypebyId(int id) throws RemoteException;
}
