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
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PaidKt {
    private static ImageVector _paid;

    public static final ImageVector getPaid(Icons.Outlined outlined) {
        ImageVector imageVector = _paid;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Paid", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        b.curveToRelative(0.0f, -4.41f, 3.59f, -8.0f, 8.0f, -8.0f);
        b.reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f);
        b.curveTo(20.0f, 16.41f, 16.41f, 20.0f, 12.0f, 20.0f);
        b.close();
        b.moveTo(12.89f, 11.1f);
        b.curveToRelative(-1.78f, -0.59f, -2.64f, -0.96f, -2.64f, -1.9f);
        b.curveToRelative(0.0f, -1.02f, 1.11f, -1.39f, 1.81f, -1.39f);
        b.curveToRelative(1.31f, 0.0f, 1.79f, 0.99f, 1.9f, 1.34f);
        b.lineToRelative(1.58f, -0.67f);
        b.curveToRelative(-0.15f, -0.44f, -0.82f, -1.91f, -2.66f, -2.23f);
        kf0.r(b, 5.0f, -1.75f, 1.26f);
        b.curveToRelative(-2.6f, 0.56f, -2.62f, 2.85f, -2.62f, 2.96f);
        b.curveToRelative(0.0f, 2.27f, 2.25f, 2.91f, 3.35f, 3.31f);
        b.curveToRelative(1.58f, 0.56f, 2.28f, 1.07f, 2.28f, 2.03f);
        b.curveToRelative(0.0f, 1.13f, -1.05f, 1.61f, -1.98f, 1.61f);
        b.curveToRelative(-1.82f, 0.0f, -2.34f, -1.87f, -2.4f, -2.09f);
        b.lineTo(8.1f, 14.75f);
        b.curveToRelative(0.63f, 2.19f, 2.28f, 2.78f, 3.02f, 2.96f);
        kf0.r(b, 19.0f, 1.75f, -1.24f);
        b.curveToRelative(0.52f, -0.09f, 3.02f, -0.59f, 3.02f, -3.22f);
        b.curveTo(15.9f, 13.15f, 15.29f, 11.93f, 12.89f, 11.1f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _paid = build;
        build.getClass();
        return build;
    }
}
