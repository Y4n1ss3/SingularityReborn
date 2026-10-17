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
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CopyrightKt {
    private static ImageVector _copyright;

    public static final ImageVector getCopyright(Icons.Filled filled) {
        ImageVector imageVector = _copyright;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Copyright", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(11.88f, 9.14f);
        b.curveToRelative(1.28f, 0.06f, 1.61f, 1.15f, 1.63f, 1.66f);
        b.horizontalLineToRelative(1.79f);
        b.curveToRelative(-0.08f, -1.98f, -1.49f, -3.19f, -3.45f, -3.19f);
        b.curveTo(9.64f, 7.61f, 8.0f, 9.0f, 8.0f, 12.14f);
        b.curveToRelative(0.0f, 1.94f, 0.93f, 4.24f, 3.84f, 4.24f);
        b.curveToRelative(2.22f, 0.0f, 3.41f, -1.65f, 3.44f, -2.95f);
        b.horizontalLineToRelative(-1.79f);
        b.curveToRelative(-0.03f, 0.59f, -0.45f, 1.38f, -1.63f, 1.44f);
        b.curveTo(10.55f, 14.83f, 10.0f, 13.81f, 10.0f, 12.14f);
        b.curveTo(10.0f, 9.25f, 11.28f, 9.16f, 11.88f, 9.14f);
        b.close();
        b.moveTo(12.0f, 2.0f);
        b.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        b.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        b.close();
        b.moveTo(12.0f, 20.0f);
        b.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        b.reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f);
        b.reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 16.41f, 20.0f, 12.0f, 20.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _copyright = build;
        build.getClass();
        return build;
    }
}
