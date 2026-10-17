package defpackage;

import android.content.Context;
import androidx.compose.runtime.MutableState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ma extends us0 implements my {
    public final /* synthetic */ int d;
    public int e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ MutableState i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ma(Context context, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, hm hmVar, int i) {
        super(2, hmVar);
        this.d = i;
        this.f = context;
        this.g = mutableState;
        this.h = mutableState2;
        this.i = mutableState3;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        switch (this.d) {
            case 0:
                return new ma(this.f, this.g, this.h, this.i, hmVar, 0);
            case 1:
                return new ma(this.f, this.g, this.h, this.i, hmVar, 1);
            default:
                return new ma(this.f, this.g, this.h, this.i, hmVar, 2);
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
        return ((ma) create(unVar, hmVar)).invokeSuspend(w01Var);
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
                    return kb.g(this.f, this.g, this.h, this.i, true, this) == vnVar ? vnVar : w01Var;
                }
                if (i2 == 1) {
                    p10.Q(obj);
                    return w01Var;
                }
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                int i3 = this.e;
                if (i3 == 0) {
                    p10.Q(obj);
                    this.e = 1;
                    return kb.g(this.f, this.g, this.h, this.i, false, this) == vnVar ? vnVar : w01Var;
                }
                if (i3 == 1) {
                    p10.Q(obj);
                    return w01Var;
                }
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i4 = this.e;
                MutableState mutableState = this.g;
                MutableState mutableState2 = this.h;
                if (i4 == 0) {
                    p10.Q(obj);
                    mutableState.setValue(Boolean.TRUE);
                    mutableState2.setValue("Starting...");
                    i3 i3Var = new i3(mutableState2, 22);
                    this.e = 1;
                    nq nqVar = nr.a;
                    obj = p01.H(hq.d, new u3(i3Var, "guidebook", this.f, "https://f.adamski2003.lol/quest/fixes/com.oculus.guidebook.apk", (hm) null), this);
                    if (obj == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i4 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                mutableState.setValue(Boolean.FALSE);
                if (!booleanValue) {
                    return w01Var;
                }
                this.i.setValue(Boolean.TRUE);
                mutableState2.setValue("Installed!");
                return w01Var;
        }
    }
}
