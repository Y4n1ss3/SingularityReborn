package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.shadow.ShadowContext;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.iy;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CacheDrawScope implements Density {
    public static final int $stable = 0;
    private BuildDrawCacheParams cacheParams = EmptyBuildDrawCacheParams.INSTANCE;
    private ContentDrawScope contentDrawScope;
    private DrawResult drawResult;
    private iy graphicsContextProvider;

    /* renamed from: record-TdoYBX4$default, reason: not valid java name */
    public static /* synthetic */ void m4292recordTdoYBX4$default(CacheDrawScope cacheDrawScope, GraphicsLayer graphicsLayer, Density density, LayoutDirection layoutDirection, long j, ky kyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            density = cacheDrawScope;
        }
        if ((i & 2) != 0) {
            layoutDirection = cacheDrawScope.getLayoutDirection();
        }
        if ((i & 4) != 0) {
            j = IntSizeKt.m7793toIntSizeuvyYCjk(cacheDrawScope.m4293getSizeNHjbRc());
        }
        cacheDrawScope.m4294recordTdoYBX4(graphicsLayer, density, layoutDirection, j, kyVar);
    }

    public final BuildDrawCacheParams getCacheParams$ui() {
        return this.cacheParams;
    }

    public final ContentDrawScope getContentDrawScope$ui() {
        return this.contentDrawScope;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.cacheParams.getDensity().getDensity();
    }

    public final DrawResult getDrawResult$ui() {
        return this.drawResult;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.cacheParams.getDensity().getFontScale();
    }

    public final iy getGraphicsContextProvider$ui() {
        return this.graphicsContextProvider;
    }

    public final LayoutDirection getLayoutDirection() {
        return this.cacheParams.getLayoutDirection();
    }

    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m4293getSizeNHjbRc() {
        return this.cacheParams.mo4290getSizeNHjbRc();
    }

    public final GraphicsLayer obtainGraphicsLayer() {
        iy iyVar = this.graphicsContextProvider;
        iyVar.getClass();
        return ((GraphicsContext) iyVar.invoke()).createGraphicsLayer();
    }

    public final ShadowContext obtainShadowContext() {
        iy iyVar = this.graphicsContextProvider;
        iyVar.getClass();
        return ((GraphicsContext) iyVar.invoke()).getShadowContext();
    }

    public final DrawResult onDrawBehind(ky kyVar) {
        return onDrawWithContent(new CacheDrawScope$onDrawBehind$1(kyVar));
    }

    public final DrawResult onDrawWithContent(ky kyVar) {
        DrawResult drawResult = new DrawResult(kyVar);
        this.drawResult = drawResult;
        return drawResult;
    }

    /* renamed from: record-TdoYBX4, reason: not valid java name */
    public final void m4294recordTdoYBX4(GraphicsLayer graphicsLayer, Density density, LayoutDirection layoutDirection, long j, ky kyVar) {
        ContentDrawScope contentDrawScope = this.contentDrawScope;
        contentDrawScope.getClass();
        contentDrawScope.mo5336recordJVtK1S4(graphicsLayer, j, new CacheDrawScope$record$1$1(kyVar, contentDrawScope, density, layoutDirection, contentDrawScope.getDrawContext().getDensity(), contentDrawScope.getDrawContext().getLayoutDirection()));
    }

    public final void setCacheParams$ui(BuildDrawCacheParams buildDrawCacheParams) {
        this.cacheParams = buildDrawCacheParams;
    }

    public final void setContentDrawScope$ui(ContentDrawScope contentDrawScope) {
        this.contentDrawScope = contentDrawScope;
    }

    public final void setDrawResult$ui(DrawResult drawResult) {
        this.drawResult = drawResult;
    }

    public final void setGraphicsContextProvider$ui(iy iyVar) {
        this.graphicsContextProvider = iyVar;
    }
}
