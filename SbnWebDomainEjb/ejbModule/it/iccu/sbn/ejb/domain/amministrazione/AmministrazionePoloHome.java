/*
 * Generated by XDoclet - Do not edit!
 */
package it.iccu.sbn.ejb.domain.amministrazione;

/**
 * Home interface for AmministrazionePolo.
 * @generated
 * @wtp generated
 */
public interface AmministrazionePoloHome
   extends javax.ejb.EJBHome
{
   public static final String COMP_NAME="java:comp/env/ejb/AmministrazionePolo";
   public static final String JNDI_NAME="sbnWeb/AmministrazionePolo";

   public it.iccu.sbn.ejb.domain.amministrazione.AmministrazionePolo create()
      throws javax.ejb.CreateException,java.rmi.RemoteException;

}