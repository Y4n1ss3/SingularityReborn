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
import defpackage.fc;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PaidKt {
    private static ImageVector _paid;

    public static final ImageVector getPaid(Icons.Sharp sharp) {
        ImageVector imageVector = _paid;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Paid", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        b.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        fc.A(b, 12.88f, 17.76f, 19.0f, -1.75f);
        b.verticalLineToRelative(-1.29f);
        b.curveToRelative(-0.74f, -0.18f, -2.39f, -0.77f, -3.02f, -2.96f);
        b.lineToRelative(1.65f, -0.67f);
        b.curveToRelative(0.06f, 0.22f, 0.58f, 2.09f, 2.4f, 2.09f);
        b.curveToRelative(0.93f, 0.0f, 1.98f, -0.48f, 1.98f, -1.61f);
        b.curveToRelative(0.0f, -0.96f, -0.7f, -1.46f, -2.28f, -2.03f);
        b.curveToRelative(-1.1f, -0.39f, -3.35f, -1.03f, -3.35f, -3.31f);
        b.curveToRelative(0.0f, -0.1f, 0.01f, -2.4f, 2.62f, -2.96f);
        kf0.r(b, 5.0f, 1.75f, 1.24f);
        b.curveToRelative(1.84f, 0.32f, 2.51f, 1.79f, 2.66f, 2.23f);
        b.lineToRelative(-1.58f, 0.67f);
        b.curveToRelative(-0.11f, -0.35f, -0.59f, -1.34f, -1.9f, -1.34f);
        b.curveToRelative(-0.7f, 0.0f, -1.81f, 0.37f, -1.81f, 1.39f);
        b.curveToRelative(0.0f, 0.95f, 0.86f, 1.31f, 2.64f, 1.9f);
        b.curveToRelative(2.4f, 0.83f, 3.01f, 2.05f, 3.01f, 3.45f);
        b.curveTo(15.9f, 17.17f, 13.4f, 17.67f, 12.88f, 17.76f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _paid = build;
        build.getClass();
        return build;
    }
}
