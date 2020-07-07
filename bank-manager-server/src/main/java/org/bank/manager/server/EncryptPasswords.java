package org.bank.manager.server;

import com.ontimize.db.DBUtils;
import com.ontimize.db.UserEntity;

public class EncryptPasswords { //Encripta la contra que le pongas

    public static void main (String[] args)
    {
        DBUtils.main(args);
        UserEntity.main(args);
    }
}