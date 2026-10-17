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
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DryCleaningKt {
    private static ImageVector _dryCleaning;

    public static final ImageVector getDryCleaning(Icons.Rounded rounded) {
        ImageVector imageVector = _dryCleaning;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DryCleaning", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder u = kp0.u(19.56f, 11.36f, 13.0f, 8.44f, 7.0f);
        u.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        u.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        u.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        u.curveToRelative(0.38f, 0.0f, 0.72f, 0.22f, 0.88f, 0.53f);
        u.curveTo(13.04f, 4.84f, 13.39f, 5.0f, 13.73f, 5.0f);
        u.curveToRelative(0.74f, 0.0f, 1.26f, -0.79f, 0.91f, -1.44f);
        u.curveToRelative(-0.6f, -1.1f, -1.86f, -1.78f, -3.24f, -1.51f);
        u.curveToRelative(-1.17f, 0.23f, -2.12f, 1.2f, -2.34f, 2.37f);
        u.curveTo(8.77f, 5.98f, 9.67f, 7.35f, 11.0f, 7.82f);
        u.verticalLineToRelative(0.63f);
        u.lineToRelative(-6.56f, 2.92f);
        u.curveTo(3.56f, 11.75f, 3.0f, 12.62f, 3.0f, 13.57f);
        u.verticalLineToRelative(0.01f);
        u.curveTo(3.0f, 14.92f, 4.08f, 16.0f, 5.42f, 16.0f);
        u.horizontalLineTo(7.0f);
        u.verticalLineToRelative(4.0f);
        u.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        u.horizontalLineToRelative(6.0f);
        u.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        u.verticalLineToRelative(-4.0f);
        u.horizontalLineToRelative(1.58f);
        u.curveToRelative(1.34f, 0.0f, 2.42f, -1.08f, 2.42f, -2.42f);
        u.verticalLineToRelative(-0.01f);
        u.curveTo(21.0f, 12.62f, 20.44f, 11.75f, 19.56f, 11.36f);
        af0.l(u, 18.58f, 14.0f, -1.86f);
        u.curveToRelative(-0.35f, -0.6f, -0.98f, -1.0f, -1.72f, -1.0f);
        u.horizontalLineTo(9.0f);
        u.curveToRelative(-0.74f, 0.0f, -1.38f, 0.4f, -1.72f, 1.0f);
        u.horizontalLineTo(5.42f);
        u.curveToRelative(-0.46f, 0.0f, -0.58f, -0.65f, -0.17f, -0.81f);
        u.lineToRelative(6.75f, -3.0f);
        u.lineToRelative(6.75f, 3.0f);
        u.curveTo(19.17f, 13.38f, 19.03f, 14.0f, 18.58f, 14.0f);
        u.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, u.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dryCleaning = build;
        build.getClass();
        return build;
    }
}
