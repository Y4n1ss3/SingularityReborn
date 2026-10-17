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
import defpackage.af0;
import defpackage.fc;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AttributionKt {
    private static ImageVector _attribution;

    public static final ImageVector getAttribution(Icons.TwoTone twoTone) {
        ImageVector imageVector = _attribution;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Attribution", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 4.0f);
        b.curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f);
        b.reflectiveCurveToRelative(3.58f, 8.0f, 8.0f, 8.0f);
        b.reflectiveCurveToRelative(8.0f, -3.58f, 8.0f, -8.0f);
        b.reflectiveCurveToRelative(-3.58f, -8.0f, -8.0f, -8.0f);
        b.close();
        b.moveTo(12.0f, 5.0f);
        b.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        b.reflectiveCurveTo(12.83f, 8.0f, 12.0f, 8.0f);
        b.reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f);
        b.reflectiveCurveTo(11.17f, 5.0f, 12.0f, 5.0f);
        af0.l(b, 14.75f, 14.5f, -1.5f);
        fc.w(b, 13.25f, 19.0f, -2.5f, -4.5f);
        b.horizontalLineToRelative(-1.5f);
        b.lineTo(9.25f, 9.88f);
        b.curveToRelative(0.0f, -0.92f, 1.84f, -1.38f, 2.75f, -1.38f);
        b.reflectiveCurveToRelative(2.75f, 0.47f, 2.75f, 1.38f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(b, 4.62f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(12.0f, 2.0f);
        b2.curveTo(6.47f, 2.0f, 2.0f, 6.47f, 2.0f, 12.0f);
        b2.reflectiveCurveToRelative(4.47f, 10.0f, 10.0f, 10.0f);
        b2.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b2.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        b2.close();
        b2.moveTo(12.0f, 20.0f);
        b2.curveToRelative(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
        b2.reflectiveCurveToRelative(3.58f, -8.0f, 8.0f, -8.0f);
        b2.reflectiveCurveToRelative(8.0f, 3.58f, 8.0f, 8.0f);
        b2.reflectiveCurveToRelative(-3.58f, 8.0f, -8.0f, 8.0f);
        b2.close();
        b2.moveTo(12.0f, 8.5f);
        b2.curveToRelative(-0.91f, 0.0f, -2.75f, 0.46f, -2.75f, 1.38f);
        uo.B(b2, 4.62f, 1.5f, 10.75f, 19.0f);
        kf0.x(b2, 2.5f, -4.5f, 1.5f);
        b2.lineTo(14.75f, 9.88f);
        b2.curveToRelative(0.0f, -0.91f, -1.84f, -1.38f, -2.75f, -1.38f);
        b2.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b3 = af0.b(12.0f, 6.5f, -1.5f, 0.0f);
        b3.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f);
        b3.arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _attribution = build;
        build.getClass();
        return build;
    }
}
