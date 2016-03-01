package fr.upem.administrator;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;

/**
 * Created by Jeremy
 */
public class SecurityManager {

    public static String sha1(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("sha1");
            md.reset();
            md.update(password.getBytes());
            return byteToHex(md.digest());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String byteToHex(final byte[] hash)
    {
        Formatter formatter = new Formatter();
        for(byte b : hash) {
            formatter.format("%02x", b);
        }
        String result = formatter.toString();
        formatter.close();
        return result;
    }
}
