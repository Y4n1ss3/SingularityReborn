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
import defpackage.j50;
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LivingKt {
    private static ImageVector _living;

    public static final ImageVector getLiving(Icons.Outlined outlined) {
        ImageVector imageVector = _living;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Living", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(17.75f, 10.35f, 9.0f);
        d.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        d.horizontalLineToRelative(-5.5f);
        d.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        d.verticalLineToRelative(1.35f);
        d.curveTo(5.51f, 10.78f, 5.0f, 11.58f, 5.0f, 12.5f);
        d.verticalLineTo(16.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(10.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineToRelative(-3.5f);
        d.curveTo(19.0f, 11.58f, 18.49f, 10.78f, 17.75f, 10.35f);
        af0.l(d, 9.25f, 7.5f, 5.5f);
        d.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        d.verticalLineToRelative(1.03f);
        d.curveTo(14.99f, 10.15f, 14.0f, 11.2f, 14.0f, 12.5f);
        kf0.r(d, 13.0f, -4.0f, -0.5f);
        d.curveToRelative(0.0f, -1.3f, -0.99f, -2.35f, -2.25f, -2.47f);
        d.verticalLineTo(9.0f);
        d.curveTo(7.75f, 8.17f, 8.42f, 7.5f, 9.25f, 7.5f);
        d.close();
        d.moveTo(17.5f, 16.0f);
        d.curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        d.horizontalLineTo(7.0f);
        d.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        d.verticalLineToRelative(-3.5f);
        d.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        d.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        kf0.z(d, 2.0f, 7.0f, -2.0f);
        d.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        kf0.D(d, 16.0f, 20.0f, 4.0f, 16.0f);
        fc.q(d, 4.0f, 4.0f, 20.0f);
        d.moveTo(20.0f, 2.0f);
        d.horizontalLineTo(4.0f);
        d.curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f);
        d.verticalLineToRelative(16.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(16.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(4.0f);
        d.curveTo(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _living = build;
        build.getClass();
        return build;
    }
}
