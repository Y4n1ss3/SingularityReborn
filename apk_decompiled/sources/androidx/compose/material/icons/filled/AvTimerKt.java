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
import defpackage.j50;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AvTimerKt {
    private static ImageVector _avTimer;

    public static final ImageVector getAvTimer(Icons.Filled filled) {
        ImageVector imageVector = _avTimer;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AvTimer", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(11.0f, 17.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        uo.C(b, 11.0f, 3.0f, 4.0f, 2.0f);
        b.lineTo(13.0f, 5.08f);
        b.curveToRelative(3.39f, 0.49f, 6.0f, 3.39f, 6.0f, 6.92f);
        b.curveToRelative(0.0f, 3.87f, -3.13f, 7.0f, -7.0f, 7.0f);
        b.reflectiveCurveToRelative(-7.0f, -3.13f, -7.0f, -7.0f);
        b.curveToRelative(0.0f, -1.68f, 0.59f, -3.22f, 1.58f, -4.42f);
        b.lineTo(12.0f, 13.0f);
        b.lineToRelative(1.41f, -1.41f);
        b.lineToRelative(-6.8f, -6.8f);
        b.verticalLineToRelative(0.02f);
        b.curveTo(4.42f, 6.45f, 3.0f, 9.05f, 3.0f, 12.0f);
        b.curveToRelative(0.0f, 4.97f, 4.02f, 9.0f, 9.0f, 9.0f);
        b.curveToRelative(4.97f, 0.0f, 9.0f, -4.03f, 9.0f, -9.0f);
        b.reflectiveCurveToRelative(-4.03f, -9.0f, -9.0f, -9.0f);
        j50.t(b, -1.0f, 18.0f, 12.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        b.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        b.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        b.close();
        b.moveTo(6.0f, 12.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(b, -1.0f, 0.45f, -1.0f, 1.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _avTimer = build;
        build.getClass();
        return build;
    }
}
