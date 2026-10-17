package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class jh0 extends BroadcastReceiver {
    public final /* synthetic */ kh0 a;

    public jh0(kh0 kh0Var) {
        this.a = kh0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        kh0 kh0Var = this.a;
        Handler handler = kh0Var.c;
        j jVar = kh0Var.g;
        handler.removeCallbacks(jVar);
        handler.postDelayed(jVar, 1500L);
    }
}
