package androidx.compose.ui.semantics;

import android.graphics.Region;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.unit.IntRect;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class SemanticRegionImpl implements SemanticsRegion {
    private final Region region = new Region();

    @Override // androidx.compose.ui.semantics.SemanticsRegion
    public boolean difference(IntRect intRect) {
        return this.region.op(intRect.getLeft(), intRect.getTop(), intRect.getRight(), intRect.getBottom(), Region.Op.DIFFERENCE);
    }

    @Override // androidx.compose.ui.semantics.SemanticsRegion
    public IntRect getBounds() {
        return RectHelper_androidKt.toComposeIntRect(this.region.getBounds());
    }

    public final Region getRegion() {
        return this.region;
    }

    @Override // androidx.compose.ui.semantics.SemanticsRegion
    public boolean intersect(SemanticsRegion semanticsRegion) {
        Region region = this.region;
        semanticsRegion.getClass();
        return region.op(((SemanticRegionImpl) semanticsRegion).region, Region.Op.INTERSECT);
    }

    @Override // androidx.compose.ui.semantics.SemanticsRegion
    public boolean isEmpty() {
        return this.region.isEmpty();
    }

    @Override // androidx.compose.ui.semantics.SemanticsRegion
    public void set(IntRect intRect) {
        this.region.set(intRect.getLeft(), intRect.getTop(), intRect.getRight(), intRect.getBottom());
    }
}
