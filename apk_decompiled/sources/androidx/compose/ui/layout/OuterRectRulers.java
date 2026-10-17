package androidx.compose.ui.layout;

import androidx.compose.ui.layout.HorizontalRuler;
import androidx.compose.ui.layout.VerticalRuler;
import defpackage.ac;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class OuterRectRulers implements RectRulers {
    private final HorizontalRuler bottom;
    private final VerticalRuler left;
    private final VerticalRuler right;
    private final RectRulers[] rulers;
    private final HorizontalRuler top;

    public OuterRectRulers(RectRulers[] rectRulersArr) {
        this.rulers = rectRulersArr;
        VerticalRuler.Companion companion = VerticalRuler.Companion;
        int length = rectRulersArr.length;
        VerticalRuler[] verticalRulerArr = new VerticalRuler[length];
        for (int i = 0; i < length; i++) {
            verticalRulerArr[i] = this.rulers[i].getLeft();
        }
        this.left = companion.minOf(verticalRulerArr);
        HorizontalRuler.Companion companion2 = HorizontalRuler.Companion;
        int length2 = this.rulers.length;
        HorizontalRuler[] horizontalRulerArr = new HorizontalRuler[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            horizontalRulerArr[i2] = this.rulers[i2].getTop();
        }
        this.top = companion2.minOf(horizontalRulerArr);
        VerticalRuler.Companion companion3 = VerticalRuler.Companion;
        int length3 = this.rulers.length;
        VerticalRuler[] verticalRulerArr2 = new VerticalRuler[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            verticalRulerArr2[i3] = this.rulers[i3].getRight();
        }
        this.right = companion3.maxOf(verticalRulerArr2);
        HorizontalRuler.Companion companion4 = HorizontalRuler.Companion;
        int length4 = this.rulers.length;
        HorizontalRuler[] horizontalRulerArr2 = new HorizontalRuler[length4];
        for (int i4 = 0; i4 < length4; i4++) {
            horizontalRulerArr2[i4] = this.rulers[i4].getBottom();
        }
        this.bottom = companion4.maxOf(horizontalRulerArr2);
    }

    @Override // androidx.compose.ui.layout.RectRulers
    public HorizontalRuler getBottom() {
        return this.bottom;
    }

    @Override // androidx.compose.ui.layout.RectRulers
    public VerticalRuler getLeft() {
        return this.left;
    }

    @Override // androidx.compose.ui.layout.RectRulers
    public VerticalRuler getRight() {
        return this.right;
    }

    @Override // androidx.compose.ui.layout.RectRulers
    public HorizontalRuler getTop() {
        return this.top;
    }

    public String toString() {
        return ac.h0("outermostOf(", this.rulers);
    }
}
