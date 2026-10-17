package androidx.compose.ui.layout;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.node.MotionReferencePlacementDelegate;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.kf0;
import defpackage.ky;
import defpackage.lu0;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class Placeable implements Measured {
    public static final int $stable = 8;
    private long apparentToRealOffset;
    private int height;
    private long measuredSize = IntSize.m7777constructorimpl(0);
    private long measurementConstraints;
    private int width;

    public Placeable() {
        long j;
        j = PlaceableKt.DefaultConstraints;
        this.measurementConstraints = j;
        this.apparentToRealOffset = IntOffset.Companion.m7750getZeronOccac();
    }

    private final void onMeasuredSizeChanged() {
        this.width = y80.h((int) (this.measuredSize >> 32), Constraints.m7566getMinWidthimpl(this.measurementConstraints), Constraints.m7564getMaxWidthimpl(this.measurementConstraints));
        this.height = y80.h((int) (this.measuredSize & 4294967295L), Constraints.m7565getMinHeightimpl(this.measurementConstraints), Constraints.m7563getMaxHeightimpl(this.measurementConstraints));
        int i = this.width;
        long j = this.measuredSize;
        this.apparentToRealOffset = IntOffset.m7733constructorimpl((((i - ((int) (j >> 32))) / 2) << 32) | (4294967295L & ((r0 - ((int) (j & 4294967295L))) / 2)));
    }

    /* renamed from: getApparentToRealOffset-nOcc-ac, reason: not valid java name */
    public final long m6297getApparentToRealOffsetnOccac() {
        return this.apparentToRealOffset;
    }

    public final int getHeight() {
        return this.height;
    }

    @Override // androidx.compose.ui.layout.Measured
    public int getMeasuredHeight() {
        return (int) (this.measuredSize & 4294967295L);
    }

    /* renamed from: getMeasuredSize-YbymL2g, reason: not valid java name */
    public final long m6298getMeasuredSizeYbymL2g() {
        return this.measuredSize;
    }

    @Override // androidx.compose.ui.layout.Measured
    public int getMeasuredWidth() {
        return (int) (this.measuredSize >> 32);
    }

    /* renamed from: getMeasurementConstraints-msEJaDk, reason: not valid java name */
    public final long m6299getMeasurementConstraintsmsEJaDk() {
        return this.measurementConstraints;
    }

    public final int getWidth() {
        return this.width;
    }

    /* renamed from: placeAt-f8xVGno, reason: not valid java name */
    public void mo6300placeAtf8xVGno(long j, float f, GraphicsLayer graphicsLayer) {
        mo6235placeAtf8xVGno(j, f, (ky) null);
    }

    /* renamed from: placeAt-f8xVGno */
    public abstract void mo6235placeAtf8xVGno(long j, float f, ky kyVar);

    /* renamed from: setMeasuredSize-ozmzZPI, reason: not valid java name */
    public final void m6301setMeasuredSizeozmzZPI(long j) {
        if (IntSize.m7780equalsimpl0(this.measuredSize, j)) {
            return;
        }
        this.measuredSize = j;
        onMeasuredSizeChanged();
    }

    /* renamed from: setMeasurementConstraints-BRTryo0, reason: not valid java name */
    public final void m6302setMeasurementConstraintsBRTryo0(long j) {
        if (Constraints.m7557equalsimpl0(this.measurementConstraints, j)) {
            return;
        }
        this.measurementConstraints = j;
        onMeasuredSizeChanged();
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @PlacementScopeMarker
    /* loaded from: classes.dex */
    public static abstract class PlacementScope implements Density {
        public static final int $stable = 0;
        private boolean motionFrameOfReferencePlacement;

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final void handleMotionFrameOfReferencePlacement(Placeable placeable) {
            if (placeable instanceof MotionReferencePlacementDelegate) {
                ((MotionReferencePlacementDelegate) placeable).updatePlacedUnderMotionFrameOfReference(this.motionFrameOfReferencePlacement);
            }
        }

        public static /* synthetic */ void place$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, int i3, Object obj) {
            if (obj != null) {
                lu0.a("Super calls with default arguments not supported in this target, function: place");
                return;
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            placementScope.place(placeable, i, i2, f);
        }

        /* renamed from: place-70tqf50$default, reason: not valid java name */
        public static /* synthetic */ void m6303place70tqf50$default(PlacementScope placementScope, Placeable placeable, long j, float f, int i, Object obj) {
            if (obj != null) {
                lu0.a("Super calls with default arguments not supported in this target, function: place-70tqf50");
                return;
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            placementScope.m6309place70tqf50(placeable, j, f);
        }

        public static /* synthetic */ void placeRelative$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, int i3, Object obj) {
            if (obj != null) {
                lu0.a("Super calls with default arguments not supported in this target, function: placeRelative");
                return;
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            placementScope.placeRelative(placeable, i, i2, f);
        }

        /* renamed from: placeRelative-70tqf50$default, reason: not valid java name */
        public static /* synthetic */ void m6304placeRelative70tqf50$default(PlacementScope placementScope, Placeable placeable, long j, float f, int i, Object obj) {
            if (obj != null) {
                lu0.a("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
                return;
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            placementScope.m6314placeRelative70tqf50(placeable, j, f);
        }

        public static /* synthetic */ void placeRelativeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, ky kyVar, int i3, Object obj) {
            if (obj != null) {
                lu0.a("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
                return;
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i3 & 8) != 0) {
                kyVar = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.placeRelativeWithLayer(placeable, i, i2, f2, kyVar);
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m6305placeRelativeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j, float f, ky kyVar, int i, Object obj) {
            if (obj != null) {
                lu0.a("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
                return;
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i & 4) != 0) {
                kyVar = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.m6315placeRelativeWithLayeraW9wM(placeable, j, f2, kyVar);
        }

        public static /* synthetic */ void placeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, ky kyVar, int i3, Object obj) {
            if (obj != null) {
                lu0.a("Super calls with default arguments not supported in this target, function: placeWithLayer");
                return;
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i3 & 8) != 0) {
                kyVar = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.placeWithLayer(placeable, i, i2, f2, kyVar);
        }

        /* renamed from: placeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m6307placeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j, float f, ky kyVar, int i, Object obj) {
            if (obj != null) {
                lu0.a("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
                return;
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i & 4) != 0) {
                kyVar = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.m6317placeWithLayeraW9wM(placeable, j, f2, kyVar);
        }

        public LayoutCoordinates getCoordinates() {
            return null;
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return 1.0f;
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return 1.0f;
        }

        public abstract LayoutDirection getParentLayoutDirection();

        public abstract int getParentWidth();

        public final void place(Placeable placeable, int i, int i2, float f) {
            placeable.mo6235placeAtf8xVGno(kf0.a(this, placeable, placeable, IntOffset.m7733constructorimpl((i2 & 4294967295L) | (i << 32))), f, (ky) null);
        }

        /* renamed from: place-70tqf50, reason: not valid java name */
        public final void m6309place70tqf50(Placeable placeable, long j, float f) {
            placeable.mo6235placeAtf8xVGno(kf0.a(this, placeable, placeable, j), f, (ky) null);
        }

        /* renamed from: placeApparentToRealOffset-aW-9-wM$ui, reason: not valid java name */
        public final void m6311placeApparentToRealOffsetaW9wM$ui(Placeable placeable, long j, float f, ky kyVar) {
            placeable.mo6235placeAtf8xVGno(kf0.a(this, placeable, placeable, j), f, kyVar);
        }

        /* renamed from: placeAutoMirrored-aW-9-wM$ui, reason: not valid java name */
        public final void m6313placeAutoMirroredaW9wM$ui(Placeable placeable, long j, float f, ky kyVar) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                placeable.mo6235placeAtf8xVGno(kf0.a(this, placeable, placeable, j), f, kyVar);
                return;
            }
            placeable.mo6235placeAtf8xVGno(kf0.a(this, placeable, placeable, IntOffset.m7733constructorimpl((IntOffset.m7740getYimpl(j) & 4294967295L) | (((getParentWidth() - placeable.getWidth()) - IntOffset.m7739getXimpl(j)) << 32))), f, kyVar);
        }

        public final void placeRelative(Placeable placeable, int i, int i2, float f) {
            long m7733constructorimpl = IntOffset.m7733constructorimpl((i << 32) | (i2 & 4294967295L));
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                placeable.mo6235placeAtf8xVGno(kf0.a(this, placeable, placeable, m7733constructorimpl), f, (ky) null);
            } else {
                placeable.mo6235placeAtf8xVGno(kf0.a(this, placeable, placeable, IntOffset.m7733constructorimpl((((getParentWidth() - placeable.getWidth()) - IntOffset.m7739getXimpl(m7733constructorimpl)) << 32) | (IntOffset.m7740getYimpl(m7733constructorimpl) & 4294967295L))), f, (ky) null);
            }
        }

        /* renamed from: placeRelative-70tqf50, reason: not valid java name */
        public final void m6314placeRelative70tqf50(Placeable placeable, long j, float f) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                placeable.mo6235placeAtf8xVGno(kf0.a(this, placeable, placeable, j), f, (ky) null);
                return;
            }
            placeable.mo6235placeAtf8xVGno(kf0.a(this, placeable, placeable, IntOffset.m7733constructorimpl((IntOffset.m7740getYimpl(j) & 4294967295L) | (((getParentWidth() - placeable.getWidth()) - IntOffset.m7739getXimpl(j)) << 32))), f, (ky) null);
        }

        public final void placeRelativeWithLayer(Placeable placeable, int i, int i2, float f, ky kyVar) {
            long m7733constructorimpl = IntOffset.m7733constructorimpl((i << 32) | (i2 & 4294967295L));
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                placeable.mo6235placeAtf8xVGno(kf0.a(this, placeable, placeable, m7733constructorimpl), f, kyVar);
            } else {
                placeable.mo6235placeAtf8xVGno(kf0.a(this, placeable, placeable, IntOffset.m7733constructorimpl((((getParentWidth() - placeable.getWidth()) - IntOffset.m7739getXimpl(m7733constructorimpl)) << 32) | (IntOffset.m7740getYimpl(m7733constructorimpl) & 4294967295L))), f, kyVar);
            }
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m6315placeRelativeWithLayeraW9wM(Placeable placeable, long j, float f, ky kyVar) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                placeable.mo6235placeAtf8xVGno(kf0.a(this, placeable, placeable, j), f, kyVar);
                return;
            }
            placeable.mo6235placeAtf8xVGno(kf0.a(this, placeable, placeable, IntOffset.m7733constructorimpl((IntOffset.m7740getYimpl(j) & 4294967295L) | (((getParentWidth() - placeable.getWidth()) - IntOffset.m7739getXimpl(j)) << 32))), f, kyVar);
        }

        public final void placeWithLayer(Placeable placeable, int i, int i2, float f, ky kyVar) {
            placeable.mo6235placeAtf8xVGno(kf0.a(this, placeable, placeable, IntOffset.m7733constructorimpl((i2 & 4294967295L) | (i << 32))), f, kyVar);
        }

        /* renamed from: placeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m6317placeWithLayeraW9wM(Placeable placeable, long j, float f, ky kyVar) {
            placeable.mo6235placeAtf8xVGno(kf0.a(this, placeable, placeable, j), f, kyVar);
        }

        public final void withMotionFrameOfReferencePlacement(ky kyVar) {
            this.motionFrameOfReferencePlacement = true;
            kyVar.invoke(this);
            this.motionFrameOfReferencePlacement = false;
        }

        /* renamed from: placeApparentToRealOffset-aW-9-wM$ui, reason: not valid java name */
        public final void m6310placeApparentToRealOffsetaW9wM$ui(Placeable placeable, long j, float f, GraphicsLayer graphicsLayer) {
            placeable.mo6300placeAtf8xVGno(kf0.a(this, placeable, placeable, j), f, graphicsLayer);
        }

        /* renamed from: placeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m6318placeWithLayeraW9wM(Placeable placeable, long j, GraphicsLayer graphicsLayer, float f) {
            placeable.mo6300placeAtf8xVGno(kf0.a(this, placeable, placeable, j), f, graphicsLayer);
        }

        public final void placeWithLayer(Placeable placeable, int i, int i2, GraphicsLayer graphicsLayer, float f) {
            placeable.mo6300placeAtf8xVGno(kf0.a(this, placeable, placeable, IntOffset.m7733constructorimpl((i2 & 4294967295L) | (i << 32))), f, graphicsLayer);
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m6306placeRelativeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j, GraphicsLayer graphicsLayer, float f, int i, Object obj) {
            if (obj != null) {
                lu0.a("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
                return;
            }
            if ((i & 4) != 0) {
                f = 0.0f;
            }
            placementScope.m6316placeRelativeWithLayeraW9wM(placeable, j, graphicsLayer, f);
        }

        /* renamed from: placeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m6308placeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j, GraphicsLayer graphicsLayer, float f, int i, Object obj) {
            if (obj != null) {
                lu0.a("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
                return;
            }
            if ((i & 4) != 0) {
                f = 0.0f;
            }
            placementScope.m6318placeWithLayeraW9wM(placeable, j, graphicsLayer, f);
        }

        public static /* synthetic */ void placeRelativeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i, int i2, GraphicsLayer graphicsLayer, float f, int i3, Object obj) {
            if (obj != null) {
                lu0.a("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
                return;
            }
            if ((i3 & 8) != 0) {
                f = 0.0f;
            }
            placementScope.placeRelativeWithLayer(placeable, i, i2, graphicsLayer, f);
        }

        public static /* synthetic */ void placeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i, int i2, GraphicsLayer graphicsLayer, float f, int i3, Object obj) {
            if (obj != null) {
                lu0.a("Super calls with default arguments not supported in this target, function: placeWithLayer");
                return;
            }
            if ((i3 & 8) != 0) {
                f = 0.0f;
            }
            placementScope.placeWithLayer(placeable, i, i2, graphicsLayer, f);
        }

        public float current(Ruler ruler, float f) {
            return f;
        }

        /* renamed from: placeAutoMirrored-aW-9-wM$ui, reason: not valid java name */
        public final void m6312placeAutoMirroredaW9wM$ui(Placeable placeable, long j, float f, GraphicsLayer graphicsLayer) {
            if (getParentLayoutDirection() != LayoutDirection.Ltr && getParentWidth() != 0) {
                placeable.mo6300placeAtf8xVGno(kf0.a(this, placeable, placeable, IntOffset.m7733constructorimpl((IntOffset.m7740getYimpl(j) & 4294967295L) | (((getParentWidth() - placeable.getWidth()) - IntOffset.m7739getXimpl(j)) << 32))), f, graphicsLayer);
                return;
            }
            placeable.mo6300placeAtf8xVGno(kf0.a(this, placeable, placeable, j), f, graphicsLayer);
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m6316placeRelativeWithLayeraW9wM(Placeable placeable, long j, GraphicsLayer graphicsLayer, float f) {
            if (getParentLayoutDirection() != LayoutDirection.Ltr && getParentWidth() != 0) {
                placeable.mo6300placeAtf8xVGno(kf0.a(this, placeable, placeable, IntOffset.m7733constructorimpl((IntOffset.m7740getYimpl(j) & 4294967295L) | (((getParentWidth() - placeable.getWidth()) - IntOffset.m7739getXimpl(j)) << 32))), f, graphicsLayer);
                return;
            }
            placeable.mo6300placeAtf8xVGno(kf0.a(this, placeable, placeable, j), f, graphicsLayer);
        }

        public final void placeRelativeWithLayer(Placeable placeable, int i, int i2, GraphicsLayer graphicsLayer, float f) {
            long m7733constructorimpl = IntOffset.m7733constructorimpl((i << 32) | (i2 & 4294967295L));
            if (getParentLayoutDirection() != LayoutDirection.Ltr && getParentWidth() != 0) {
                placeable.mo6300placeAtf8xVGno(kf0.a(this, placeable, placeable, IntOffset.m7733constructorimpl((((getParentWidth() - placeable.getWidth()) - IntOffset.m7739getXimpl(m7733constructorimpl)) << 32) | (IntOffset.m7740getYimpl(m7733constructorimpl) & 4294967295L))), f, graphicsLayer);
            } else {
                placeable.mo6300placeAtf8xVGno(kf0.a(this, placeable, placeable, m7733constructorimpl), f, graphicsLayer);
            }
        }
    }
}
