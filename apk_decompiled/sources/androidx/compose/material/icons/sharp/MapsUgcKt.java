package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MapsUgcKt {
    private static ImageVector _mapsUgc;

    public static final ImageVector getMapsUgc(Icons.Sharp sharp) {
        ImageVector imageVector = _mapsUgc;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.MapsUgc", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 4.0f);
        b.curveToRelative(4.41f, 0.0f, 8.0f, 3.59f, 8.0f, 8.0f);
        b.reflectiveCurveToRelative(-3.59f, 8.0f, -8.0f, 8.0f);
        b.curveToRelative(-1.18f, 0.0f, -2.34f, -0.26f, -3.43f, -0.78f);
        b.curveToRelative(-0.27f, -0.13f, -0.56f, -0.19f, -0.86f, -0.19f);
        b.curveToRelative(-0.19f, 0.0f, -0.38f, 0.03f, -0.56f, 0.08f);
        b.lineToRelative(-3.2f, 0.94f);
        b.lineToRelative(0.94f, -3.2f);
        b.curveToRelative(0.14f, -0.47f, 0.1f, -0.98f, -0.11f, -1.42f);
        b.curveTo(4.26f, 14.34f, 4.0f, 13.18f, 4.0f, 12.0f);
        b.curveTo(4.0f, 7.59f, 7.59f, 4.0f, 12.0f, 4.0f);
        b.moveTo(12.0f, 2.0f);
        b.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b.curveToRelative(0.0f, 1.54f, 0.36f, 2.98f, 0.97f, 4.29f);
        b.lineTo(1.0f, 23.0f);
        b.lineToRelative(6.71f, -1.97f);
        b.curveTo(9.02f, 21.64f, 10.46f, 22.0f, 12.0f, 22.0f);
        b.curveToRelative(5.52f, 0.0f, 10.0f, -4.48f, 10.0f, -10.0f);
        b.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 12.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int m5057getEvenOddRgk1Os = PathFillType.Companion.m5057getEvenOddRgk1Os();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(13.0f, 8.0f, -2.0f, 0.0f);
        e.lineToRelative(0.0f, 3.0f);
        e.lineToRelative(-3.0f, 0.0f);
        e.lineToRelative(0.0f, 2.0f);
        e.lineToRelative(3.0f, 0.0f);
        e.lineToRelative(0.0f, 3.0f);
        e.lineToRelative(2.0f, 0.0f);
        e.lineToRelative(0.0f, -3.0f);
        e.lineToRelative(3.0f, 0.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, 0.0f, -2.0f, -3.0f, 0.0f), m5057getEvenOddRgk1Os, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _mapsUgc = build;
        build.getClass();
        return build;
    }
}
