package androidx.compose.material.icons.twotone;

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
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MonochromePhotosKt {
    private static ImageVector _monochromePhotos;

    public static final ImageVector getMonochromePhotos(Icons.TwoTone twoTone) {
        ImageVector imageVector = _monochromePhotos;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.MonochromePhotos", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(12.0f, 18.0f, -1.8f);
        h.curveToRelative(-1.8f, 0.0f, -3.2f, -1.4f, -3.2f, -3.2f);
        h.reflectiveCurveToRelative(1.4f, -3.2f, 3.2f, -3.2f);
        h.lineTo(12.0f, 8.0f);
        h.curveToRelative(-2.8f, 0.0f, -5.0f, 2.2f, -5.0f, 5.0f);
        h.reflectiveCurveToRelative(2.2f, 5.0f, 5.0f, 5.0f);
        h.close();
        h.moveTo(17.0f, 13.0f);
        h.curveToRelative(0.0f, 2.8f, -2.2f, 5.0f, -5.0f, 5.0f);
        uo.B(h, 1.0f, 8.0f, 20.0f, 7.0f);
        h.horizontalLineToRelative(-8.0f);
        h.verticalLineToRelative(1.0f);
        h.curveToRelative(2.8f, 0.0f, 5.0f, 2.2f, 5.0f, 5.0f);
        h.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, h.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(4.0f, 21.0f, 16.0f);
        a.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        a.lineTo(22.0f, 7.0f);
        a.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        a.horizontalLineToRelative(-3.2f);
        a.lineTo(15.0f, 3.0f);
        a.lineTo(9.0f, 3.0f);
        a.lineTo(7.2f, 5.0f);
        a.lineTo(4.0f, 5.0f);
        a.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        a.verticalLineToRelative(12.0f);
        a.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        k4.r(a, 12.0f, 8.0f, 12.0f, 7.0f);
        af0.v(a, 8.0f, 12.0f, -8.0f, -1.0f);
        a.curveToRelative(-2.8f, 0.0f, -5.0f, -2.2f, -5.0f, -5.0f);
        a.reflectiveCurveToRelative(2.2f, -5.0f, 5.0f, -5.0f);
        a.close();
        a.moveTo(15.2f, 13.0f);
        a.curveToRelative(0.0f, 1.8f, -1.4f, 3.2f, -3.2f, 3.2f);
        a.lineTo(12.0f, 18.0f);
        a.curveToRelative(2.8f, 0.0f, 5.0f, -2.2f, 5.0f, -5.0f);
        a.reflectiveCurveToRelative(-2.2f, -5.0f, -5.0f, -5.0f);
        a.verticalLineToRelative(1.8f);
        a.curveToRelative(1.8f, 0.0f, 3.2f, 1.4f, 3.2f, 3.2f);
        a.close();
        a.moveTo(8.8f, 13.0f);
        a.curveToRelative(0.0f, 1.8f, 1.4f, 3.2f, 3.2f, 3.2f);
        a.lineTo(12.0f, 9.8f);
        a.curveToRelative(-1.8f, 0.0f, -3.2f, 1.4f, -3.2f, 3.2f);
        a.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, a.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _monochromePhotos = build;
        build.getClass();
        return build;
    }
}
