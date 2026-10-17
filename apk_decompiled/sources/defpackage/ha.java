package defpackage;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ha implements my {
    public final /* synthetic */ ky d;
    public final /* synthetic */ q90 e;
    public final /* synthetic */ sa f;

    public ha(ky kyVar, q90 q90Var, sa saVar) {
        this.d = kyVar;
        this.e = q90Var;
        this.f = saVar;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int intValue = ((Number) obj2).intValue();
        int i = 2;
        if (composer.shouldExecute((intValue & 3) != 2, intValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2004054279, intValue, -1, "com.lumi.singularity.ui.activities.AppsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppsActivity.kt:1183)");
            }
            ky kyVar = this.d;
            boolean changed = composer.changed(kyVar);
            Object obj3 = this.e;
            boolean changed2 = changed | composer.changed(obj3);
            Object rememberedValue = composer.rememberedValue();
            if (changed2 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new ga(kyVar, obj3, 0);
                composer.updateRememberedValue(rememberedValue);
            }
            ButtonKt.Button((iy) rememberedValue, null, !r13.c, RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f)), null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(889452311, true, new ka(this.f, i), composer, 54), composer, 805306368, 498);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }
}
