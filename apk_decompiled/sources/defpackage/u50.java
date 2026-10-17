package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class u50 extends Handler {
    public final /* synthetic */ w50 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u50(w50 w50Var, Looper looper) {
        super(looper);
        this.a = w50Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int size;
        bg[] bgVarArr;
        if (message.what != 1) {
            super.handleMessage(message);
            return;
        }
        w50 w50Var = this.a;
        while (true) {
            synchronized (((HashMap) w50Var.b)) {
                try {
                    size = ((ArrayList) w50Var.d).size();
                    if (size <= 0) {
                        return;
                    }
                    bgVarArr = new bg[size];
                    ((ArrayList) w50Var.d).toArray(bgVarArr);
                    ((ArrayList) w50Var.d).clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i = 0; i < size; i++) {
                bg bgVar = bgVarArr[i];
                int size2 = ((ArrayList) bgVar.b).size();
                for (int i2 = 0; i2 < size2; i2++) {
                    v50 v50Var = (v50) ((ArrayList) bgVar.b).get(i2);
                    if (!v50Var.d) {
                        v50Var.b.onReceive((Context) w50Var.a, (Intent) bgVar.a);
                    }
                }
            }
        }
    }
}
