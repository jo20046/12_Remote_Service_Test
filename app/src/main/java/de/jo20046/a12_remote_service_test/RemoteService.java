package de.jo20046.a12_remote_service_test;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class RemoteService extends Service {

    @Override
    public IBinder onBind(Intent intent) {
        return new IRemoteService.Stub() {
            @Override
            public int getPid() throws RemoteException {
                return 0;
            }

            @Override
            public int add(int i1, int i2) throws RemoteException {
                return i1 + i2;
            }
        };
    }
}