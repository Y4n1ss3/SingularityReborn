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
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DepartureBoardKt {
    private static ImageVector _departureBoard;

    public static final ImageVector getDepartureBoard(Icons.Filled filled) {
        ImageVector imageVector = _departureBoard;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.DepartureBoard", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(16.0f, 1.0f);
        b.curveToRelative(-2.4f, 0.0f, -4.52f, 1.21f, -5.78f, 3.05f);
        b.curveToRelative(0.01f, -0.01f, 0.01f, -0.02f, 0.02f, -0.03f);
        b.curveTo(9.84f, 4.0f, 9.42f, 4.0f, 9.0f, 4.0f);
        b.curveToRelative(-4.42f, 0.0f, -8.0f, 0.5f, -8.0f, 4.0f);
        b.verticalLineToRelative(10.0f);
        b.curveToRelative(0.0f, 0.88f, 0.39f, 1.67f, 1.0f, 2.22f);
        b.lineTo(2.0f, 22.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(1.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        kf0.z(b, -1.0f, 8.0f, 1.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(1.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(-1.78f);
        b.curveToRelative(0.61f, -0.55f, 1.0f, -1.34f, 1.0f, -2.22f);
        b.verticalLineToRelative(-3.08f);
        b.curveToRelative(3.39f, -0.49f, 6.0f, -3.39f, 6.0f, -6.92f);
        b.curveToRelative(0.0f, -3.87f, -3.13f, -7.0f, -7.0f, -7.0f);
        b.close();
        b.moveTo(4.5f, 19.0f);
        b.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        b.reflectiveCurveTo(3.67f, 16.0f, 4.5f, 16.0f);
        b.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        b.reflectiveCurveTo(5.33f, 19.0f, 4.5f, 19.0f);
        k4.r(b, 3.0f, 13.0f, 3.0f, 8.0f);
        b.horizontalLineToRelative(6.0f);
        b.curveToRelative(0.0f, 1.96f, 0.81f, 3.73f, 2.11f, 5.0f);
        uo.l(b, 3.0f, 13.0f, 13.5f, 19.0f);
        b.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        b.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        b.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        b.reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f);
        b.close();
        b.moveTo(16.0f, 13.0f);
        b.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        b.reflectiveCurveToRelative(2.24f, -5.0f, 5.0f, -5.0f);
        b.reflectiveCurveToRelative(5.0f, 2.24f, 5.0f, 5.0f);
        b.reflectiveCurveToRelative(-2.24f, 5.0f, -5.0f, 5.0f);
        k4.r(b, 16.5f, 4.0f, 15.0f, 4.0f);
        b.verticalLineToRelative(5.0f);
        b.lineToRelative(3.62f, 2.16f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(b, 0.75f, -1.23f, -2.87f, -1.68f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _departureBoard = build;
        build.getClass();
        return build;
    }
}
