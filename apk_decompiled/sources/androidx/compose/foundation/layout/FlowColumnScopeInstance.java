package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FlowColumnScopeInstance implements ColumnScope, FlowColumnScope {
    public static final int $stable = 0;
    public static final FlowColumnScopeInstance INSTANCE = new FlowColumnScopeInstance();
    private final /* synthetic */ ColumnScopeInstance $$delegate_0 = ColumnScopeInstance.INSTANCE;

    private FlowColumnScopeInstance() {
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public Modifier align(Modifier modifier, Alignment.Horizontal horizontal) {
        return this.$$delegate_0.align(modifier, horizontal);
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public Modifier alignBy(Modifier modifier, ky kyVar) {
        return this.$$delegate_0.alignBy(modifier, kyVar);
    }

    @Override // androidx.compose.foundation.layout.FlowColumnScope
    public Modifier fillMaxColumnWidth(Modifier modifier, float f) {
        if (!(f >= 0.0f && f <= 1.0f)) {
            InlineClassHelperKt.throwIllegalArgumentException("invalid fraction " + f + "; must be >= 0 and <= 1.0");
        }
        return modifier.then(new FillCrossAxisSizeElement(f));
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public Modifier weight(Modifier modifier, float f, boolean z) {
        return this.$$delegate_0.weight(modifier, f, z);
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public Modifier alignBy(Modifier modifier, VerticalAlignmentLine verticalAlignmentLine) {
        return this.$$delegate_0.alignBy(modifier, verticalAlignmentLine);
    }
}
