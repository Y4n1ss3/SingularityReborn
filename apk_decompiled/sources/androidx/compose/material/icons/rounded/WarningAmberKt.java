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
import defpackage.af0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WarningAmberKt {
    private static ImageVector _warningAmber;

    public static final ImageVector getWarningAmber(Icons.Rounded rounded) {
        ImageVector imageVector = _warningAmber;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.WarningAmber", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(12.0f, 5.99f, 19.53f, 19.0f);
        i.lineTo(4.47f, 19.0f);
        i.lineTo(12.0f, 5.99f);
        i.moveTo(2.74f, 18.0f);
        i.curveToRelative(-0.77f, 1.33f, 0.19f, 3.0f, 1.73f, 3.0f);
        i.horizontalLineToRelative(15.06f);
        i.curveToRelative(1.54f, 0.0f, 2.5f, -1.67f, 1.73f, -3.0f);
        i.lineTo(13.73f, 4.99f);
        i.curveToRelative(-0.77f, -1.33f, -2.69f, -1.33f, -3.46f, 0.0f);
        uo.l(i, 2.74f, 18.0f, 11.0f, 11.0f);
        i.verticalLineToRelative(2.0f);
        i.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        i.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        i.verticalLineToRelative(-2.0f);
        i.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        i.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        r6.B(i, 11.0f, 16.0f, 2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.d(i, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _warningAmber = build;
        build.getClass();
        return build;
    }
}
