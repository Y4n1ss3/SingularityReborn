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
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TokenKt {
    private static ImageVector _token;

    public static final ImageVector getToken(Icons.Rounded rounded) {
        ImageVector imageVector = _token;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Token", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.97f, 2.54f);
        b.curveToRelative(-0.6f, -0.34f, -1.34f, -0.34f, -1.94f, 0.0f);
        b.lineToRelative(-7.0f, 3.89f);
        b.lineTo(9.1f, 9.24f);
        b.curveTo(9.83f, 8.48f, 10.86f, 8.0f, 12.0f, 8.0f);
        b.reflectiveCurveToRelative(2.17f, 0.48f, 2.9f, 1.24f);
        gy.B(b, 5.07f, -2.82f, 12.97f, 2.54f);
        b.moveTo(10.0f, 12.0f);
        b.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        b.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        b.reflectiveCurveTo(10.0f, 13.1f, 10.0f, 12.0f);
        k4.x(b, 3.0f, 8.14f, 5.13f, 2.85f);
        b.curveTo(8.04f, 11.31f, 8.0f, 11.65f, 8.0f, 12.0f);
        b.curveToRelative(0.0f, 1.86f, 1.27f, 3.43f, 3.0f, 3.87f);
        b.verticalLineToRelative(5.57f);
        b.lineToRelative(-6.97f, -3.87f);
        b.curveTo(3.39f, 17.22f, 3.0f, 16.55f, 3.0f, 15.82f);
        kf0.D(b, 8.14f, 13.0f, 21.44f, -5.57f);
        b.curveToRelative(1.73f, -0.44f, 3.0f, -2.01f, 3.0f, -3.87f);
        b.curveToRelative(0.0f, -0.35f, -0.04f, -0.69f, -0.13f, -1.01f);
        b.lineTo(21.0f, 8.14f);
        b.lineToRelative(0.0f, 7.68f);
        b.curveToRelative(0.0f, 0.73f, -0.39f, 1.4f, -1.03f, 1.75f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 13.0f, 21.44f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _token = build;
        build.getClass();
        return build;
    }
}
