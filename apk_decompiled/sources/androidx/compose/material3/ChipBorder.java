package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import defpackage.dq;
import defpackage.er;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@er
/* loaded from: classes.dex */
public final class ChipBorder {
    public static final int $stable = 0;
    private final long borderColor;
    private final float borderWidth;
    private final long disabledBorderColor;

    private ChipBorder(long j, long j2, float f) {
        this.borderColor = j;
        this.disabledBorderColor = j2;
        this.borderWidth = f;
    }

    public final State<BorderStroke> borderStroke$material3(boolean z, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1899621712, i, -1, "androidx.compose.material3.ChipBorder.borderStroke (Chip.kt:2915)");
        }
        State<BorderStroke> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(BorderStrokeKt.m253BorderStrokecXLIe8U(this.borderWidth, z ? this.borderColor : this.disabledBorderColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return rememberUpdatedState;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ChipBorder)) {
            return false;
        }
        ChipBorder chipBorder = (ChipBorder) obj;
        return Color.m4762equalsimpl0(this.borderColor, chipBorder.borderColor) && Color.m4762equalsimpl0(this.disabledBorderColor, chipBorder.disabledBorderColor) && Dp.m7616equalsimpl0(this.borderWidth, chipBorder.borderWidth);
    }

    public int hashCode() {
        return Dp.m7617hashCodeimpl(this.borderWidth) + kp0.d(this.disabledBorderColor, Color.m4768hashCodeimpl(this.borderColor) * 31, 31);
    }

    public /* synthetic */ ChipBorder(long j, long j2, float f, dq dqVar) {
        this(j, j2, f);
    }
}
