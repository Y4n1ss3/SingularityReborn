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
import defpackage.k4;
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VideogameAssetOffKt {
    private static ImageVector _videogameAssetOff;

    public static final ImageVector getVideogameAssetOff(Icons.Rounded rounded) {
        ImageVector imageVector = _videogameAssetOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.VideogameAssetOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(20.7f, 17.87f);
        b.curveTo(21.46f, 17.59f, 22.0f, 16.85f, 22.0f, 16.0f);
        b.verticalLineTo(8.0f);
        b.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        kf0.m(b, 8.83f, 20.7f, 17.87f);
        b.moveTo(17.5f, 9.0f);
        b.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        b.reflectiveCurveTo(18.33f, 12.0f, 17.5f, 12.0f);
        b.reflectiveCurveTo(16.0f, 11.33f, 16.0f, 10.5f);
        b.reflectiveCurveTo(16.67f, 9.0f, 17.5f, 9.0f);
        k4.r(b, 20.49f, 20.49f, 3.51f, 3.51f);
        b.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        b.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        b.lineToRelative(1.2f, 1.2f);
        b.curveTo(2.54f, 6.41f, 2.0f, 7.15f, 2.0f, 8.0f);
        b.verticalLineToRelative(8.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(11.17f);
        b.lineToRelative(3.9f, 3.9f);
        b.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        b.horizontalLineToRelative(0.0f);
        b.curveTo(20.88f, 21.51f, 20.88f, 20.88f, 20.49f, 20.49f);
        uo.q(b, 10.0f, 13.0f, 9.0f, 1.0f);
        b.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        b.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        b.verticalLineToRelative(-1.0f);
        b.horizontalLineTo(6.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        b.horizontalLineToRelative(1.0f);
        b.verticalLineToRelative(-1.0f);
        b.curveToRelative(0.0f, -0.05f, 0.01f, -0.11f, 0.01f, -0.16f);
        b.lineToRelative(3.14f, 3.14f);
        b.curveTo(10.11f, 12.99f, 10.05f, 13.0f, 10.0f, 13.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _videogameAssetOff = build;
        build.getClass();
        return build;
    }
}
