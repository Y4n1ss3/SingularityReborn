package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerScopeKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.shadow.Shadow;
import androidx.compose.ui.unit.Dp;
import defpackage.er;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ShadowKt {
    public static final Modifier dropShadow(Modifier modifier, Shape shape, Shadow shadow) {
        return modifier.then(new SimpleDropShadowElement(shape, shadow));
    }

    public static final Modifier innerShadow(Modifier modifier, Shape shape, Shadow shadow) {
        return modifier.then(new SimpleInnerShadowElement(shape, shadow));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resetShadow(ShadowScope shadowScope) {
        shadowScope.setRadius(0.0f);
        shadowScope.setSpread(0.0f);
        shadowScope.mo4274setOffsetk4lQ0M(Offset.Companion.m4532getZeroF1C5BW0());
        shadowScope.mo4273setColor8_81llA(Color.Companion.m4787getBlack0d7_KjU());
        shadowScope.setBrush(null);
        shadowScope.setAlpha(1.0f);
        shadowScope.mo4272setBlendModes9anfk8(BlendMode.Companion.m4701getSrcOver0nO6VwU());
    }

    /* renamed from: shadow-s4CzXII, reason: not valid java name */
    public static final Modifier m4355shadows4CzXII(Modifier modifier, float f, Shape shape, boolean z, long j, long j2) {
        return (Dp.m7610compareTo0680j_4(f, Dp.m7611constructorimpl(0.0f)) > 0 || z) ? modifier.then(new ShadowGraphicsLayerElement(f, shape, z, j, j2, null)) : modifier;
    }

    @er
    /* renamed from: shadow-ziNgDLE, reason: not valid java name */
    public static final /* synthetic */ Modifier m4357shadowziNgDLE(Modifier modifier, float f, Shape shape, boolean z) {
        return m4355shadows4CzXII(modifier, f, shape, z, GraphicsLayerScopeKt.getDefaultShadowColor(), GraphicsLayerScopeKt.getDefaultShadowColor());
    }

    /* renamed from: shadow-ziNgDLE$default, reason: not valid java name */
    public static /* synthetic */ Modifier m4358shadowziNgDLE$default(Modifier modifier, float f, Shape shape, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        if ((i & 4) != 0) {
            z = Dp.m7610compareTo0680j_4(f, Dp.m7611constructorimpl(0.0f)) > 0;
        }
        return m4357shadowziNgDLE(modifier, f, shape, z);
    }

    public static final Modifier dropShadow(Modifier modifier, Shape shape, ky kyVar) {
        return modifier.then(new BlockDropShadowElement(shape, kyVar));
    }

    public static final Modifier innerShadow(Modifier modifier, Shape shape, ky kyVar) {
        return modifier.then(new BlockInnerShadowElement(shape, kyVar));
    }
}
