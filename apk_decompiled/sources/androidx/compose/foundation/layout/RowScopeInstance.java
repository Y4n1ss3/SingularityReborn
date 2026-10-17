package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RowScopeInstance implements RowScope {
    public static final int $stable = 0;
    public static final RowScopeInstance INSTANCE = new RowScopeInstance();

    private RowScopeInstance() {
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public Modifier align(Modifier modifier, Alignment.Vertical vertical) {
        return modifier.then(new VerticalAlignElement(vertical));
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public Modifier alignBy(Modifier modifier, HorizontalAlignmentLine horizontalAlignmentLine) {
        return modifier.then(new WithAlignmentLineElement(horizontalAlignmentLine));
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public Modifier alignByBaseline(Modifier modifier) {
        return alignBy(modifier, androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline());
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public Modifier weight(Modifier modifier, float f, boolean z) {
        if (!(((double) f) > 0.0d)) {
            InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return modifier.then(new LayoutWeightElement(f, z));
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public Modifier alignBy(Modifier modifier, ky kyVar) {
        return modifier.then(new WithAlignmentLineBlockElement(kyVar));
    }
}
