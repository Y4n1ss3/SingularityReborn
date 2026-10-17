package androidx.compose.material3.carousel;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Rect;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CarouselItemDrawInfoImpl implements CarouselItemDrawInfo {
    public static final int $stable = 0;
    private final MutableFloatState sizeState$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
    private final MutableFloatState minSizeState$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
    private final MutableFloatState maxSizeState$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
    private final MutableState maskRectState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Rect.Companion.getZero(), null, 2, null);

    @Override // androidx.compose.material3.carousel.CarouselItemDrawInfo
    public Rect getMaskRect() {
        return getMaskRectState();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Rect getMaskRectState() {
        return (Rect) this.maskRectState$delegate.getValue();
    }

    @Override // androidx.compose.material3.carousel.CarouselItemDrawInfo
    public float getMaxSize() {
        return getMaxSizeState();
    }

    public final float getMaxSizeState() {
        return this.maxSizeState$delegate.getFloatValue();
    }

    @Override // androidx.compose.material3.carousel.CarouselItemDrawInfo
    public float getMinSize() {
        return getMinSizeState();
    }

    public final float getMinSizeState() {
        return this.minSizeState$delegate.getFloatValue();
    }

    @Override // androidx.compose.material3.carousel.CarouselItemDrawInfo
    public float getSize() {
        return getSizeState();
    }

    public final float getSizeState() {
        return this.sizeState$delegate.getFloatValue();
    }

    public final void setMaskRectState(Rect rect) {
        this.maskRectState$delegate.setValue(rect);
    }

    public final void setMaxSizeState(float f) {
        this.maxSizeState$delegate.setFloatValue(f);
    }

    public final void setMinSizeState(float f) {
        this.minSizeState$delegate.setFloatValue(f);
    }

    public final void setSizeState(float f) {
        this.sizeState$delegate.setFloatValue(f);
    }
}
