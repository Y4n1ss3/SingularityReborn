package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.MutableState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class j01 extends BroadcastReceiver {
    public final /* synthetic */ MutableState a;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ MutableState f;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ MutableState h;

    public j01(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8) {
        this.a = mutableState;
        this.b = mutableState2;
        this.c = mutableState3;
        this.d = mutableState4;
        this.e = mutableState5;
        this.f = mutableState6;
        this.g = mutableState7;
        this.h = mutableState8;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (q10.b(intent != null ? intent.getAction() : null, "com.lumi.singularity.TWEAKS_STOPPED")) {
            Boolean bool = Boolean.FALSE;
            this.a.setValue(bool);
            this.b.setValue(bool);
            this.c.setValue(bool);
            this.d.setValue(bool);
            this.e.setValue(bool);
            this.f.setValue(bool);
            this.g.setValue(bool);
            this.h.setValue(bool);
        }
    }
}
