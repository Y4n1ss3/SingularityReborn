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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FlightKt {
    private static ImageVector _flight;

    public static final ImageVector getFlight(Icons.Rounded rounded) {
        ImageVector imageVector = _flight;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Flight", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(21.0f, 14.58f);
        b.curveToRelative(0.0f, -0.36f, -0.19f, -0.69f, -0.49f, -0.89f);
        b.lineTo(13.0f, 9.0f);
        b.verticalLineTo(3.5f);
        b.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        b.reflectiveCurveTo(10.0f, 2.67f, 10.0f, 3.5f);
        b.verticalLineTo(9.0f);
        b.lineToRelative(-7.51f, 4.69f);
        b.curveToRelative(-0.3f, 0.19f, -0.49f, 0.53f, -0.49f, 0.89f);
        b.curveToRelative(0.0f, 0.7f, 0.68f, 1.21f, 1.36f, 1.0f);
        b.lineTo(10.0f, 13.5f);
        b.verticalLineTo(19.0f);
        b.lineToRelative(-1.8f, 1.35f);
        b.curveToRelative(-0.13f, 0.09f, -0.2f, 0.24f, -0.2f, 0.4f);
        b.verticalLineToRelative(0.59f);
        b.curveToRelative(0.0f, 0.33f, 0.32f, 0.57f, 0.64f, 0.48f);
        b.lineTo(11.5f, 21.0f);
        b.lineToRelative(2.86f, 0.82f);
        b.curveToRelative(0.32f, 0.09f, 0.64f, -0.15f, 0.64f, -0.48f);
        b.verticalLineToRelative(-0.59f);
        b.curveToRelative(0.0f, -0.16f, -0.07f, -0.31f, -0.2f, -0.4f);
        b.lineTo(13.0f, 19.0f);
        b.verticalLineToRelative(-5.5f);
        b.lineToRelative(6.64f, 2.08f);
        b.curveToRelative(0.68f, 0.21f, 1.36f, -0.3f, 1.36f, -1.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _flight = build;
        build.getClass();
        return build;
    }
}
