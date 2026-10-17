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
import defpackage.af0;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HailKt {
    private static ImageVector _hail;

    public static final ImageVector getHail(Icons.Rounded rounded) {
        ImageVector imageVector = _hail;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Hail", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 6.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        b.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        b.reflectiveCurveTo(13.1f, 6.0f, 12.0f, 6.0f);
        k4.r(b, 17.95f, 2.0f, 17.95f, 2.0f);
        b.curveToRelative(0.59f, 0.0f, 1.06f, 0.51f, 1.0f, 1.09f);
        b.curveTo(18.93f, 3.24f, 18.74f, 7.15f, 15.0f, 8.4f);
        b.verticalLineTo(21.0f);
        b.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        b.horizontalLineToRelative(0.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        kf0.z(b, -5.0f, -2.0f, 5.0f);
        b.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        b.horizontalLineToRelative(0.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.verticalLineTo(10.1f);
        b.curveToRelative(-0.3f, 0.1f, -0.5f, 0.2f, -0.6f, 0.3f);
        b.curveToRelative(-0.46f, 0.36f, -1.17f, 0.87f, -1.36f, 2.67f);
        b.curveTo(6.99f, 13.59f, 6.57f, 14.0f, 6.04f, 14.0f);
        b.horizontalLineToRelative(0.0f);
        b.curveToRelative(-0.58f, 0.0f, -1.05f, -0.49f, -1.0f, -1.07f);
        b.curveToRelative(0.13f, -1.6f, 0.62f, -2.98f, 2.07f, -4.22f);
        b.curveTo(8.21f, 7.81f, 10.0f, 7.0f, 12.0f, 7.0f);
        b.reflectiveCurveToRelative(2.68f, -0.46f, 3.48f, -1.06f);
        b.curveToRelative(0.43f, -0.34f, 1.28f, -0.99f, 1.48f, -3.02f);
        b.curveTo(17.01f, 2.4f, 17.43f, 2.0f, 17.95f, 2.0f);
        af0.l(b, 5.0f, 16.0f, 1.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        b.verticalLineToRelative(4.0f);
        b.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        b.horizontalLineTo(5.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.verticalLineToRelative(-4.0f);
        b.curveTo(4.0f, 16.45f, 4.45f, 16.0f, 5.0f, 16.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hail = build;
        build.getClass();
        return build;
    }
}
