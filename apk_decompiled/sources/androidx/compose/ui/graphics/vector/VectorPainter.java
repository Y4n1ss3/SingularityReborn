package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composition;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.dq;
import defpackage.kf0;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VectorPainter extends Painter {
    public static final int $stable = 8;
    private final MutableState autoMirror$delegate;
    private Composition composition;
    private float currentAlpha;
    private ColorFilter currentColorFilter;
    private final MutableState drawInvalidation$delegate;
    private final MutableState size$delegate;
    private final VectorComponent vector;

    public VectorPainter(GroupComponent groupComponent) {
        this.size$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m4573boximpl(Size.Companion.m4594getZeroNHjbRc()), null, 2, null);
        this.autoMirror$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        VectorComponent vectorComponent = new VectorComponent(groupComponent);
        vectorComponent.setInvalidateCallback$ui(new VectorPainter$vector$1$1(this));
        this.vector = vectorComponent;
        this.drawInvalidation$delegate = SnapshotStateKt.mutableStateOf(w01.a, SnapshotStateKt.neverEqualPolicy());
        this.currentAlpha = 1.0f;
    }

    private final w01 getDrawInvalidation() {
        this.drawInvalidation$delegate.getValue();
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDrawInvalidation(w01 w01Var) {
        this.drawInvalidation$delegate.setValue(w01Var);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyAlpha(float f) {
        this.currentAlpha = f;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyColorFilter(ColorFilter colorFilter) {
        this.currentColorFilter = colorFilter;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getAutoMirror$ui() {
        return ((Boolean) this.autoMirror$delegate.getValue()).booleanValue();
    }

    /* renamed from: getBitmapConfig-_sVssgQ$ui, reason: not valid java name */
    public final int m5512getBitmapConfig_sVssgQ$ui() {
        return this.vector.m5502getCacheBitmapConfig_sVssgQ$ui();
    }

    public final Composition getComposition$ui() {
        return this.composition;
    }

    public final ColorFilter getIntrinsicColorFilter$ui() {
        return this.vector.getIntrinsicColorFilter$ui();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo5455getIntrinsicSizeNHjbRc() {
        return m5513getSizeNHjbRc$ui();
    }

    public final String getName$ui() {
        return this.vector.getName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getSize-NH-jbRc$ui, reason: not valid java name */
    public final long m5513getSizeNHjbRc$ui() {
        return ((Size) this.size$delegate.getValue()).m4590unboximpl();
    }

    public final VectorComponent getVector$ui() {
        return this.vector;
    }

    /* renamed from: getViewportSize-NH-jbRc$ui, reason: not valid java name */
    public final long m5514getViewportSizeNHjbRc$ui() {
        return this.vector.m5503getViewportSizeNHjbRc$ui();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(DrawScope drawScope) {
        VectorComponent vectorComponent = this.vector;
        ColorFilter colorFilter = this.currentColorFilter;
        if (colorFilter == null) {
            colorFilter = vectorComponent.getIntrinsicColorFilter$ui();
        }
        if (getAutoMirror$ui() && drawScope.getLayoutDirection() == LayoutDirection.Rtl) {
            long mo5334getCenterF1C5BW0 = drawScope.mo5334getCenterF1C5BW0();
            DrawContext drawContext = drawScope.getDrawContext();
            long mo5256getSizeNHjbRc = drawContext.mo5256getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo5263scale0AR0LA0(-1.0f, 1.0f, mo5334getCenterF1C5BW0);
                vectorComponent.draw(drawScope, this.currentAlpha, colorFilter);
            } finally {
                kf0.g(drawContext, mo5256getSizeNHjbRc);
            }
        } else {
            vectorComponent.draw(drawScope, this.currentAlpha, colorFilter);
        }
        getDrawInvalidation();
    }

    public final void setAutoMirror$ui(boolean z) {
        this.autoMirror$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setComposition$ui(Composition composition) {
        this.composition = composition;
    }

    public final void setIntrinsicColorFilter$ui(ColorFilter colorFilter) {
        this.vector.setIntrinsicColorFilter$ui(colorFilter);
    }

    public final void setName$ui(String str) {
        this.vector.setName(str);
    }

    /* renamed from: setSize-uvyYCjk$ui, reason: not valid java name */
    public final void m5515setSizeuvyYCjk$ui(long j) {
        this.size$delegate.setValue(Size.m4573boximpl(j));
    }

    /* renamed from: setViewportSize-uvyYCjk$ui, reason: not valid java name */
    public final void m5516setViewportSizeuvyYCjk$ui(long j) {
        this.vector.m5504setViewportSizeuvyYCjk$ui(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VectorPainter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ VectorPainter(GroupComponent groupComponent, int i, dq dqVar) {
        this((i & 1) != 0 ? new GroupComponent() : groupComponent);
    }
}
