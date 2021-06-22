package helpers;

import org.aeonbits.owner.ConfigFactory;

public class CredentialManagerImpl {
    public static CredentialManager getCredConfig() {
        return ConfigFactory.create(CredentialManager.class, System.getProperties());
    }
}
