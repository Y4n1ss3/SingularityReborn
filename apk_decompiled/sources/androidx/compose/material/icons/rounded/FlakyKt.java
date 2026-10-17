package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import defpackage.k4;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FlakyKt {
    private static ImageVector _flaky;

    public static final ImageVector getFlaky(Icons.Rounded rounded) {
        ImageVector imageVector = _flaky;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Flaky", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int m5057getEvenOddRgk1Os = PathFillType.Companion.m5057getEvenOddRgk1Os();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.16f, 15.72f);
        b.curveToRelative(-0.29f, -0.29f, -0.29f, -0.77f, 0.0f, -1.06f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveToRelative(0.29f, -0.29f, 0.77f, -0.29f, 1.06f, 0.0f);
        b.lineToRelative(0.82f, 0.82f);
        b.lineToRelative(1.96f, -1.96f);
        b.curveToRelative(0.29f, -0.29f, 0.77f, -0.29f, 1.06f, 0.0f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveToRelative(0.29f, 0.29f, 0.29f, 0.77f, 0.0f, 1.06f);
        b.lineToRelative(-2.65f, 2.65f);
        b.curveToRelative(-0.19f, 0.19f, -0.51f, 0.2f, -0.7f, 0.0f);
        uo.l(b, 12.16f, 15.72f, 12.0f, 2.0f);
        b.curveTo(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f);
        b.reflectiveCurveToRelative(4.5f, 10.0f, 10.0f, 10.0f);
        b.reflectiveCurveToRelative(10.0f, -4.5f, 10.0f, -10.0f);
        b.reflectiveCurveTo(17.5f, 2.0f, 12.0f, 2.0f);
        k4.x(b, 7.87f, 6.81f, 0.88f, 0.88f);
        b.lineToRelative(0.88f, -0.88f);
        b.curveToRelative(0.29f, -0.29f, 0.77f, -0.29f, 1.06f, 0.0f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveToRelative(0.29f, 0.29f, 0.29f, 0.77f, 0.0f, 1.06f);
        b.lineTo(9.81f, 8.75f);
        b.lineToRelative(0.88f, 0.88f);
        b.curveToRelative(0.29f, 0.29f, 0.29f, 0.77f, 0.0f, 1.06f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveToRelative(-0.29f, 0.29f, -0.77f, 0.29f, -1.06f, 0.0f);
        b.lineTo(8.75f, 9.81f);
        b.lineToRelative(-0.88f, 0.88f);
        b.curveToRelative(-0.29f, 0.29f, -0.77f, 0.29f, -1.06f, 0.0f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveToRelative(-0.29f, -0.29f, -0.29f, -0.77f, 0.0f, -1.06f);
        b.lineToRelative(0.88f, -0.88f);
        b.lineTo(6.81f, 7.87f);
        b.curveToRelative(-0.29f, -0.29f, -0.29f, -0.77f, 0.0f, -1.06f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveTo(7.1f, 6.51f, 7.57f, 6.51f, 7.87f, 6.81f);
        b.close();
        b.moveTo(12.0f, 20.0f);
        b.curveToRelative(-2.2f, 0.0f, -4.2f, -0.9f, -5.7f, -2.3f);
        b.lineTo(17.7f, 6.3f);
        b.curveTo(19.1f, 7.8f, 20.0f, 9.8f, 20.0f, 12.0f);
        b.curveTo(20.0f, 16.4f, 16.4f, 20.0f, 12.0f, 20.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), m5057getEvenOddRgk1Os, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _flaky = build;
        build.getClass();
        return build;
    }
}
