package androidx.compose.material.icons.sharp;

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
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DepartureBoardKt {
    private static ImageVector _departureBoard;

    public static final ImageVector getDepartureBoard(Icons.Sharp sharp) {
        ImageVector imageVector = _departureBoard;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.DepartureBoard", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(17.34f, 1.13f);
        b.curveToRelative(-2.94f, -0.55f, -5.63f, 0.75f, -7.12f, 2.92f);
        b.curveToRelative(0.01f, -0.01f, 0.01f, -0.02f, 0.02f, -0.03f);
        b.curveTo(9.84f, 4.0f, 9.42f, 4.0f, 9.0f, 4.0f);
        b.curveToRelative(-4.42f, 0.0f, -8.0f, 0.5f, -8.0f, 4.0f);
        b.verticalLineToRelative(10.0f);
        b.curveToRelative(0.0f, 0.88f, 0.39f, 1.67f, 1.0f, 2.22f);
        fc.w(b, 2.0f, 23.0f, 3.0f, -2.0f);
        af0.v(b, 8.0f, 2.0f, 3.0f, -2.78f);
        b.curveToRelative(0.61f, -0.55f, 1.0f, -1.34f, 1.0f, -2.22f);
        b.verticalLineToRelative(-3.08f);
        b.curveToRelative(3.72f, -0.54f, 6.5f, -3.98f, 5.92f, -7.97f);
        b.curveToRelative(-0.42f, -2.9f, -2.7f, -5.29f, -5.58f, -5.82f);
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
        b.lineToRelative(0.75f, -1.23f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b, -2.87f, -1.68f, 16.5f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _departureBoard = build;
        build.getClass();
        return build;
    }
}
