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
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HdrAutoKt {
    private static ImageVector _hdrAuto;

    public static final ImageVector getHdrAuto(Icons.Rounded rounded) {
        ImageVector imageVector = _hdrAuto;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.HdrAuto", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(k4.e(12.04f, 8.04f, -0.09f, 0.0f), -1.6f, 4.55f, 3.29f, 0.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        b.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        k4.x(b, 15.0f, 16.41f, -0.78f, -2.22f);
        b.horizontalLineTo(9.78f);
        b.lineToRelative(-0.79f, 2.22f);
        b.curveTo(8.87f, 16.76f, 8.53f, 17.0f, 8.16f, 17.0f);
        b.horizontalLineToRelative(0.0f);
        b.curveToRelative(-0.62f, 0.0f, -1.05f, -0.62f, -0.83f, -1.2f);
        b.lineToRelative(3.34f, -8.88f);
        b.curveTo(10.88f, 6.37f, 11.4f, 6.0f, 12.0f, 6.0f);
        b.horizontalLineToRelative(0.0f);
        b.curveToRelative(0.59f, 0.0f, 1.12f, 0.37f, 1.33f, 0.92f);
        b.lineToRelative(3.34f, 8.88f);
        b.curveToRelative(0.22f, 0.58f, -0.21f, 1.2f, -0.83f, 1.2f);
        b.horizontalLineToRelative(0.0f);
        b.curveTo(15.46f, 17.0f, 15.12f, 16.76f, 15.0f, 16.41f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hdrAuto = build;
        build.getClass();
        return build;
    }
}
