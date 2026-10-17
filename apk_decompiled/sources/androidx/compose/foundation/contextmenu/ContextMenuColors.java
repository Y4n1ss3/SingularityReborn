package androidx.compose.foundation.contextmenu;

import androidx.compose.ui.graphics.Color;
import defpackage.dq;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ContextMenuColors {
    public static final int $stable = 0;
    private final long backgroundColor;
    private final long disabledIconColor;
    private final long disabledTextColor;
    private final long iconColor;
    private final long textColor;

    private ContextMenuColors(long j, long j2, long j3, long j4, long j5) {
        this.backgroundColor = j;
        this.textColor = j2;
        this.iconColor = j3;
        this.disabledTextColor = j4;
        this.disabledIconColor = j5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ContextMenuColors)) {
            return false;
        }
        ContextMenuColors contextMenuColors = (ContextMenuColors) obj;
        return Color.m4762equalsimpl0(this.backgroundColor, contextMenuColors.backgroundColor) && Color.m4762equalsimpl0(this.textColor, contextMenuColors.textColor) && Color.m4762equalsimpl0(this.iconColor, contextMenuColors.iconColor) && Color.m4762equalsimpl0(this.disabledTextColor, contextMenuColors.disabledTextColor) && Color.m4762equalsimpl0(this.disabledIconColor, contextMenuColors.disabledIconColor);
    }

    /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m331getBackgroundColor0d7_KjU() {
        return this.backgroundColor;
    }

    /* renamed from: getDisabledIconColor-0d7_KjU, reason: not valid java name */
    public final long m332getDisabledIconColor0d7_KjU() {
        return this.disabledIconColor;
    }

    /* renamed from: getDisabledTextColor-0d7_KjU, reason: not valid java name */
    public final long m333getDisabledTextColor0d7_KjU() {
        return this.disabledTextColor;
    }

    /* renamed from: getIconColor-0d7_KjU, reason: not valid java name */
    public final long m334getIconColor0d7_KjU() {
        return this.iconColor;
    }

    /* renamed from: getTextColor-0d7_KjU, reason: not valid java name */
    public final long m335getTextColor0d7_KjU() {
        return this.textColor;
    }

    public int hashCode() {
        return Color.m4768hashCodeimpl(this.disabledIconColor) + kp0.d(this.disabledTextColor, kp0.d(this.iconColor, kp0.d(this.textColor, Color.m4768hashCodeimpl(this.backgroundColor) * 31, 31), 31), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        kp0.i(this.backgroundColor, sb, ", textColor=");
        kp0.i(this.textColor, sb, ", iconColor=");
        kp0.i(this.iconColor, sb, ", disabledTextColor=");
        kp0.i(this.disabledTextColor, sb, ", disabledIconColor=");
        sb.append((Object) Color.m4769toStringimpl(this.disabledIconColor));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ ContextMenuColors(long j, long j2, long j3, long j4, long j5, dq dqVar) {
        this(j, j2, j3, j4, j5);
    }
}
