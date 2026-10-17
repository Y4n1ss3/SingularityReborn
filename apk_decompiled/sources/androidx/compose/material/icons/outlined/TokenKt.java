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
import defpackage.bv;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TokenKt {
    private static ImageVector _token;

    public static final ImageVector getToken(Icons.Outlined outlined) {
        ImageVector imageVector = _token;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Token", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(21.0f, 7.0f, -9.0f, -5.0f);
        e.lineTo(3.0f, 7.0f);
        e.verticalLineToRelative(10.0f);
        e.lineToRelative(9.0f, 5.0f);
        gy.B(e, 9.0f, -5.0f, 21.0f, 7.0f);
        e.moveTo(12.0f, 4.29f);
        e.lineToRelative(5.91f, 3.28f);
        e.lineTo(14.9f, 9.24f);
        e.curveTo(14.17f, 8.48f, 13.14f, 8.0f, 12.0f, 8.0f);
        e.reflectiveCurveTo(9.83f, 8.48f, 9.1f, 9.24f);
        r6.C(e, 6.09f, 7.57f, 12.0f, 4.29f);
        e.moveTo(11.0f, 19.16f);
        e.lineToRelative(-6.0f, -3.33f);
        e.verticalLineTo(9.26f);
        e.lineToRelative(3.13f, 1.74f);
        e.curveTo(8.04f, 11.31f, 8.0f, 11.65f, 8.0f, 12.0f);
        e.curveToRelative(0.0f, 1.86f, 1.27f, 3.43f, 3.0f, 3.87f);
        bv.t(e, 19.16f, 10.0f, 12.0f);
        e.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        e.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        e.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        e.reflectiveCurveTo(10.0f, 13.1f, 10.0f, 12.0f);
        bv.v(e, 13.0f, 19.16f, -3.28f);
        e.curveToRelative(1.73f, -0.44f, 3.0f, -2.01f, 3.0f, -3.87f);
        e.curveToRelative(0.0f, -0.35f, -0.04f, -0.69f, -0.13f, -1.01f);
        e.lineTo(19.0f, 9.26f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(e, 0.0f, 6.57f, 13.0f, 19.16f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _token = build;
        build.getClass();
        return build;
    }
}
