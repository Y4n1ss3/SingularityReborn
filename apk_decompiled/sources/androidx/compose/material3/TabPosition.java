package androidx.compose.material3;

import androidx.compose.ui.unit.Dp;
import defpackage.dq;
import defpackage.fc;
import defpackage.j50;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TabPosition {
    public static final int $stable = 0;
    private final float contentWidth;
    private final float left;
    private final float width;

    private TabPosition(float f, float f2, float f3) {
        this.left = f;
        this.width = f2;
        this.contentWidth = f3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabPosition)) {
            return false;
        }
        TabPosition tabPosition = (TabPosition) obj;
        return Dp.m7616equalsimpl0(this.left, tabPosition.left) && Dp.m7616equalsimpl0(this.width, tabPosition.width) && Dp.m7616equalsimpl0(this.contentWidth, tabPosition.contentWidth);
    }

    /* renamed from: getContentWidth-D9Ej5fM, reason: not valid java name */
    public final float m2500getContentWidthD9Ej5fM() {
        return this.contentWidth;
    }

    /* renamed from: getLeft-D9Ej5fM, reason: not valid java name */
    public final float m2501getLeftD9Ej5fM() {
        return this.left;
    }

    /* renamed from: getRight-D9Ej5fM, reason: not valid java name */
    public final float m2502getRightD9Ej5fM() {
        return Dp.m7611constructorimpl(this.left + this.width);
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final float m2503getWidthD9Ej5fM() {
        return this.width;
    }

    public int hashCode() {
        return Dp.m7617hashCodeimpl(this.contentWidth) + j50.a(this.width, Dp.m7617hashCodeimpl(this.left) * 31, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TabPosition(left=");
        sb.append((Object) Dp.m7622toStringimpl(this.left));
        sb.append(", right=");
        sb.append((Object) Dp.m7622toStringimpl(m2502getRightD9Ej5fM()));
        sb.append(", width=");
        fc.i(this.width, sb, ", contentWidth=");
        sb.append((Object) Dp.m7622toStringimpl(this.contentWidth));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ TabPosition(float f, float f2, float f3, dq dqVar) {
        this(f, f2, f3);
    }
}
