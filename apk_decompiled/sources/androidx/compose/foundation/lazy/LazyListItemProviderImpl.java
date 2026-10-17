package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Fields;
import defpackage.e10;
import defpackage.my;
import defpackage.q10;
import defpackage.w01;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyListItemProviderImpl implements LazyListItemProvider {
    private final LazyListIntervalContent intervalContent;
    private final LazyItemScopeImpl itemScope;
    private final LazyLayoutKeyIndexMap keyIndexMap;
    private final LazyListState state;

    public LazyListItemProviderImpl(LazyListState lazyListState, LazyListIntervalContent lazyListIntervalContent, LazyItemScopeImpl lazyItemScopeImpl, LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap) {
        this.state = lazyListState;
        this.intervalContent = lazyListIntervalContent;
        this.itemScope = lazyItemScopeImpl;
        this.keyIndexMap = lazyLayoutKeyIndexMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Item$lambda$0(LazyListItemProviderImpl lazyListItemProviderImpl, int i, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-824725566, i2, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item.<anonymous> (LazyListItemProvider.kt:78)");
            }
            IntervalList.Interval<LazyListInterval> interval = lazyListItemProviderImpl.intervalContent.getIntervals().get(i);
            interval.getValue().getItem().invoke(lazyListItemProviderImpl.getItemScope(), Integer.valueOf(i - interval.getStartIndex()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Item$lambda$1(LazyListItemProviderImpl lazyListItemProviderImpl, int i, Object obj, int i2, Composer composer, int i3) {
        lazyListItemProviderImpl.Item(i, obj, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return w01.a;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public void Item(final int i, Object obj, Composer composer, final int i2) {
        int i3;
        final int i4;
        final Object obj2;
        Composer startRestartGroup = composer.startRestartGroup(-462424778);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(obj) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changed(this) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-462424778, i3, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item (LazyListItemProvider.kt:76)");
            }
            i4 = i;
            obj2 = obj;
            LazyLayoutPinnableItemKt.LazyLayoutPinnableItem(obj2, i4, this.state.getPinnedItems$foundation(), ComposableLambdaKt.rememberComposableLambda(-824725566, true, new my() { // from class: androidx.compose.foundation.lazy.a
                @Override // defpackage.my
                public final Object invoke(Object obj3, Object obj4) {
                    w01 Item$lambda$0;
                    int intValue = ((Integer) obj4).intValue();
                    Item$lambda$0 = LazyListItemProviderImpl.Item$lambda$0(LazyListItemProviderImpl.this, i, (Composer) obj3, intValue);
                    return Item$lambda$0;
                }
            }, startRestartGroup, 54), startRestartGroup, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            i4 = i;
            obj2 = obj;
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new my() { // from class: androidx.compose.foundation.lazy.b
                @Override // defpackage.my
                public final Object invoke(Object obj3, Object obj4) {
                    w01 Item$lambda$1;
                    int intValue = ((Integer) obj4).intValue();
                    Item$lambda$1 = LazyListItemProviderImpl.Item$lambda$1(LazyListItemProviderImpl.this, i4, obj2, i2, (Composer) obj3, intValue);
                    return Item$lambda$1;
                }
            });
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LazyListItemProviderImpl) {
            return q10.b(this.intervalContent, ((LazyListItemProviderImpl) obj).intervalContent);
        }
        return false;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public Object getContentType(int i) {
        return this.intervalContent.getContentType(i);
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemProvider
    public e10 getHeaderIndexes() {
        return this.intervalContent.getHeaderIndexes();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getIndex(Object obj) {
        return getKeyIndexMap().getIndex(obj);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getItemCount() {
        return this.intervalContent.getItemCount();
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemProvider
    public LazyItemScopeImpl getItemScope() {
        return this.itemScope;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public Object getKey(int i) {
        Object key = getKeyIndexMap().getKey(i);
        return key == null ? this.intervalContent.getKey(i) : key;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemProvider
    public LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.keyIndexMap;
    }

    public int hashCode() {
        return this.intervalContent.hashCode();
    }
}
