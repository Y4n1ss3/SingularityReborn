package androidx.compose.material3;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import androidx.compose.ui.unit.Dp;
import defpackage.er;
import defpackage.ms;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class InteractiveComponentSizeKt {
    private static final HorizontalAlignmentLine MinimumInteractiveTopAlignmentLine = new HorizontalAlignmentLine(InteractiveComponentSizeKt$MinimumInteractiveTopAlignmentLine$1.INSTANCE);
    private static final VerticalAlignmentLine MinimumInteractiveLeftAlignmentLine = new VerticalAlignmentLine(InteractiveComponentSizeKt$MinimumInteractiveLeftAlignmentLine$1.INSTANCE);
    private static final ProvidableCompositionLocal<Boolean> LocalMinimumInteractiveComponentEnforcement = CompositionLocalKt.staticCompositionLocalOf(new ms(6));
    private static final ProvidableCompositionLocal<Dp> LocalMinimumInteractiveComponentSize = CompositionLocalKt.staticCompositionLocalOf(new ms(7));

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LocalMinimumInteractiveComponentEnforcement$lambda$0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Dp LocalMinimumInteractiveComponentSize$lambda$1() {
        return Dp.m7609boximpl(Dp.m7611constructorimpl(48.0f));
    }

    public static final ProvidableCompositionLocal<Boolean> getLocalMinimumInteractiveComponentEnforcement() {
        return LocalMinimumInteractiveComponentEnforcement;
    }

    public static final ProvidableCompositionLocal<Dp> getLocalMinimumInteractiveComponentSize() {
        return LocalMinimumInteractiveComponentSize;
    }

    public static final VerticalAlignmentLine getMinimumInteractiveLeftAlignmentLine() {
        return MinimumInteractiveLeftAlignmentLine;
    }

    public static final HorizontalAlignmentLine getMinimumInteractiveTopAlignmentLine() {
        return MinimumInteractiveTopAlignmentLine;
    }

    public static final Modifier minimumInteractiveComponentSize(Modifier modifier) {
        return modifier.then(MinimumInteractiveModifier.INSTANCE);
    }

    @er
    public static /* synthetic */ void getLocalMinimumInteractiveComponentEnforcement$annotations() {
    }
}
