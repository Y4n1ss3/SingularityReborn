package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import defpackage.ky;
import defpackage.lf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SwipeToDismissBoxDefaults {
    public static final int $stable = 0;
    public static final SwipeToDismissBoxDefaults INSTANCE = new SwipeToDismissBoxDefaults();

    private SwipeToDismissBoxDefaults() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float _get_positionalThreshold_$lambda$2$lambda$1$lambda$0(Density density, float f) {
        return density.mo367toPx0680j_4(Dp.m7611constructorimpl(56.0f));
    }

    public final ky getPositionalThreshold(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1545861529, i, -1, "androidx.compose.material3.SwipeToDismissBoxDefaults.<get-positionalThreshold> (SwipeToDismissBox.kt:362)");
        }
        composer.startReplaceGroup(-485754360);
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        boolean changed = composer.changed(density);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new lf0(density, 1);
            composer.updateRememberedValue(rememberedValue);
        }
        ky kyVar = (ky) rememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return kyVar;
    }
}
