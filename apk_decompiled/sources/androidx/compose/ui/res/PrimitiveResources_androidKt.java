package androidx.compose.ui.res;

import android.content.res.Resources;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class PrimitiveResources_androidKt {
    public static final boolean booleanResource(int i, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-432394447, i2, -1, "androidx.compose.ui.res.booleanResource (PrimitiveResources.android.kt:60)");
        }
        boolean z = ((Resources) composer.consume(AndroidCompositionLocals_androidKt.getLocalResources())).getBoolean(i);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return z;
    }

    public static final float dimensionResource(int i, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(804324951, i2, -1, "androidx.compose.ui.res.dimensionResource (PrimitiveResources.android.kt:72)");
        }
        float m7611constructorimpl = Dp.m7611constructorimpl(((Resources) composer.consume(AndroidCompositionLocals_androidKt.getLocalResources())).getDimension(i) / ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).getDensity());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m7611constructorimpl;
    }

    public static final int[] integerArrayResource(int i, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-93991766, i2, -1, "androidx.compose.ui.res.integerArrayResource (PrimitiveResources.android.kt:48)");
        }
        int[] intArray = ((Resources) composer.consume(AndroidCompositionLocals_androidKt.getLocalResources())).getIntArray(i);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return intArray;
    }

    public static final int integerResource(int i, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(916701108, i2, -1, "androidx.compose.ui.res.integerResource (PrimitiveResources.android.kt:36)");
        }
        int integer = ((Resources) composer.consume(AndroidCompositionLocals_androidKt.getLocalResources())).getInteger(i);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return integer;
    }
}
