package androidx.compose.ui.relocation;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.IntSizeKt;
import defpackage.f30;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class BringIntoViewModifierNodeKt$bringIntoView$2 extends f30 implements iy {
    final /* synthetic */ iy $bounds;
    final /* synthetic */ LayoutCoordinates $layoutCoordinates;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BringIntoViewModifierNodeKt$bringIntoView$2(iy iyVar, LayoutCoordinates layoutCoordinates) {
        super(0);
        this.$bounds = iyVar;
        this.$layoutCoordinates = layoutCoordinates;
    }

    @Override // defpackage.iy
    public final Rect invoke() {
        Rect rect;
        iy iyVar = this.$bounds;
        if (iyVar != null && (rect = (Rect) iyVar.invoke()) != null) {
            return rect;
        }
        LayoutCoordinates layoutCoordinates = this.$layoutCoordinates;
        if (!layoutCoordinates.isAttached()) {
            layoutCoordinates = null;
        }
        if (layoutCoordinates != null) {
            return SizeKt.m4606toRectuvyYCjk(IntSizeKt.m7794toSizeozmzZPI(layoutCoordinates.mo6242getSizeYbymL2g()));
        }
        return null;
    }
}
