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
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LocalPharmacyKt {
    private static ImageVector _localPharmacy;

    public static final ImageVector getLocalPharmacy(Icons.Rounded rounded) {
        ImageVector imageVector = _localPharmacy;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.LocalPharmacy", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(18.89f, 5.0f, -0.53f, 0.71f, -1.97f);
        i.curveToRelative(0.24f, -0.65f, -0.1f, -1.37f, -0.75f, -1.6f);
        i.curveToRelative(-0.65f, -0.24f, -1.37f, 0.1f, -1.61f, 0.75f);
        i.lineTo(15.69f, 5.0f);
        i.horizontalLineTo(5.1f);
        i.curveTo(3.73f, 5.0f, 2.77f, 6.34f, 3.2f, 7.63f);
        i.lineTo(5.0f, 13.0f);
        i.lineToRelative(-1.79f, 5.37f);
        i.curveTo(2.77f, 19.66f, 3.74f, 21.0f, 5.1f, 21.0f);
        i.horizontalLineToRelative(13.78f);
        i.curveToRelative(1.36f, 0.0f, 2.33f, -1.34f, 1.9f, -2.63f);
        i.lineTo(19.0f, 13.0f);
        i.lineToRelative(1.78f, -5.37f);
        i.curveTo(21.21f, 6.34f, 20.25f, 5.0f, 18.89f, 5.0f);
        r6.B(i, 15.0f, 14.0f, -2.0f, 2.0f);
        i.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        i.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        i.verticalLineToRelative(-2.0f);
        i.horizontalLineTo(9.0f);
        i.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        i.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        i.horizontalLineToRelative(2.0f);
        i.verticalLineToRelative(-2.0f);
        i.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        i.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        i.verticalLineToRelative(2.0f);
        i.horizontalLineToRelative(2.0f);
        i.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(i, -0.45f, 1.0f, -1.0f, 1.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localPharmacy = build;
        build.getClass();
        return build;
    }
}
