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
import defpackage.j50;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PublicKt {
    private static ImageVector _public;

    public static final ImageVector getPublic(Icons.TwoTone twoTone) {
        ImageVector imageVector = _public;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Public", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(14.99f, 4.59f, 5.0f);
        d.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        d.horizontalLineToRelative(-2.0f);
        d.verticalLineToRelative(2.0f);
        d.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        kf0.x(d, -2.0f, 2.0f, 6.0f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        d.verticalLineToRelative(3.0f);
        d.horizontalLineToRelative(1.0f);
        d.curveToRelative(0.89f, 0.0f, 1.64f, 0.59f, 1.9f, 1.4f);
        d.curveTo(19.19f, 15.98f, 20.0f, 14.08f, 20.0f, 12.0f);
        d.curveToRelative(0.0f, -3.35f, -2.08f, -6.23f, -5.01f, -7.41f);
        bv.v(d, 8.99f, 16.0f, -1.0f);
        d.lineToRelative(-4.78f, -4.78f);
        d.curveTo(4.08f, 10.79f, 4.0f, 11.39f, 4.0f, 12.0f);
        d.curveToRelative(0.0f, 4.07f, 3.06f, 7.43f, 6.99f, 7.93f);
        d.verticalLineTo(18.0f);
        d.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        d.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        b.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        b.close();
        b.moveTo(10.99f, 19.93f);
        b.curveTo(7.06f, 19.43f, 4.0f, 16.07f, 4.0f, 12.0f);
        b.curveToRelative(0.0f, -0.61f, 0.08f, -1.21f, 0.21f, -1.78f);
        b.lineTo(8.99f, 15.0f);
        b.verticalLineToRelative(1.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        r6.l(b, 1.93f, 17.89f, 17.4f);
        b.curveToRelative(-0.26f, -0.81f, -1.0f, -1.4f, -1.9f, -1.4f);
        b.horizontalLineToRelative(-1.0f);
        b.verticalLineToRelative(-3.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        kf0.x(b, -6.0f, -2.0f, 2.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.lineTo(10.99f, 7.0f);
        b.horizontalLineToRelative(2.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.verticalLineToRelative(-0.41f);
        b.curveTo(17.92f, 5.77f, 20.0f, 8.65f, 20.0f, 12.0f);
        b.curveToRelative(0.0f, 2.08f, -0.81f, 3.98f, -2.11f, 5.4f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _public = build;
        build.getClass();
        return build;
    }
}
