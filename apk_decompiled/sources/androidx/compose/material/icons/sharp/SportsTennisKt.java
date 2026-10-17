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
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SportsTennisKt {
    private static ImageVector _sportsTennis;

    public static final ImageVector getSportsTennis(Icons.Sharp sharp) {
        ImageVector imageVector = _sportsTennis;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SportsTennis", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(19.52f, 2.49f);
        b.curveToRelative(-2.34f, -2.34f, -6.62f, -1.87f, -9.55f, 1.06f);
        b.curveToRelative(-1.6f, 1.6f, -2.52f, 3.87f, -2.54f, 5.46f);
        b.curveToRelative(-0.02f, 1.58f, 0.26f, 3.89f, -1.35f, 5.5f);
        b.lineToRelative(-4.24f, 4.24f);
        b.lineToRelative(1.42f, 1.42f);
        b.lineToRelative(4.24f, -4.24f);
        b.curveToRelative(1.61f, -1.61f, 3.92f, -1.33f, 5.5f, -1.35f);
        b.reflectiveCurveToRelative(3.86f, -0.94f, 5.46f, -2.54f);
        b.curveTo(21.38f, 9.11f, 21.86f, 4.83f, 19.52f, 2.49f);
        b.close();
        b.moveTo(10.32f, 11.68f);
        b.curveToRelative(-1.53f, -1.53f, -1.05f, -4.61f, 1.06f, -6.72f);
        b.reflectiveCurveToRelative(5.18f, -2.59f, 6.72f, -1.06f);
        b.curveToRelative(1.53f, 1.53f, 1.05f, 4.61f, -1.06f, 6.72f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 11.86f, 13.21f, 10.32f, 11.68f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(18.0f, 17.0f);
        b2.curveToRelative(0.53f, 0.0f, 1.04f, 0.21f, 1.41f, 0.59f);
        b2.curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0.0f, 2.83f);
        b2.curveTo(19.04f, 20.79f, 18.53f, 21.0f, 18.0f, 21.0f);
        b2.reflectiveCurveToRelative(-1.04f, -0.21f, -1.41f, -0.59f);
        b2.curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0.0f, -2.83f);
        b2.curveTo(16.96f, 17.21f, 17.47f, 17.0f, 18.0f, 17.0f);
        b2.moveTo(18.0f, 15.0f);
        b2.curveToRelative(-1.02f, 0.0f, -2.05f, 0.39f, -2.83f, 1.17f);
        b2.curveToRelative(-1.56f, 1.56f, -1.56f, 4.09f, 0.0f, 5.66f);
        b2.curveTo(15.95f, 22.61f, 16.98f, 23.0f, 18.0f, 23.0f);
        b2.reflectiveCurveToRelative(2.05f, -0.39f, 2.83f, -1.17f);
        b2.curveToRelative(1.56f, -1.56f, 1.56f, -4.09f, 0.0f, -5.66f);
        b2.curveTo(20.05f, 15.39f, 19.02f, 15.0f, 18.0f, 15.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b2, 18.0f, 15.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sportsTennis = build;
        build.getClass();
        return build;
    }
}
