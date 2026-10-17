package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class y50 {
    public static final ProvidableCompositionLocal a = CompositionLocalKt.compositionLocalOf$default(null, e2.g, 1, null);

    public static td0 a(Composer composer) {
        composer.startReplaceableGroup(-2068013981);
        td0 td0Var = (td0) composer.consume(a);
        composer.startReplaceableGroup(1680121597);
        Object obj = null;
        if (td0Var == null) {
            View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
            view.getClass();
            vv vvVar = new vv(do0.W(new br(new hm0(view, 3), yp0.f, 2), yp0.g));
            td0Var = (td0) (!vvVar.hasNext() ? null : vvVar.next());
        }
        composer.endReplaceableGroup();
        if (td0Var == null) {
            Object obj2 = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            while (true) {
                if (!(obj2 instanceof ContextWrapper)) {
                    break;
                }
                if (obj2 instanceof td0) {
                    obj = obj2;
                    break;
                }
                obj2 = ((ContextWrapper) obj2).getBaseContext();
            }
            td0Var = (td0) obj;
        }
        composer.endReplaceableGroup();
        return td0Var;
    }
}
