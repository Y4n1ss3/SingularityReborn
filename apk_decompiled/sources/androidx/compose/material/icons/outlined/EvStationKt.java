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
import defpackage.fc;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EvStationKt {
    private static ImageVector _evStation;

    public static final ImageVector getEvStation(Icons.Outlined outlined) {
        ImageVector imageVector = _evStation;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.EvStation", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(19.77f, 7.23f, 0.01f, -0.01f);
        e.lineToRelative(-3.72f, -3.72f);
        e.lineTo(15.0f, 4.56f);
        e.lineToRelative(2.11f, 2.11f);
        e.curveToRelative(-0.94f, 0.36f, -1.61f, 1.26f, -1.61f, 2.33f);
        e.curveToRelative(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f);
        e.curveToRelative(0.36f, 0.0f, 0.69f, -0.08f, 1.0f, -0.21f);
        e.verticalLineToRelative(7.21f);
        e.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        e.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        e.lineTo(17.0f, 14.0f);
        e.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        e.horizontalLineToRelative(-1.0f);
        e.lineTo(14.0f, 5.0f);
        e.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        e.lineTo(6.0f, 3.0f);
        e.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        r6.D(e, 16.0f, 10.0f, -7.5f, 1.5f);
        e.verticalLineToRelative(5.0f);
        e.curveToRelative(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f);
        e.reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f);
        e.lineTo(20.5f, 9.0f);
        e.curveToRelative(0.0f, -0.69f, -0.28f, -1.32f, -0.73f, -1.77f);
        bv.v(e, 12.0f, 11.0f, 8.0f);
        e.lineTo(6.0f, 19.0f);
        r6.m(e, 6.0f, 5.0f, 6.0f, 6.0f);
        e.moveTo(18.0f, 10.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        e.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        e.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        e.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        k4.x(e, 10.0f, 6.0f, -4.0f, 7.5f);
        e.horizontalLineToRelative(2.0f);
        e.lineTo(8.0f, 18.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.g(e, 4.0f, -7.0f, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _evStation = build;
        build.getClass();
        return build;
    }
}
