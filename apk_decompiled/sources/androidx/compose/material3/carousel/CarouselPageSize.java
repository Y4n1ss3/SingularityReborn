package androidx.compose.material3.carousel;

import androidx.compose.foundation.pager.PageSize;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.unit.Density;
import defpackage.my;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CarouselPageSize implements PageSize {
    public static final int $stable = 0;
    private final float afterContentPadding;
    private final float beforeContentPadding;
    private final my keylineList;
    private final MutableState strategyState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Strategy.Companion.getEmpty(), null, 2, null);

    public CarouselPageSize(my myVar, float f, float f2) {
        this.keylineList = myVar;
        this.beforeContentPadding = f;
        this.afterContentPadding = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Strategy getStrategyState() {
        return (Strategy) this.strategyState$delegate.getValue();
    }

    private final void setStrategyState(Strategy strategy) {
        this.strategyState$delegate.setValue(strategy);
    }

    @Override // androidx.compose.foundation.pager.PageSize
    public int calculateMainAxisPageSize(Density density, int i, int i2) {
        float f = i;
        float f2 = i2;
        setStrategyState(new Strategy((KeylineList) this.keylineList.invoke(Float.valueOf(f), Float.valueOf(f2)), f, f2, this.beforeContentPadding, this.afterContentPadding));
        return getStrategy().isValid() ? y80.P(getStrategy().getItemMainAxisSize()) : i;
    }

    public final Strategy getStrategy() {
        return getStrategyState();
    }
}
