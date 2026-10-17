package androidx.compose.ui.semantics;

import defpackage.dq;
import defpackage.fc;
import defpackage.o;
import defpackage.q10;
import defpackage.ti;
import defpackage.ui;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ProgressBarRangeInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final ProgressBarRangeInfo Indeterminate = new ProgressBarRangeInfo(0.0f, new ti(0.0f, 0.0f), 0, 4, null);
    private final float current;
    private final ui range;
    private final int steps;

    public ProgressBarRangeInfo(float f, ui uiVar, int i) {
        this.current = f;
        this.range = uiVar;
        this.steps = i;
        if (Float.isNaN(f)) {
            o.m("current must not be NaN");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgressBarRangeInfo)) {
            return false;
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) obj;
        return this.current == progressBarRangeInfo.current && q10.b(this.range, progressBarRangeInfo.range) && this.steps == progressBarRangeInfo.steps;
    }

    public final float getCurrent() {
        return this.current;
    }

    public final ui getRange() {
        return this.range;
    }

    public final int getSteps() {
        return this.steps;
    }

    public int hashCode() {
        return ((this.range.hashCode() + (Float.hashCode(this.current) * 31)) * 31) + this.steps;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ProgressBarRangeInfo(current=");
        sb.append(this.current);
        sb.append(", range=");
        sb.append(this.range);
        sb.append(", steps=");
        return fc.e(sb, this.steps, ')');
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final ProgressBarRangeInfo getIndeterminate() {
            return ProgressBarRangeInfo.Indeterminate;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ProgressBarRangeInfo(float f, ui uiVar, int i, int i2, dq dqVar) {
        this(f, uiVar, (i2 & 4) != 0 ? 0 : i);
    }
}
