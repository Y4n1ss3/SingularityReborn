package androidx.compose.foundation;

import android.view.View;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import defpackage.d41;
import defpackage.dq;
import defpackage.ky;
import defpackage.p01;
import defpackage.q10;
import defpackage.u60;
import defpackage.w01;
import defpackage.xn;
import defpackage.zg;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MagnifierNode extends Modifier.Node implements GlobalPositionAwareModifierNode, DrawModifierNode, SemanticsModifierNode, ObserverModifierNode {
    public static final int $stable = 8;
    private State<Offset> anchorPositionInRootState;
    private boolean clippingEnabled;
    private float cornerRadius;
    private Density density;
    private zg drawSignalChannel;
    private float elevation;
    private final MutableState layoutCoordinates$delegate;
    private PlatformMagnifier magnifier;
    private ky magnifierCenter;
    private ky onSizeChanged;
    private PlatformMagnifierFactory platformMagnifierFactory;
    private IntSize previousSize;
    private long size;
    private ky sourceCenter;
    private long sourceCenterInRoot;
    private boolean useTextDefault;
    private View view;
    private float zoom;

    public /* synthetic */ MagnifierNode(ky kyVar, ky kyVar2, ky kyVar3, float f, boolean z, long j, float f2, float f3, boolean z2, PlatformMagnifierFactory platformMagnifierFactory, int i, dq dqVar) {
        this(kyVar, (i & 2) != 0 ? null : kyVar2, (i & 4) != 0 ? null : kyVar3, (i & 8) != 0 ? Float.NaN : f, (i & 16) != 0 ? false : z, (i & 32) != 0 ? DpSize.Companion.m7718getUnspecifiedMYxV2XQ() : j, (i & 64) != 0 ? Dp.Companion.m7631getUnspecifiedD9Ej5fM() : f2, (i & Fields.SpotShadowColor) != 0 ? Dp.Companion.m7631getUnspecifiedD9Ej5fM() : f3, (i & Fields.RotationX) != 0 ? true : z2, (i & Fields.RotationY) != 0 ? PlatformMagnifierFactory.Companion.getForCurrentPlatform() : platformMagnifierFactory, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Offset applySemantics$lambda$0(MagnifierNode magnifierNode) {
        return Offset.m4505boximpl(magnifierNode.sourceCenterInRoot);
    }

    /* renamed from: getAnchorPositionInRoot-F1C5BW0, reason: not valid java name */
    private final long m285getAnchorPositionInRootF1C5BW0() {
        State<Offset> state = this.anchorPositionInRootState;
        if (state == null) {
            state = SnapshotStateKt.derivedStateOf(new u60(this, 2));
            this.anchorPositionInRootState = state;
        }
        return state != null ? state.getValue().m4526unboximpl() : Offset.Companion.m4531getUnspecifiedF1C5BW0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Offset getAnchorPositionInRoot_F1C5BW0$lambda$0(MagnifierNode magnifierNode) {
        LayoutCoordinates layoutCoordinates = magnifierNode.getLayoutCoordinates();
        return Offset.m4505boximpl(layoutCoordinates != null ? LayoutCoordinatesKt.positionInRoot(layoutCoordinates) : Offset.Companion.m4531getUnspecifiedF1C5BW0());
    }

    private final LayoutCoordinates getLayoutCoordinates() {
        return (LayoutCoordinates) this.layoutCoordinates$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 onObservedReadsChanged$lambda$0(MagnifierNode magnifierNode) {
        magnifierNode.updateMagnifier();
        return w01.a;
    }

    private final void recreateMagnifier() {
        PlatformMagnifier platformMagnifier = this.magnifier;
        if (platformMagnifier != null) {
            platformMagnifier.dismiss();
        }
        View view = this.view;
        if (view == null) {
            view = DelegatableNode_androidKt.requireView(this);
        }
        View view2 = view;
        this.view = view2;
        Density density = this.density;
        if (density == null) {
            density = DelegatableNodeKt.requireDensity(this);
        }
        Density density2 = density;
        this.density = density2;
        this.magnifier = this.platformMagnifierFactory.mo317createnHHXs2Y(view2, this.useTextDefault, this.size, this.cornerRadius, this.elevation, this.clippingEnabled, density2, this.zoom);
        updateSizeIfNecessary();
    }

    private final void setLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        this.layoutCoordinates$delegate.setValue(layoutCoordinates);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void updateMagnifier() {
        long m4531getUnspecifiedF1C5BW0;
        PlatformMagnifier platformMagnifier;
        Density density = this.density;
        if (density == null) {
            density = DelegatableNodeKt.requireDensity(this);
            this.density = density;
        }
        long m4526unboximpl = ((Offset) this.sourceCenter.invoke(density)).m4526unboximpl();
        if ((m4526unboximpl & InlineClassHelperKt.DualUnsignedFloatMask) == InlineClassHelperKt.UnspecifiedPackedFloats || (m285getAnchorPositionInRootF1C5BW0() & InlineClassHelperKt.DualUnsignedFloatMask) == InlineClassHelperKt.UnspecifiedPackedFloats) {
            this.sourceCenterInRoot = Offset.Companion.m4531getUnspecifiedF1C5BW0();
            PlatformMagnifier platformMagnifier2 = this.magnifier;
            if (platformMagnifier2 != null) {
                platformMagnifier2.dismiss();
                return;
            }
            return;
        }
        this.sourceCenterInRoot = Offset.m4521plusMKHz9U(m285getAnchorPositionInRootF1C5BW0(), m4526unboximpl);
        ky kyVar = this.magnifierCenter;
        if (kyVar != null) {
            Offset m4505boximpl = Offset.m4505boximpl(((Offset) kyVar.invoke(density)).m4526unboximpl());
            if ((m4505boximpl.m4526unboximpl() & InlineClassHelperKt.DualUnsignedFloatMask) == InlineClassHelperKt.UnspecifiedPackedFloats) {
                m4505boximpl = null;
            }
            if (m4505boximpl != null) {
                m4531getUnspecifiedF1C5BW0 = Offset.m4521plusMKHz9U(m285getAnchorPositionInRootF1C5BW0(), m4505boximpl.m4526unboximpl());
                long j = m4531getUnspecifiedF1C5BW0;
                if (this.magnifier == null) {
                    recreateMagnifier();
                }
                platformMagnifier = this.magnifier;
                if (platformMagnifier != null) {
                    platformMagnifier.mo316updateWko1d7g(this.sourceCenterInRoot, j, this.zoom);
                }
                updateSizeIfNecessary();
            }
        }
        m4531getUnspecifiedF1C5BW0 = Offset.Companion.m4531getUnspecifiedF1C5BW0();
        long j2 = m4531getUnspecifiedF1C5BW0;
        if (this.magnifier == null) {
        }
        platformMagnifier = this.magnifier;
        if (platformMagnifier != null) {
        }
        updateSizeIfNecessary();
    }

    private final void updateSizeIfNecessary() {
        Density density;
        PlatformMagnifier platformMagnifier = this.magnifier;
        if (platformMagnifier == null || (density = this.density) == null || IntSize.m7779equalsimpl(platformMagnifier.mo315getSizeYbymL2g(), this.previousSize)) {
            return;
        }
        ky kyVar = this.onSizeChanged;
        if (kyVar != null) {
            kyVar.invoke(DpSize.m7697boximpl(density.mo365toDpSizekrfVVM(IntSizeKt.m7794toSizeozmzZPI(platformMagnifier.mo315getSizeYbymL2g()))));
        }
        this.previousSize = IntSize.m7774boximpl(platformMagnifier.mo315getSizeYbymL2g());
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(Magnifier_androidKt.getMagnifierPositionInRoot(), new u60(this, 1));
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        zg zgVar = this.drawSignalChannel;
        if (zgVar != null) {
            zgVar.m(w01.a);
        }
    }

    public final boolean getClippingEnabled() {
        return this.clippingEnabled;
    }

    /* renamed from: getCornerRadius-D9Ej5fM, reason: not valid java name */
    public final float m286getCornerRadiusD9Ej5fM() {
        return this.cornerRadius;
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m287getElevationD9Ej5fM() {
        return this.elevation;
    }

    public final ky getMagnifierCenter() {
        return this.magnifierCenter;
    }

    public final ky getOnSizeChanged() {
        return this.onSizeChanged;
    }

    public final PlatformMagnifierFactory getPlatformMagnifierFactory() {
        return this.platformMagnifierFactory;
    }

    /* renamed from: getSize-MYxV2XQ, reason: not valid java name */
    public final long m288getSizeMYxV2XQ() {
        return this.size;
    }

    public final ky getSourceCenter() {
        return this.sourceCenter;
    }

    public final boolean getUseTextDefault() {
        return this.useTextDefault;
    }

    public final float getZoom() {
        return this.zoom;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        onObservedReadsChanged();
        this.drawSignalChannel = d41.b(0, 7, null);
        p01.t(getCoroutineScope(), null, xn.g, new MagnifierNode$onAttach$1(this, null), 1);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        PlatformMagnifier platformMagnifier = this.magnifier;
        if (platformMagnifier != null) {
            platformMagnifier.dismiss();
        }
        this.magnifier = null;
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        setLayoutCoordinates(layoutCoordinates);
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        ObserverModifierNodeKt.observeReads(this, new u60(this, 0));
    }

    public final void setClippingEnabled(boolean z) {
        this.clippingEnabled = z;
    }

    /* renamed from: setCornerRadius-0680j_4, reason: not valid java name */
    public final void m289setCornerRadius0680j_4(float f) {
        this.cornerRadius = f;
    }

    /* renamed from: setElevation-0680j_4, reason: not valid java name */
    public final void m290setElevation0680j_4(float f) {
        this.elevation = f;
    }

    public final void setMagnifierCenter(ky kyVar) {
        this.magnifierCenter = kyVar;
    }

    public final void setOnSizeChanged(ky kyVar) {
        this.onSizeChanged = kyVar;
    }

    public final void setPlatformMagnifierFactory(PlatformMagnifierFactory platformMagnifierFactory) {
        this.platformMagnifierFactory = platformMagnifierFactory;
    }

    /* renamed from: setSize-EaSLcWc, reason: not valid java name */
    public final void m291setSizeEaSLcWc(long j) {
        this.size = j;
    }

    public final void setSourceCenter(ky kyVar) {
        this.sourceCenter = kyVar;
    }

    public final void setUseTextDefault(boolean z) {
        this.useTextDefault = z;
    }

    public final void setZoom(float f) {
        this.zoom = f;
    }

    /* renamed from: update-5F03MCQ, reason: not valid java name */
    public final void m292update5F03MCQ(ky kyVar, ky kyVar2, float f, boolean z, long j, float f2, float f3, boolean z2, ky kyVar3, PlatformMagnifierFactory platformMagnifierFactory) {
        float f4 = this.zoom;
        long j2 = this.size;
        float f5 = this.cornerRadius;
        boolean z3 = this.useTextDefault;
        float f6 = this.elevation;
        boolean z4 = this.clippingEnabled;
        PlatformMagnifierFactory platformMagnifierFactory2 = this.platformMagnifierFactory;
        View view = this.view;
        Density density = this.density;
        this.sourceCenter = kyVar;
        this.magnifierCenter = kyVar2;
        this.zoom = f;
        this.useTextDefault = z;
        this.size = j;
        this.cornerRadius = f2;
        this.elevation = f3;
        this.clippingEnabled = z2;
        this.onSizeChanged = kyVar3;
        this.platformMagnifierFactory = platformMagnifierFactory;
        View requireView = DelegatableNode_androidKt.requireView(this);
        Density requireDensity = DelegatableNodeKt.requireDensity(this);
        if (this.magnifier != null && ((!Magnifier_androidKt.equalsIncludingNaN(f, f4) && !platformMagnifierFactory.getCanUpdateZoom()) || !DpSize.m7706equalsimpl0(j, j2) || !Dp.m7616equalsimpl0(f2, f5) || !Dp.m7616equalsimpl0(f3, f6) || z != z3 || z2 != z4 || !q10.b(platformMagnifierFactory, platformMagnifierFactory2) || !q10.b(requireView, view) || !q10.b(requireDensity, density))) {
            recreateMagnifier();
        }
        updateMagnifier();
    }

    private MagnifierNode(ky kyVar, ky kyVar2, ky kyVar3, float f, boolean z, long j, float f2, float f3, boolean z2, PlatformMagnifierFactory platformMagnifierFactory) {
        this.sourceCenter = kyVar;
        this.magnifierCenter = kyVar2;
        this.onSizeChanged = kyVar3;
        this.zoom = f;
        this.useTextDefault = z;
        this.size = j;
        this.cornerRadius = f2;
        this.elevation = f3;
        this.clippingEnabled = z2;
        this.platformMagnifierFactory = platformMagnifierFactory;
        this.layoutCoordinates$delegate = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.neverEqualPolicy());
        this.sourceCenterInRoot = Offset.Companion.m4531getUnspecifiedF1C5BW0();
    }

    public /* synthetic */ MagnifierNode(ky kyVar, ky kyVar2, ky kyVar3, float f, boolean z, long j, float f2, float f3, boolean z2, PlatformMagnifierFactory platformMagnifierFactory, dq dqVar) {
        this(kyVar, kyVar2, kyVar3, f, z, j, f2, f3, z2, platformMagnifierFactory);
    }
}
