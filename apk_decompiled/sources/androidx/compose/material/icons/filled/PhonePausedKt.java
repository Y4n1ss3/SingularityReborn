package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.k4;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhonePausedKt {
    private static ImageVector _phonePaused;

    public static final ImageVector getPhonePaused(Icons.Filled filled) {
        ImageVector imageVector = _phonePaused;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PhonePaused", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(17.0f, 3.0f, -2.0f, 7.0f, 2.0f);
        uo.l(n, 17.0f, 3.0f, 20.0f, 15.5f);
        n.curveToRelative(-1.25f, 0.0f, -2.45f, -0.2f, -3.57f, -0.57f);
        n.curveToRelative(-0.35f, -0.11f, -0.74f, -0.03f, -1.02f, 0.24f);
        n.lineToRelative(-2.2f, 2.2f);
        n.curveToRelative(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f);
        n.lineToRelative(2.2f, -2.21f);
        n.curveToRelative(0.28f, -0.26f, 0.36f, -0.65f, 0.25f, -1.0f);
        n.curveTo(8.7f, 6.45f, 8.5f, 5.25f, 8.5f, 4.0f);
        n.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        n.lineTo(4.0f, 3.0f);
        n.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        n.curveToRelative(0.0f, 9.39f, 7.61f, 17.0f, 17.0f, 17.0f);
        n.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        n.verticalLineToRelative(-3.5f);
        n.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        uo.C(n, 19.0f, 3.0f, 7.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.h(n, 21.0f, 3.0f, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phonePaused = build;
        build.getClass();
        return build;
    }
}
