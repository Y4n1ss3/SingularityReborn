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
import defpackage.af0;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TokenKt {
    private static ImageVector _token;

    public static final ImageVector getToken(Icons.Filled filled) {
        ImageVector imageVector = _token;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Token", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(19.97f, 6.43f, 12.0f, 2.0f);
        i.lineTo(4.03f, 6.43f);
        i.lineTo(9.1f, 9.24f);
        i.curveTo(9.83f, 8.48f, 10.86f, 8.0f, 12.0f, 8.0f);
        i.reflectiveCurveToRelative(2.17f, 0.48f, 2.9f, 1.24f);
        uo.l(i, 19.97f, 6.43f, 10.0f, 12.0f);
        i.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        i.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        i.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        i.reflectiveCurveTo(10.0f, 13.1f, 10.0f, 12.0f);
        k4.r(i, 11.0f, 21.44f, 3.0f, 17.0f);
        i.verticalLineTo(8.14f);
        i.lineToRelative(5.13f, 2.85f);
        i.curveTo(8.04f, 11.31f, 8.0f, 11.65f, 8.0f, 12.0f);
        i.curveToRelative(0.0f, 1.86f, 1.27f, 3.43f, 3.0f, 3.87f);
        kf0.D(i, 21.44f, 13.0f, 21.44f, -5.57f);
        i.curveToRelative(1.73f, -0.44f, 3.0f, -2.01f, 3.0f, -3.87f);
        i.curveToRelative(0.0f, -0.35f, -0.04f, -0.69f, -0.13f, -1.01f);
        i.lineTo(21.0f, 8.14f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(i, 21.0f, 17.0f, 13.0f, 21.44f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _token = build;
        build.getClass();
        return build;
    }
}
