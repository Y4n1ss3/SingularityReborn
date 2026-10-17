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
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TransgenderKt {
    private static ImageVector _transgender;

    public static final ImageVector getTransgender(Icons.TwoTone twoTone) {
        ImageVector imageVector = _transgender;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Transgender", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 8.0f);
        b.curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f);
        b.reflectiveCurveTo(13.93f, 15.0f, 12.0f, 15.0f);
        b.reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f);
        b.reflectiveCurveTo(10.07f, 8.0f, 12.0f, 8.0f);
        k4.x(b, 16.53f, 8.38f, 3.97f, -3.96f);
        gy.z(b, 7.0f, 2.0f, 1.0f, -6.0f);
        gy.C(b, 2.0f, 2.58f, -3.97f, 3.97f);
        b.curveTo(14.23f, 6.36f, 13.16f, 6.0f, 12.0f, 6.0f);
        b.curveToRelative(-1.16f, 0.0f, -2.23f, 0.36f, -3.11f, 0.97f);
        b.lineTo(8.24f, 6.32f);
        b.lineToRelative(1.41f, -1.41f);
        b.lineTo(8.24f, 3.49f);
        b.lineTo(6.82f, 4.9f);
        fc.v(b, 4.92f, 3.0f, 7.5f, 1.0f);
        af0.w(b, -6.0f, 6.0f, 2.0f, 4.42f);
        b.lineToRelative(1.91f, 1.9f);
        b.lineTo(3.99f, 7.74f);
        b.lineToRelative(1.41f, 1.41f);
        b.lineToRelative(1.41f, -1.41f);
        b.lineToRelative(0.65f, 0.65f);
        b.curveTo(6.86f, 9.27f, 6.5f, 10.34f, 6.5f, 11.5f);
        b.curveToRelative(0.0f, 2.7f, 1.94f, 4.94f, 4.5f, 5.41f);
        r6.w(b, 11.0f, 19.0f, 9.0f, 2.0f);
        af0.v(b, 2.0f, 2.0f, 2.0f, -2.0f);
        kf0.x(b, 2.0f, -2.0f, -2.0f);
        b.lineToRelative(0.0f, -2.09f);
        b.curveToRelative(2.56f, -0.47f, 4.5f, -2.71f, 4.5f, -5.41f);
        b.curveTo(17.5f, 10.34f, 17.14f, 9.27f, 16.53f, 8.38f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _transgender = build;
        build.getClass();
        return build;
    }
}
