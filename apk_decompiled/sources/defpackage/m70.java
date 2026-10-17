package defpackage;

import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.material3.ModalWideNavigationRailState;
import androidx.compose.material3.SwipeToDismissBoxKt;
import androidx.compose.material3.SwipeToDismissBoxState;
import androidx.compose.material3.WideNavigationRailKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import com.lumi.singularity.ui.activities.TweaksActivity;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class m70 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;

    public /* synthetic */ m70(Object obj, boolean z, boolean z2, int i) {
        this.d = i;
        this.g = obj;
        this.e = z;
        this.f = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        xe0 SwipeToDismissBox$lambda$11$lambda$10$lambda$9;
        xe0 ModalWideNavigationRailContent_pU6N4AM$lambda$23$lambda$22;
        int i = this.d;
        w01 w01Var = w01.a;
        int i2 = 1;
        Object obj3 = this.g;
        boolean z = this.f;
        boolean z2 = this.e;
        switch (i) {
            case 0:
                iy iyVar = (iy) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(358795539, intValue, -1, "com.lumi.singularity.ui.activities.UpdateDialog.<anonymous> (MainActivity.kt:2484)");
                    }
                    ButtonKt.TextButton(iyVar, null, (!z2 || z) ? 1 : 0, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-313318000, true, new s9(z, i2), composer, 54), composer, 805306368, 506);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return w01Var;
            case 1:
                SwipeToDismissBox$lambda$11$lambda$10$lambda$9 = SwipeToDismissBoxKt.SwipeToDismissBox$lambda$11$lambda$10$lambda$9((SwipeToDismissBoxState) obj3, z2, z, (IntSize) obj, (Constraints) obj2);
                return SwipeToDismissBox$lambda$11$lambda$10$lambda$9;
            case 2:
                TweaksActivity tweaksActivity = (TweaksActivity) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i3 = TweaksActivity.C;
                if (composer2.shouldExecute((intValue2 & 3) != 2, intValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-993553266, intValue2, -1, "com.lumi.singularity.ui.activities.TweaksActivity.onCreate.<anonymous> (TweaksActivity.kt:570)");
                    }
                    Object rememberedValue = composer2.rememberedValue();
                    Composer.Companion companion = Composer.Companion;
                    hm hmVar = null;
                    if (rememberedValue == companion.getEmpty()) {
                        if (!z2) {
                            z = false;
                        }
                        rememberedValue = uo.a(z, null, 2, null, composer2);
                    }
                    MutableState mutableState = (MutableState) rememberedValue;
                    boolean changed = composer2.changed(z2);
                    Object rememberedValue2 = composer2.rememberedValue();
                    if (changed || rememberedValue2 == companion.getEmpty()) {
                        rememberedValue2 = new qt0(z2, mutableState, hmVar, i2);
                        composer2.updateRememberedValue(rememberedValue2);
                    }
                    EffectsKt.LaunchedEffect(w01Var, (my) rememberedValue2, composer2, 6);
                    MaterialThemeKt.MaterialTheme(y90.a(composer2), null, null, ComposableLambdaKt.rememberComposableLambda(-918716830, true, new tw0(tweaksActivity, mutableState, r6), composer2, 54), composer2, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return w01Var;
            default:
                ModalWideNavigationRailContent_pU6N4AM$lambda$23$lambda$22 = WideNavigationRailKt.ModalWideNavigationRailContent_pU6N4AM$lambda$23$lambda$22(z2, z, (ModalWideNavigationRailState) obj3, (IntSize) obj, (Constraints) obj2);
                return ModalWideNavigationRailContent_pU6N4AM$lambda$23$lambda$22;
        }
    }

    public /* synthetic */ m70(boolean z, boolean z2, Object obj, int i) {
        this.d = i;
        this.e = z;
        this.f = z2;
        this.g = obj;
    }
}
