package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.runtime.MutableState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class es implements ky {
    public final /* synthetic */ SharedPreferences d;
    public final /* synthetic */ String e;
    public final /* synthetic */ un f;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ Context i;

    public es(SharedPreferences sharedPreferences, String str, un unVar, MutableState mutableState, MutableState mutableState2, Context context) {
        this.d = sharedPreferences;
        this.e = str;
        this.f = unVar;
        this.g = mutableState;
        this.h = mutableState2;
        this.i = context;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        Boolean bool = (Boolean) obj;
        boolean booleanValue = bool.booleanValue();
        this.g.setValue(bool);
        this.d.edit().putBoolean(this.e, booleanValue).apply();
        if (gs.b(this.h)) {
            p01.t(this.f, null, null, new e4(this.i, null, 10), 3);
        }
        return w01.a;
    }
}
