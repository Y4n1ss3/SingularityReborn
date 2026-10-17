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
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class IsoKt {
    private static ImageVector _iso;

    public static final ImageVector getIso(Icons.Rounded rounded) {
        ImageVector imageVector = _iso;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Iso", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(19.0f, 3.0f, 5.0f, 3.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i.verticalLineToRelative(14.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(14.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.lineTo(21.0f, 5.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.r(i, 6.25f, 7.5f, 7.5f, 7.5f);
        i.lineTo(7.5f, 6.25f);
        i.curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f);
        i.reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f);
        i.lineTo(9.0f, 7.5f);
        i.horizontalLineToRelative(1.25f);
        i.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        i.reflectiveCurveToRelative(-0.34f, 0.75f, -0.75f, 0.75f);
        i.lineTo(9.0f, 9.0f);
        i.verticalLineToRelative(1.25f);
        i.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        i.reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f);
        i.lineTo(7.5f, 9.0f);
        i.lineTo(6.25f, 9.0f);
        i.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        i.reflectiveCurveToRelative(0.34f, -0.75f, 0.75f, -0.75f);
        k4.r(i, 18.0f, 19.0f, 5.0f, 19.0f);
        i.lineTo(19.0f, 5.0f);
        i.verticalLineToRelative(13.0f);
        i.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        i.close();
        i.moveTo(17.0f, 16.25f);
        i.curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f);
        i.horizontalLineToRelative(-3.5f);
        i.curveToRelative(-0.41f, 0.0f, -0.75f, 0.34f, -0.75f, 0.75f);
        i.reflectiveCurveToRelative(0.34f, 0.75f, 0.75f, 0.75f);
        i.horizontalLineToRelative(3.5f);
        i.curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _iso = build;
        build.getClass();
        return build;
    }
}
