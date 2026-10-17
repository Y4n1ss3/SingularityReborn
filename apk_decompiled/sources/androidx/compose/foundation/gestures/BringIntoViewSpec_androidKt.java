package androidx.compose.foundation.gestures;

import android.content.Context;
import androidx.compose.runtime.CompositionLocalAccessorScope;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.ed;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BringIntoViewSpec_androidKt {
    private static final ProvidableCompositionLocal<BringIntoViewSpec> LocalBringIntoViewSpec = CompositionLocalKt.compositionLocalWithComputedDefaultOf(new ed(8));
    private static final BringIntoViewSpec PivotBringIntoViewSpec = new BringIntoViewSpec() { // from class: androidx.compose.foundation.gestures.BringIntoViewSpec_androidKt$PivotBringIntoViewSpec$1
        private final float childFraction;
        private final float parentFraction = 0.3f;

        @Override // androidx.compose.foundation.gestures.BringIntoViewSpec
        public float calculateScrollDistance(float f, float f2, float f3) {
            float abs = Math.abs((f2 + f) - f);
            boolean z = abs <= f3;
            float f4 = (this.parentFraction * f3) - (this.childFraction * abs);
            float f5 = f3 - f4;
            if (z && f5 < abs) {
                f4 = f3 - abs;
            }
            return f - f4;
        }

        public final float getChildFraction() {
            return this.childFraction;
        }

        public final float getParentFraction() {
            return this.parentFraction;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final BringIntoViewSpec LocalBringIntoViewSpec$lambda$0(CompositionLocalAccessorScope compositionLocalAccessorScope) {
        return !((Context) compositionLocalAccessorScope.getCurrentValue(AndroidCompositionLocals_androidKt.getLocalContext())).getPackageManager().hasSystemFeature("android.software.leanback") ? BringIntoViewSpec.Companion.getDefaultBringIntoViewSpec$foundation() : PivotBringIntoViewSpec;
    }

    public static final ProvidableCompositionLocal<BringIntoViewSpec> getLocalBringIntoViewSpec() {
        return LocalBringIntoViewSpec;
    }

    public static final BringIntoViewSpec getPivotBringIntoViewSpec() {
        return PivotBringIntoViewSpec;
    }

    public static /* synthetic */ void getLocalBringIntoViewSpec$annotations() {
    }

    public static /* synthetic */ void getPivotBringIntoViewSpec$annotations() {
    }
}
