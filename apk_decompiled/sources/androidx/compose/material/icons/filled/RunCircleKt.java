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
import defpackage.fc;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RunCircleKt {
    private static ImageVector _runCircle;

    public static final ImageVector getRunCircle(Icons.Filled filled) {
        ImageVector imageVector = _runCircle;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.RunCircle", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        b.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        b.close();
        b.moveTo(13.5f, 6.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        b.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        b.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        b.curveTo(12.5f, 6.45f, 12.95f, 6.0f, 13.5f, 6.0f);
        b.close();
        b.moveTo(16.0f, 12.0f);
        b.curveToRelative(-0.7f, 0.0f, -2.01f, -0.54f, -2.91f, -1.76f);
        b.lineToRelative(-0.41f, 2.35f);
        fc.t(b, 14.0f, 14.03f, 18.0f, -1.0f);
        b.verticalLineToRelative(-3.58f);
        b.lineToRelative(-1.11f, -1.21f);
        b.lineToRelative(-0.52f, 2.64f);
        b.lineTo(7.6f, 15.08f);
        b.lineToRelative(0.2f, -0.98f);
        b.lineToRelative(2.78f, 0.57f);
        b.lineToRelative(0.96f, -4.89f);
        uf.u(b, 10.0f, 10.35f, 12.0f, 9.0f);
        b.verticalLineTo(9.65f);
        b.lineToRelative(3.28f, -1.21f);
        b.curveToRelative(0.49f, -0.18f, 1.03f, 0.06f, 1.26f, 0.53f);
        b.curveTo(14.37f, 10.67f, 15.59f, 11.0f, 16.0f, 11.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(b, 12.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _runCircle = build;
        build.getClass();
        return build;
    }
}
