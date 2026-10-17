package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import androidx.compose.runtime.MutableState;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ra extends us0 implements my {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ra(SharedPreferences sharedPreferences, MutableState mutableState, Context context, MutableState mutableState2, MutableState mutableState3, hm hmVar) {
        super(2, hmVar);
        this.i = sharedPreferences;
        this.e = mutableState;
        this.f = context;
        this.g = mutableState2;
        this.h = mutableState3;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        int i = this.d;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                MutableState mutableState = this.g;
                MutableState mutableState2 = this.h;
                return new ra(this.e, (un) obj2, this.f, mutableState, mutableState2, hmVar);
            default:
                return new ra((SharedPreferences) obj2, this.e, this.f, this.g, this.h, hmVar);
        }
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        w01 w01Var = w01.a;
        un unVar = (un) obj;
        hm hmVar = (hm) obj2;
        switch (i) {
            case 0:
                ((ra) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
            default:
                ((ra) create(unVar, hmVar)).invokeSuspend(w01Var);
                break;
        }
        return w01Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        w01 w01Var = w01.a;
        MutableState mutableState = this.h;
        Object obj2 = this.i;
        MutableState mutableState2 = this.g;
        Context context = this.f;
        MutableState mutableState3 = this.e;
        switch (i) {
            case 0:
                p10.Q(obj);
                ni0 ni0Var = kb.a;
                if (((Boolean) mutableState3.getValue()).booleanValue()) {
                    kb.h((un) obj2, context, mutableState2, mutableState);
                }
                return w01Var;
            default:
                p10.Q(obj);
                try {
                    URL url = new URL("https://f.adamski2003.lol/quest/fixes/versions.txt");
                    Charset charset = rh.a;
                    InputStream openStream = url.openStream();
                    try {
                        openStream.getClass();
                        byte[] z = q10.z(openStream);
                        q10.g(openStream, null);
                        mutableState3.setValue(new String(z, charset));
                    } finally {
                    }
                } catch (Exception unused) {
                }
                List E = y80.E("com.oculus.guidebook", "com.meta.shell.env.footprint.haven2025", "com.meta.shell.env.vista.calming");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : E) {
                    try {
                        context.getPackageManager().getPackageInfo((String) obj3, 0);
                        arrayList.add(obj3);
                    } catch (PackageManager.NameNotFoundException unused2) {
                    }
                }
                Set<String> L0 = yi.L0(arrayList);
                mutableState2.setValue(L0);
                ((SharedPreferences) obj2).edit().putStringSet("cached_installed_pkgs", L0).apply();
                mutableState.setValue(Boolean.TRUE);
                return w01Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ra(MutableState mutableState, un unVar, Context context, MutableState mutableState2, MutableState mutableState3, hm hmVar) {
        super(2, hmVar);
        this.e = mutableState;
        this.i = unVar;
        this.f = context;
        this.g = mutableState2;
        this.h = mutableState3;
    }
}
