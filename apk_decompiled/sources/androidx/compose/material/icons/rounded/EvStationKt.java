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
import defpackage.k4;
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EvStationKt {
    private static ImageVector _evStation;

    public static final ImageVector getEvStation(Icons.Rounded rounded) {
        ImageVector imageVector = _evStation;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.EvStation", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(19.77f, 7.23f, 0.01f, -0.01f);
        e.lineToRelative(-3.19f, -3.19f);
        e.curveToRelative(-0.29f, -0.29f, -0.77f, -0.29f, -1.06f, 0.0f);
        e.curveToRelative(-0.29f, 0.29f, -0.29f, 0.77f, 0.0f, 1.06f);
        e.lineToRelative(1.58f, 1.58f);
        e.curveToRelative(-1.05f, 0.4f, -1.76f, 1.47f, -1.58f, 2.71f);
        e.curveToRelative(0.16f, 1.1f, 1.1f, 1.99f, 2.2f, 2.11f);
        e.curveToRelative(0.47f, 0.05f, 0.88f, -0.03f, 1.27f, -0.2f);
        e.verticalLineToRelative(7.21f);
        e.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        e.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        e.verticalLineTo(14.0f);
        e.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        e.horizontalLineToRelative(-1.0f);
        e.verticalLineTo(5.0f);
        e.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        e.horizontalLineTo(6.0f);
        e.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        e.verticalLineToRelative(15.0f);
        e.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        e.horizontalLineToRelative(8.0f);
        e.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        kf0.z(e, -6.5f, 1.5f, 4.86f);
        e.curveToRelative(0.0f, 1.31f, 0.94f, 2.5f, 2.24f, 2.63f);
        e.curveToRelative(1.5f, 0.15f, 2.76f, -1.02f, 2.76f, -2.49f);
        e.verticalLineTo(9.0f);
        e.curveToRelative(0.0f, -0.69f, -0.28f, -1.32f, -0.73f, -1.77f);
        e.close();
        e.moveTo(18.0f, 10.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        e.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        e.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        e.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        uo.A(e, 8.0f, 16.12f, 13.5f, 6.83f);
        e.curveToRelative(-0.38f, 0.0f, -0.62f, -0.4f, -0.44f, -0.74f);
        e.lineToRelative(2.67f, -5.0f);
        e.curveToRelative(0.24f, -0.45f, 0.94f, -0.28f, 0.94f, 0.24f);
        e.verticalLineToRelative(3.0f);
        e.horizontalLineToRelative(1.14f);
        e.curveToRelative(0.38f, 0.0f, 0.62f, 0.41f, 0.43f, 0.75f);
        e.lineToRelative(-2.64f, 4.62f);
        e.curveToRelative(-0.25f, 0.44f, -0.93f, 0.26f, -0.93f, -0.25f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _evStation = build;
        build.getClass();
        return build;
    }
}
