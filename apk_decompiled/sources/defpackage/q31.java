package defpackage;

import android.view.View;
import android.view.Window;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class q31 extends p10 {
    public final Window k;

    public q31(Window window) {
        this.k = window;
    }

    @Override // defpackage.p10
    public final void L(boolean z) {
        Window window = this.k;
        if (!z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-17));
        } else {
            window.clearFlags(GroupFlagsKt.HasRecompositionRequiredFlag);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 16);
        }
    }

    @Override // defpackage.p10
    public final void M(boolean z) {
        Window window = this.k;
        if (!z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        } else {
            window.clearFlags(GroupFlagsKt.IsRecompositionRequiredFlag);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 8192);
        }
    }
}
