package defpackage;

import androidx.compose.runtime.MutableState;
import com.lumi.singularity.ui.activities.TerminalActivity;
import com.lumi.singularity.ui.activities.TweaksActivity;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class qt0 extends us0 implements my {
    public final /* synthetic */ int d;
    public MutableState e;
    public int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ MutableState h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qt0(boolean z, MutableState mutableState, hm hmVar, int i) {
        super(2, hmVar);
        this.d = i;
        this.g = z;
        this.h = mutableState;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        switch (this.d) {
            case 0:
                return new qt0(this.g, this.h, hmVar, 0);
            default:
                return new qt0(this.g, this.h, hmVar, 1);
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
        return ((qt0) create(unVar, hmVar)).invokeSuspend(w01Var);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        w01 w01Var = w01.a;
        MutableState mutableState = this.h;
        boolean z = this.g;
        vn vnVar = vn.d;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    p10.Q(obj);
                    if (!z) {
                        nq nqVar = nr.a;
                        hq hqVar = hq.d;
                        b80 b80Var = new b80(2, 7, null);
                        this.e = mutableState;
                        this.f = 1;
                        obj = p01.H(hqVar, b80Var, this);
                        if (obj == vnVar) {
                            break;
                        }
                    }
                } else if (i2 != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mutableState = this.e;
                    p10.Q(obj);
                }
                Boolean bool = (Boolean) obj;
                bool.getClass();
                int i3 = TerminalActivity.v;
                mutableState.setValue(bool);
                break;
            default:
                int i4 = this.f;
                if (i4 == 0) {
                    p10.Q(obj);
                    if (!z) {
                        nq nqVar2 = nr.a;
                        hq hqVar2 = hq.d;
                        b80 b80Var2 = new b80(2, 9, null);
                        this.e = mutableState;
                        this.f = 1;
                        obj = p01.H(hqVar2, b80Var2, this);
                        if (obj == vnVar) {
                            break;
                        }
                    }
                } else if (i4 != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mutableState = this.e;
                    p10.Q(obj);
                }
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                int i5 = TweaksActivity.C;
                mutableState.setValue(bool2);
                break;
        }
        return w01Var;
    }
}
