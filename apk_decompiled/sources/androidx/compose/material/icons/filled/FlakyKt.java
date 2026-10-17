package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FlakyKt {
    private static ImageVector _flaky;

    public static final ImageVector getFlaky(Icons.Filled filled) {
        ImageVector imageVector = _flaky;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Flaky", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int m5057getEvenOddRgk1Os = PathFillType.Companion.m5057getEvenOddRgk1Os();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(14.05f, 17.58f, -0.01f, 0.01f);
        e.lineToRelative(-2.4f, -2.4f);
        e.lineToRelative(1.06f, -1.06f);
        e.lineToRelative(1.35f, 1.35f);
        e.lineTo(16.54f, 13.0f);
        e.lineToRelative(1.06f, 1.06f);
        gy.B(e, -3.54f, 3.54f, 14.05f, 17.58f);
        e.moveTo(12.0f, 2.0f);
        e.curveTo(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f);
        e.reflectiveCurveToRelative(4.5f, 10.0f, 10.0f, 10.0f);
        e.reflectiveCurveToRelative(10.0f, -4.5f, 10.0f, -10.0f);
        e.reflectiveCurveTo(17.5f, 2.0f, 12.0f, 2.0f);
        k4.x(e, 7.34f, 6.28f, 1.41f, 1.41f);
        e.lineToRelative(1.41f, -1.41f);
        e.lineToRelative(1.06f, 1.06f);
        e.lineTo(9.81f, 8.75f);
        e.lineToRelative(1.41f, 1.41f);
        e.lineToRelative(-1.06f, 1.06f);
        e.lineTo(8.75f, 9.81f);
        e.lineToRelative(-1.41f, 1.41f);
        e.lineToRelative(-1.06f, -1.06f);
        e.lineToRelative(1.41f, -1.41f);
        r6.C(e, 6.28f, 7.34f, 7.34f, 6.28f);
        e.moveTo(12.0f, 20.0f);
        e.curveToRelative(-2.2f, 0.0f, -4.2f, -0.9f, -5.7f, -2.3f);
        e.lineTo(17.7f, 6.3f);
        e.curveTo(19.1f, 7.8f, 20.0f, 9.8f, 20.0f, 12.0f);
        e.curveTo(20.0f, 16.4f, 16.4f, 20.0f, 12.0f, 20.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), m5057getEvenOddRgk1Os, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _flaky = build;
        build.getClass();
        return build;
    }
}
