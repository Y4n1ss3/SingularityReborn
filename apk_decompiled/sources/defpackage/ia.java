package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import androidx.compose.runtime.MutableState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ia extends us0 implements my {
    public final /* synthetic */ int d;
    public int e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ SharedPreferences i;
    public final /* synthetic */ PackageManager j;
    public final /* synthetic */ MutableState k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ia(Context context, MutableState mutableState, MutableState mutableState2, SharedPreferences sharedPreferences, PackageManager packageManager, MutableState mutableState3, hm hmVar, int i) {
        super(2, hmVar);
        this.d = i;
        this.f = context;
        this.g = mutableState;
        this.h = mutableState2;
        this.i = sharedPreferences;
        this.j = packageManager;
        this.k = mutableState3;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        switch (this.d) {
            case 0:
                return new ia(this.f, this.g, this.h, this.i, this.j, this.k, hmVar, 0);
            default:
                return new ia(this.f, this.g, this.h, this.i, this.j, this.k, hmVar, 1);
        }
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        w01 w01Var = w01.a;
        un unVar = (un) obj;
        hm hmVar = (hm) obj2;
        switch (i) {
        }
        return ((ia) create(unVar, hmVar)).invokeSuspend(w01Var);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        w01 w01Var = w01.a;
        vn vnVar = vn.d;
        switch (i) {
            case 0:
                int i2 = this.e;
                if (i2 == 0) {
                    p10.Q(obj);
                    this.e = 1;
                    if (kb.e(this.f, this.g, this.h, this.i, this.j, this.k, true, this) == vnVar) {
                        break;
                    }
                } else if (i2 != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    p10.Q(obj);
                    break;
                }
                break;
            default:
                int i3 = this.e;
                if (i3 == 0) {
                    p10.Q(obj);
                    this.e = 1;
                    if (kb.e(this.f, this.g, this.h, this.i, this.j, this.k, true, this) == vnVar) {
                        break;
                    }
                } else if (i3 != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    p10.Q(obj);
                    break;
                }
                break;
        }
        return vnVar;
    }
}
