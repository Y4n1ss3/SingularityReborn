package androidx.compose.foundation;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.unit.Dp;
import defpackage.dq;
import defpackage.fc;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BorderStroke {
    public static final int $stable = 0;
    private final Brush brush;
    private final float width;

    private BorderStroke(float f, Brush brush) {
        this.width = f;
        this.brush = brush;
    }

    /* renamed from: copy-D5KLDUw$default, reason: not valid java name */
    public static /* synthetic */ BorderStroke m250copyD5KLDUw$default(BorderStroke borderStroke, float f, Brush brush, int i, Object obj) {
        if ((i & 1) != 0) {
            f = borderStroke.width;
        }
        if ((i & 2) != 0) {
            brush = borderStroke.brush;
        }
        return borderStroke.m251copyD5KLDUw(f, brush);
    }

    /* renamed from: copy-D5KLDUw, reason: not valid java name */
    public final BorderStroke m251copyD5KLDUw(float f, Brush brush) {
        return new BorderStroke(f, brush, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderStroke)) {
            return false;
        }
        BorderStroke borderStroke = (BorderStroke) obj;
        return Dp.m7616equalsimpl0(this.width, borderStroke.width) && q10.b(this.brush, borderStroke.brush);
    }

    public final Brush getBrush() {
        return this.brush;
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final float m252getWidthD9Ej5fM() {
        return this.width;
    }

    public int hashCode() {
        return this.brush.hashCode() + (Dp.m7617hashCodeimpl(this.width) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BorderStroke(width=");
        fc.i(this.width, sb, ", brush=");
        sb.append(this.brush);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ BorderStroke(float f, Brush brush, dq dqVar) {
        this(f, brush);
    }
}
