package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawContextKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.dq;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ViewLayer extends View {
    private boolean canUseCompositingLayer;
    private final CanvasDrawScope canvasDrawScope;
    private final CanvasHolder canvasHolder;
    private Density density;
    private ky drawBlock;
    private boolean isInvalidated;
    private Outline layerOutline;
    private LayoutDirection layoutDirection;
    private final View ownerView;
    private GraphicsLayer parentLayer;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final ViewOutlineProvider LayerOutlineProvider = new ViewOutlineProvider() { // from class: androidx.compose.ui.graphics.layer.ViewLayer$Companion$LayerOutlineProvider$1
        /* JADX WARN: Code restructure failed: missing block: B:3:0x0004, code lost:
        
            r0 = ((androidx.compose.ui.graphics.layer.ViewLayer) r1).layerOutline;
         */
        @Override // android.view.ViewOutlineProvider
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void getOutline(View view, Outline outline) {
            Outline outline2;
            if (!(view instanceof ViewLayer) || outline2 == null) {
                return;
            }
            outline.set(outline2);
        }
    };

    public ViewLayer(View view, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope) {
        super(view.getContext());
        this.ownerView = view;
        this.canvasHolder = canvasHolder;
        this.canvasDrawScope = canvasDrawScope;
        setOutlineProvider(LayerOutlineProvider);
        this.canUseCompositingLayer = true;
        this.density = DrawContextKt.getDefaultDensity();
        this.layoutDirection = LayoutDirection.Ltr;
        this.drawBlock = GraphicsLayerImpl.Companion.getDefaultDrawBlock();
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        CanvasHolder canvasHolder = this.canvasHolder;
        Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
        AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
        CanvasDrawScope canvasDrawScope = this.canvasDrawScope;
        Density density = this.density;
        LayoutDirection layoutDirection = this.layoutDirection;
        float width = getWidth();
        float height = getHeight();
        long m4576constructorimpl = Size.m4576constructorimpl((Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32));
        GraphicsLayer graphicsLayer = this.parentLayer;
        ky kyVar = this.drawBlock;
        Density density2 = canvasDrawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = canvasDrawScope.getDrawContext().getLayoutDirection();
        androidx.compose.ui.graphics.Canvas canvas2 = canvasDrawScope.getDrawContext().getCanvas();
        long mo5256getSizeNHjbRc = canvasDrawScope.getDrawContext().mo5256getSizeNHjbRc();
        GraphicsLayer graphicsLayer2 = canvasDrawScope.getDrawContext().getGraphicsLayer();
        DrawContext drawContext = canvasDrawScope.getDrawContext();
        drawContext.setDensity(density);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(androidCanvas);
        drawContext.mo5257setSizeuvyYCjk(m4576constructorimpl);
        drawContext.setGraphicsLayer(graphicsLayer);
        androidCanvas.save();
        try {
            kyVar.invoke(canvasDrawScope);
            androidCanvas.restore();
            DrawContext drawContext2 = canvasDrawScope.getDrawContext();
            drawContext2.setDensity(density2);
            drawContext2.setLayoutDirection(layoutDirection2);
            drawContext2.setCanvas(canvas2);
            drawContext2.mo5257setSizeuvyYCjk(mo5256getSizeNHjbRc);
            drawContext2.setGraphicsLayer(graphicsLayer2);
            canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
            this.isInvalidated = false;
        } catch (Throwable th) {
            androidCanvas.restore();
            DrawContext drawContext3 = canvasDrawScope.getDrawContext();
            drawContext3.setDensity(density2);
            drawContext3.setLayoutDirection(layoutDirection2);
            drawContext3.setCanvas(canvas2);
            drawContext3.mo5257setSizeuvyYCjk(mo5256getSizeNHjbRc);
            drawContext3.setGraphicsLayer(graphicsLayer2);
            throw th;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.canUseCompositingLayer;
    }

    public final CanvasHolder getCanvasHolder() {
        return this.canvasHolder;
    }

    public final View getOwnerView() {
        return this.ownerView;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.canUseCompositingLayer;
    }

    @Override // android.view.View
    public void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        this.isInvalidated = true;
        super.invalidate();
    }

    public final boolean isInvalidated() {
        return this.isInvalidated;
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z) {
        if (this.canUseCompositingLayer != z) {
            this.canUseCompositingLayer = z;
            invalidate();
        }
    }

    public final void setDrawParams(Density density, LayoutDirection layoutDirection, GraphicsLayer graphicsLayer, ky kyVar) {
        this.density = density;
        this.layoutDirection = layoutDirection;
        this.drawBlock = kyVar;
        this.parentLayer = graphicsLayer;
    }

    public final void setInvalidated(boolean z) {
        this.isInvalidated = z;
    }

    public final boolean setLayerOutline(Outline outline) {
        this.layerOutline = outline;
        return OutlineUtils.INSTANCE.rebuildOutline(this);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final ViewOutlineProvider getLayerOutlineProvider$ui_graphics() {
            return ViewLayer.LayerOutlineProvider;
        }

        private Companion() {
        }
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    public /* synthetic */ ViewLayer(View view, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope, int i, dq dqVar) {
        this(view, (i & 2) != 0 ? new CanvasHolder() : canvasHolder, (i & 4) != 0 ? new CanvasDrawScope() : canvasDrawScope);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
