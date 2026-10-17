package defpackage;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.lumi.singularity.ui.activities.AdbRootActivity;
import java.io.File;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class r3 extends us0 implements my {
    public final /* synthetic */ int d;
    public int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Context g;
    public final /* synthetic */ c3 h;
    public final /* synthetic */ String i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ iy k;
    public final /* synthetic */ MutableState l;
    public final /* synthetic */ MutableState m;
    public final /* synthetic */ MutableState n;
    public final /* synthetic */ MutableState o;
    public final /* synthetic */ MutableState p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r3(boolean z, Context context, c3 c3Var, String str, boolean z2, iy iyVar, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, hm hmVar, int i) {
        super(2, hmVar);
        this.d = i;
        this.f = z;
        this.g = context;
        this.h = c3Var;
        this.i = str;
        this.j = z2;
        this.k = iyVar;
        this.l = mutableState;
        this.m = mutableState2;
        this.n = mutableState3;
        this.o = mutableState4;
        this.p = mutableState5;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        switch (this.d) {
            case 0:
                return new r3(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, hmVar, 0);
            default:
                return new r3(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, hmVar, 1);
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
        return ((r3) create(unVar, hmVar)).invokeSuspend(w01Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        c3 c3Var = this.h;
        boolean z = this.f;
        vn vnVar = vn.d;
        w01 w01Var = w01.a;
        final int i2 = 1;
        switch (i) {
            case 0:
                int i3 = this.e;
                if (i3 == 0) {
                    p10.Q(obj);
                    if (z) {
                        final MutableState mutableState = this.l;
                        if (!((Boolean) mutableState.getValue()).booleanValue()) {
                            mutableState.setValue(Boolean.TRUE);
                            final MutableState mutableState2 = this.m;
                            j4.e(mutableState2, "Port 5555 detected");
                            File h = ((AdbRootActivity) c3Var).h();
                            y2 y2Var = new y2(mutableState2, 2);
                            final int i4 = 0;
                            final MutableState mutableState3 = this.n;
                            iy iyVar = new iy() { // from class: p3
                                @Override // defpackage.iy
                                public final Object invoke() {
                                    int i5 = i4;
                                    w01 w01Var2 = w01.a;
                                    MutableState mutableState4 = mutableState;
                                    MutableState mutableState5 = mutableState3;
                                    MutableState mutableState6 = mutableState2;
                                    switch (i5) {
                                        case 0:
                                            j4.e(mutableState6, "Direct port 5555 connection failed. Falling back to wireless ADB discovery.");
                                            mutableState5.setValue(Boolean.FALSE);
                                            j4.d(mutableState4, false);
                                            break;
                                        default:
                                            j4.e(mutableState6, "Automatic connection failed. Falling back to manual setup.");
                                            mutableState5.setValue(Boolean.FALSE);
                                            j4.d(mutableState4, false);
                                            break;
                                    }
                                    return w01Var2;
                                }
                            };
                            final int i5 = 0;
                            final MutableState mutableState4 = this.o;
                            final MutableState mutableState5 = this.p;
                            iy iyVar2 = new iy() { // from class: q3
                                @Override // defpackage.iy
                                public final Object invoke() {
                                    int i6 = i5;
                                    w01 w01Var2 = w01.a;
                                    MutableState mutableState6 = mutableState;
                                    MutableState mutableState7 = mutableState3;
                                    MutableState mutableState8 = mutableState5;
                                    MutableState mutableState9 = mutableState4;
                                    switch (i6) {
                                        case 0:
                                            mutableState9.setValue(Boolean.TRUE);
                                            mutableState8.setValue("5555");
                                            mutableState7.setValue(Boolean.FALSE);
                                            j4.d(mutableState6, false);
                                            break;
                                        default:
                                            mutableState9.setValue(Boolean.TRUE);
                                            mutableState8.setValue("5555");
                                            mutableState7.setValue(Boolean.FALSE);
                                            j4.d(mutableState6, false);
                                            break;
                                    }
                                    return w01Var2;
                                }
                            };
                            this.e = 1;
                            if (j4.f(this.g, h, this.i, this.j, true, y2Var, this.k, iyVar, iyVar2, this) == vnVar) {
                                break;
                            }
                        }
                    }
                } else if (i3 != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    p10.Q(obj);
                }
                break;
            default:
                int i6 = this.e;
                if (i6 == 0) {
                    p10.Q(obj);
                    if (!z) {
                        final MutableState mutableState6 = this.l;
                        boolean booleanValue = ((Boolean) mutableState6.getValue()).booleanValue();
                        final MutableState mutableState7 = this.n;
                        if (booleanValue) {
                            final MutableState mutableState8 = this.m;
                            if (!((Boolean) mutableState8.getValue()).booleanValue()) {
                                mutableState8.setValue(Boolean.TRUE);
                                j4.e(mutableState7, "Attempting automatic ADB connection...");
                                File h2 = ((AdbRootActivity) c3Var).h();
                                y2 y2Var2 = new y2(mutableState7, 3);
                                iy iyVar3 = new iy() { // from class: p3
                                    @Override // defpackage.iy
                                    public final Object invoke() {
                                        int i52 = i2;
                                        w01 w01Var2 = w01.a;
                                        MutableState mutableState42 = mutableState8;
                                        MutableState mutableState52 = mutableState6;
                                        MutableState mutableState62 = mutableState7;
                                        switch (i52) {
                                            case 0:
                                                j4.e(mutableState62, "Direct port 5555 connection failed. Falling back to wireless ADB discovery.");
                                                mutableState52.setValue(Boolean.FALSE);
                                                j4.d(mutableState42, false);
                                                break;
                                            default:
                                                j4.e(mutableState62, "Automatic connection failed. Falling back to manual setup.");
                                                mutableState52.setValue(Boolean.FALSE);
                                                j4.d(mutableState42, false);
                                                break;
                                        }
                                        return w01Var2;
                                    }
                                };
                                final int i7 = 1;
                                final MutableState mutableState9 = this.o;
                                final MutableState mutableState10 = this.p;
                                iy iyVar4 = new iy() { // from class: q3
                                    @Override // defpackage.iy
                                    public final Object invoke() {
                                        int i62 = i7;
                                        w01 w01Var2 = w01.a;
                                        MutableState mutableState62 = mutableState8;
                                        MutableState mutableState72 = mutableState6;
                                        MutableState mutableState82 = mutableState10;
                                        MutableState mutableState92 = mutableState9;
                                        switch (i62) {
                                            case 0:
                                                mutableState92.setValue(Boolean.TRUE);
                                                mutableState82.setValue("5555");
                                                mutableState72.setValue(Boolean.FALSE);
                                                j4.d(mutableState62, false);
                                                break;
                                            default:
                                                mutableState92.setValue(Boolean.TRUE);
                                                mutableState82.setValue("5555");
                                                mutableState72.setValue(Boolean.FALSE);
                                                j4.d(mutableState62, false);
                                                break;
                                        }
                                        return w01Var2;
                                    }
                                };
                                this.e = 1;
                                if (j4.f(this.g, h2, this.i, this.j, false, y2Var2, this.k, iyVar3, iyVar4, this) == vnVar) {
                                    break;
                                }
                            }
                        }
                        if (!((Boolean) mutableState6.getValue()).booleanValue() && ((String) mutableState7.getValue()).length() == 0) {
                            j4.e(mutableState7, "Ready for manual pairing.");
                        }
                    }
                } else if (i6 != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    p10.Q(obj);
                }
                break;
        }
        return w01Var;
    }
}
