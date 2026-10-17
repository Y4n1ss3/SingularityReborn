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
import defpackage.bv;
import defpackage.j50;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ConfirmationNumberKt {
    private static ImageVector _confirmationNumber;

    public static final ImageVector getConfirmationNumber(Icons.Filled filled) {
        ImageVector imageVector = _confirmationNumber;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ConfirmationNumber", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(22.0f, 10.0f, 6.0f);
        d.curveToRelative(0.0f, -1.11f, -0.9f, -2.0f, -2.0f, -2.0f);
        d.horizontalLineTo(4.0f);
        d.curveTo(2.9f, 4.0f, 2.01f, 4.89f, 2.01f, 6.0f);
        d.verticalLineToRelative(4.0f);
        d.curveTo(3.11f, 10.0f, 4.0f, 10.9f, 4.0f, 12.0f);
        d.reflectiveCurveToRelative(-0.89f, 2.0f, -2.0f, 2.0f);
        d.verticalLineToRelative(4.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(16.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineToRelative(-4.0f);
        d.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        d.reflectiveCurveTo(20.9f, 10.0f, 22.0f, 10.0f);
        r6.B(d, 13.0f, 17.5f, -2.0f, -2.0f);
        uo.r(d, 2.0f, 17.5f, 13.0f, 13.0f);
        bv.l(d, -2.0f, -2.0f, 2.0f, 13.0f);
        k4.C(d, 13.0f, 8.5f, -2.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(d, 2.0f, 8.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _confirmationNumber = build;
        build.getClass();
        return build;
    }
}
