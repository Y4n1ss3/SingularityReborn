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
import defpackage.bv;
import defpackage.fc;
import defpackage.j50;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FactoryKt {
    private static ImageVector _factory;

    public static final ImageVector getFactory(Icons.Rounded rounded) {
        ImageVector imageVector = _factory;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Factory", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(14.0f, 10.0f, 8.48f);
        d.curveToRelative(0.0f, -0.71f, -0.71f, -1.19f, -1.37f, -0.93f);
        d.lineTo(9.0f, 9.0f);
        d.verticalLineTo(8.52f);
        d.curveTo(9.0f, 7.8f, 8.27f, 7.31f, 7.61f, 7.6f);
        d.lineTo(3.21f, 9.48f);
        d.curveTo(2.48f, 9.8f, 2.0f, 10.52f, 2.0f, 11.32f);
        d.verticalLineTo(20.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(16.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        bv.z(d, 10.0f, 14.0f, 9.0f, 17.0f);
        d.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        d.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        d.verticalLineToRelative(-2.0f);
        d.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        d.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        bv.t(d, 17.0f, 13.0f, 17.0f);
        d.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        d.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        d.verticalLineToRelative(-2.0f);
        d.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        d.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        bv.t(d, 17.0f, 17.0f, 17.0f);
        d.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        d.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        d.verticalLineToRelative(-2.0f);
        d.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        d.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(d, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(20.12f, 2.0f, -1.23f);
        a.curveToRelative(-0.51f, 0.0f, -0.93f, 0.38f, -0.99f, 0.88f);
        a.lineTo(17.2f, 8.5f);
        a.horizontalLineToRelative(4.6f);
        a.lineToRelative(-0.69f, -5.62f);
        a.curveTo(21.05f, 2.38f, 20.62f, 2.0f, 20.12f, 2.0f);
        a.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, a.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _factory = build;
        build.getClass();
        return build;
    }
}
