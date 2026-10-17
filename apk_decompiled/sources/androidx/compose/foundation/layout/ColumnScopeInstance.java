package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ColumnScopeInstance implements ColumnScope {
    public static final int $stable = 0;
    public static final ColumnScopeInstance INSTANCE = new ColumnScopeInstance();

    private ColumnScopeInstance() {
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public Modifier align(Modifier modifier, Alignment.Horizontal horizontal) {
        return modifier.then(new HorizontalAlignElement(horizontal));
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public Modifier alignBy(Modifier modifier, VerticalAlignmentLine verticalAlignmentLine) {
        return modifier.then(new WithAlignmentLineElement(verticalAlignmentLine));
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public Modifier weight(Modifier modifier, float f, boolean z) {
        if (!(((double) f) > 0.0d)) {
            InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return modifier.then(new LayoutWeightElement(f, z));
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public Modifier alignBy(Modifier modifier, ky kyVar) {
        return modifier.then(new WithAlignmentLineBlockElement(kyVar));
    }
}
