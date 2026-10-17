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
import defpackage.af0;
import defpackage.gy;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VideogameAssetOffKt {
    private static ImageVector _videogameAssetOff;

    public static final ImageVector getVideogameAssetOff(Icons.Filled filled) {
        ImageVector imageVector = _videogameAssetOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.VideogameAssetOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(21.19f, 21.19f, 2.81f, 2.81f);
        i.lineTo(1.39f, 4.22f);
        i.lineTo(3.3f, 6.13f);
        i.curveTo(2.54f, 6.41f, 2.0f, 7.15f, 2.0f, 8.0f);
        i.verticalLineToRelative(8.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(11.17f);
        gy.B(i, 4.61f, 4.61f, 21.19f, 21.19f);
        uf.D(i, 9.0f, 13.0f, 2.0f, 7.0f);
        af0.B(i, -2.0f, 5.0f, -2.0f, 2.0f);
        i.verticalLineTo(9.83f);
        i.lineTo(10.17f, 13.0f);
        i.horizontalLineTo(9.0f);
        i.close();
        i.moveTo(20.7f, 17.87f);
        i.curveTo(21.46f, 17.59f, 22.0f, 16.85f, 22.0f, 16.0f);
        i.verticalLineTo(8.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        kf0.m(i, 8.83f, 20.7f, 17.87f);
        i.moveTo(17.5f, 9.0f);
        i.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        i.reflectiveCurveTo(18.33f, 12.0f, 17.5f, 12.0f);
        i.reflectiveCurveTo(16.0f, 11.33f, 16.0f, 10.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(i, 16.67f, 9.0f, 17.5f, 9.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _videogameAssetOff = build;
        build.getClass();
        return build;
    }
}
