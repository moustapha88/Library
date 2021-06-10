package ProjetFinDAnnee.service;

import ProjetFinDAnnee.model.Client;
import ProjetFinDAnnee.model.Utilisateur;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IUtilisateur extends Remote {

    public boolean addUtilisateur(Utilisateur typeClient) throws RemoteException;
    public List<Utilisateur> listeUtilisateur() throws RemoteException;
    public Utilisateur getUser(String login, String password) throws RemoteException;
    public Utilisateur getUserById(int id) throws RemoteException;

}
