package androidx.compose.ui.platform;

import androidx.compose.ui.node.OwnerScope;
import androidx.compose.ui.semantics.ScrollAxisRange;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ScrollObservationScope implements OwnerScope {
    public static final int $stable = 8;
    private final List<ScrollObservationScope> allScopes;
    private ScrollAxisRange horizontalScrollAxisRange;
    private Float oldXValue;
    private Float oldYValue;
    private final int semanticsNodeId;
    private ScrollAxisRange verticalScrollAxisRange;

    public ScrollObservationScope(int i, List<ScrollObservationScope> list, Float f, Float f2, ScrollAxisRange scrollAxisRange, ScrollAxisRange scrollAxisRange2) {
        this.semanticsNodeId = i;
        this.allScopes = list;
        this.oldXValue = f;
        this.oldYValue = f2;
        this.horizontalScrollAxisRange = scrollAxisRange;
        this.verticalScrollAxisRange = scrollAxisRange2;
    }

    public final List<ScrollObservationScope> getAllScopes() {
        return this.allScopes;
    }

    public final ScrollAxisRange getHorizontalScrollAxisRange() {
        return this.horizontalScrollAxisRange;
    }

    public final Float getOldXValue() {
        return this.oldXValue;
    }

    public final Float getOldYValue() {
        return this.oldYValue;
    }

    public final int getSemanticsNodeId() {
        return this.semanticsNodeId;
    }

    public final ScrollAxisRange getVerticalScrollAxisRange() {
        return this.verticalScrollAxisRange;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return this.allScopes.contains(this);
    }

    public final void setHorizontalScrollAxisRange(ScrollAxisRange scrollAxisRange) {
        this.horizontalScrollAxisRange = scrollAxisRange;
    }

    public final void setOldXValue(Float f) {
        this.oldXValue = f;
    }

    public final void setOldYValue(Float f) {
        this.oldYValue = f;
    }

    public final void setVerticalScrollAxisRange(ScrollAxisRange scrollAxisRange) {
        this.verticalScrollAxisRange = scrollAxisRange;
    }
}
