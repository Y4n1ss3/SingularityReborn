package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TileMode;
import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BlurKt {
    /* renamed from: blur-1fqS-gw, reason: not valid java name */
    public static final Modifier m4277blur1fqSgw(Modifier modifier, float f, float f2, Shape shape) {
        int m5157getDecal3opZhB0;
        boolean z;
        if (shape != null) {
            m5157getDecal3opZhB0 = TileMode.Companion.m5156getClamp3opZhB0();
            z = true;
        } else {
            m5157getDecal3opZhB0 = TileMode.Companion.m5157getDecal3opZhB0();
            z = false;
        }
        boolean z2 = z;
        return ((Dp.m7610compareTo0680j_4(f, Dp.m7611constructorimpl(0.0f)) <= 0 || Dp.m7610compareTo0680j_4(f2, Dp.m7611constructorimpl(0.0f)) <= 0) && !z2) ? modifier : GraphicsLayerModifierKt.graphicsLayer(modifier, new BlurKt$blur$1(f, f2, m5157getDecal3opZhB0, shape, z2));
    }

    /* renamed from: blur-1fqS-gw$default, reason: not valid java name */
    public static /* synthetic */ Modifier m4278blur1fqSgw$default(Modifier modifier, float f, float f2, BlurredEdgeTreatment blurredEdgeTreatment, int i, Object obj) {
        if ((i & 4) != 0) {
            blurredEdgeTreatment = BlurredEdgeTreatment.m4281boximpl(BlurredEdgeTreatment.Companion.m4288getRectangleGoahg());
        }
        return m4277blur1fqSgw(modifier, f, f2, blurredEdgeTreatment.m4287unboximpl());
    }

    /* renamed from: blur-F8QBwvs, reason: not valid java name */
    public static final Modifier m4279blurF8QBwvs(Modifier modifier, float f, Shape shape) {
        return m4277blur1fqSgw(modifier, f, f, shape);
    }

    /* renamed from: blur-F8QBwvs$default, reason: not valid java name */
    public static /* synthetic */ Modifier m4280blurF8QBwvs$default(Modifier modifier, float f, BlurredEdgeTreatment blurredEdgeTreatment, int i, Object obj) {
        if ((i & 2) != 0) {
            blurredEdgeTreatment = BlurredEdgeTreatment.m4281boximpl(BlurredEdgeTreatment.Companion.m4288getRectangleGoahg());
        }
        return m4279blurF8QBwvs(modifier, f, blurredEdgeTreatment.m4287unboximpl());
    }
}
