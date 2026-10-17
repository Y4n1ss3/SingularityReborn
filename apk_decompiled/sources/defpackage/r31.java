package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public class r31 extends p10 {
    public final WindowInsetsController k;
    public final Window l;

    public r31(Window window) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.k = insetsController;
        this.l = window;
    }

    @Override // defpackage.p10
    public final void L(boolean z) {
        Window window = this.l;
        if (z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            this.k.setSystemBarsAppearance(16, 16);
        } else {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
            this.k.setSystemBarsAppearance(0, 16);
        }
    }

    @Override // defpackage.p10
    public final void M(boolean z) {
        Window window = this.l;
        if (z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            this.k.setSystemBarsAppearance(8, 8);
        } else {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
            this.k.setSystemBarsAppearance(0, 8);
        }
    }
}
