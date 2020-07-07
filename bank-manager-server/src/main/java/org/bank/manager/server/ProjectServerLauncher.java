package org.bank.manager.server;

import com.ontimize.gui.ServerLauncher;

import com.ontimize.db.DatabaseConnectionManager;

public class ProjectServerLauncher {

	public static void main(String[] args) {

        DatabaseConnectionManager.offset = 5;
        DatabaseConnectionManager.offsetString = "quickstart";
		try {
			ServerLauncher.main(args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
