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
import defpackage.af0;
import defpackage.fc;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EscalatorWarningKt {
    private static ImageVector _escalatorWarning;

    public static final ImageVector getEscalatorWarning(Icons.Sharp sharp) {
        ImageVector imageVector = _escalatorWarning;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.EscalatorWarning", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(6.5f, 2.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        b.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        b.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        b.reflectiveCurveTo(5.4f, 2.0f, 6.5f, 2.0f);
        b.close();
        b.moveTo(15.5f, 9.5f);
        b.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        b.reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f);
        b.reflectiveCurveTo(17.83f, 8.0f, 17.0f, 8.0f);
        b.reflectiveCurveTo(15.5f, 8.67f, 15.5f, 9.5f);
        k4.x(b, 14.21f, 12.86f, -0.92f, 1.32f);
        b.lineTo(9.72f, 8.0f);
        b.curveTo(9.37f, 7.38f, 8.71f, 7.0f, 7.99f, 7.0f);
        uf.k(b, 3.0f, 8.0f, 1.5f, 7.0f);
        b.horizontalLineToRelative(5.0f);
        b.verticalLineTo(11.61f);
        b.lineTo(12.03f, 16.0f);
        fc.s(b, 2.2f, 15.0f, 14.9f, 22.0f);
        af0.v(b, 4.0f, -5.0f, 1.0f, -5.0f);
        b.horizontalLineToRelative(-4.15f);
        b.curveTo(15.19f, 12.0f, 14.58f, 12.32f, 14.21f, 12.86f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _escalatorWarning = build;
        build.getClass();
        return build;
    }
}
