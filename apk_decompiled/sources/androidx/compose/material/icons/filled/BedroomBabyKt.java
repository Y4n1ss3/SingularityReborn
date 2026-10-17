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
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BedroomBabyKt {
    private static ImageVector _bedroomBaby;

    public static final ImageVector getBedroomBaby(Icons.Filled filled) {
        ImageVector imageVector = _bedroomBaby;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.BedroomBaby", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(20.0f, 2.0f, 4.0f);
        d.curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f);
        d.verticalLineToRelative(16.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(16.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(4.0f);
        d.curveTo(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f);
        d.close();
        d.moveTo(12.0f, 18.0f);
        d.curveToRelative(-2.64f, 0.0f, -5.13f, -1.03f, -7.0f, -2.9f);
        d.lineToRelative(1.06f, -1.06f);
        d.curveToRelative(0.34f, 0.34f, 0.71f, 0.65f, 1.1f, 0.92f);
        d.lineTo(8.0f, 13.5f);
        d.verticalLineTo(9.51f);
        d.lineTo(6.45f, 10.5f);
        d.lineToRelative(-0.95f, -1.0f);
        d.lineTo(7.0f, 7.76f);
        d.lineTo(6.0f, 7.0f);
        r6.t(d, 3.65f, 1.73f, 3.0f, 17.0f);
        kf0.z(d, 1.0f, -1.0f, 2.5f);
        d.lineToRelative(0.84f, 1.46f);
        d.curveToRelative(0.39f, -0.28f, 0.76f, -0.58f, 1.1f, -0.92f);
        d.lineTo(19.0f, 15.1f);
        d.curveTo(17.13f, 16.97f, 14.64f, 18.0f, 12.0f, 18.0f);
        d.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(14.69f, 14.24f);
        b.curveToRelative(-1.74f, 0.65f, -3.66f, 0.65f, -5.4f, 0.0f);
        b.lineToRelative(-0.81f, 1.41f);
        b.lineToRelative(-0.03f, 0.06f);
        b.curveToRelative(1.1f, 0.52f, 2.28f, 0.79f, 3.53f, 0.79f);
        b.reflectiveCurveToRelative(2.45f, -0.28f, 3.55f, -0.79f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b, -0.03f, -0.06f, 14.69f, 14.24f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bedroomBaby = build;
        build.getClass();
        return build;
    }
}
