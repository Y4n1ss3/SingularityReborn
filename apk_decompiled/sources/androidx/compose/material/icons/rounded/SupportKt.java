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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SupportKt {
    private static ImageVector _support;

    public static final ImageVector getSupport(Icons.Rounded rounded) {
        ImageVector imageVector = _support;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Support", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        b.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        k4.x(b, 19.46f, 9.12f, -2.78f, 1.15f);
        b.curveToRelative(-0.51f, -1.36f, -1.58f, -2.44f, -2.95f, -2.94f);
        b.lineToRelative(1.15f, -2.78f);
        b.curveTo(16.98f, 5.35f, 18.65f, 7.02f, 19.46f, 9.12f);
        b.close();
        b.moveTo(12.0f, 15.0f);
        b.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        b.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        b.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        b.reflectiveCurveTo(13.66f, 15.0f, 12.0f, 15.0f);
        k4.x(b, 9.13f, 4.54f, 1.17f, 2.78f);
        b.curveToRelative(-1.38f, 0.5f, -2.47f, 1.59f, -2.98f, 2.97f);
        b.lineTo(4.54f, 9.13f);
        b.curveTo(5.35f, 7.02f, 7.02f, 5.35f, 9.13f, 4.54f);
        k4.x(b, 4.54f, 14.87f, 2.78f, -1.15f);
        b.curveToRelative(0.51f, 1.38f, 1.59f, 2.46f, 2.97f, 2.96f);
        b.lineToRelative(-1.17f, 2.78f);
        b.curveTo(7.02f, 18.65f, 5.35f, 16.98f, 4.54f, 14.87f);
        k4.x(b, 14.88f, 19.46f, -1.15f, -2.78f);
        b.curveToRelative(1.37f, -0.51f, 2.45f, -1.59f, 2.95f, -2.97f);
        b.lineToRelative(2.78f, 1.17f);
        b.curveTo(18.65f, 16.98f, 16.98f, 18.65f, 14.88f, 19.46f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _support = build;
        build.getClass();
        return build;
    }
}
