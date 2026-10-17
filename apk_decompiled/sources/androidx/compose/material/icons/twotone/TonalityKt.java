package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.bv;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TonalityKt {
    private static ImageVector _tonality;

    public static final ImageVector getTonality(Icons.TwoTone twoTone) {
        ImageVector imageVector = _tonality;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Tonality", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(4.0f, 12.0f);
        b.curveToRelative(0.0f, 4.08f, 3.06f, 7.44f, 7.0f, 7.93f);
        b.verticalLineTo(4.07f);
        b.curveTo(7.05f, 4.56f, 4.0f, 7.92f, 4.0f, 12.0f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(12.0f, 2.0f);
        b2.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b2.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        b2.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b2.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        b2.close();
        b2.moveTo(11.0f, 19.93f);
        b2.curveToRelative(-3.94f, -0.49f, -7.0f, -3.85f, -7.0f, -7.93f);
        b2.reflectiveCurveToRelative(3.05f, -7.44f, 7.0f, -7.93f);
        r6.l(b2, 15.86f, 13.0f, 4.07f);
        b2.curveToRelative(1.03f, 0.13f, 2.0f, 0.45f, 2.87f, 0.93f);
        bv.r(b2, 13.0f, 5.0f, -0.93f);
        b2.moveTo(13.0f, 7.0f);
        b2.horizontalLineToRelative(5.24f);
        b2.curveToRelative(0.25f, 0.31f, 0.48f, 0.65f, 0.68f, 1.0f);
        r6.C(b2, 13.0f, 8.0f, 13.0f, 7.0f);
        b2.moveTo(13.0f, 10.0f);
        b2.horizontalLineToRelative(6.74f);
        b2.curveToRelative(0.08f, 0.33f, 0.15f, 0.66f, 0.19f, 1.0f);
        bv.r(b2, 13.0f, 11.0f, -1.0f);
        b2.moveTo(13.0f, 19.93f);
        b2.lineTo(13.0f, 19.0f);
        b2.horizontalLineToRelative(2.87f);
        b2.curveToRelative(-0.87f, 0.48f, -1.84f, 0.8f, -2.87f, 0.93f);
        k4.r(b2, 18.24f, 17.0f, 13.0f, 17.0f);
        b2.verticalLineToRelative(-1.0f);
        b2.horizontalLineToRelative(5.92f);
        b2.curveToRelative(-0.2f, 0.35f, -0.43f, 0.69f, -0.68f, 1.0f);
        k4.r(b2, 19.74f, 14.0f, 13.0f, 14.0f);
        b2.verticalLineToRelative(-1.0f);
        b2.horizontalLineToRelative(6.93f);
        b2.curveToRelative(-0.04f, 0.34f, -0.11f, 0.67f, -0.19f, 1.0f);
        b2.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tonality = build;
        build.getClass();
        return build;
    }
}
