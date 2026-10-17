package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Fields;
import defpackage.oi;
import defpackage.q10;
import defpackage.re0;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PagerLazyLayoutItemProvider implements LazyLayoutItemProvider {
    public static final int $stable = 0;
    private final LazyLayoutIntervalContent<PagerIntervalContent> intervalContent;
    private final LazyLayoutKeyIndexMap keyIndexMap;
    private final PagerScopeImpl pagerScopeImpl = PagerScopeImpl.INSTANCE;
    private final PagerState state;

    public PagerLazyLayoutItemProvider(PagerState pagerState, LazyLayoutIntervalContent<PagerIntervalContent> lazyLayoutIntervalContent, LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap) {
        this.state = pagerState;
        this.intervalContent = lazyLayoutIntervalContent;
        this.keyIndexMap = lazyLayoutKeyIndexMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Item$lambda$0(PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1142237095, i2, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item.<anonymous> (LazyLayoutPager.kt:210)");
            }
            IntervalList.Interval<PagerIntervalContent> interval = pagerLazyLayoutItemProvider.intervalContent.getIntervals().get(i);
            interval.getValue().getItem().invoke(pagerLazyLayoutItemProvider.pagerScopeImpl, Integer.valueOf(i - interval.getStartIndex()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Item$lambda$1(PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i, Object obj, int i2, Composer composer, int i3) {
        pagerLazyLayoutItemProvider.Item(i, obj, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return w01.a;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public void Item(int i, Object obj, Composer composer, int i2) {
        int i3;
        int i4;
        Object obj2;
        Composer startRestartGroup = composer.startRestartGroup(-1201380429);
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
                ComposerKt.traceEventStart(-1201380429, i3, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item (LazyLayoutPager.kt:208)");
            }
            i4 = i;
            obj2 = obj;
            LazyLayoutPinnableItemKt.LazyLayoutPinnableItem(obj2, i4, this.state.getPinnedPages$foundation(), ComposableLambdaKt.rememberComposableLambda(1142237095, true, new oi(this, i, 5), startRestartGroup, 54), startRestartGroup, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
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
            endRestartGroup.updateScope(new re0(this, i4, obj2, i2));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PagerLazyLayoutItemProvider) {
            return q10.b(this.intervalContent, ((PagerLazyLayoutItemProvider) obj).intervalContent);
        }
        return false;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getIndex(Object obj) {
        return this.keyIndexMap.getIndex(obj);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getItemCount() {
        return this.intervalContent.getItemCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public Object getKey(int i) {
        Object key = this.keyIndexMap.getKey(i);
        return key == null ? this.intervalContent.getKey(i) : key;
    }

    public int hashCode() {
        return this.intervalContent.hashCode();
    }
}
