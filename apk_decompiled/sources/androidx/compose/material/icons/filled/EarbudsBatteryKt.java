package androidx.compose.material.icons.filled;

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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EarbudsBatteryKt {
    private static ImageVector _earbudsBattery;

    public static final ImageVector getEarbudsBattery(Icons.Filled filled) {
        ImageVector imageVector = _earbudsBattery;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.EarbudsBattery", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder n = fc.n(21.0f, 7.0f, -1.0f, 6.0f, -2.0f);
        n.verticalLineToRelative(1.0f);
        n.horizontalLineToRelative(-1.0f);
        n.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        n.verticalLineToRelative(9.0f);
        n.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        n.horizontalLineToRelative(4.0f);
        n.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        n.verticalLineTo(8.0f);
        n.curveTo(22.0f, 7.45f, 21.55f, 7.0f, 21.0f, 7.0f);
        n.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, n.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(10.62f, 6.0f);
        b.curveTo(8.76f, 6.0f, 7.25f, 7.51f, 7.25f, 9.38f);
        b.verticalLineToRelative(5.25f);
        b.curveToRelative(0.0f, 1.04f, -0.84f, 1.88f, -1.88f, 1.88f);
        b.reflectiveCurveTo(3.5f, 15.66f, 3.5f, 14.62f);
        b.verticalLineToRelative(-4.7f);
        b.curveTo(3.66f, 9.97f, 3.83f, 10.0f, 4.0f, 10.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.reflectiveCurveTo(5.1f, 6.0f, 4.0f, 6.0f);
        b.reflectiveCurveTo(2.0f, 6.9f, 2.0f, 8.0f);
        b.curveToRelative(0.0f, 0.04f, 0.0f, 6.62f, 0.0f, 6.62f);
        b.curveTo(2.0f, 16.49f, 3.51f, 18.0f, 5.38f, 18.0f);
        b.reflectiveCurveToRelative(3.38f, -1.51f, 3.38f, -3.38f);
        b.verticalLineTo(9.38f);
        b.curveToRelative(0.0f, -1.04f, 0.84f, -1.88f, 1.88f, -1.88f);
        b.reflectiveCurveToRelative(1.88f, 0.84f, 1.88f, 1.88f);
        b.verticalLineToRelative(4.7f);
        b.curveTo(12.34f, 14.03f, 12.17f, 14.0f, 12.0f, 14.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        b.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        b.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        b.curveToRelative(0.0f, -0.04f, 0.0f, -6.62f, 0.0f, -6.62f);
        b.curveTo(14.0f, 7.51f, 12.49f, 6.0f, 10.62f, 6.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _earbudsBattery = build;
        build.getClass();
        return build;
    }
}
