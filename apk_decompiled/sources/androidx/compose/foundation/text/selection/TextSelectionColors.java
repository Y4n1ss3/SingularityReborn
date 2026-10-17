package androidx.compose.foundation.text.selection;

import androidx.compose.ui.graphics.Color;
import defpackage.dq;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextSelectionColors {
    public static final int $stable = 0;
    private final long backgroundColor;
    private final long handleColor;

    private TextSelectionColors(long j, long j2) {
        this.handleColor = j;
        this.backgroundColor = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextSelectionColors)) {
            return false;
        }
        TextSelectionColors textSelectionColors = (TextSelectionColors) obj;
        return Color.m4762equalsimpl0(this.handleColor, textSelectionColors.handleColor) && Color.m4762equalsimpl0(this.backgroundColor, textSelectionColors.backgroundColor);
    }

    /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m1568getBackgroundColor0d7_KjU() {
        return this.backgroundColor;
    }

    /* renamed from: getHandleColor-0d7_KjU, reason: not valid java name */
    public final long m1569getHandleColor0d7_KjU() {
        return this.handleColor;
    }

    public int hashCode() {
        return Color.m4768hashCodeimpl(this.backgroundColor) + (Color.m4768hashCodeimpl(this.handleColor) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        kp0.i(this.handleColor, sb, ", selectionBackgroundColor=");
        sb.append((Object) Color.m4769toStringimpl(this.backgroundColor));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ TextSelectionColors(long j, long j2, dq dqVar) {
        this(j, j2);
    }
}
