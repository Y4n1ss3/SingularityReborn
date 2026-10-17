package defpackage;

import android.content.Context;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class f3 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ f3(int i, Object obj, boolean z, Object obj2) {
        this.d = i;
        this.e = z;
        this.f = obj;
        this.g = obj2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        w01 w01Var = w01.a;
        Object obj3 = this.g;
        Object obj4 = this.f;
        boolean z = this.e;
        int i2 = 2;
        switch (i) {
            case 0:
                String str = (String) obj4;
                iy iyVar = (iy) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                if (!composer.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                    composer.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(326132183, intValue, -1, "com.lumi.singularity.ui.activities.AdbConnectScreen.<anonymous> (AdbRootActivity.kt:242)");
                    }
                    ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(883356315, true, new h3(str, z), composer, 54);
                    ComposableLambda rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(1236012829, true, new l2(i2, iyVar), composer, 54);
                    TopAppBarDefaults topAppBarDefaults = TopAppBarDefaults.INSTANCE;
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i3 = MaterialTheme.$stable;
                    AppBarKt.m1624TopAppBarGHTll3U(rememberComposableLambda, null, rememberComposableLambda2, null, 0.0f, null, topAppBarDefaults.m2822topAppBarColors5tl4gsc(materialTheme.getColorScheme(composer, i3).m1773getPrimaryContainer0d7_KjU(), 0L, 0L, materialTheme.getColorScheme(composer, i3).m1757getOnPrimaryContainer0d7_KjU(), 0L, 0L, composer, TopAppBarDefaults.$stable << 18, 54), null, composer, 390, 186);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            default:
                un unVar = (un) obj4;
                Context context = (Context) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (!composer2.shouldExecute((intValue2 & 3) != 2, intValue2 & 1)) {
                    composer2.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1812342041, intValue2, -1, "com.lumi.singularity.ui.activities.AppsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppsActivity.kt:806)");
                    }
                    boolean changed = composer2.changed(z) | composer2.changedInstance(unVar) | composer2.changedInstance(context);
                    Object rememberedValue = composer2.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new r9(0, unVar, z, context);
                        composer2.updateRememberedValue(rememberedValue);
                    }
                    ButtonKt.Button((iy) rememberedValue, null, false, RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f)), null, null, null, null, null, wk.g, composer2, 805306368, 502);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
        }
        return w01Var;
    }
}
