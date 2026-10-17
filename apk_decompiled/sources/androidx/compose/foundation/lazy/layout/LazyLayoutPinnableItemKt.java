package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.layout.PinnableContainerKt;
import defpackage.g1;
import defpackage.ky;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyLayoutPinnableItemKt {
    public static final void LazyLayoutPinnableItem(Object obj, int i, LazyLayoutPinnedItemList lazyLayoutPinnedItemList, my myVar, Composer composer, int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(872548579);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(lazyLayoutPinnedItemList) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(myVar) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i4 = 1;
        if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(872548579, i3, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem (LazyLayoutPinnableItem.kt:50)");
            }
            boolean changed = startRestartGroup.changed(obj) | startRestartGroup.changed(lazyLayoutPinnedItemList);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new LazyLayoutPinnableItem(obj, lazyLayoutPinnedItemList);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            LazyLayoutPinnableItem lazyLayoutPinnableItem = (LazyLayoutPinnableItem) rememberedValue;
            lazyLayoutPinnableItem.setIndex(i);
            lazyLayoutPinnableItem.setParentPinnableContainer((PinnableContainer) startRestartGroup.consume(PinnableContainerKt.getLocalPinnableContainer()));
            boolean changed2 = startRestartGroup.changed(lazyLayoutPinnableItem);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new d(lazyLayoutPinnableItem, i4);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            EffectsKt.DisposableEffect(lazyLayoutPinnableItem, (ky) rememberedValue2, startRestartGroup, 0);
            CompositionLocalKt.CompositionLocalProvider(PinnableContainerKt.getLocalPinnableContainer().provides(lazyLayoutPinnableItem), myVar, startRestartGroup, ((i3 >> 6) & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new g1(obj, i, lazyLayoutPinnedItemList, myVar, i2, 7));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult LazyLayoutPinnableItem$lambda$1$0(final LazyLayoutPinnableItem lazyLayoutPinnableItem, DisposableEffectScope disposableEffectScope) {
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$lambda$1$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                LazyLayoutPinnableItem.this.onDisposed();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LazyLayoutPinnableItem$lambda$2(Object obj, int i, LazyLayoutPinnedItemList lazyLayoutPinnedItemList, my myVar, int i2, Composer composer, int i3) {
        LazyLayoutPinnableItem(obj, i, lazyLayoutPinnedItemList, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return w01.a;
    }
}
