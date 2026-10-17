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
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VignetteKt {
    private static ImageVector _vignette;

    public static final ImageVector getVignette(Icons.Outlined outlined) {
        ImageVector imageVector = _vignette;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Vignette", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder y = gy.y(21.0f, 5.0f, 14.0f, 3.0f, 19.0f);
        y.lineTo(3.0f, 5.0f);
        y.horizontalLineToRelative(18.0f);
        y.moveToRelative(0.0f, -2.0f);
        y.lineTo(3.0f, 3.0f);
        y.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        y.verticalLineToRelative(14.0f);
        y.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        y.horizontalLineToRelative(18.0f);
        y.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        y.lineTo(23.0f, 5.0f);
        y.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        y.close();
        y.moveTo(12.0f, 8.0f);
        y.curveToRelative(3.25f, 0.0f, 6.0f, 1.83f, 6.0f, 4.0f);
        y.reflectiveCurveToRelative(-2.75f, 4.0f, -6.0f, 4.0f);
        y.reflectiveCurveToRelative(-6.0f, -1.83f, -6.0f, -4.0f);
        y.reflectiveCurveToRelative(2.75f, -4.0f, 6.0f, -4.0f);
        y.moveToRelative(0.0f, -2.0f);
        y.curveToRelative(-4.42f, 0.0f, -8.0f, 2.69f, -8.0f, 6.0f);
        y.reflectiveCurveToRelative(3.58f, 6.0f, 8.0f, 6.0f);
        y.reflectiveCurveToRelative(8.0f, -2.69f, 8.0f, -6.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(y, -3.58f, -6.0f, -8.0f, -6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _vignette = build;
        build.getClass();
        return build;
    }
}
