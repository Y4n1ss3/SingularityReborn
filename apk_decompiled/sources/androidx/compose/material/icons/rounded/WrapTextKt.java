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
import defpackage.er;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WrapTextKt {
    private static ImageVector _wrapText;

    public static final ImageVector getWrapText(Icons.Rounded rounded) {
        ImageVector imageVector = _wrapText;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.WrapText", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(5.0f, 7.0f, 14.0f);
        a.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        a.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        a.lineTo(5.0f, 5.0f);
        a.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        a.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        k4.r(a, 16.83f, 11.0f, 5.0f, 11.0f);
        a.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        a.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        a.horizontalLineToRelative(12.13f);
        a.curveToRelative(1.0f, 0.0f, 1.93f, 0.67f, 2.09f, 1.66f);
        a.curveToRelative(0.21f, 1.25f, -0.76f, 2.34f, -1.97f, 2.34f);
        a.lineTo(15.0f, 17.0f);
        a.verticalLineToRelative(-0.79f);
        a.curveToRelative(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f);
        a.lineToRelative(-1.79f, 1.79f);
        a.curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f);
        a.lineToRelative(1.79f, 1.79f);
        a.curveToRelative(0.32f, 0.32f, 0.85f, 0.09f, 0.85f, -0.35f);
        a.lineTo(15.0f, 19.0f);
        a.horizontalLineToRelative(2.0f);
        a.curveToRelative(2.34f, 0.0f, 4.21f, -2.01f, 3.98f, -4.39f);
        a.curveToRelative(-0.2f, -2.08f, -2.06f, -3.61f, -4.15f, -3.61f);
        k4.r(a, 9.0f, 17.0f, 5.0f, 17.0f);
        a.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        a.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        a.horizontalLineToRelative(4.0f);
        a.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(a, -0.45f, -1.0f, -1.0f, -1.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wrapText = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getWrapText$annotations(Icons.Rounded rounded) {
    }
}
