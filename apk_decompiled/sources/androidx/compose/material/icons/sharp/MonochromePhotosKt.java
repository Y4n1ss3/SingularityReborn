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
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MonochromePhotosKt {
    private static ImageVector _monochromePhotos;

    public static final ImageVector getMonochromePhotos(Icons.Sharp sharp) {
        ImageVector imageVector = _monochromePhotos;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.MonochromePhotos", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(22.0f, 5.0f, -5.2f, 15.0f, 3.0f);
        p.lineTo(9.0f, 3.0f);
        p.lineTo(7.2f, 5.0f);
        af0.m(p, 2.0f, 5.0f, 16.0f, 20.0f);
        uo.l(p, 22.0f, 5.0f, 20.0f, 19.0f);
        p.horizontalLineToRelative(-8.0f);
        p.verticalLineToRelative(-1.0f);
        p.curveToRelative(-2.8f, 0.0f, -5.0f, -2.2f, -5.0f, -5.0f);
        p.reflectiveCurveToRelative(2.2f, -5.0f, 5.0f, -5.0f);
        r6.m(p, 12.0f, 7.0f, 8.0f, 12.0f);
        p.moveTo(17.0f, 13.0f);
        p.curveToRelative(0.0f, -2.8f, -2.2f, -5.0f, -5.0f, -5.0f);
        p.verticalLineToRelative(1.8f);
        p.curveToRelative(1.8f, 0.0f, 3.2f, 1.4f, 3.2f, 3.2f);
        p.reflectiveCurveToRelative(-1.4f, 3.2f, -3.2f, 3.2f);
        p.lineTo(12.0f, 18.0f);
        p.curveToRelative(2.8f, 0.0f, 5.0f, -2.2f, 5.0f, -5.0f);
        p.close();
        p.moveTo(8.8f, 13.0f);
        p.curveToRelative(0.0f, 1.8f, 1.4f, 3.2f, 3.2f, 3.2f);
        p.lineTo(12.0f, 9.8f);
        p.curveToRelative(-1.8f, 0.0f, -3.2f, 1.4f, -3.2f, 3.2f);
        p.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, p.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _monochromePhotos = build;
        build.getClass();
        return build;
    }
}
