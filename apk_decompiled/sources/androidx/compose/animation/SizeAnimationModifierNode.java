package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import defpackage.dq;
import defpackage.my;
import defpackage.p01;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class SizeAnimationModifierNode extends LayoutModifierNodeWithPassThroughIntrinsics {
    private Alignment alignment;
    private final MutableState animData$delegate;
    private AnimationSpec<IntSize> animationSpec;
    private my listener;
    private long lookaheadConstraints;
    private boolean lookaheadConstraintsAvailable;
    private long lookaheadSize;

    public SizeAnimationModifierNode(AnimationSpec<IntSize> animationSpec, Alignment alignment, my myVar) {
        this.animationSpec = animationSpec;
        this.alignment = alignment;
        this.listener = myVar;
        this.lookaheadSize = AnimationModifierKt.getInvalidSize();
        this.lookaheadConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        this.animData$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    /* renamed from: setLookaheadConstraints-BRTryo0, reason: not valid java name */
    private final void m101setLookaheadConstraintsBRTryo0(long j) {
        this.lookaheadConstraints = j;
        this.lookaheadConstraintsAvailable = true;
    }

    /* renamed from: targetConstraints-ZezNO4M, reason: not valid java name */
    private final long m102targetConstraintsZezNO4M(long j) {
        return this.lookaheadConstraintsAvailable ? this.lookaheadConstraints : j;
    }

    /* renamed from: animateTo-mzRDjE0, reason: not valid java name */
    public final long m103animateTomzRDjE0(long j) {
        AnimData animData = getAnimData();
        dq dqVar = null;
        if (animData != null) {
            boolean z = (IntSize.m7780equalsimpl0(j, animData.getAnim().getValue().m7786unboximpl()) || animData.getAnim().isRunning()) ? false : true;
            if (!IntSize.m7780equalsimpl0(j, animData.getAnim().getTargetValue().m7786unboximpl()) || z) {
                animData.m108setStartSizeozmzZPI(animData.getAnim().getValue().m7786unboximpl());
                p01.t(getCoroutineScope(), null, null, new SizeAnimationModifierNode$animateTo$data$1$1(animData, j, this, null), 3);
            }
        } else {
            animData = new AnimData(new Animatable(IntSize.m7774boximpl(j), VectorConvertersKt.getVectorConverter(IntSize.Companion), IntSize.m7774boximpl(IntSize.m7777constructorimpl(InlineClassHelperKt.Uint64Low32)), null, 8, null), j, dqVar);
        }
        setAnimData(animData);
        return animData.getAnim().getValue().m7786unboximpl();
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AnimData getAnimData() {
        return (AnimData) this.animData$delegate.getValue();
    }

    public final AnimationSpec<IntSize> getAnimationSpec() {
        return this.animationSpec;
    }

    public final my getListener() {
        return this.listener;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo33measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Placeable mo6234measureBRTryo0;
        long m7578constrain4WqzIAM;
        if (measureScope.isLookingAhead()) {
            m101setLookaheadConstraintsBRTryo0(j);
            mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(j);
        } else {
            mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(m102targetConstraintsZezNO4M(j));
        }
        Placeable placeable = mo6234measureBRTryo0;
        long m7777constructorimpl = IntSize.m7777constructorimpl((placeable.getWidth() << 32) | (placeable.getHeight() & 4294967295L));
        if (measureScope.isLookingAhead()) {
            this.lookaheadSize = m7777constructorimpl;
            m7578constrain4WqzIAM = m7777constructorimpl;
        } else {
            m7578constrain4WqzIAM = ConstraintsKt.m7578constrain4WqzIAM(j, m103animateTomzRDjE0(AnimationModifierKt.m37isValidozmzZPI(this.lookaheadSize) ? this.lookaheadSize : m7777constructorimpl));
        }
        int i = (int) (m7578constrain4WqzIAM >> 32);
        int i2 = (int) (m7578constrain4WqzIAM & 4294967295L);
        return MeasureScope.layout$default(measureScope, i, i2, null, new SizeAnimationModifierNode$measure$2(this, m7777constructorimpl, i, i2, measureScope, placeable), 4, null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        this.lookaheadSize = AnimationModifierKt.getInvalidSize();
        this.lookaheadConstraintsAvailable = false;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        super.onReset();
        setAnimData(null);
    }

    public final void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    public final void setAnimData(AnimData animData) {
        this.animData$delegate.setValue(animData);
    }

    public final void setAnimationSpec(AnimationSpec<IntSize> animationSpec) {
        this.animationSpec = animationSpec;
    }

    public final void setListener(my myVar) {
        this.listener = myVar;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class AnimData {
        public static final int $stable = 8;
        private final Animatable<IntSize, AnimationVector2D> anim;
        private long startSize;

        private AnimData(Animatable<IntSize, AnimationVector2D> animatable, long j) {
            this.anim = animatable;
            this.startSize = j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: copy-O0kMr_c$default, reason: not valid java name */
        public static /* synthetic */ AnimData m104copyO0kMr_c$default(AnimData animData, Animatable animatable, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                animatable = animData.anim;
            }
            if ((i & 2) != 0) {
                j = animData.startSize;
            }
            return animData.m106copyO0kMr_c(animatable, j);
        }

        public final Animatable<IntSize, AnimationVector2D> component1() {
            return this.anim;
        }

        /* renamed from: component2-YbymL2g, reason: not valid java name */
        public final long m105component2YbymL2g() {
            return this.startSize;
        }

        /* renamed from: copy-O0kMr_c, reason: not valid java name */
        public final AnimData m106copyO0kMr_c(Animatable<IntSize, AnimationVector2D> animatable, long j) {
            return new AnimData(animatable, j, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnimData)) {
                return false;
            }
            AnimData animData = (AnimData) obj;
            return q10.b(this.anim, animData.anim) && IntSize.m7780equalsimpl0(this.startSize, animData.startSize);
        }

        public final Animatable<IntSize, AnimationVector2D> getAnim() {
            return this.anim;
        }

        /* renamed from: getStartSize-YbymL2g, reason: not valid java name */
        public final long m107getStartSizeYbymL2g() {
            return this.startSize;
        }

        public int hashCode() {
            return IntSize.m7783hashCodeimpl(this.startSize) + (this.anim.hashCode() * 31);
        }

        /* renamed from: setStartSize-ozmzZPI, reason: not valid java name */
        public final void m108setStartSizeozmzZPI(long j) {
            this.startSize = j;
        }

        public String toString() {
            return "AnimData(anim=" + this.anim + ", startSize=" + ((Object) IntSize.m7785toStringimpl(this.startSize)) + ')';
        }

        public /* synthetic */ AnimData(Animatable animatable, long j, dq dqVar) {
            this(animatable, j);
        }
    }

    public /* synthetic */ SizeAnimationModifierNode(AnimationSpec animationSpec, Alignment alignment, my myVar, int i, dq dqVar) {
        this(animationSpec, (i & 2) != 0 ? Alignment.Companion.getTopStart() : alignment, (i & 4) != 0 ? null : myVar);
    }
}
