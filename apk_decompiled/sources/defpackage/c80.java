package defpackage;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.lumi.singularity.ui.activities.MainActivity;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class c80 extends us0 implements my {
    public int d;
    public int e;
    public int f;
    public final /* synthetic */ String g;
    public final /* synthetic */ cq0 h;
    public final /* synthetic */ Context i;
    public final /* synthetic */ MutableState j;
    public final /* synthetic */ MutableState k;
    public final /* synthetic */ MutableState l;
    public final /* synthetic */ MutableState m;
    public final /* synthetic */ MutableState n;
    public final /* synthetic */ MutableState o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ un q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c80(String str, cq0 cq0Var, Context context, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, un unVar, hm hmVar) {
        super(2, hmVar);
        this.g = str;
        this.h = cq0Var;
        this.i = context;
        this.j = mutableState;
        this.k = mutableState2;
        this.l = mutableState3;
        this.m = mutableState4;
        this.n = mutableState5;
        this.o = mutableState6;
        this.p = mutableState7;
        this.q = unVar;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new c80(this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        return ((c80) create((un) obj, (hm) obj2)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0109, code lost:
    
        if (defpackage.y80.p(1000, r25) == r4) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01f3, code lost:
    
        if (defpackage.y80.p(1500, r25) == r4) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b5, code lost:
    
        if (defpackage.y80.p(1500, r25) == r4) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0109 -> B:14:0x010d). Please report as a decompilation issue!!! */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        int i3;
        Context context;
        int i4;
        Object obj2;
        int i5;
        int i6 = this.f;
        w01 w01Var = w01.a;
        MutableState mutableState = this.n;
        int i7 = 3;
        Context context2 = this.i;
        cq0 cq0Var = this.h;
        MutableState mutableState2 = this.l;
        MutableState mutableState3 = this.j;
        MutableState mutableState4 = this.m;
        MutableState mutableState5 = this.k;
        vn vnVar = vn.d;
        if (i6 == 0) {
            p10.Q(obj);
            String str = this.g;
            if (str != null) {
                mutableState3.setValue(Boolean.FALSE);
                e80.h(mutableState5, 0);
                mutableState2.setValue(Boolean.TRUE);
                mutableState4.setValue(((String) mutableState4.getValue()) + "[!] " + str + "\n");
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    mutableState4.setValue(((String) mutableState4.getValue()) + "[*] Auto-reboot is enabled — rebooting now...\n");
                    this.f = 1;
                }
                return w01Var;
            }
            i = 1;
            i2 = 1;
            i3 = 0;
            if (i < 16) {
            }
            Context context3 = context2;
            MutableState mutableState6 = this.o;
            if (i3 == 0) {
            }
        } else if (i6 == 1) {
            p10.Q(obj);
        } else {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 != 4) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                    context = context2;
                    MainActivity mainActivity = (MainActivity) cq0Var;
                    context.getClass();
                    t40 y = d41.y(mainActivity);
                    nq nqVar = nr.a;
                    p01.t(y, hq.d, null, new z2(mainActivity, null, 3), 2);
                    return w01Var;
                }
                i5 = this.e;
                i4 = this.d;
                p10.Q(obj);
                i2 = 1;
                Context context4 = context2;
                int i8 = i4;
                i = i5 + 1;
                i3 = i8;
                context2 = context4;
                i7 = 3;
                if (i < 16) {
                    zj0 zj0Var = zj0.a;
                    this.d = i3;
                    this.e = i;
                    this.f = 2;
                    obj2 = zj0.b(this);
                    if (obj2 != vnVar) {
                        int i9 = i;
                        i4 = i3;
                        i5 = i9;
                        if (((Boolean) obj2).booleanValue()) {
                            this.d = i4;
                            this.e = i5;
                            this.f = i7;
                            context4 = context2;
                        } else {
                            i3 = i2;
                        }
                    }
                    return vnVar;
                }
                Context context32 = context2;
                MutableState mutableState62 = this.o;
                if (i3 == 0) {
                    Boolean bool = Boolean.FALSE;
                    mutableState3.setValue(bool);
                    mutableState62.setValue(Boolean.TRUE);
                    mutableState2.setValue(bool);
                    e80.h(mutableState5, 0);
                    return w01Var;
                }
                int intValue = ((Number) mutableState5.getValue()).intValue() + 1;
                mutableState5.setValue(Integer.valueOf(intValue));
                if (intValue < 2) {
                    mutableState4.setValue(((String) mutableState4.getValue()) + "\n[*] Root attempt failed, retrying automatically...\n");
                    MutableState mutableState7 = this.p;
                    ku kuVar = (ku) mutableState7.getValue();
                    MutableState mutableState8 = this.m;
                    ((MainActivity) cq0Var).j(context32, kuVar, new i3(mutableState8, 18), new h70(this.q, cq0Var, this.i, this.j, this.k, this.l, mutableState8, this.n, mutableState62, mutableState7, 2));
                    return w01Var;
                }
                context = context32;
                mutableState3.setValue(Boolean.FALSE);
                mutableState5.setValue(0);
                mutableState2.setValue(Boolean.TRUE);
                mutableState4.setValue(((String) mutableState4.getValue()) + "[!] Root failed — retry below, or reboot if retrying fails\n");
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    mutableState4.setValue(((String) mutableState4.getValue()) + "[*] Auto-reboot is enabled — rebooting now...\n");
                    this.d = i3;
                    this.e = intValue;
                    this.f = 4;
                }
                return w01Var;
            }
            i5 = this.e;
            i4 = this.d;
            p10.Q(obj);
            i2 = 1;
            obj2 = obj;
            if (((Boolean) obj2).booleanValue()) {
            }
        }
        MainActivity mainActivity2 = (MainActivity) cq0Var;
        context2.getClass();
        t40 y2 = d41.y(mainActivity2);
        nq nqVar2 = nr.a;
        p01.t(y2, hq.d, null, new z2(mainActivity2, null, 3), 2);
        return w01Var;
    }
}
