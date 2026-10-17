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
import defpackage.af0;
import defpackage.gy;
import defpackage.j50;
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VideogameAssetOffKt {
    private static ImageVector _videogameAssetOff;

    public static final ImageVector getVideogameAssetOff(Icons.Outlined outlined) {
        ImageVector imageVector = _videogameAssetOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.VideogameAssetOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(17.5f, 9.0f);
        b.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        b.reflectiveCurveTo(18.33f, 12.0f, 17.5f, 12.0f);
        b.reflectiveCurveTo(16.0f, 11.33f, 16.0f, 10.5f);
        b.reflectiveCurveTo(16.67f, 9.0f, 17.5f, 9.0f);
        uo.q(b, 10.83f, 8.0f, 20.0f, 8.0f);
        b.horizontalLineToRelative(-1.17f);
        b.lineToRelative(1.87f, 1.87f);
        b.curveTo(21.45f, 17.58f, 22.0f, 16.85f, 22.0f, 16.0f);
        b.verticalLineTo(8.0f);
        b.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        kf0.m(b, 8.83f, 10.83f, 8.0f);
        b.moveTo(19.78f, 22.61f);
        b.lineTo(15.17f, 18.0f);
        b.horizontalLineTo(4.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        b.verticalLineTo(8.0f);
        b.curveToRelative(0.0f, -0.85f, 0.55f, -1.58f, 1.3f, -1.87f);
        b.lineTo(1.39f, 4.22f);
        b.lineToRelative(1.41f, -1.41f);
        gy.B(b, 18.38f, 18.38f, 19.78f, 22.61f);
        b.moveTo(13.17f, 16.0f);
        j50.x(b, -3.0f, -3.0f, 9.0f, 2.0f);
        af0.o(b, 7.0f, -2.0f, 5.0f, -2.0f);
        b.horizontalLineToRelative(2.0f);
        b.verticalLineTo(9.83f);
        b.lineTo(5.17f, 8.0f);
        b.horizontalLineTo(4.0f);
        b.verticalLineToRelative(8.0f);
        b.horizontalLineTo(13.17f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _videogameAssetOff = build;
        build.getClass();
        return build;
    }
}
