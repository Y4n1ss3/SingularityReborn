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
import defpackage.bv;
import defpackage.gy;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NoStrollerKt {
    private static ImageVector _noStroller;

    public static final ImageVector getNoStroller(Icons.Outlined outlined) {
        ImageVector imageVector = _noStroller;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.NoStroller", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(8.0f, 20.0f);
        b.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        b.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        b.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        b.reflectiveCurveTo(8.0f, 18.9f, 8.0f, 20.0f);
        bv.v(b, 15.0f, 8.66f, 3.51f);
        b.lineToRelative(2.0f, 2.0f);
        b.verticalLineToRelative(-7.9f);
        b.curveTo(17.58f, 5.59f, 17.97f, 5.0f, 18.65f, 5.0f);
        b.curveTo(19.42f, 5.0f, 20.0f, 5.66f, 20.0f, 6.48f);
        uf.z(b, 7.0f, 2.0f, 6.48f);
        b.curveTo(22.0f, 4.56f, 20.52f, 3.0f, 18.65f, 3.0f);
        b.curveToRelative(-1.66f, 0.0f, -2.54f, 1.27f, -3.18f, 2.03f);
        b.lineToRelative(-3.5f, 4.11f);
        gy.B(b, 1.42f, 1.42f, 15.0f, 8.66f);
        b.moveTo(19.78f, 22.61f);
        b.lineToRelative(-1.91f, -1.91f);
        b.curveTo(17.58f, 21.46f, 16.86f, 22.0f, 16.0f, 22.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        b.curveToRelative(0.0f, -0.86f, 0.54f, -1.58f, 1.3f, -1.87f);
        b.lineTo(14.17f, 17.0f);
        b.horizontalLineTo(7.43f);
        b.curveToRelative(-0.85f, 0.0f, -1.31f, -1.0f, -0.76f, -1.65f);
        b.lineToRelative(2.69f, -3.16f);
        b.lineTo(1.39f, 4.22f);
        b.lineToRelative(1.41f, -1.41f);
        b.lineToRelative(7.86f, 7.86f);
        b.lineToRelative(1.42f, 1.42f);
        b.lineToRelative(0.0f, 0.0f);
        gy.B(b, 9.11f, 9.11f, 19.78f, 22.61f);
        b.moveTo(12.17f, 15.0f);
        b.lineToRelative(-1.39f, -1.39f);
        kf0.h(b, 9.6f, 15.0f, 12.17f);
        b.moveTo(10.0f, 5.0f);
        b.curveToRelative(0.29f, 0.0f, 0.58f, 0.02f, 0.86f, 0.05f);
        b.lineTo(9.49f, 6.67f);
        b.lineToRelative(1.42f, 1.42f);
        b.lineTo(14.3f, 4.1f);
        b.curveTo(13.03f, 3.4f, 11.56f, 3.0f, 10.0f, 3.0f);
        b.curveTo(8.77f, 3.0f, 7.6f, 3.25f, 6.53f, 3.7f);
        b.lineTo(8.1f, 5.27f);
        b.curveTo(8.71f, 5.1f, 9.35f, 5.0f, 10.0f, 5.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noStroller = build;
        build.getClass();
        return build;
    }
}
