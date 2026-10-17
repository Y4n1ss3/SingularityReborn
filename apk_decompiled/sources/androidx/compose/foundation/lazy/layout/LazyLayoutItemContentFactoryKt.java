package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.graphics.Fields;
import defpackage.g1;
import defpackage.q6;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyLayoutItemContentFactoryKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SkippableItem-JVlU9Rs, reason: not valid java name */
    public static final void m926SkippableItemJVlU9Rs(LazyLayoutItemProvider lazyLayoutItemProvider, Object obj, int i, Object obj2, Composer composer, int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(1439843069);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(lazyLayoutItemProvider) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changed(obj) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changed(i) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changed(obj2) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1439843069, i3, -1, "androidx.compose.foundation.lazy.layout.SkippableItem (LazyLayoutItemContentFactory.kt:124)");
            }
            ((SaveableStateHolder) obj).SaveableStateProvider(obj2, ComposableLambdaKt.rememberComposableLambda(980966366, true, new q6(lazyLayoutItemProvider, i, obj2, 22), startRestartGroup, 54), startRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new g1(lazyLayoutItemProvider, obj, i, obj2, i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SkippableItem_JVlU9Rs$lambda$0(LazyLayoutItemProvider lazyLayoutItemProvider, int i, Object obj, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(980966366, i2, -1, "androidx.compose.foundation.lazy.layout.SkippableItem.<anonymous> (LazyLayoutItemContentFactory.kt:126)");
            }
            lazyLayoutItemProvider.Item(i, obj, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SkippableItem_JVlU9Rs$lambda$1(LazyLayoutItemProvider lazyLayoutItemProvider, Object obj, int i, Object obj2, int i2, Composer composer, int i3) {
        m926SkippableItemJVlU9Rs(lazyLayoutItemProvider, obj, i, obj2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return w01.a;
    }
}
