package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ColorPainter extends Painter {
    public static final int $stable = 8;
    private float alpha;
    private final long color;
    private ColorFilter colorFilter;
    private final long intrinsicSize;

    private ColorPainter(long j) {
        this.color = j;
        this.alpha = 1.0f;
        this.intrinsicSize = Size.Companion.m4593getUnspecifiedNHjbRc();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyAlpha(float f) {
        this.alpha = f;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ColorPainter) && Color.m4762equalsimpl0(this.color, ((ColorPainter) obj).color);
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m5459getColor0d7_KjU() {
        return this.color;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo5455getIntrinsicSizeNHjbRc() {
        return this.intrinsicSize;
    }

    public int hashCode() {
        return Color.m4768hashCodeimpl(this.color);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(DrawScope drawScope) {
        DrawScope.m5329drawRectnJ9OG0$default(drawScope, this.color, 0L, 0L, this.alpha, null, this.colorFilter, 0, 86, null);
    }

    public String toString() {
        return "ColorPainter(color=" + ((Object) Color.m4769toStringimpl(this.color)) + ')';
    }

    public /* synthetic */ ColorPainter(long j, dq dqVar) {
        this(j);
    }
}
