package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.IntSize;
import defpackage.f30;
import defpackage.iy;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VectorComponent extends VNode {
    public static final int $stable = 8;
    private final DrawCache cacheDrawScope;
    private final ky drawVectorBlock;
    private final MutableState intrinsicColorFilter$delegate;
    private iy invalidateCallback;
    private boolean isDirty;
    private String name;
    private long previousDrawSize;
    private final GroupComponent root;
    private float rootScaleX;
    private float rootScaleY;
    private ColorFilter tintFilter;
    private final MutableState viewportSize$delegate;

    public VectorComponent(GroupComponent groupComponent) {
        super(null);
        this.root = groupComponent;
        groupComponent.setInvalidateListener$ui(new AnonymousClass1());
        this.name = "";
        this.isDirty = true;
        this.cacheDrawScope = new DrawCache();
        this.invalidateCallback = VectorComponent$invalidateCallback$1.INSTANCE;
        this.intrinsicColorFilter$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        Size.Companion companion = Size.Companion;
        this.viewportSize$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m4573boximpl(companion.m4594getZeroNHjbRc()), null, 2, null);
        this.previousDrawSize = companion.m4593getUnspecifiedNHjbRc();
        this.rootScaleX = 1.0f;
        this.rootScaleY = 1.0f;
        this.drawVectorBlock = new VectorComponent$drawVectorBlock$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doInvalidate() {
        this.isDirty = true;
        this.invalidateCallback.invoke();
    }

    public final void draw(DrawScope drawScope, float f, ColorFilter colorFilter) {
        ImageBitmapConfig.Companion companion;
        int m4992getArgb8888_sVssgQ;
        DrawScope drawScope2;
        if (this.root.isTintable() && this.root.m5487getTintColor0d7_KjU() != 16 && VectorKt.tintableWithAlphaMask(getIntrinsicColorFilter$ui()) && VectorKt.tintableWithAlphaMask(colorFilter)) {
            companion = ImageBitmapConfig.Companion;
            m4992getArgb8888_sVssgQ = companion.m4991getAlpha8_sVssgQ();
        } else {
            companion = ImageBitmapConfig.Companion;
            m4992getArgb8888_sVssgQ = companion.m4992getArgb8888_sVssgQ();
        }
        int i = m4992getArgb8888_sVssgQ;
        if (!this.isDirty && Size.m4581equalsimpl0(this.previousDrawSize, drawScope.mo5335getSizeNHjbRc()) && ImageBitmapConfig.m4987equalsimpl0(i, m5502getCacheBitmapConfig_sVssgQ$ui())) {
            drawScope2 = drawScope;
        } else {
            this.tintFilter = ImageBitmapConfig.m4987equalsimpl0(i, companion.m4991getAlpha8_sVssgQ()) ? ColorFilter.Companion.m4802tintxETnrds$default(ColorFilter.Companion, VectorKt.m5511toOpaque8_81llA(this.root.m5487getTintColor0d7_KjU()), 0, 2, null) : null;
            this.rootScaleX = Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() >> 32)) / Float.intBitsToFloat((int) (m5503getViewportSizeNHjbRc$ui() >> 32));
            this.rootScaleY = Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() & 4294967295L)) / Float.intBitsToFloat((int) (m5503getViewportSizeNHjbRc$ui() & 4294967295L));
            drawScope2 = drawScope;
            this.cacheDrawScope.m5485drawCachedImageFqjB98A(i, IntSize.m7777constructorimpl((((int) Math.ceil(Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() & 4294967295L)))) & 4294967295L) | (((int) Math.ceil(Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() >> 32)))) << 32)), drawScope2, drawScope.getLayoutDirection(), this.drawVectorBlock);
            this.isDirty = false;
            this.previousDrawSize = drawScope2.mo5335getSizeNHjbRc();
        }
        if (colorFilter == null) {
            colorFilter = getIntrinsicColorFilter$ui() != null ? getIntrinsicColorFilter$ui() : this.tintFilter;
        }
        this.cacheDrawScope.drawInto(drawScope2, f, colorFilter);
    }

    /* renamed from: getCacheBitmapConfig-_sVssgQ$ui, reason: not valid java name */
    public final int m5502getCacheBitmapConfig_sVssgQ$ui() {
        ImageBitmap mCachedImage = this.cacheDrawScope.getMCachedImage();
        return mCachedImage != null ? mCachedImage.mo4625getConfig_sVssgQ() : ImageBitmapConfig.Companion.m4992getArgb8888_sVssgQ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ColorFilter getIntrinsicColorFilter$ui() {
        return (ColorFilter) this.intrinsicColorFilter$delegate.getValue();
    }

    public final iy getInvalidateCallback$ui() {
        return this.invalidateCallback;
    }

    public final String getName() {
        return this.name;
    }

    public final GroupComponent getRoot() {
        return this.root;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getViewportSize-NH-jbRc$ui, reason: not valid java name */
    public final long m5503getViewportSizeNHjbRc$ui() {
        return ((Size) this.viewportSize$delegate.getValue()).m4590unboximpl();
    }

    public final void setIntrinsicColorFilter$ui(ColorFilter colorFilter) {
        this.intrinsicColorFilter$delegate.setValue(colorFilter);
    }

    public final void setInvalidateCallback$ui(iy iyVar) {
        this.invalidateCallback = iyVar;
    }

    public final void setName(String str) {
        this.name = str;
    }

    /* renamed from: setViewportSize-uvyYCjk$ui, reason: not valid java name */
    public final void m5504setViewportSizeuvyYCjk$ui(long j) {
        this.viewportSize$delegate.setValue(Size.m4573boximpl(j));
    }

    public String toString() {
        return "Params: \tname: " + this.name + "\n\tviewportWidth: " + Float.intBitsToFloat((int) (m5503getViewportSizeNHjbRc$ui() >> 32)) + "\n\tviewportHeight: " + Float.intBitsToFloat((int) (m5503getViewportSizeNHjbRc$ui() & 4294967295L)) + "\n";
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    /* renamed from: androidx.compose.ui.graphics.vector.VectorComponent$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f30 implements ky {
        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.ky
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((VNode) obj);
            return w01.a;
        }

        public final void invoke(VNode vNode) {
            VectorComponent.this.doInvalidate();
        }
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public void draw(DrawScope drawScope) {
        draw(drawScope, 1.0f, null);
    }
}
