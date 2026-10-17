package androidx.compose.material.icons.outlined;

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
public final class ChangeCircleKt {
    private static ImageVector _changeCircle;

    public static final ImageVector getChangeCircle(Icons.Outlined outlined) {
        ImageVector imageVector = _changeCircle;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ChangeCircle", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        b.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        b.close();
        b.moveTo(12.0f, 20.0f);
        b.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        b.reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f);
        b.reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f);
        b.reflectiveCurveTo(16.41f, 20.0f, 12.0f, 20.0f);
        k4.x(b, 16.17f, 14.76f, -1.1f, -1.1f);
        b.curveToRelative(0.71f, -1.33f, 0.53f, -3.01f, -0.59f, -4.13f);
        b.curveTo(13.79f, 8.84f, 12.9f, 8.5f, 12.0f, 8.5f);
        b.curveToRelative(-0.03f, 0.0f, -0.06f, 0.01f, -0.09f, 0.01f);
        b.lineTo(13.0f, 9.6f);
        b.lineToRelative(-1.06f, 1.06f);
        b.lineTo(9.11f, 7.83f);
        b.lineTo(11.94f, 5.0f);
        b.lineTo(13.0f, 6.06f);
        b.lineToRelative(-0.96f, 0.96f);
        b.curveToRelative(1.27f, 0.01f, 2.53f, 0.48f, 3.5f, 1.44f);
        b.curveTo(17.24f, 10.17f, 17.45f, 12.82f, 16.17f, 14.76f);
        k4.r(b, 14.89f, 16.17f, 12.06f, 19.0f);
        b.lineTo(11.0f, 17.94f);
        b.lineToRelative(0.95f, -0.95f);
        b.curveToRelative(-1.26f, -0.01f, -2.52f, -0.5f, -3.48f, -1.46f);
        b.curveToRelative(-1.71f, -1.71f, -1.92f, -4.35f, -0.64f, -6.29f);
        b.lineToRelative(1.1f, 1.1f);
        b.curveToRelative(-0.71f, 1.33f, -0.53f, 3.01f, 0.59f, 4.13f);
        b.curveToRelative(0.7f, 0.7f, 1.63f, 1.04f, 2.56f, 1.01f);
        b.lineTo(11.0f, 14.4f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b, 1.06f, -1.06f, 14.89f, 16.17f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _changeCircle = build;
        build.getClass();
        return build;
    }
}
