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
import defpackage.af0;
import defpackage.fc;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EarbudsBatteryKt {
    private static ImageVector _earbudsBattery;

    public static final ImageVector getEarbudsBattery(Icons.Outlined outlined) {
        ImageVector imageVector = _earbudsBattery;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.EarbudsBattery", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
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
        af0.r(n, 20.0f, 16.0f, -2.0f, 9.0f);
        uo.r(n, 2.0f, 16.0f, 14.0f, 9.38f);
        n.curveTo(14.0f, 7.51f, 12.49f, 6.0f, 10.62f, 6.0f);
        n.reflectiveCurveTo(7.25f, 7.51f, 7.25f, 9.38f);
        n.verticalLineToRelative(5.25f);
        n.curveToRelative(0.0f, 1.04f, -0.84f, 1.88f, -1.88f, 1.88f);
        n.reflectiveCurveTo(3.5f, 15.66f, 3.5f, 14.62f);
        n.verticalLineToRelative(-4.7f);
        n.curveTo(3.66f, 9.97f, 3.83f, 10.0f, 4.0f, 10.0f);
        n.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        n.reflectiveCurveTo(5.1f, 6.0f, 4.0f, 6.0f);
        n.reflectiveCurveTo(2.0f, 6.9f, 2.0f, 8.0f);
        n.curveToRelative(0.0f, 0.04f, 0.0f, 6.62f, 0.0f, 6.62f);
        n.curveTo(2.0f, 16.49f, 3.51f, 18.0f, 5.38f, 18.0f);
        n.reflectiveCurveToRelative(3.38f, -1.51f, 3.38f, -3.38f);
        n.verticalLineTo(9.38f);
        n.curveToRelative(0.0f, -1.04f, 0.84f, -1.88f, 1.88f, -1.88f);
        n.reflectiveCurveToRelative(1.88f, 0.84f, 1.88f, 1.88f);
        n.verticalLineToRelative(4.7f);
        n.curveTo(12.34f, 14.03f, 12.17f, 14.0f, 12.0f, 14.0f);
        n.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        n.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        n.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        n.curveTo(14.0f, 15.96f, 14.0f, 9.38f, 14.0f, 9.38f);
        n.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, n.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _earbudsBattery = build;
        build.getClass();
        return build;
    }
}
