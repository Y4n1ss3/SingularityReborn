package androidx.compose.animation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.ContentScale;
import defpackage.iy;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SkipToLookaheadSizeNodeKt {
    private static final iy DefaultEnabled = SkipToLookaheadSizeNodeKt$DefaultEnabled$1.INSTANCE;

    public static final Modifier createContentScaleModifier(Modifier modifier, ScaleToBoundsImpl scaleToBoundsImpl, iy iyVar) {
        return modifier.then(q10.b(scaleToBoundsImpl.getContentScale(), ContentScale.Companion.getCrop()) ? GraphicsLayerModifierKt.graphicsLayer(Modifier.Companion, new SkipToLookaheadSizeNodeKt$createContentScaleModifier$1(iyVar)) : Modifier.Companion).then(new SkipToLookaheadSizeElement(scaleToBoundsImpl, iyVar));
    }
}
