package androidx.compose.runtime.retain;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import defpackage.er;
import defpackage.iy;
import defpackage.ky;
import defpackage.ou;
import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RetainedEffectKt {
    private static final RetainedEffectScope InternalRetainedEffectScope = new RetainedEffectScope();
    private static final String RetainedEffectNoParamError = "RetainedEffect must provide one or more 'key' parameters that define the identity of the RetainedEffect and determine when its previous effect should be disposed and a new effect started for the new key.";

    public static final void RetainedEffect(Object[] objArr, ky kyVar, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(712993160, i, -1, "androidx.compose.runtime.retain.RetainedEffect (RetainedEffect.kt:293)");
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        boolean z = (((i & 112) ^ 48) > 32 && composer.changed(kyVar)) || (i & 48) == 32;
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new ou(kyVar, 4);
            composer.updateRememberedValue(rememberedValue);
        }
        RetainKt.retain(1776543431, Arrays.copyOf(copyOf, copyOf.length), (iy) rememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RetainedEffectImpl RetainedEffect$lambda$0$0(ky kyVar) {
        return new RetainedEffectImpl(kyVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RetainedEffectImpl RetainedEffect$lambda$1$0(ky kyVar) {
        return new RetainedEffectImpl(kyVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RetainedEffectImpl RetainedEffect$lambda$2$0(ky kyVar) {
        return new RetainedEffectImpl(kyVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RetainedEffectImpl RetainedEffect$lambda$3$0(ky kyVar) {
        return new RetainedEffectImpl(kyVar);
    }

    public static final void RetainedEffect(Object obj, ky kyVar, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(45580315, i, -1, "androidx.compose.runtime.retain.RetainedEffect (RetainedEffect.kt:138)");
        }
        Object[] objArr = {obj};
        boolean z = (((i & 112) ^ 48) > 32 && composer.changed(kyVar)) || (i & 48) == 32;
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new ou(kyVar, 2);
            composer.updateRememberedValue(rememberedValue);
        }
        RetainKt.retain(1776543431, Arrays.copyOf(objArr, 1), (iy) rememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final void RetainedEffect(Object obj, Object obj2, ky kyVar, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-593547589, i, -1, "androidx.compose.runtime.retain.RetainedEffect (RetainedEffect.kt:190)");
        }
        Object[] objArr = {obj, obj2};
        int i2 = 1;
        boolean z = (((i & 896) ^ 384) > 256 && composer.changed(kyVar)) || (i & 384) == 256;
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new ou(kyVar, i2);
            composer.updateRememberedValue(rememberedValue);
        }
        RetainKt.retain(1776543431, Arrays.copyOf(objArr, 2), (iy) rememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final void RetainedEffect(Object obj, Object obj2, Object obj3, ky kyVar, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(130977115, i, -1, "androidx.compose.runtime.retain.RetainedEffect (RetainedEffect.kt:243)");
        }
        Object[] objArr = {obj, obj2, obj3};
        boolean z = (((i & 7168) ^ 3072) > 2048 && composer.changed(kyVar)) || (i & 3072) == 2048;
        Object rememberedValue = composer.rememberedValue();
        int i2 = 3;
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new ou(kyVar, i2);
            composer.updateRememberedValue(rememberedValue);
        }
        RetainKt.retain(1776543431, Arrays.copyOf(objArr, 3), (iy) rememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @er
    public static final void RetainedEffect(ky kyVar, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(829391227, i, -1, "androidx.compose.runtime.retain.RetainedEffect (RetainedEffect.kt:87)");
        }
        throw new IllegalStateException(RetainedEffectNoParamError);
    }
}
