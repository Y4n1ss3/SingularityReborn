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
import defpackage.fc;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ElderlyKt {
    private static ImageVector _elderly;

    public static final ImageVector getElderly(Icons.Sharp sharp) {
        ImageVector imageVector = _elderly;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Elderly", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(13.5f, 5.5f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        b.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        b.reflectiveCurveTo(12.4f, 5.5f, 13.5f, 5.5f);
        fc.A(b, 20.0f, 12.5f, 23.0f, -1.0f);
        b.verticalLineTo(12.5f);
        b.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        b.reflectiveCurveTo(18.0f, 12.22f, 18.0f, 12.5f);
        kf0.z(b, 1.0f, -1.0f, -0.69f);
        b.curveToRelative(-1.46f, -0.38f, -2.7f, -1.29f, -3.51f, -2.52f);
        b.curveTo(13.18f, 11.16f, 13.0f, 12.07f, 13.0f, 13.0f);
        b.curveToRelative(0.0f, 0.23f, 0.02f, 0.46f, 0.03f, 0.69f);
        fc.t(b, 15.0f, 16.5f, 23.0f, -2.0f);
        b.verticalLineToRelative(-5.0f);
        b.lineToRelative(-1.78f, -2.54f);
        b.lineTo(11.0f, 19.0f);
        b.lineToRelative(-3.0f, 4.0f);
        b.lineToRelative(-1.6f, -1.2f);
        b.lineTo(9.0f, 18.33f);
        b.verticalLineTo(13.0f);
        b.curveToRelative(0.0f, -1.15f, 0.18f, -2.29f, 0.5f, -3.39f);
        uf.u(b, 8.0f, 10.46f, 14.0f, 6.0f);
        b.verticalLineTo(9.3f);
        b.lineToRelative(5.4f, -3.07f);
        b.lineToRelative(0.0f, 0.01f);
        b.curveToRelative(0.59f, -0.31f, 1.32f, -0.33f, 1.94f, 0.03f);
        b.curveToRelative(0.36f, 0.21f, 0.63f, 0.51f, 0.8f, 0.85f);
        b.lineToRelative(0.0f, 0.0f);
        b.lineToRelative(0.79f, 1.67f);
        b.curveTo(15.58f, 10.1f, 16.94f, 11.0f, 18.5f, 11.0f);
        b.curveTo(19.33f, 11.0f, 20.0f, 11.67f, 20.0f, 12.5f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _elderly = build;
        build.getClass();
        return build;
    }
}
