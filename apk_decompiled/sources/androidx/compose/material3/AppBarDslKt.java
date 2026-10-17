package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AppBarDslKt {
    public static final AppBarOverflowState rememberAppBarOverflowState(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(209837519, i, -1, "androidx.compose.material3.rememberAppBarOverflowState (AppBarDsl.kt:264)");
        }
        Object[] objArr = new Object[0];
        Saver<AppBarOverflowStateImpl, ?> saver = AppBarOverflowStateImpl.Companion.getSaver();
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new defpackage.e1(2);
            composer.updateRememberedValue(rememberedValue);
        }
        AppBarOverflowStateImpl appBarOverflowStateImpl = (AppBarOverflowStateImpl) RememberSaveableKt.m4146rememberSaveable(objArr, (Saver) saver, (iy) rememberedValue, composer, 384);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return appBarOverflowStateImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppBarOverflowStateImpl rememberAppBarOverflowState$lambda$1$lambda$0() {
        return new AppBarOverflowStateImpl();
    }
}
