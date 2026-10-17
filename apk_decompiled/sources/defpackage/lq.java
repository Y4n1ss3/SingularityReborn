package defpackage;

import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class lq implements w40 {
    public final /* synthetic */ int d;
    public final Object e;
    public final Object f;

    public lq(x40 x40Var) {
        this.d = 2;
        this.e = x40Var;
        ni niVar = ni.c;
        Class<?> cls = x40Var.getClass();
        li liVar = (li) niVar.a.get(cls);
        this.f = liVar == null ? niVar.a(cls, null) : liVar;
    }

    @Override // defpackage.w40
    public final void onStateChanged(y40 y40Var, q40 q40Var) {
        int i = this.d;
        Object obj = this.e;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                jq jqVar = (jq) obj;
                switch (kq.a[q40Var.ordinal()]) {
                    case 1:
                        jqVar.onCreate(y40Var);
                        break;
                    case 2:
                        jqVar.onStart(y40Var);
                        break;
                    case 3:
                        jqVar.onResume(y40Var);
                        break;
                    case 4:
                        jqVar.onPause(y40Var);
                        break;
                    case 5:
                        jqVar.onStop(y40Var);
                        break;
                    case 6:
                        jqVar.onDestroy(y40Var);
                        break;
                    case 7:
                        o.m("ON_ANY must not been send by anybody");
                        break;
                    default:
                        o.n();
                        break;
                }
                w40 w40Var = (w40) obj2;
                if (w40Var != null) {
                    w40Var.onStateChanged(y40Var, q40Var);
                    break;
                }
                break;
            case 1:
                if (q40Var == q40.ON_START) {
                    ((s40) obj).b(this);
                    ((el0) obj2).d();
                    break;
                }
                break;
            default:
                x40 x40Var = (x40) obj;
                HashMap hashMap = ((li) obj2).a;
                li.a((List) hashMap.get(q40Var), y40Var, q40Var, x40Var);
                li.a((List) hashMap.get(q40.ON_ANY), y40Var, q40Var, x40Var);
                break;
        }
    }

    public /* synthetic */ lq(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }
}
