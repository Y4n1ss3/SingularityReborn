package defpackage;

import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy_androidKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class c1 implements w40 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c1(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.w40
    public final void onStateChanged(y40 y40Var, q40 q40Var) {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                ((ky) obj).invoke(q40Var);
                break;
            case 1:
                gl0 gl0Var = (gl0) obj;
                if (q40Var != q40.ON_START) {
                    if (q40Var == q40.ON_STOP) {
                        gl0Var.h = false;
                        break;
                    }
                } else {
                    gl0Var.h = true;
                    break;
                }
                break;
            default:
                ViewCompositionStrategy_androidKt.installForLifecycle$lambda$1((AbstractComposeView) obj, y40Var, q40Var);
                break;
        }
    }
}
