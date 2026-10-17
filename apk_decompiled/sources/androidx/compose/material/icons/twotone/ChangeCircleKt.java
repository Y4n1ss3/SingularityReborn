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
import defpackage.gy;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ChangeCircleKt {
    private static ImageVector _changeCircle;

    public static final ImageVector getChangeCircle(Icons.TwoTone twoTone) {
        ImageVector imageVector = _changeCircle;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ChangeCircle", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        b.reflectiveCurveToRelative(-8.0f, -3.59f, -8.0f, -8.0f);
        b.reflectiveCurveTo(7.59f, 4.0f, 12.0f, 4.0f);
        b.moveTo(12.06f, 13.34f);
        b.verticalLineToRelative(2.14f);
        b.curveToRelative(-0.92f, 0.02f, -1.84f, -0.31f, -2.54f, -1.01f);
        b.curveToRelative(-1.12f, -1.12f, -1.3f, -2.8f, -0.59f, -4.13f);
        b.lineToRelative(-1.1f, -1.1f);
        b.curveToRelative(-1.28f, 1.94f, -1.07f, 4.59f, 0.64f, 6.29f);
        b.curveTo(9.44f, 16.51f, 10.72f, 17.0f, 12.0f, 17.0f);
        b.curveToRelative(0.02f, 0.0f, 0.04f, 0.0f, 0.06f, 0.0f);
        b.verticalLineTo(19.0f);
        gy.B(b, 2.83f, -2.83f, 12.06f, 13.34f);
        b.moveTo(15.54f, 8.46f);
        b.curveToRelative(-0.99f, -0.99f, -2.3f, -1.46f, -3.6f, -1.45f);
        b.verticalLineTo(5.0f);
        b.lineTo(9.11f, 7.83f);
        b.lineToRelative(2.83f, 2.83f);
        b.verticalLineTo(8.51f);
        b.curveToRelative(0.02f, 0.0f, 0.04f, 0.0f, 0.06f, 0.0f);
        b.curveToRelative(0.9f, 0.0f, 1.79f, 0.34f, 2.48f, 1.02f);
        b.curveToRelative(1.12f, 1.12f, 1.3f, 2.8f, 0.59f, 4.13f);
        b.lineToRelative(1.1f, 1.1f);
        b.curveTo(17.45f, 12.82f, 17.24f, 10.17f, 15.54f, 8.46f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(12.0f, 4.0f);
        b2.curveToRelative(4.41f, 0.0f, 8.0f, 3.59f, 8.0f, 8.0f);
        b2.reflectiveCurveToRelative(-3.59f, 8.0f, -8.0f, 8.0f);
        b2.reflectiveCurveToRelative(-8.0f, -3.59f, -8.0f, -8.0f);
        b2.reflectiveCurveTo(7.59f, 4.0f, 12.0f, 4.0f);
        b2.moveTo(12.0f, 2.0f);
        b2.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b2.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        b2.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b2.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        uo.l(b2, 12.0f, 2.0f, 12.06f, 13.34f);
        b2.verticalLineToRelative(2.14f);
        b2.curveToRelative(-0.92f, 0.02f, -1.84f, -0.31f, -2.54f, -1.01f);
        b2.curveToRelative(-1.12f, -1.12f, -1.3f, -2.8f, -0.59f, -4.13f);
        b2.lineToRelative(-1.1f, -1.1f);
        b2.curveToRelative(-1.28f, 1.94f, -1.07f, 4.59f, 0.64f, 6.29f);
        b2.curveTo(9.44f, 16.51f, 10.72f, 17.0f, 12.0f, 17.0f);
        b2.curveToRelative(0.02f, 0.0f, 0.04f, 0.0f, 0.06f, 0.0f);
        b2.verticalLineTo(19.0f);
        gy.B(b2, 2.83f, -2.83f, 12.06f, 13.34f);
        b2.moveTo(15.54f, 8.46f);
        b2.curveToRelative(-0.99f, -0.99f, -2.3f, -1.46f, -3.6f, -1.45f);
        b2.verticalLineTo(5.0f);
        b2.lineTo(9.11f, 7.83f);
        b2.lineToRelative(2.83f, 2.83f);
        b2.verticalLineTo(8.51f);
        b2.curveToRelative(0.02f, 0.0f, 0.04f, 0.0f, 0.06f, 0.0f);
        b2.curveToRelative(0.9f, 0.0f, 1.79f, 0.34f, 2.48f, 1.02f);
        b2.curveToRelative(1.12f, 1.12f, 1.3f, 2.8f, 0.59f, 4.13f);
        b2.lineToRelative(1.1f, 1.1f);
        b2.curveTo(17.45f, 12.82f, 17.24f, 10.17f, 15.54f, 8.46f);
        b2.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _changeCircle = build;
        build.getClass();
        return build;
    }
}
