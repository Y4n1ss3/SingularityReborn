package androidx.compose.material.icons.sharp;

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

    public static final ImageVector getNightlightRound(Icons.Sharp sharp) {
        ImageVector imageVector = _nightlightRound;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.NightlightRound", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(15.5f, 22.0f);
        b.curveToRelative(1.05f, 0.0f, 2.05f, -0.16f, 3.0f, -0.46f);
        b.curveToRelative(-4.06f, -1.27f, -7.0f, -5.06f, -7.0f, -9.54f);
        b.reflectiveCurveToRelative(2.94f, -8.27f, 7.0f, -9.54f);
        b.curveTo(17.55f, 2.16f, 16.55f, 2.0f, 15.5f, 2.0f);
        b.curveToRelative(-5.52f, 0.0f, -10.0f, 4.48f, -10.0f, 10.0f);
        b.reflectiveCurveTo(9.98f, 22.0f, 15.5f, 22.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 15.5f, 22.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nightlightRound = build;
        build.getClass();
        return build;
    }
}
