package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import defpackage.f30;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ViewLayer$Companion$getMatrix$1 extends f30 implements my {
    public static final ViewLayer$Companion$getMatrix$1 INSTANCE = new ViewLayer$Companion$getMatrix$1();

    public ViewLayer$Companion$getMatrix$1() {
        super(2);
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((View) obj, (Matrix) obj2);
        return w01.a;
    }

    public final void invoke(View view, Matrix matrix) {
        matrix.set(view.getMatrix());
    }
}
