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
import defpackage.gy;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SportsSoccerKt {
    private static ImageVector _sportsSoccer;

    public static final ImageVector getSportsSoccer(Icons.Outlined outlined) {
        ImageVector imageVector = _sportsSoccer;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SportsSoccer", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        b.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        k4.x(b, 13.0f, 5.3f, 1.35f, -0.95f);
        b.curveToRelative(1.82f, 0.56f, 3.37f, 1.76f, 4.38f, 3.34f);
        b.lineToRelative(-0.39f, 1.34f);
        b.lineToRelative(-1.35f, 0.46f);
        uf.o(b, 13.0f, 6.7f, 5.3f);
        b.moveTo(9.65f, 4.35f);
        b.lineTo(11.0f, 5.3f);
        b.verticalLineToRelative(1.4f);
        b.lineTo(7.01f, 9.49f);
        b.lineTo(5.66f, 9.03f);
        b.lineTo(5.27f, 7.69f);
        b.curveTo(6.28f, 6.12f, 7.83f, 4.92f, 9.65f, 4.35f);
        k4.x(b, 7.08f, 17.11f, -1.14f, 0.1f);
        b.curveTo(4.73f, 15.81f, 4.0f, 13.99f, 4.0f, 12.0f);
        b.curveToRelative(0.0f, -0.12f, 0.01f, -0.23f, 0.02f, -0.35f);
        b.lineToRelative(1.0f, -0.73f);
        b.lineTo(6.4f, 11.4f);
        gy.B(b, 1.46f, 4.34f, 7.08f, 17.11f);
        b.moveTo(14.5f, 19.59f);
        b.curveTo(13.71f, 19.85f, 12.87f, 20.0f, 12.0f, 20.0f);
        b.reflectiveCurveToRelative(-1.71f, -0.15f, -2.5f, -0.41f);
        b.lineToRelative(-0.69f, -1.49f);
        b.lineTo(9.45f, 17.0f);
        b.horizontalLineToRelative(5.11f);
        gy.B(b, 0.64f, 1.11f, 14.5f, 19.59f);
        b.moveTo(14.27f, 15.0f);
        b.horizontalLineTo(9.73f);
        b.lineToRelative(-1.35f, -4.02f);
        b.lineTo(12.0f, 8.44f);
        gy.B(b, 3.63f, 2.54f, 14.27f, 15.0f);
        b.moveTo(18.06f, 17.21f);
        b.lineToRelative(-1.14f, -0.1f);
        b.lineToRelative(-0.79f, -1.37f);
        b.lineToRelative(1.46f, -4.34f);
        b.lineToRelative(1.39f, -0.47f);
        b.lineToRelative(1.0f, 0.73f);
        b.curveTo(19.99f, 11.77f, 20.0f, 11.88f, 20.0f, 12.0f);
        b.curveTo(20.0f, 13.99f, 19.27f, 15.81f, 18.06f, 17.21f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sportsSoccer = build;
        build.getClass();
        return build;
    }
}
