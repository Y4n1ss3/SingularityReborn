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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CurrencyRupeeKt {
    private static ImageVector _currencyRupee;

    public static final ImageVector getCurrencyRupee(Icons.Rounded rounded) {
        ImageVector imageVector = _currencyRupee;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.CurrencyRupee", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = r6.a(10.5f, 14.0f, 9.77f, 5.1f, 5.31f);
        a.curveToRelative(0.61f, 0.64f, 0.16f, 1.69f, -0.72f, 1.69f);
        a.curveToRelative(-0.27f, 0.0f, -0.53f, -0.11f, -0.72f, -0.31f);
        a.lineTo(7.4f, 14.41f);
        a.curveTo(7.14f, 14.15f, 7.0f, 13.79f, 7.0f, 13.43f);
        a.curveTo(7.0f, 12.64f, 7.64f, 12.0f, 8.43f, 12.0f);
        a.horizontalLineToRelative(2.07f);
        a.curveToRelative(1.76f, 0.0f, 3.22f, -1.3f, 3.46f, -3.0f);
        a.lineTo(7.0f, 9.0f);
        a.curveTo(6.45f, 9.0f, 6.0f, 8.55f, 6.0f, 8.0f);
        a.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        a.lineToRelative(6.66f, 0.0f);
        a.curveTo(13.1f, 5.82f, 11.9f, 5.0f, 10.5f, 5.0f);
        a.lineTo(7.0f, 5.0f);
        a.curveTo(6.45f, 5.0f, 6.0f, 4.55f, 6.0f, 4.0f);
        a.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        a.horizontalLineToRelative(10.0f);
        a.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        a.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        a.lineToRelative(-2.26f, 0.0f);
        a.curveToRelative(0.48f, 0.58f, 0.84f, 1.26f, 1.05f, 2.0f);
        a.lineTo(17.0f, 7.0f);
        a.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        a.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        a.lineToRelative(-1.02f, 0.0f);
        a.curveTo(15.72f, 11.8f, 13.36f, 14.0f, 10.5f, 14.0f);
        a.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, a.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _currencyRupee = build;
        build.getClass();
        return build;
    }
}
