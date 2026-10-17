package androidx.compose.ui.layout;

import defpackage.c21;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class RectRulersImpl implements RectRulers {
    private final String name;
    private VerticalRuler left = new VerticalRuler();
    private HorizontalRuler top = new HorizontalRuler();
    private VerticalRuler right = new VerticalRuler();
    private HorizontalRuler bottom = new HorizontalRuler();

    public RectRulersImpl(String str) {
        this.name = str;
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

    public void setBottom(HorizontalRuler horizontalRuler) {
        this.bottom = horizontalRuler;
    }

    public void setLeft(VerticalRuler verticalRuler) {
        this.left = verticalRuler;
    }

    public void setRight(VerticalRuler verticalRuler) {
        this.right = verticalRuler;
    }

    public void setTop(HorizontalRuler horizontalRuler) {
        this.top = horizontalRuler;
    }

    public String toString() {
        return this.name != null ? c21.a(new StringBuilder("RectRulers("), this.name, ')') : super.toString();
    }
}
