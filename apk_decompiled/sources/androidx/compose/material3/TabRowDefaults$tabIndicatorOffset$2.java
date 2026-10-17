package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import defpackage.ky;
import defpackage.ny;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TabRowDefaults$tabIndicatorOffset$2 implements ny {
    final /* synthetic */ TabPosition $currentTabPosition;

    public TabRowDefaults$tabIndicatorOffset$2(TabPosition tabPosition) {
        this.$currentTabPosition = tabPosition;
    }

    private static final float invoke$lambda$0(State<Dp> state) {
        return state.getValue().m7625unboximpl();
    }

    private static final float invoke$lambda$1(State<Dp> state) {
        return state.getValue().m7625unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset invoke$lambda$3$lambda$2(State state, Density density) {
        return IntOffset.m7730boximpl(IntOffset.m7733constructorimpl(density.mo361roundToPx0680j_4(invoke$lambda$1(state)) << 32));
    }

    public final Modifier invoke(Modifier modifier, Composer composer, int i) {
        composer.startReplaceGroup(-1541271084);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1541271084, i, -1, "androidx.compose.material3.TabRowDefaults.tabIndicatorOffset.<anonymous> (TabRow.kt:1108)");
        }
        float m2503getWidthD9Ej5fM = this.$currentTabPosition.m2503getWidthD9Ej5fM();
        MotionSchemeKeyTokens motionSchemeKeyTokens = MotionSchemeKeyTokens.DefaultSpatial;
        State<Dp> m127animateDpAsStateAjpBEmI = AnimateAsStateKt.m127animateDpAsStateAjpBEmI(m2503getWidthD9Ej5fM, MotionSchemeKt.value(motionSchemeKeyTokens, composer, 6), null, null, composer, 0, 12);
        State<Dp> m127animateDpAsStateAjpBEmI2 = AnimateAsStateKt.m127animateDpAsStateAjpBEmI(this.$currentTabPosition.m2501getLeftD9Ej5fM(), MotionSchemeKt.value(motionSchemeKeyTokens, composer, 6), null, null, composer, 0, 12);
        Modifier wrapContentSize$default = SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), Alignment.Companion.getBottomStart(), false, 2, null);
        boolean changed = composer.changed(m127animateDpAsStateAjpBEmI2);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new g0(m127animateDpAsStateAjpBEmI2, 3);
            composer.updateRememberedValue(rememberedValue);
        }
        Modifier m812width3ABfNKs = SizeKt.m812width3ABfNKs(OffsetKt.offset(wrapContentSize$default, (ky) rememberedValue), invoke$lambda$0(m127animateDpAsStateAjpBEmI));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m812width3ABfNKs;
    }

    @Override // defpackage.ny
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }
}
