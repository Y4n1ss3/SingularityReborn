package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerScope;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.platform.NestedScrollInteropConnectionKt;
import androidx.compose.ui.platform.WindowRecomposer_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.VelocityKt;
import com.lumi.singularity.R;
import defpackage.a31;
import defpackage.dq;
import defpackage.er;
import defpackage.f2;
import defpackage.fd0;
import defpackage.hl0;
import defpackage.iy;
import defpackage.ky;
import defpackage.m31;
import defpackage.oy;
import defpackage.p01;
import defpackage.p11;
import defpackage.p31;
import defpackage.pc0;
import defpackage.q21;
import defpackage.qc0;
import defpackage.r21;
import defpackage.u11;
import defpackage.v00;
import defpackage.y40;
import defpackage.y80;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class AndroidViewHolder extends ViewGroup implements pc0, ComposeNodeLifecycleCallback, OwnerScope, fd0 {
    private ky bringIntoViewRequester;
    private final int compositeKeyHash;
    private Density density;
    private final NestedScrollDispatcher dispatcher;
    private boolean hasUpdateBlock;
    private p31 insets;
    private boolean isDrawing;
    private int lastHeightMeasureSpec;
    private int lastWidthMeasureSpec;
    private final LayoutNode layoutNode;
    private y40 lifecycleOwner;
    private final int[] location;
    private Modifier modifier;
    private final qc0 nestedScrollingParentHelper;
    private ky onDensityChanged;
    private ky onModifierChanged;
    private ky onRequestDisallowInterceptTouchEvent;
    private final Owner owner;
    private final int[] position;
    private iy release;
    private iy reset;
    private final iy runInvalidate;
    private final iy runUpdate;
    private hl0 savedStateRegistryOwner;
    private long size;
    private iy update;
    private final View view;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final ky OnCommitAffectingUpdate = AndroidViewHolder$Companion$OnCommitAffectingUpdate$1.INSTANCE;

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidViewHolder(Context context, CompositionContext compositionContext, int i, NestedScrollDispatcher nestedScrollDispatcher, View view, Owner owner) {
        super(context);
        AndroidViewHolder_androidKt$NoOpScrollConnection$1 androidViewHolder_androidKt$NoOpScrollConnection$1;
        this.compositeKeyHash = i;
        this.dispatcher = nestedScrollDispatcher;
        this.view = view;
        this.owner = owner;
        if (compositionContext != null) {
            WindowRecomposer_androidKt.setCompositionContext(this, compositionContext);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        r21 r21Var = new r21() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder.2
            {
                super(1);
            }

            @Override // defpackage.r21
            public p31 onProgress(p31 p31Var, List<a31> list) {
                return AndroidViewHolder.this.insetToLayoutPosition(p31Var);
            }

            @Override // defpackage.r21
            public q21 onStart(a31 a31Var, q21 q21Var) {
                return AndroidViewHolder.this.insetBounds(q21Var);
            }
        };
        int i2 = u11.a;
        a31.a(this, r21Var);
        p11.g(this, this);
        this.update = AndroidViewHolder$update$1.INSTANCE;
        this.reset = AndroidViewHolder$reset$1.INSTANCE;
        this.release = AndroidViewHolder$release$1.INSTANCE;
        Modifier.Companion companion = Modifier.Companion;
        this.modifier = companion;
        this.density = DensityKt.Density$default(1.0f, 0.0f, 2, null);
        this.position = new int[2];
        this.size = IntSize.Companion.m7787getZeroYbymL2g();
        this.runUpdate = new AndroidViewHolder$runUpdate$1(this);
        this.runInvalidate = new AndroidViewHolder$runInvalidate$1(this);
        this.location = new int[2];
        this.lastWidthMeasureSpec = Integer.MIN_VALUE;
        this.lastHeightMeasureSpec = Integer.MIN_VALUE;
        this.nestedScrollingParentHelper = new qc0();
        Object[] objArr = 0 == true ? 1 : 0;
        final LayoutNode layoutNode = new LayoutNode(false, objArr, 3, null);
        layoutNode.setInteropViewFactoryHolder$ui(this);
        androidViewHolder_androidKt$NoOpScrollConnection$1 = AndroidViewHolder_androidKt.NoOpScrollConnection;
        Modifier then = OnGloballyPositionedModifierKt.onGloballyPositioned(DrawModifierKt.drawBehind(PointerInteropFilter_androidKt.pointerInteropFilter(SemanticsModifierKt.semantics(NestedScrollModifierKt.nestedScroll(companion, androidViewHolder_androidKt$NoOpScrollConnection$1, nestedScrollDispatcher), true, AndroidViewHolder$layoutNode$1$coreModifier$1.INSTANCE), this), new AndroidViewHolder$layoutNode$1$coreModifier$2(this, layoutNode, this)), new AndroidViewHolder$layoutNode$1$coreModifier$3(this, layoutNode)).then(new BringIntoViewElement(new AndroidViewHolder$layoutNode$1$coreModifier$4(this)));
        layoutNode.setCompositeKeyHash(i);
        layoutNode.setModifier(this.modifier.then(then));
        this.onModifierChanged = new AndroidViewHolder$layoutNode$1$1(layoutNode, then);
        layoutNode.setDensity(this.density);
        this.onDensityChanged = new AndroidViewHolder$layoutNode$1$2(layoutNode);
        layoutNode.setOnAttach$ui(new AndroidViewHolder$layoutNode$1$3(this, layoutNode));
        layoutNode.setOnDetach$ui(new AndroidViewHolder$layoutNode$1$4(this));
        layoutNode.setMeasurePolicy(new MeasurePolicy() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5
            private final int intrinsicHeight(int i3) {
                int obtainMeasureSpec;
                AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
                ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
                layoutParams.getClass();
                obtainMeasureSpec = androidViewHolder.obtainMeasureSpec(0, i3, layoutParams.width);
                androidViewHolder.measure(obtainMeasureSpec, View.MeasureSpec.makeMeasureSpec(0, 0));
                return AndroidViewHolder.this.getMeasuredHeight();
            }

            private final int intrinsicWidth(int i3) {
                int obtainMeasureSpec;
                AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                AndroidViewHolder androidViewHolder2 = AndroidViewHolder.this;
                ViewGroup.LayoutParams layoutParams = androidViewHolder2.getLayoutParams();
                layoutParams.getClass();
                obtainMeasureSpec = androidViewHolder2.obtainMeasureSpec(0, i3, layoutParams.height);
                androidViewHolder.measure(makeMeasureSpec, obtainMeasureSpec);
                return AndroidViewHolder.this.getMeasuredWidth();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i3) {
                return intrinsicHeight(i3);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i3) {
                return intrinsicWidth(i3);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public MeasureResult mo5measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                int obtainMeasureSpec;
                int obtainMeasureSpec2;
                if (AndroidViewHolder.this.getChildCount() == 0) {
                    return MeasureScope.layout$default(measureScope, Constraints.m7566getMinWidthimpl(j), Constraints.m7565getMinHeightimpl(j), null, AndroidViewHolder$layoutNode$1$5$measure$1.INSTANCE, 4, null);
                }
                if (Constraints.m7566getMinWidthimpl(j) != 0) {
                    AndroidViewHolder.this.getChildAt(0).setMinimumWidth(Constraints.m7566getMinWidthimpl(j));
                }
                if (Constraints.m7565getMinHeightimpl(j) != 0) {
                    AndroidViewHolder.this.getChildAt(0).setMinimumHeight(Constraints.m7565getMinHeightimpl(j));
                }
                AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
                int m7566getMinWidthimpl = Constraints.m7566getMinWidthimpl(j);
                int m7564getMaxWidthimpl = Constraints.m7564getMaxWidthimpl(j);
                ViewGroup.LayoutParams layoutParams = AndroidViewHolder.this.getLayoutParams();
                layoutParams.getClass();
                obtainMeasureSpec = androidViewHolder.obtainMeasureSpec(m7566getMinWidthimpl, m7564getMaxWidthimpl, layoutParams.width);
                AndroidViewHolder androidViewHolder2 = AndroidViewHolder.this;
                int m7565getMinHeightimpl = Constraints.m7565getMinHeightimpl(j);
                int m7563getMaxHeightimpl = Constraints.m7563getMaxHeightimpl(j);
                ViewGroup.LayoutParams layoutParams2 = AndroidViewHolder.this.getLayoutParams();
                layoutParams2.getClass();
                obtainMeasureSpec2 = androidViewHolder2.obtainMeasureSpec(m7565getMinHeightimpl, m7563getMaxHeightimpl, layoutParams2.height);
                androidViewHolder.measure(obtainMeasureSpec, obtainMeasureSpec2);
                return MeasureScope.layout$default(measureScope, AndroidViewHolder.this.getMeasuredWidth(), AndroidViewHolder.this.getMeasuredHeight(), null, new AndroidViewHolder$layoutNode$1$5$measure$2(AndroidViewHolder.this, layoutNode), 4, null);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i3) {
                return intrinsicHeight(i3);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i3) {
                return intrinsicWidth(i3);
            }
        });
        this.layoutNode = layoutNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OwnerSnapshotObserver getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            InlineClassHelperKt.throwIllegalStateException("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.owner.getSnapshotObserver();
    }

    private final v00 inset(v00 v00Var, int i, int i2, int i3, int i4) {
        int i5 = v00Var.a - i;
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = v00Var.b - i2;
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = v00Var.c - i3;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = v00Var.d - i4;
        return v00.b(i5, i6, i7, i8 >= 0 ? i8 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q21 insetBounds(q21 q21Var) {
        NodeCoordinator innerCoordinator$ui = this.layoutNode.getInnerCoordinator$ui();
        if (innerCoordinator$ui.isAttached()) {
            long m7756roundk4lQ0M = IntOffsetKt.m7756roundk4lQ0M(LayoutCoordinatesKt.positionInRoot(innerCoordinator$ui));
            int m7739getXimpl = IntOffset.m7739getXimpl(m7756roundk4lQ0M);
            if (m7739getXimpl < 0) {
                m7739getXimpl = 0;
            }
            int m7740getYimpl = IntOffset.m7740getYimpl(m7756roundk4lQ0M);
            int i = m7740getYimpl < 0 ? 0 : m7740getYimpl;
            long mo6242getSizeYbymL2g = LayoutCoordinatesKt.findRootCoordinates(innerCoordinator$ui).mo6242getSizeYbymL2g();
            int i2 = (int) (mo6242getSizeYbymL2g >> 32);
            int i3 = (int) (mo6242getSizeYbymL2g & 4294967295L);
            long mo6242getSizeYbymL2g2 = innerCoordinator$ui.mo6242getSizeYbymL2g();
            long floatToRawIntBits = Float.floatToRawIntBits((int) (mo6242getSizeYbymL2g2 >> 32));
            int floatToRawIntBits2 = Float.floatToRawIntBits((int) (mo6242getSizeYbymL2g2 & 4294967295L));
            int i4 = i;
            long m7756roundk4lQ0M2 = IntOffsetKt.m7756roundk4lQ0M(innerCoordinator$ui.mo6245localToRootMKHz9U(Offset.m4508constructorimpl((floatToRawIntBits2 & 4294967295L) | (floatToRawIntBits << 32))));
            int m7739getXimpl2 = i2 - IntOffset.m7739getXimpl(m7756roundk4lQ0M2);
            if (m7739getXimpl2 < 0) {
                m7739getXimpl2 = 0;
            }
            int m7740getYimpl2 = i3 - IntOffset.m7740getYimpl(m7756roundk4lQ0M2);
            int i5 = m7740getYimpl2 >= 0 ? m7740getYimpl2 : 0;
            if (m7739getXimpl != 0 || i4 != 0 || m7739getXimpl2 != 0 || i5 != 0) {
                int i6 = m7739getXimpl;
                int i7 = m7739getXimpl2;
                return new q21(inset(q21Var.a, i6, i4, i7, i5), inset(q21Var.b, i6, i4, i7, i5));
            }
        }
        return q21Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p31 insetToLayoutPosition(p31 p31Var) {
        m31 m31Var = p31Var.a;
        v00 g = m31Var.g(-1);
        v00 v00Var = v00.e;
        if (g.equals(v00Var) && m31Var.h(-9).equals(v00Var) && m31Var.f() == null) {
            return p31Var;
        }
        NodeCoordinator innerCoordinator$ui = this.layoutNode.getInnerCoordinator$ui();
        if (innerCoordinator$ui.isAttached()) {
            long m7756roundk4lQ0M = IntOffsetKt.m7756roundk4lQ0M(LayoutCoordinatesKt.positionInRoot(innerCoordinator$ui));
            int m7739getXimpl = IntOffset.m7739getXimpl(m7756roundk4lQ0M);
            if (m7739getXimpl < 0) {
                m7739getXimpl = 0;
            }
            int m7740getYimpl = IntOffset.m7740getYimpl(m7756roundk4lQ0M);
            if (m7740getYimpl < 0) {
                m7740getYimpl = 0;
            }
            long mo6242getSizeYbymL2g = LayoutCoordinatesKt.findRootCoordinates(innerCoordinator$ui).mo6242getSizeYbymL2g();
            int i = (int) (mo6242getSizeYbymL2g >> 32);
            int i2 = (int) (mo6242getSizeYbymL2g & 4294967295L);
            long mo6242getSizeYbymL2g2 = innerCoordinator$ui.mo6242getSizeYbymL2g();
            long m7756roundk4lQ0M2 = IntOffsetKt.m7756roundk4lQ0M(innerCoordinator$ui.mo6245localToRootMKHz9U(Offset.m4508constructorimpl((4294967295L & Float.floatToRawIntBits((int) (mo6242getSizeYbymL2g2 & 4294967295L))) | (Float.floatToRawIntBits((int) (mo6242getSizeYbymL2g2 >> 32)) << 32))));
            int m7739getXimpl2 = i - IntOffset.m7739getXimpl(m7756roundk4lQ0M2);
            if (m7739getXimpl2 < 0) {
                m7739getXimpl2 = 0;
            }
            int m7740getYimpl2 = i2 - IntOffset.m7740getYimpl(m7756roundk4lQ0M2);
            int i3 = m7740getYimpl2 >= 0 ? m7740getYimpl2 : 0;
            if (m7739getXimpl != 0 || m7740getYimpl != 0 || m7739getXimpl2 != 0 || i3 != 0) {
                return p31Var.a.n(m7739getXimpl, m7740getYimpl, m7739getXimpl2, i3);
            }
        }
        return p31Var;
    }

    private final <T> T insetValue(T t, oy oyVar) {
        NodeCoordinator innerCoordinator$ui = this.layoutNode.getInnerCoordinator$ui();
        if (innerCoordinator$ui.isAttached()) {
            long m7756roundk4lQ0M = IntOffsetKt.m7756roundk4lQ0M(LayoutCoordinatesKt.positionInRoot(innerCoordinator$ui));
            int m7739getXimpl = IntOffset.m7739getXimpl(m7756roundk4lQ0M);
            if (m7739getXimpl < 0) {
                m7739getXimpl = 0;
            }
            int m7740getYimpl = IntOffset.m7740getYimpl(m7756roundk4lQ0M);
            if (m7740getYimpl < 0) {
                m7740getYimpl = 0;
            }
            long mo6242getSizeYbymL2g = LayoutCoordinatesKt.findRootCoordinates(innerCoordinator$ui).mo6242getSizeYbymL2g();
            int i = (int) (mo6242getSizeYbymL2g >> 32);
            int i2 = (int) (mo6242getSizeYbymL2g & 4294967295L);
            long mo6242getSizeYbymL2g2 = innerCoordinator$ui.mo6242getSizeYbymL2g();
            long m7756roundk4lQ0M2 = IntOffsetKt.m7756roundk4lQ0M(innerCoordinator$ui.mo6245localToRootMKHz9U(Offset.m4508constructorimpl((4294967295L & Float.floatToRawIntBits((int) (mo6242getSizeYbymL2g2 & 4294967295L))) | (Float.floatToRawIntBits((int) (mo6242getSizeYbymL2g2 >> 32)) << 32))));
            int m7739getXimpl2 = i - IntOffset.m7739getXimpl(m7756roundk4lQ0M2);
            if (m7739getXimpl2 < 0) {
                m7739getXimpl2 = 0;
            }
            int m7740getYimpl2 = i2 - IntOffset.m7740getYimpl(m7756roundk4lQ0M2);
            int i3 = m7740getYimpl2 >= 0 ? m7740getYimpl2 : 0;
            if (m7739getXimpl != 0 || m7740getYimpl != 0 || m7739getXimpl2 != 0 || i3 != 0) {
                return (T) oyVar.invoke(Integer.valueOf(m7739getXimpl), Integer.valueOf(m7740getYimpl), Integer.valueOf(m7739getXimpl2), Integer.valueOf(i3));
            }
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int obtainMeasureSpec(int i, int i2, int i3) {
        return (i3 >= 0 || i == i2) ? View.MeasureSpec.makeMeasureSpec(y80.h(i3, i, i2), GroupFlagsKt.IsSubcompositionContextFlag) : (i3 != -2 || i2 == Integer.MAX_VALUE) ? (i3 != -1 || i2 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i2, GroupFlagsKt.IsSubcompositionContextFlag) : View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.location);
        int[] iArr = this.location;
        int i = iArr[0];
        region.op(i, iArr[1], getWidth() + i, getHeight() + this.location[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final Density getDensity() {
        return this.density;
    }

    public final View getInteropView() {
        return this.view;
    }

    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final y40 getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        qc0 qc0Var = this.nestedScrollingParentHelper;
        return qc0Var.b | qc0Var.a;
    }

    public final ky getOnDensityChanged$ui() {
        return this.onDensityChanged;
    }

    public final ky getOnModifierChanged$ui() {
        return this.onModifierChanged;
    }

    public final ky getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.onRequestDisallowInterceptTouchEvent;
    }

    public final iy getRelease() {
        return this.release;
    }

    public final iy getReset() {
        return this.reset;
    }

    public final hl0 getSavedStateRegistryOwner() {
        return this.savedStateRegistryOwner;
    }

    public final iy getUpdate() {
        return this.update;
    }

    public final View getView() {
        return this.view;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @er
    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        invalidateOrDefer();
        return null;
    }

    public final void invalidateOrDefer() {
        if (!this.isDrawing) {
            this.layoutNode.invalidateLayer$ui();
        } else {
            this.view.postOnAnimation(new f2(3, this.runInvalidate));
        }
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.view.isNestedScrollingEnabled();
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return isAttachedToWindow();
    }

    @Override // defpackage.fd0
    public p31 onApplyWindowInsets(View view, p31 p31Var) {
        this.insets = new p31(p31Var);
        return insetToLayoutPosition(p31Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.runUpdate.invoke();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onDeactivate() {
        this.reset.invoke();
        removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidateOrDefer();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().clear$ui(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.view.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        if (this.view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        this.view.measure(i, i2);
        setMeasuredDimension(this.view.getMeasuredWidth(), this.view.getMeasuredHeight());
        this.lastWidthMeasureSpec = i;
        this.lastHeightMeasureSpec = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        float composeVelocity;
        float composeVelocity2;
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        composeVelocity = AndroidViewHolder_androidKt.toComposeVelocity(f);
        composeVelocity2 = AndroidViewHolder_androidKt.toComposeVelocity(f2);
        p01.t(this.dispatcher.getCoroutineScope(), null, null, new AndroidViewHolder$onNestedFling$1(z, this, VelocityKt.Velocity(composeVelocity, composeVelocity2), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        float composeVelocity;
        float composeVelocity2;
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        composeVelocity = AndroidViewHolder_androidKt.toComposeVelocity(f);
        composeVelocity2 = AndroidViewHolder_androidKt.toComposeVelocity(f2);
        p01.t(this.dispatcher.getCoroutineScope(), null, null, new AndroidViewHolder$onNestedPreFling$1(this, VelocityKt.Velocity(composeVelocity, composeVelocity2), null), 3);
        return false;
    }

    @Override // defpackage.pc0
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        float composeOffset;
        float composeOffset2;
        int nestedScrollSource;
        if (isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
            composeOffset = AndroidViewHolder_androidKt.toComposeOffset(i);
            composeOffset2 = AndroidViewHolder_androidKt.toComposeOffset(i2);
            long m4508constructorimpl = Offset.m4508constructorimpl((Float.floatToRawIntBits(composeOffset2) & 4294967295L) | (Float.floatToRawIntBits(composeOffset) << 32));
            nestedScrollSource = AndroidViewHolder_androidKt.toNestedScrollSource(i3);
            long m5953dispatchPreScrollOzD1aCk = nestedScrollDispatcher.m5953dispatchPreScrollOzD1aCk(m4508constructorimpl, nestedScrollSource);
            iArr[0] = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (m5953dispatchPreScrollOzD1aCk >> 32)));
            iArr[1] = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (m5953dispatchPreScrollOzD1aCk & 4294967295L)));
        }
    }

    @Override // defpackage.pc0
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        float composeOffset;
        float composeOffset2;
        float composeOffset3;
        float composeOffset4;
        int nestedScrollSource;
        if (isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
            composeOffset = AndroidViewHolder_androidKt.toComposeOffset(i);
            composeOffset2 = AndroidViewHolder_androidKt.toComposeOffset(i2);
            long m4508constructorimpl = Offset.m4508constructorimpl((Float.floatToRawIntBits(composeOffset2) & 4294967295L) | (Float.floatToRawIntBits(composeOffset) << 32));
            composeOffset3 = AndroidViewHolder_androidKt.toComposeOffset(i3);
            composeOffset4 = AndroidViewHolder_androidKt.toComposeOffset(i4);
            long m4508constructorimpl2 = Offset.m4508constructorimpl((Float.floatToRawIntBits(composeOffset4) & 4294967295L) | (Float.floatToRawIntBits(composeOffset3) << 32));
            nestedScrollSource = AndroidViewHolder_androidKt.toNestedScrollSource(i5);
            long m5951dispatchPostScrollDzOQY0M = nestedScrollDispatcher.m5951dispatchPostScrollDzOQY0M(m4508constructorimpl, m4508constructorimpl2, nestedScrollSource);
            iArr[0] = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (m5951dispatchPostScrollDzOQY0M >> 32)));
            iArr[1] = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (m5951dispatchPostScrollDzOQY0M & 4294967295L)));
        }
    }

    @Override // defpackage.pc0
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        qc0 qc0Var = this.nestedScrollingParentHelper;
        if (i2 == 1) {
            qc0Var.b = i;
        } else {
            qc0Var.a = i;
        }
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onRelease() {
        this.release.invoke();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onReuse() {
        if (this.view.getParent() != this) {
            addView(this.view);
        } else {
            this.reset.invoke();
        }
    }

    @Override // defpackage.pc0
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    @Override // defpackage.pc0
    public void onStopNestedScroll(View view, int i) {
        qc0 qc0Var = this.nestedScrollingParentHelper;
        if (i == 1) {
            qc0Var.b = 0;
        } else {
            qc0Var.a = 0;
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    public final void remeasure() {
        int i;
        int i2 = this.lastWidthMeasureSpec;
        if (i2 == Integer.MIN_VALUE || (i = this.lastHeightMeasureSpec) == Integer.MIN_VALUE) {
            return;
        }
        measure(i2, i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        ky kyVar = this.bringIntoViewRequester;
        if (kyVar == null) {
            return true;
        }
        kyVar.invoke(rect != null ? RectHelper_androidKt.toComposeRect(rect) : null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        ky kyVar = this.onRequestDisallowInterceptTouchEvent;
        if (kyVar != null) {
            kyVar.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(Density density) {
        if (density != this.density) {
            this.density = density;
            ky kyVar = this.onDensityChanged;
            if (kyVar != null) {
                kyVar.invoke(density);
            }
        }
    }

    public final void setLifecycleOwner(y40 y40Var) {
        if (y40Var != this.lifecycleOwner) {
            this.lifecycleOwner = y40Var;
            setTag(R.id.view_tree_lifecycle_owner, y40Var);
        }
    }

    public final void setModifier(Modifier modifier) {
        if (modifier != this.modifier) {
            this.modifier = modifier;
            ky kyVar = this.onModifierChanged;
            if (kyVar != null) {
                kyVar.invoke(modifier);
            }
        }
    }

    public final void setOnDensityChanged$ui(ky kyVar) {
        this.onDensityChanged = kyVar;
    }

    public final void setOnModifierChanged$ui(ky kyVar) {
        this.onModifierChanged = kyVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(ky kyVar) {
        this.onRequestDisallowInterceptTouchEvent = kyVar;
    }

    public final void setRelease(iy iyVar) {
        this.release = iyVar;
    }

    public final void setReset(iy iyVar) {
        this.reset = iyVar;
    }

    public final void setSavedStateRegistryOwner(hl0 hl0Var) {
        if (hl0Var != this.savedStateRegistryOwner) {
            this.savedStateRegistryOwner = hl0Var;
            setTag(R.id.view_tree_saved_state_registry_owner, hl0Var);
        }
    }

    public final void setUpdate(iy iyVar) {
        this.update = iyVar;
        this.hasUpdateBlock = true;
        this.runUpdate.invoke();
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        private Companion() {
        }
    }

    @Override // defpackage.pc0
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        float composeOffset;
        float composeOffset2;
        float composeOffset3;
        float composeOffset4;
        int nestedScrollSource;
        if (isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
            composeOffset = AndroidViewHolder_androidKt.toComposeOffset(i);
            composeOffset2 = AndroidViewHolder_androidKt.toComposeOffset(i2);
            long m4508constructorimpl = Offset.m4508constructorimpl((Float.floatToRawIntBits(composeOffset2) & 4294967295L) | (Float.floatToRawIntBits(composeOffset) << 32));
            composeOffset3 = AndroidViewHolder_androidKt.toComposeOffset(i3);
            composeOffset4 = AndroidViewHolder_androidKt.toComposeOffset(i4);
            long m4508constructorimpl2 = Offset.m4508constructorimpl((Float.floatToRawIntBits(composeOffset4) & 4294967295L) | (Float.floatToRawIntBits(composeOffset3) << 32));
            nestedScrollSource = AndroidViewHolder_androidKt.toNestedScrollSource(i5);
            nestedScrollDispatcher.m5951dispatchPostScrollDzOQY0M(m4508constructorimpl, m4508constructorimpl2, nestedScrollSource);
        }
    }
}
