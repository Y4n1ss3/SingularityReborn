package androidx.compose.runtime.reflect;

import defpackage.fc;
import defpackage.j50;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ComposableInfo {
    public static final int $stable = 0;
    private final int changedParams;
    private final int defaultParams;
    private final boolean isComposable;
    private final int realParamsCount;

    public ComposableInfo(boolean z, int i, int i2, int i3) {
        this.isComposable = z;
        this.realParamsCount = i;
        this.changedParams = i2;
        this.defaultParams = i3;
    }

    public static /* synthetic */ ComposableInfo copy$default(ComposableInfo composableInfo, boolean z, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z = composableInfo.isComposable;
        }
        if ((i4 & 2) != 0) {
            i = composableInfo.realParamsCount;
        }
        if ((i4 & 4) != 0) {
            i2 = composableInfo.changedParams;
        }
        if ((i4 & 8) != 0) {
            i3 = composableInfo.defaultParams;
        }
        return composableInfo.copy(z, i, i2, i3);
    }

    public final boolean component1() {
        return this.isComposable;
    }

    public final int component2() {
        return this.realParamsCount;
    }

    public final int component3() {
        return this.changedParams;
    }

    public final int component4() {
        return this.defaultParams;
    }

    public final ComposableInfo copy(boolean z, int i, int i2, int i3) {
        return new ComposableInfo(z, i, i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComposableInfo)) {
            return false;
        }
        ComposableInfo composableInfo = (ComposableInfo) obj;
        return this.isComposable == composableInfo.isComposable && this.realParamsCount == composableInfo.realParamsCount && this.changedParams == composableInfo.changedParams && this.defaultParams == composableInfo.defaultParams;
    }

    public final int getChangedParams() {
        return this.changedParams;
    }

    public final int getDefaultParams() {
        return this.defaultParams;
    }

    public final int getRealParamsCount() {
        return this.realParamsCount;
    }

    public int hashCode() {
        return Integer.hashCode(this.defaultParams) + j50.b(this.changedParams, j50.b(this.realParamsCount, Boolean.hashCode(this.isComposable) * 31, 31), 31);
    }

    public final boolean isComposable() {
        return this.isComposable;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ComposableInfo(isComposable=");
        sb.append(this.isComposable);
        sb.append(", realParamsCount=");
        sb.append(this.realParamsCount);
        sb.append(", changedParams=");
        sb.append(this.changedParams);
        sb.append(", defaultParams=");
        return fc.e(sb, this.defaultParams, ')');
    }
}
