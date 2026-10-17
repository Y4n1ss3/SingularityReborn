package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.f30;
import defpackage.iy;
import defpackage.k4;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class CacheDrawModifierNodeImpl extends Modifier.Node implements CacheDrawModifierNode, ObserverModifierNode, BuildDrawCacheParams {
    private ky block;
    private final CacheDrawScope cacheDrawScope;
    private ScopedGraphicsContext cachedGraphicsContext;
    private boolean isCacheValid;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    /* renamed from: androidx.compose.ui.draw.CacheDrawModifierNodeImpl$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f30 implements iy {
        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.iy
        public final GraphicsContext invoke() {
            return CacheDrawModifierNodeImpl.this.getGraphicsContext();
        }
    }

    public CacheDrawModifierNodeImpl(CacheDrawScope cacheDrawScope, ky kyVar) {
        this.cacheDrawScope = cacheDrawScope;
        this.block = kyVar;
        cacheDrawScope.setCacheParams$ui(this);
        cacheDrawScope.setGraphicsContextProvider$ui(new AnonymousClass1());
    }

    private final DrawResult getOrBuildCachedDrawBlock(ContentDrawScope contentDrawScope) {
        if (!this.isCacheValid) {
            CacheDrawScope cacheDrawScope = this.cacheDrawScope;
            cacheDrawScope.setDrawResult$ui(null);
            cacheDrawScope.setContentDrawScope$ui(contentDrawScope);
            ObserverModifierNodeKt.observeReads(this, new CacheDrawModifierNodeImpl$getOrBuildCachedDrawBlock$1$1(this, cacheDrawScope));
            if (cacheDrawScope.getDrawResult$ui() == null) {
                throw k4.a("DrawResult not defined, did you forget to call onDraw?");
            }
            this.isCacheValid = true;
        }
        DrawResult drawResult$ui = this.cacheDrawScope.getDrawResult$ui();
        drawResult$ui.getClass();
        return drawResult$ui;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        getOrBuildCachedDrawBlock(contentDrawScope).getBlock$ui().invoke(contentDrawScope);
    }

    public final ky getBlock() {
        return this.block;
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    public Density getDensity() {
        return DelegatableNodeKt.requireDensity(this);
    }

    public final GraphicsContext getGraphicsContext() {
        ScopedGraphicsContext scopedGraphicsContext = this.cachedGraphicsContext;
        if (scopedGraphicsContext == null) {
            scopedGraphicsContext = new ScopedGraphicsContext();
            this.cachedGraphicsContext = scopedGraphicsContext;
        }
        if (scopedGraphicsContext.getGraphicsContext() == null) {
            scopedGraphicsContext.setGraphicsContext(DelegatableNodeKt.requireGraphicsContext(this));
        }
        return scopedGraphicsContext;
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    public LayoutDirection getLayoutDirection() {
        return DelegatableNodeKt.requireLayoutDirection(this);
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    /* renamed from: getSize-NH-jbRc */
    public long mo4290getSizeNHjbRc() {
        return IntSizeKt.m7794toSizeozmzZPI(DelegatableNodeKt.m6414requireCoordinator64DMado(this, NodeKind.m6573constructorimpl(4)).mo6242getSizeYbymL2g());
    }

    @Override // androidx.compose.ui.draw.CacheDrawModifierNode
    public void invalidateDrawCache() {
        ScopedGraphicsContext scopedGraphicsContext = this.cachedGraphicsContext;
        if (scopedGraphicsContext != null) {
            scopedGraphicsContext.releaseGraphicsLayers();
        }
        this.isCacheValid = false;
        this.cacheDrawScope.setDrawResult$ui(null);
        DrawModifierNodeKt.invalidateDraw(this);
    }

    @Override // androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public void onDensityChange() {
        invalidateDrawCache();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        super.onDetach();
        ScopedGraphicsContext scopedGraphicsContext = this.cachedGraphicsContext;
        if (scopedGraphicsContext != null) {
            scopedGraphicsContext.releaseGraphicsLayers();
        }
    }

    @Override // androidx.compose.ui.node.DelegatableNode
    public void onLayoutDirectionChange() {
        invalidateDrawCache();
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void onMeasureResultChanged() {
        invalidateDrawCache();
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        invalidateDrawCache();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        super.onReset();
        invalidateDrawCache();
    }

    public final void setBlock(ky kyVar) {
        this.block = kyVar;
        invalidateDrawCache();
    }
}
