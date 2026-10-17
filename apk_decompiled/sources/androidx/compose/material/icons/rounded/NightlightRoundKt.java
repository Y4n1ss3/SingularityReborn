package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.gy;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NightlightRoundKt {
    private static ImageVector _nightlightRound;

    public static final ImageVector getNightlightRound(Icons.Rounded rounded) {
        ImageVector imageVector = _nightlightRound;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.NightlightRound", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(15.5f, 22.0f);
        b.curveToRelative(0.07f, 0.0f, 0.14f, 0.0f, 0.21f, 0.0f);
        b.curveToRelative(0.84f, -0.02f, 1.12f, -1.11f, 0.41f, -1.56f);
        b.curveToRelative(-2.78f, -1.77f, -4.63f, -4.89f, -4.63f, -8.43f);
        b.curveToRelative(0.0f, -3.55f, 1.85f, -6.66f, 4.63f, -8.44f);
        b.curveToRelative(0.7f, -0.45f, 0.44f, -1.54f, -0.39f, -1.56f);
        b.curveToRelative(-0.04f, 0.0f, -0.09f, 0.0f, -0.13f, 0.0f);
        b.curveToRelative(-4.9f, -0.05f, -9.21f, 3.53f, -9.98f, 8.37f);
        b.curveTo(4.64f, 16.61f, 9.45f, 22.0f, 15.5f, 22.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 15.5f, 22.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nightlightRound = build;
        build.getClass();
        return build;
    }
}
