package defpackage;

import android.view.View;
import android.view.Window;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class zj implements w40 {
    public final /* synthetic */ int d;
    public final /* synthetic */ vu0 e;

    public /* synthetic */ zj(vu0 vu0Var, int i) {
        this.d = i;
        this.e = vu0Var;
    }

    @Override // defpackage.w40
    public final void onStateChanged(y40 y40Var, q40 q40Var) {
        switch (this.d) {
            case 0:
                if (q40Var == q40.ON_STOP) {
                    Window window = this.e.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        peekDecorView.cancelPendingInputEvents();
                        break;
                    }
                }
                break;
            case 1:
                if (q40Var == q40.ON_DESTROY) {
                    this.e.e.b = null;
                    if (!this.e.isChangingConfigurations()) {
                        LinkedHashMap linkedHashMap = this.e.c().a;
                        Iterator it = linkedHashMap.values().iterator();
                        while (it.hasNext()) {
                            ((w11) it.next()).clear$lifecycle_viewmodel_release();
                        }
                        linkedHashMap.clear();
                    }
                    ck ckVar = this.e.k;
                    vu0 vu0Var = ckVar.g;
                    vu0Var.getWindow().getDecorView().removeCallbacks(ckVar);
                    vu0Var.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(ckVar);
                    break;
                }
                break;
            default:
                vu0 vu0Var2 = this.e;
                if (vu0Var2.i == null) {
                    bk bkVar = (bk) vu0Var2.getLastNonConfigurationInstance();
                    if (bkVar != null) {
                        vu0Var2.i = bkVar.a;
                    }
                    if (vu0Var2.i == null) {
                        vu0Var2.i = new t60(1);
                    }
                }
                vu0Var2.g.b(this);
                break;
        }
    }
}
