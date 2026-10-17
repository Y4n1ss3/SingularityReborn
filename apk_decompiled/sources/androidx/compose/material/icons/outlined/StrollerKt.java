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
import defpackage.gy;
import defpackage.k4;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class StrollerKt {
    private static ImageVector _stroller;

    public static final ImageVector getStroller(Icons.Outlined outlined) {
        ImageVector imageVector = _stroller;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Stroller", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.0f, 20.0f);
        b.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        b.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        b.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        b.reflectiveCurveTo(18.0f, 18.9f, 18.0f, 20.0f);
        b.close();
        b.moveTo(6.0f, 18.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        b.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        b.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        b.reflectiveCurveTo(7.1f, 18.0f, 6.0f, 18.0f);
        k4.r(b, 15.0f, 8.66f, 9.6f, 15.0f);
        b.horizontalLineTo(15.0f);
        b.verticalLineTo(8.66f);
        b.moveTo(18.65f, 3.0f);
        b.curveTo(20.52f, 3.0f, 22.0f, 4.56f, 22.0f, 6.48f);
        uf.z(b, 7.0f, -2.0f, 6.48f);
        b.curveTo(20.0f, 5.66f, 19.42f, 5.0f, 18.65f, 5.0f);
        b.curveTo(17.97f, 5.0f, 17.58f, 5.59f, 17.0f, 6.27f);
        b.verticalLineTo(15.0f);
        b.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        b.horizontalLineTo(7.43f);
        b.curveToRelative(-0.85f, 0.0f, -1.31f, -1.0f, -0.76f, -1.65f);
        b.lineToRelative(8.8f, -10.32f);
        b.curveTo(16.11f, 4.27f, 16.99f, 3.0f, 18.65f, 3.0f);
        uo.l(b, 18.65f, 3.0f, 10.0f, 5.0f);
        b.curveTo(9.35f, 5.0f, 8.71f, 5.09f, 8.09f, 5.27f);
        b.lineToRelative(1.4f, 1.4f);
        b.lineToRelative(1.37f, -1.61f);
        b.curveTo(10.58f, 5.02f, 10.29f, 5.0f, 10.0f, 5.0f);
        b.moveTo(10.0f, 3.0f);
        b.curveToRelative(1.56f, 0.0f, 3.03f, 0.4f, 4.3f, 1.1f);
        b.lineToRelative(-4.7f, 5.51f);
        b.lineTo(4.72f, 4.72f);
        b.curveTo(6.21f, 3.64f, 8.03f, 3.0f, 10.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 10.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _stroller = build;
        build.getClass();
        return build;
    }
}
