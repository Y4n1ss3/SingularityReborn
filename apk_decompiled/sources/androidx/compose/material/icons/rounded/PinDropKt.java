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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PinDropKt {
    private static ImageVector _pinDrop;

    public static final ImageVector getPinDrop(Icons.Rounded rounded) {
        ImageVector imageVector = _pinDrop;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PinDrop", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(6.0f, 20.0f, 12.0f);
        a.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        a.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        a.horizontalLineTo(6.0f);
        a.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        a.reflectiveCurveTo(5.45f, 20.0f, 6.0f, 20.0f);
        a.close();
        a.moveTo(12.0f, 7.0f);
        a.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        a.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        a.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        a.reflectiveCurveTo(13.1f, 7.0f, 12.0f, 7.0f);
        a.close();
        a.moveTo(12.0f, 2.0f);
        a.curveToRelative(3.27f, 0.0f, 7.0f, 2.46f, 7.0f, 7.15f);
        a.curveToRelative(0.0f, 2.98f, -2.13f, 6.12f, -6.39f, 9.39f);
        a.curveToRelative(-0.36f, 0.28f, -0.86f, 0.28f, -1.22f, 0.0f);
        a.curveTo(7.13f, 15.26f, 5.0f, 12.13f, 5.0f, 9.15f);
        a.curveTo(5.0f, 4.46f, 8.73f, 2.0f, 12.0f, 2.0f);
        a.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, a.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pinDrop = build;
        build.getClass();
        return build;
    }
}
