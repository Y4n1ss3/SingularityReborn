package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import defpackage.iy;
import defpackage.u30;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyStaggeredGridStateKt {
    public static final LazyStaggeredGridState rememberLazyStaggeredGridState(int i, int i2, Composer composer, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i = 0;
        }
        int i5 = 2;
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(161145796, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridState (LazyStaggeredGridState.kt:80)");
        }
        Object[] objArr = new Object[0];
        Saver<LazyStaggeredGridState, Object> saver = LazyStaggeredGridState.Companion.getSaver();
        boolean z = true;
        boolean z2 = (((i3 & 14) ^ 6) > 4 && composer.changed(i)) || (i3 & 6) == 4;
        if ((((i3 & 112) ^ 48) <= 32 || !composer.changed(i2)) && (i3 & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object rememberedValue = composer.rememberedValue();
        if (z3 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new u30(i, i2, i5);
            composer.updateRememberedValue(rememberedValue);
        }
        LazyStaggeredGridState lazyStaggeredGridState = (LazyStaggeredGridState) RememberSaveableKt.m4146rememberSaveable(objArr, (Saver) saver, (iy) rememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyStaggeredGridState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyStaggeredGridState rememberLazyStaggeredGridState$lambda$0$0(int i, int i2) {
        return new LazyStaggeredGridState(i, i2);
    }
}
