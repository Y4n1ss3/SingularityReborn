package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import defpackage.p01;
import defpackage.q10;
import defpackage.un;
import defpackage.xn;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BoundsTransformDeferredAnimation {
    public static final int $stable = 8;
    private long additionalOffset;
    private Animatable<Rect, AnimationVector4D> animatable;
    private final MutableState animatedValue$delegate;
    private long currentPosition;
    private long currentSize;
    private List<LayoutCoordinates> directManipulationParents;
    private boolean isPending;
    private long targetOffset;
    private long targetSize;

    public BoundsTransformDeferredAnimation() {
        Size.Companion companion = Size.Companion;
        this.targetSize = companion.m4593getUnspecifiedNHjbRc();
        Offset.Companion companion2 = Offset.Companion;
        this.targetOffset = companion2.m4531getUnspecifiedF1C5BW0();
        this.currentPosition = companion2.m4531getUnspecifiedF1C5BW0();
        this.currentSize = companion.m4593getUnspecifiedNHjbRc();
        this.animatedValue$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.additionalOffset = companion2.m4532getZeroF1C5BW0();
    }

    private final Rect animate(un unVar, BoundsTransform boundsTransform) {
        BoundsTransformDeferredAnimation boundsTransformDeferredAnimation;
        Rect value;
        long j = this.targetOffset;
        if ((InlineClassHelperKt.DualUnsignedFloatMask & j) != InlineClassHelperKt.UnspecifiedPackedFloats) {
            long j2 = this.targetSize;
            if (j2 != InlineClassHelperKt.UnspecifiedPackedFloats) {
                Rect m4556Recttz77jQw = RectKt.m4556Recttz77jQw(j, j2);
                Animatable<Rect, AnimationVector4D> animatable = this.animatable;
                if (animatable == null) {
                    animatable = new Animatable<>(m4556Recttz77jQw, VectorConvertersKt.getVectorConverter(Rect.Companion), null, null, 12, null);
                }
                this.animatable = animatable;
                if (this.isPending) {
                    this.isPending = false;
                    boundsTransformDeferredAnimation = this;
                    p01.t(unVar, null, xn.g, new BoundsTransformDeferredAnimation$animate$1(animatable, m4556Recttz77jQw, boundsTransform, boundsTransformDeferredAnimation, null), 1);
                    Animatable<Rect, AnimationVector4D> animatable2 = boundsTransformDeferredAnimation.animatable;
                    return (animatable2 != null || (value = animatable2.getValue()) == null) ? Rect.Companion.getZero() : value;
                }
            }
        }
        boundsTransformDeferredAnimation = this;
        Animatable<Rect, AnimationVector4D> animatable22 = boundsTransformDeferredAnimation.animatable;
        if (animatable22 != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Rect getAnimatedValue() {
        return (Rect) this.animatedValue$delegate.getValue();
    }

    private final void setAnimatedValue(Rect rect) {
        this.animatedValue$delegate.setValue(rect);
    }

    /* renamed from: updateTargetOffset-k-4lQ0M, reason: not valid java name */
    private final void m40updateTargetOffsetk4lQ0M(long j) {
        if ((this.targetOffset & InlineClassHelperKt.DualUnsignedFloatMask) != InlineClassHelperKt.UnspecifiedPackedFloats && !IntOffset.m7738equalsimpl0(IntOffsetKt.m7756roundk4lQ0M(j), IntOffsetKt.m7756roundk4lQ0M(this.targetOffset))) {
            this.isPending = true;
        }
        this.targetOffset = j;
        if ((this.currentPosition & InlineClassHelperKt.DualUnsignedFloatMask) == InlineClassHelperKt.UnspecifiedPackedFloats) {
            this.currentPosition = j;
        }
    }

    public final Rect getCurrentBounds() {
        long j = this.currentSize;
        long j2 = this.currentPosition;
        if ((InlineClassHelperKt.DualUnsignedFloatMask & j2) == InlineClassHelperKt.UnspecifiedPackedFloats || j == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return null;
        }
        return RectKt.m4556Recttz77jQw(j2, j);
    }

    /* renamed from: getCurrentSize-NH-jbRc, reason: not valid java name */
    public final long m41getCurrentSizeNHjbRc() {
        return this.currentSize;
    }

    public final Rect getValue() {
        if (isIdle()) {
            return null;
        }
        return getAnimatedValue();
    }

    public final boolean isIdle() {
        if (this.isPending) {
            return false;
        }
        Animatable<Rect, AnimationVector4D> animatable = this.animatable;
        return animatable == null || !animatable.isRunning();
    }

    /* renamed from: setCurrentSize-uvyYCjk, reason: not valid java name */
    public final void m42setCurrentSizeuvyYCjk(long j) {
        this.currentSize = j;
    }

    /* renamed from: updateCurrentBounds-tz77jQw, reason: not valid java name */
    public final void m43updateCurrentBoundstz77jQw(long j, long j2) {
        this.currentPosition = j;
        this.currentSize = j2;
    }

    public final void updateTargetOffsetAndAnimate(LookaheadScope lookaheadScope, Placeable.PlacementScope placementScope, un unVar, boolean z, boolean z2, BoundsTransform boundsTransform) {
        LayoutCoordinates coordinates = placementScope.getCoordinates();
        if (coordinates != null) {
            LayoutCoordinates lookaheadScopeCoordinates = lookaheadScope.getLookaheadScopeCoordinates(placementScope);
            long m4532getZeroF1C5BW0 = Offset.Companion.m4532getZeroF1C5BW0();
            if (!z2 && z) {
                List<LayoutCoordinates> list = this.directManipulationParents;
                if (list == null) {
                    list = new ArrayList<>();
                }
                int i = 0;
                LayoutCoordinates layoutCoordinates = coordinates;
                while (!q10.b(lookaheadScope.toLookaheadCoordinates(layoutCoordinates), lookaheadScopeCoordinates)) {
                    if (layoutCoordinates.getIntroducesMotionFrameOfReference()) {
                        if (list.size() == i) {
                            list.add(layoutCoordinates);
                            m4532getZeroF1C5BW0 = Offset.m4521plusMKHz9U(m4532getZeroF1C5BW0, LayoutCoordinatesKt.positionInParent(layoutCoordinates));
                        } else if (!q10.b(list.get(i), layoutCoordinates)) {
                            long m4520minusMKHz9U = Offset.m4520minusMKHz9U(m4532getZeroF1C5BW0, LayoutCoordinatesKt.positionInParent(list.get(i)));
                            list.set(i, layoutCoordinates);
                            m4532getZeroF1C5BW0 = Offset.m4521plusMKHz9U(m4520minusMKHz9U, LayoutCoordinatesKt.positionInParent(layoutCoordinates));
                        }
                        i++;
                    }
                    layoutCoordinates = layoutCoordinates.getParentCoordinates();
                    if (layoutCoordinates == null) {
                        break;
                    }
                }
                int size = list.size() - 1;
                if (i <= size) {
                    while (true) {
                        m4532getZeroF1C5BW0 = Offset.m4520minusMKHz9U(m4532getZeroF1C5BW0, LayoutCoordinatesKt.positionInParent(list.get(size)));
                        list.remove(list.size() - 1);
                        if (size == i) {
                            break;
                        } else {
                            size--;
                        }
                    }
                }
                this.directManipulationParents = list;
            }
            this.additionalOffset = Offset.m4521plusMKHz9U(this.additionalOffset, m4532getZeroF1C5BW0);
            m40updateTargetOffsetk4lQ0M(Offset.m4521plusMKHz9U(LookaheadScope.m6265localLookaheadPositionOfauaQtc$default(lookaheadScope, lookaheadScopeCoordinates, coordinates, 0L, z2, 2, null), this.additionalOffset));
            setAnimatedValue(animate(unVar, boundsTransform).m4553translatek4lQ0M(Offset.m4508constructorimpl(this.additionalOffset ^ (-9223372034707292160L))));
        }
    }

    /* renamed from: updateTargetSize-uvyYCjk, reason: not valid java name */
    public final void m44updateTargetSizeuvyYCjk(long j) {
        if (this.targetSize != InlineClassHelperKt.UnspecifiedPackedFloats && !IntSize.m7780equalsimpl0(IntSizeKt.m7790roundToIntSizeuvyYCjk(j), IntSizeKt.m7790roundToIntSizeuvyYCjk(this.targetSize))) {
            this.isPending = true;
        }
        this.targetSize = j;
        if (this.currentSize == InlineClassHelperKt.UnspecifiedPackedFloats) {
            this.currentSize = j;
        }
    }
}
