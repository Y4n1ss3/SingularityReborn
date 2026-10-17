package androidx.compose.foundation.gestures;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AnchoredDraggableState$anchoredDragScope$1 implements AnchoredDragScope {
    private float distance = Float.NaN;
    private T leftBound;
    private T rightBound;
    final /* synthetic */ AnchoredDraggableState<T> this$0;

    public AnchoredDraggableState$anchoredDragScope$1(AnchoredDraggableState<T> anchoredDraggableState) {
        this.this$0 = anchoredDraggableState;
    }

    @Override // androidx.compose.foundation.gestures.AnchoredDragScope
    public void dragTo(float f, float f2) {
        float offset = this.this$0.getOffset();
        this.this$0.setOffset(f);
        this.this$0.setLastVelocity(f2);
        if (Float.isNaN(offset)) {
            return;
        }
        updateIfNeeded(f >= offset);
    }

    public final float getDistance() {
        return this.distance;
    }

    public final T getLeftBound() {
        return this.leftBound;
    }

    public final T getRightBound() {
        return this.rightBound;
    }

    public final void setDistance(float f) {
        this.distance = f;
    }

    public final void setLeftBound(T t) {
        this.leftBound = t;
    }

    public final void setRightBound(T t) {
        this.rightBound = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14, types: [T, java.lang.Object] */
    public final void updateBounds(boolean z) {
        float positionOf = this.this$0.getAnchors().positionOf(this.this$0.getCurrentValue());
        float offset = this.this$0.getOffset();
        AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
        if (offset == positionOf) {
            Object closestAnchor = this.this$0.getAnchors().closestAnchor(anchoredDraggableState.getOffset() + (z ? 1.0f : -1.0f), z);
            T t = closestAnchor;
            if (closestAnchor == null) {
                t = this.this$0.getCurrentValue();
            }
            if (z) {
                this.leftBound = this.this$0.getCurrentValue();
                this.rightBound = t;
            } else {
                this.leftBound = t;
                this.rightBound = this.this$0.getCurrentValue();
            }
        } else {
            Object closestAnchor2 = anchoredDraggableState.getAnchors().closestAnchor(this.this$0.getOffset(), false);
            T t2 = closestAnchor2;
            if (closestAnchor2 == null) {
                t2 = this.this$0.getCurrentValue();
            }
            Object closestAnchor3 = this.this$0.getAnchors().closestAnchor(this.this$0.getOffset(), true);
            T t3 = closestAnchor3;
            if (closestAnchor3 == null) {
                t3 = this.this$0.getCurrentValue();
            }
            this.leftBound = t2;
            this.rightBound = t3;
        }
        DraggableAnchors anchors = this.this$0.getAnchors();
        T t4 = this.leftBound;
        t4.getClass();
        float positionOf2 = anchors.positionOf(t4);
        DraggableAnchors anchors2 = this.this$0.getAnchors();
        T t5 = this.rightBound;
        t5.getClass();
        this.distance = Math.abs(positionOf2 - anchors2.positionOf(t5));
    }

    public final void updateIfNeeded(boolean z) {
        updateBounds(z);
        if (Math.abs(this.this$0.getOffset() - this.this$0.getAnchors().positionOf(this.this$0.getCurrentValue())) >= this.distance / 2.0f) {
            Object obj = z ? this.rightBound : this.leftBound;
            if (obj == null) {
                obj = this.this$0.getCurrentValue();
            }
            if (((Boolean) this.this$0.getConfirmValueChange$foundation().invoke(obj)).booleanValue()) {
                this.this$0.setCurrentValue(obj);
            }
        }
    }
}
